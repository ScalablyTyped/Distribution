package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingDataResult extends js.Object {
  
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
  implicit class TrainingDataResultOps[Self <: TrainingDataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInput(value: TrainingData): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    
    @scala.inline
    def setOutput(value: TrainingData): Self = this.set("Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("Output", js.undefined)
    
    @scala.inline
    def setValidation(value: ValidationData): Self = this.set("Validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidation: Self = this.set("Validation", js.undefined)
  }
}
