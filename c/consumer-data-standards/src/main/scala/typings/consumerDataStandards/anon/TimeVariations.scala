package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.OFF_PEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.PEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.SHOULDER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeVariations
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The tariff amount
    */
  var amount: String
  
  /**
    * Array of time periods for which this tariff is applicable
    */
  var timeVariations: js.Array[EndTime]
  
  /**
    * The type of the charging time period. If absent applies to all periods
    */
  var `type`: js.UndefOr[PEAK | OFF_PEAK | SHOULDER] = js.undefined
}
object TimeVariations {
  
  inline def apply(amount: String, timeVariations: js.Array[EndTime]): TimeVariations = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], timeVariations = timeVariations.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeVariations]
  }
  
  extension [Self <: TimeVariations](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setTimeVariations(value: js.Array[EndTime]): Self = StObject.set(x, "timeVariations", value.asInstanceOf[js.Any])
    
    inline def setTimeVariationsVarargs(value: EndTime*): Self = StObject.set(x, "timeVariations", js.Array(value*))
    
    inline def setType(value: PEAK | OFF_PEAK | SHOULDER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
