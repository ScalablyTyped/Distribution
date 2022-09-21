package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingResult extends StObject {
  
  /**
    * The validation metrics.
    */
  var dataValidationMetrics: js.UndefOr[DataValidationMetrics] = js.undefined
  
  /**
    * The training metric details.
    */
  var trainingMetrics: js.UndefOr[TrainingMetrics] = js.undefined
  
  /**
    * The variable importance metrics.
    */
  var variableImportanceMetrics: js.UndefOr[VariableImportanceMetrics] = js.undefined
}
object TrainingResult {
  
  inline def apply(): TrainingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingResult]
  }
  
  extension [Self <: TrainingResult](x: Self) {
    
    inline def setDataValidationMetrics(value: DataValidationMetrics): Self = StObject.set(x, "dataValidationMetrics", value.asInstanceOf[js.Any])
    
    inline def setDataValidationMetricsUndefined: Self = StObject.set(x, "dataValidationMetrics", js.undefined)
    
    inline def setTrainingMetrics(value: TrainingMetrics): Self = StObject.set(x, "trainingMetrics", value.asInstanceOf[js.Any])
    
    inline def setTrainingMetricsUndefined: Self = StObject.set(x, "trainingMetrics", js.undefined)
    
    inline def setVariableImportanceMetrics(value: VariableImportanceMetrics): Self = StObject.set(x, "variableImportanceMetrics", value.asInstanceOf[js.Any])
    
    inline def setVariableImportanceMetricsUndefined: Self = StObject.set(x, "variableImportanceMetrics", js.undefined)
  }
}
