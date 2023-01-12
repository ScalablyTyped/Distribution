package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralUnitPrice
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Description of the rate
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name of the rate
    */
  var displayName: String
  
  /**
    * The block rate (unit price) for any usage above the included fixed usage, in dollars per kWh inclusive of GST.  Only required if pricingModel field is ‘QUOTA’
    */
  var generalUnitPrice: js.UndefOr[String] = js.undefined
  
  /**
    * Usage period for which the block rate applies. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var period: js.UndefOr[String] = js.undefined
  
  /**
    * Array of controlled load rates in order of usage volume
    */
  var rates: js.Array[MeasureUnit]
}
object GeneralUnitPrice {
  
  inline def apply(displayName: String, rates: js.Array[MeasureUnit]): GeneralUnitPrice = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralUnitPrice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneralUnitPrice] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setGeneralUnitPrice(value: String): Self = StObject.set(x, "generalUnitPrice", value.asInstanceOf[js.Any])
    
    inline def setGeneralUnitPriceUndefined: Self = StObject.set(x, "generalUnitPrice", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRates(value: js.Array[MeasureUnit]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setRatesVarargs(value: MeasureUnit*): Self = StObject.set(x, "rates", js.Array(value*))
  }
}
