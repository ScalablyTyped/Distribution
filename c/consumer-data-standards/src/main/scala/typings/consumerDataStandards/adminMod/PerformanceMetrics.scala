package typings.consumerDataStandards.adminMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceMetrics
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Percentage of calls within the performance threshold for the current day. 0.0 means 0%. 1.0 means 100%
    */
  var currentDay: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Percentage of calls within the performance threshold for previous days. The first element indicates yesterday and so on. A maximum of seven entries is required if available. 0.0 means 0%. 1.0 means 100%
    */
  var previousDays: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object PerformanceMetrics {
  
  inline def apply(): PerformanceMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceMetrics] (val x: Self) extends AnyVal {
    
    inline def setCurrentDay(value: Double): Self = StObject.set(x, "currentDay", value.asInstanceOf[js.Any])
    
    inline def setCurrentDayNull: Self = StObject.set(x, "currentDay", null)
    
    inline def setCurrentDayUndefined: Self = StObject.set(x, "currentDay", js.undefined)
    
    inline def setPreviousDays(value: js.Array[Double]): Self = StObject.set(x, "previousDays", value.asInstanceOf[js.Any])
    
    inline def setPreviousDaysNull: Self = StObject.set(x, "previousDays", null)
    
    inline def setPreviousDaysUndefined: Self = StObject.set(x, "previousDays", js.undefined)
    
    inline def setPreviousDaysVarargs(value: Double*): Self = StObject.set(x, "previousDays", js.Array(value*))
  }
}
