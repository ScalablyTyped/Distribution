package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple
  */
trait SimplePriceParams extends StObject {
  
  /**
    * A single id or a list of coin ids to filter if you want specific results. Use coins.list() for a list of coin ids.
    */
  var ids: String | js.Array[String]
  
  /**
    * To include 24hr_change of price.
    */
  // tslint:disable-next-line no-redundant-undefined
  var include_24hr_change: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To include 24hr_vol.
    */
  // tslint:disable-next-line no-redundant-undefined
  var include_24hr_vol: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To include last_updated_at of price.
    */
  // tslint:disable-next-line no-redundant-undefined
  var include_last_updated_at: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To include market_cap, default: false.
    */
  // tslint:disable-next-line no-redundant-undefined
  var include_market_cap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A single id or a list of ids. Use simple.supportedVsCurrencies() for a list of vsCurrency ids.
    */
  var vs_currencies: String | js.Array[String]
}
object SimplePriceParams {
  
  inline def apply(ids: String | js.Array[String], vs_currencies: String | js.Array[String]): SimplePriceParams = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], vs_currencies = vs_currencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplePriceParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimplePriceParams] (val x: Self) extends AnyVal {
    
    inline def setIds(value: String | js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setInclude_24hr_change(value: Boolean): Self = StObject.set(x, "include_24hr_change", value.asInstanceOf[js.Any])
    
    inline def setInclude_24hr_changeUndefined: Self = StObject.set(x, "include_24hr_change", js.undefined)
    
    inline def setInclude_24hr_vol(value: Boolean): Self = StObject.set(x, "include_24hr_vol", value.asInstanceOf[js.Any])
    
    inline def setInclude_24hr_volUndefined: Self = StObject.set(x, "include_24hr_vol", js.undefined)
    
    inline def setInclude_last_updated_at(value: Boolean): Self = StObject.set(x, "include_last_updated_at", value.asInstanceOf[js.Any])
    
    inline def setInclude_last_updated_atUndefined: Self = StObject.set(x, "include_last_updated_at", js.undefined)
    
    inline def setInclude_market_cap(value: Boolean): Self = StObject.set(x, "include_market_cap", value.asInstanceOf[js.Any])
    
    inline def setInclude_market_capUndefined: Self = StObject.set(x, "include_market_cap", js.undefined)
    
    inline def setVs_currencies(value: String | js.Array[String]): Self = StObject.set(x, "vs_currencies", value.asInstanceOf[js.Any])
    
    inline def setVs_currenciesVarargs(value: String*): Self = StObject.set(x, "vs_currencies", js.Array(value*))
  }
}
