package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoProductPricing
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The amount charged for the duration period
    */
  var amount: String
  
  /**
    * The description of the pricing
    */
  var description: String
  
  /**
    * The display name of the pricing
    */
  var name: String
  
  /**
    * The duration that occurs on a pricing schedule indicates the frequency. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var period: js.UndefOr[String | Null] = js.undefined
}
object TelcoProductPricing {
  
  inline def apply(amount: String, description: String, name: String): TelcoProductPricing = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoProductPricing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoProductPricing] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodNull: Self = StObject.set(x, "period", null)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
