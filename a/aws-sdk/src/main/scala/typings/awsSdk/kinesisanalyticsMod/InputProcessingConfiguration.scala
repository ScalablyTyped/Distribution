package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputProcessingConfiguration extends js.Object {
  
  /**
    * The InputLambdaProcessor that is used to preprocess the records in the stream before being processed by your application code.
    */
  var InputLambdaProcessor: typings.awsSdk.kinesisanalyticsMod.InputLambdaProcessor = js.native
}
object InputProcessingConfiguration {
  
  @scala.inline
  def apply(InputLambdaProcessor: InputLambdaProcessor): InputProcessingConfiguration = {
    val __obj = js.Dynamic.literal(InputLambdaProcessor = InputLambdaProcessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProcessingConfiguration]
  }
  
  @scala.inline
  implicit class InputProcessingConfigurationOps[Self <: InputProcessingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setInputLambdaProcessor(value: InputLambdaProcessor): Self = this.set("InputLambdaProcessor", value.asInstanceOf[js.Any])
  }
}
