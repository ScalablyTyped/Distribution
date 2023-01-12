package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinsFetchMarketChartParams extends StObject {
  
  /**
    * Data up to number of days ago (eg. 1, 14, 30, max)
    */
  var days: String
  
  /**
    * Data interval. Possible value: daily
    */
  var interval: js.UndefOr[String] = js.undefined
  
  /**
    * The target currency of market data (usd, eur, jpy, etc.)
    */
  var vs_currency: String
}
object CoinsFetchMarketChartParams {
  
  inline def apply(days: String, vs_currency: String): CoinsFetchMarketChartParams = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], vs_currency = vs_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinsFetchMarketChartParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoinsFetchMarketChartParams] (val x: Self) extends AnyVal {
    
    inline def setDays(value: String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setVs_currency(value: String): Self = StObject.set(x, "vs_currency", value.asInstanceOf[js.Any])
  }
}
