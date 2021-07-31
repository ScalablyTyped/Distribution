package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputProcessingConfigurationUpdate extends StObject {
  
  /**
    * Provides update information for an InputLambdaProcessor.
    */
  var InputLambdaProcessorUpdate: typings.awsSdk.kinesisanalyticsv2Mod.InputLambdaProcessorUpdate
}
object InputProcessingConfigurationUpdate {
  
  @scala.inline
  def apply(InputLambdaProcessorUpdate: InputLambdaProcessorUpdate): InputProcessingConfigurationUpdate = {
    val __obj = js.Dynamic.literal(InputLambdaProcessorUpdate = InputLambdaProcessorUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProcessingConfigurationUpdate]
  }
  
  @scala.inline
  implicit class InputProcessingConfigurationUpdateMutableBuilder[Self <: InputProcessingConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputLambdaProcessorUpdate(value: InputLambdaProcessorUpdate): Self = StObject.set(x, "InputLambdaProcessorUpdate", value.asInstanceOf[js.Any])
  }
}
