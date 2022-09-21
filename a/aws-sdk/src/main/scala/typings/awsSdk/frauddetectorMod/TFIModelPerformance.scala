package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TFIModelPerformance extends StObject {
  
  /**
    *  The area under the curve (auc). This summarizes the total positive rate (tpr) and false positive rate (FPR) across all possible model score thresholds. 
    */
  var auc: js.UndefOr[float] = js.undefined
}
object TFIModelPerformance {
  
  inline def apply(): TFIModelPerformance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TFIModelPerformance]
  }
  
  extension [Self <: TFIModelPerformance](x: Self) {
    
    inline def setAuc(value: float): Self = StObject.set(x, "auc", value.asInstanceOf[js.Any])
    
    inline def setAucUndefined: Self = StObject.set(x, "auc", js.undefined)
  }
}
