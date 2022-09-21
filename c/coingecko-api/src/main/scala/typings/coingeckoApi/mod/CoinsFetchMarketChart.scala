package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinsFetchMarketChart extends StObject {
  
  var market_caps: js.Array[js.Array[Double]]
  
  var prices: js.Array[js.Array[Double]]
  
  var total_volumes: js.Array[js.Array[Double]]
}
object CoinsFetchMarketChart {
  
  inline def apply(
    market_caps: js.Array[js.Array[Double]],
    prices: js.Array[js.Array[Double]],
    total_volumes: js.Array[js.Array[Double]]
  ): CoinsFetchMarketChart = {
    val __obj = js.Dynamic.literal(market_caps = market_caps.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any], total_volumes = total_volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinsFetchMarketChart]
  }
  
  extension [Self <: CoinsFetchMarketChart](x: Self) {
    
    inline def setMarket_caps(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "market_caps", value.asInstanceOf[js.Any])
    
    inline def setMarket_capsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "market_caps", js.Array(value*))
    
    inline def setPrices(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    inline def setPricesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "prices", js.Array(value*))
    
    inline def setTotal_volumes(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "total_volumes", value.asInstanceOf[js.Any])
    
    inline def setTotal_volumesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "total_volumes", js.Array(value*))
  }
}
