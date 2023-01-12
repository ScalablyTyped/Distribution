package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DailySupplyCharge
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The daily supply charge (exclusive of GST) for this controlled load tier
    */
  var dailySupplyCharge: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the controlled load rate
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name of the controlled load rate
    */
  var displayName: String
  
  /**
    * Array of controlled load rates in order of usage volume
    */
  var rates: js.Array[MeasureUnit]
}
object DailySupplyCharge {
  
  inline def apply(displayName: String, rates: js.Array[MeasureUnit]): DailySupplyCharge = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailySupplyCharge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DailySupplyCharge] (val x: Self) extends AnyVal {
    
    inline def setDailySupplyCharge(value: String): Self = StObject.set(x, "dailySupplyCharge", value.asInstanceOf[js.Any])
    
    inline def setDailySupplyChargeUndefined: Self = StObject.set(x, "dailySupplyCharge", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setRates(value: js.Array[MeasureUnit]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setRatesVarargs(value: MeasureUnit*): Self = StObject.set(x, "rates", js.Array(value*))
  }
}
