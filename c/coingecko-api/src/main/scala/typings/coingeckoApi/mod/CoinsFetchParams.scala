package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinsFetchParams extends StObject {
  
  /**
    * Set to false to exclude community_data in response
    * [default: true]
    */
  var community_data: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to false to exclude developer_data in response
    * [default: true]
    */
  var developer_data: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to false to exclude localized languages in response
    * [default: true]
    */
  var localization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to false to exclude market_data in response
    * [default: true]
    */
  var market_data: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to incluse sparkline 7 days in response
    * [default: false]
    */
  var sparkline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to false to exclude tickers data in response
    * [default: true]
    */
  var tickers: js.UndefOr[Boolean] = js.undefined
}
object CoinsFetchParams {
  
  inline def apply(): CoinsFetchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoinsFetchParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoinsFetchParams] (val x: Self) extends AnyVal {
    
    inline def setCommunity_data(value: Boolean): Self = StObject.set(x, "community_data", value.asInstanceOf[js.Any])
    
    inline def setCommunity_dataUndefined: Self = StObject.set(x, "community_data", js.undefined)
    
    inline def setDeveloper_data(value: Boolean): Self = StObject.set(x, "developer_data", value.asInstanceOf[js.Any])
    
    inline def setDeveloper_dataUndefined: Self = StObject.set(x, "developer_data", js.undefined)
    
    inline def setLocalization(value: Boolean): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
    
    inline def setLocalizationUndefined: Self = StObject.set(x, "localization", js.undefined)
    
    inline def setMarket_data(value: Boolean): Self = StObject.set(x, "market_data", value.asInstanceOf[js.Any])
    
    inline def setMarket_dataUndefined: Self = StObject.set(x, "market_data", js.undefined)
    
    inline def setSparkline(value: Boolean): Self = StObject.set(x, "sparkline", value.asInstanceOf[js.Any])
    
    inline def setSparklineUndefined: Self = StObject.set(x, "sparkline", js.undefined)
    
    inline def setTickers(value: Boolean): Self = StObject.set(x, "tickers", value.asInstanceOf[js.Any])
    
    inline def setTickersUndefined: Self = StObject.set(x, "tickers", js.undefined)
  }
}
