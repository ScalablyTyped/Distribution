package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentPerformanceRiskRatings extends StObject {
  
  /**
    * A count of the applicable resource types with a high performance risk rating.
    */
  var high: js.UndefOr[High] = js.undefined
  
  /**
    * A count of the applicable resource types with a low performance risk rating.
    */
  var low: js.UndefOr[Low] = js.undefined
  
  /**
    * A count of the applicable resource types with a medium performance risk rating.
    */
  var medium: js.UndefOr[Medium] = js.undefined
  
  /**
    * A count of the applicable resource types with a very low performance risk rating.
    */
  var veryLow: js.UndefOr[VeryLow] = js.undefined
}
object CurrentPerformanceRiskRatings {
  
  inline def apply(): CurrentPerformanceRiskRatings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentPerformanceRiskRatings]
  }
  
  extension [Self <: CurrentPerformanceRiskRatings](x: Self) {
    
    inline def setHigh(value: High): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Low): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setMedium(value: Medium): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setVeryLow(value: VeryLow): Self = StObject.set(x, "veryLow", value.asInstanceOf[js.Any])
    
    inline def setVeryLowUndefined: Self = StObject.set(x, "veryLow", js.undefined)
  }
}
