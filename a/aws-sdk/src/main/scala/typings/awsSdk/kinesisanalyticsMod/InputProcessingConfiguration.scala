package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputProcessingConfiguration extends StObject {
  
  /**
    * The InputLambdaProcessor that is used to preprocess the records in the stream before being processed by your application code.
    */
  var InputLambdaProcessor: typings.awsSdk.kinesisanalyticsMod.InputLambdaProcessor
}
object InputProcessingConfiguration {
  
  @scala.inline
  def apply(InputLambdaProcessor: InputLambdaProcessor): InputProcessingConfiguration = {
    val __obj = js.Dynamic.literal(InputLambdaProcessor = InputLambdaProcessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProcessingConfiguration]
  }
  
  @scala.inline
  implicit class InputProcessingConfigurationMutableBuilder[Self <: InputProcessingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputLambdaProcessor(value: InputLambdaProcessor): Self = StObject.set(x, "InputLambdaProcessor", value.asInstanceOf[js.Any])
  }
}
