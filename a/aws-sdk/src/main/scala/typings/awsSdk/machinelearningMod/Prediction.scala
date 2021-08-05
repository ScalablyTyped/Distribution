package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prediction extends StObject {
  
  var details: js.UndefOr[DetailsMap] = js.undefined
  
  /**
    * The prediction label for either a BINARY or MULTICLASS MLModel.
    */
  var predictedLabel: js.UndefOr[Label] = js.undefined
  
  var predictedScores: js.UndefOr[ScoreValuePerLabelMap] = js.undefined
  
  /**
    * The prediction value for REGRESSION MLModel.
    */
  var predictedValue: js.UndefOr[floatLabel] = js.undefined
}
object Prediction {
  
  inline def apply(): Prediction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prediction]
  }
  
  extension [Self <: Prediction](x: Self) {
    
    inline def setDetails(value: DetailsMap): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setPredictedLabel(value: Label): Self = StObject.set(x, "predictedLabel", value.asInstanceOf[js.Any])
    
    inline def setPredictedLabelUndefined: Self = StObject.set(x, "predictedLabel", js.undefined)
    
    inline def setPredictedScores(value: ScoreValuePerLabelMap): Self = StObject.set(x, "predictedScores", value.asInstanceOf[js.Any])
    
    inline def setPredictedScoresUndefined: Self = StObject.set(x, "predictedScores", js.undefined)
    
    inline def setPredictedValue(value: floatLabel): Self = StObject.set(x, "predictedValue", value.asInstanceOf[js.Any])
    
    inline def setPredictedValueUndefined: Self = StObject.set(x, "predictedValue", js.undefined)
  }
}
