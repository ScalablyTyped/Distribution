package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinsFetchMarketChartRangeParams extends StObject {
  
  /**
    * From date in UNIX Timestamp (eg. 1392577232)
    */
  var from: Double
  
  /**
    * To date in UNIX Timestamp (eg. 1422577232)
    */
  var to: Double
  
  /**
    * The target currency of market data (usd, eur, jpy, etc.)
    */
  var vs_currency: String
}
object CoinsFetchMarketChartRangeParams {
  
  inline def apply(from: Double, to: Double, vs_currency: String): CoinsFetchMarketChartRangeParams = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], vs_currency = vs_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinsFetchMarketChartRangeParams]
  }
  
  extension [Self <: CoinsFetchMarketChartRangeParams](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setVs_currency(value: String): Self = StObject.set(x, "vs_currency", value.asInstanceOf[js.Any])
  }
}
