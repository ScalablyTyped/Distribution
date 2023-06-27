package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.OFF_PEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.PEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.SHOULDER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RatesTimeVariations
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The tariff amount
    */
  var rates: js.Array[UnitPrice]
  
  /**
    * Array of time periods for which this tariff is applicable
    */
  var timeVariations: js.Array[EndTime]
  
  /**
    * The type of the charging time period. If absent applies to all periods
    */
  var `type`: js.UndefOr[PEAK | OFF_PEAK | SHOULDER] = js.undefined
}
object RatesTimeVariations {
  
  inline def apply(rates: js.Array[UnitPrice], timeVariations: js.Array[EndTime]): RatesTimeVariations = {
    val __obj = js.Dynamic.literal(rates = rates.asInstanceOf[js.Any], timeVariations = timeVariations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatesTimeVariations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RatesTimeVariations] (val x: Self) extends AnyVal {
    
    inline def setRates(value: js.Array[UnitPrice]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setRatesVarargs(value: UnitPrice*): Self = StObject.set(x, "rates", js.Array(value*))
    
    inline def setTimeVariations(value: js.Array[EndTime]): Self = StObject.set(x, "timeVariations", value.asInstanceOf[js.Any])
    
    inline def setTimeVariationsVarargs(value: EndTime*): Self = StObject.set(x, "timeVariations", js.Array(value*))
    
    inline def setType(value: PEAK | OFF_PEAK | SHOULDER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
