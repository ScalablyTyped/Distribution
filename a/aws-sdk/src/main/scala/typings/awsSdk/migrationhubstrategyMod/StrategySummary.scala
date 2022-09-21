package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrategySummary extends StObject {
  
  /**
    *  The count of recommendations per strategy. 
    */
  var count: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The name of recommended strategy. 
    */
  var strategy: js.UndefOr[Strategy] = js.undefined
}
object StrategySummary {
  
  inline def apply(): StrategySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrategySummary]
  }
  
  extension [Self <: StrategySummary](x: Self) {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
