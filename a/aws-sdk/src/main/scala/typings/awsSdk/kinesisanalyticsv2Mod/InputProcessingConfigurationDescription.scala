package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputProcessingConfigurationDescription extends StObject {
  
  /**
    * Provides configuration information about the associated InputLambdaProcessorDescription 
    */
  var InputLambdaProcessorDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputLambdaProcessorDescription] = js.native
}
object InputProcessingConfigurationDescription {
  
  @scala.inline
  def apply(): InputProcessingConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProcessingConfigurationDescription]
  }
  
  @scala.inline
  implicit class InputProcessingConfigurationDescriptionMutableBuilder[Self <: InputProcessingConfigurationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputLambdaProcessorDescription(value: InputLambdaProcessorDescription): Self = StObject.set(x, "InputLambdaProcessorDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLambdaProcessorDescriptionUndefined: Self = StObject.set(x, "InputLambdaProcessorDescription", js.undefined)
  }
}
