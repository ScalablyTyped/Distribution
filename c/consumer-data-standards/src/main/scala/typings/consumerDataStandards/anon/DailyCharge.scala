package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DailyCharge
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The daily supply charge (exclusive of GST) for this controlled load tier
    */
  var dailyCharge: String
  
  /**
    * A description of the controlled load tier
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A display name for the controlled load tier
    */
  var displayName: String
  
  /**
    * The period for which the controlled load rate applies. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var period: String
  
  /**
    * Array of controlled load rates in order of usage volume
    */
  var rates: js.Array[UnitPrice]
}
object DailyCharge {
  
  inline def apply(dailyCharge: String, displayName: String, period: String, rates: js.Array[UnitPrice]): DailyCharge = {
    val __obj = js.Dynamic.literal(dailyCharge = dailyCharge.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailyCharge]
  }
  
  extension [Self <: DailyCharge](x: Self) {
    
    inline def setDailyCharge(value: String): Self = StObject.set(x, "dailyCharge", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setRates(value: js.Array[UnitPrice]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setRatesVarargs(value: UnitPrice*): Self = StObject.set(x, "rates", js.Array(value*))
  }
}
