package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPerformance extends StObject {
  
  /**
    * The overall F1 score metric for the trained model.
    */
  var F1Score: js.UndefOr[Float] = js.undefined
  
  /**
    * The overall precision metric value for the trained model.
    */
  var Precision: js.UndefOr[Float] = js.undefined
  
  /**
    * The overall recall metric value for the trained model. 
    */
  var Recall: js.UndefOr[Float] = js.undefined
}
object ModelPerformance {
  
  inline def apply(): ModelPerformance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPerformance]
  }
  
  extension [Self <: ModelPerformance](x: Self) {
    
    inline def setF1Score(value: Float): Self = StObject.set(x, "F1Score", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreUndefined: Self = StObject.set(x, "F1Score", js.undefined)
    
    inline def setPrecision(value: Float): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "Precision", js.undefined)
    
    inline def setRecall(value: Float): Self = StObject.set(x, "Recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "Recall", js.undefined)
  }
}
