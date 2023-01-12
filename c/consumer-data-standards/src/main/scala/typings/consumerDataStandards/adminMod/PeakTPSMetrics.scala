package typings.consumerDataStandards.adminMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeakTPSMetrics
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Peak TPS for current day
    */
  var currentDay: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Peak TPS for previous days. The first element indicates yesterday and so on. A maximum of seven entries is required if available
    */
  var previousDays: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object PeakTPSMetrics {
  
  inline def apply(): PeakTPSMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeakTPSMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeakTPSMetrics] (val x: Self) extends AnyVal {
    
    inline def setCurrentDay(value: Double): Self = StObject.set(x, "currentDay", value.asInstanceOf[js.Any])
    
    inline def setCurrentDayNull: Self = StObject.set(x, "currentDay", null)
    
    inline def setCurrentDayUndefined: Self = StObject.set(x, "currentDay", js.undefined)
    
    inline def setPreviousDays(value: js.Array[Double]): Self = StObject.set(x, "previousDays", value.asInstanceOf[js.Any])
    
    inline def setPreviousDaysNull: Self = StObject.set(x, "previousDays", null)
    
    inline def setPreviousDaysUndefined: Self = StObject.set(x, "previousDays", js.undefined)
    
    inline def setPreviousDaysVarargs(value: Double*): Self = StObject.set(x, "previousDays", js.Array(value*))
  }
}
