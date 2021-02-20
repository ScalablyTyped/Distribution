package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingDataResult extends StObject {
  
  /**
    * The training assets that you supplied for training.
    */
  var Input: js.UndefOr[TrainingData] = js.native
  
  /**
    * The images (assets) that were actually trained by Amazon Rekognition Custom Labels. 
    */
  var Output: js.UndefOr[TrainingData] = js.native
  
  /**
    * The location of the data validation manifest. The data validation manifest is created for the training dataset during model training.
    */
  var Validation: js.UndefOr[ValidationData] = js.native
}
object TrainingDataResult {
  
  @scala.inline
  def apply(): TrainingDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingDataResult]
  }
  
  @scala.inline
  implicit class TrainingDataResultMutableBuilder[Self <: TrainingDataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: TrainingData): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    @scala.inline
    def setOutput(value: TrainingData): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    @scala.inline
    def setValidation(value: ValidationData): Self = StObject.set(x, "Validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUndefined: Self = StObject.set(x, "Validation", js.undefined)
  }
}
