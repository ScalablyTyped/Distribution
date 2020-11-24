package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputProcessingConfigurationDescription extends js.Object {
  
  /**
    * Provides configuration information about the associated InputLambdaProcessorDescription.
    */
  var InputLambdaProcessorDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputLambdaProcessorDescription] = js.native
}
object InputProcessingConfigurationDescription {
  
  @scala.inline
  def apply(): InputProcessingConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProcessingConfigurationDescription]
  }
  
  @scala.inline
  implicit class InputProcessingConfigurationDescriptionOps[Self <: InputProcessingConfigurationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputLambdaProcessorDescription(value: InputLambdaProcessorDescription): Self = this.set("InputLambdaProcessorDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLambdaProcessorDescription: Self = this.set("InputLambdaProcessorDescription", js.undefined)
  }
}
