package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingResult extends StObject {
  
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
  implicit class TrainingResultMutableBuilder[Self <: TrainingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataValidationMetrics(value: DataValidationMetrics): Self = StObject.set(x, "dataValidationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValidationMetricsUndefined: Self = StObject.set(x, "dataValidationMetrics", js.undefined)
    
    @scala.inline
    def setTrainingMetrics(value: TrainingMetrics): Self = StObject.set(x, "trainingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingMetricsUndefined: Self = StObject.set(x, "trainingMetrics", js.undefined)
  }
}
