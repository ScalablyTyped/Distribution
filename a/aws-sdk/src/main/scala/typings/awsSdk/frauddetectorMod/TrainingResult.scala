package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingResult extends js.Object {
  
  /**
    * The validation metrics.
    */
  var dataValidationMetrics: js.UndefOr[DataValidationMetrics] = js.native
  
  /**
    * The training metric details.
    */
  var trainingMetrics: js.UndefOr[TrainingMetrics] = js.native
}
object TrainingResult {
  
  @scala.inline
  def apply(): TrainingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingResult]
  }
  
  @scala.inline
  implicit class TrainingResultOps[Self <: TrainingResult] (val x: Self) extends AnyVal {
    
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
    def setDataValidationMetrics(value: DataValidationMetrics): Self = this.set("dataValidationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataValidationMetrics: Self = this.set("dataValidationMetrics", js.undefined)
    
    @scala.inline
    def setTrainingMetrics(value: TrainingMetrics): Self = this.set("trainingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingMetrics: Self = this.set("trainingMetrics", js.undefined)
  }
}
