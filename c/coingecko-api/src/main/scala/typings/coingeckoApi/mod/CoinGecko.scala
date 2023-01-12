package typings.coingeckoApi.mod

import typings.coingeckoApi.anon.All
import typings.coingeckoApi.anon.Fetch
import typings.coingeckoApi.anon.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinGecko extends StObject {
  
  var coins: All
  
  var exchanges: Fetch
  
  /**
    * Get cryptocurrency global data
    */
  def global(): js.Promise[Response[Any]]
  
  /**
    * Check API server status
    */
  def ping(): js.Promise[Response[Any]]
  
  var simple: Price
}
object CoinGecko {
  
  inline def apply(
    coins: All,
    exchanges: Fetch,
    global: () => js.Promise[Response[Any]],
    ping: () => js.Promise[Response[Any]],
    simple: Price
  ): CoinGecko = {
    val __obj = js.Dynamic.literal(coins = coins.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], global = js.Any.fromFunction0(global), ping = js.Any.fromFunction0(ping), simple = simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinGecko]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoinGecko] (val x: Self) extends AnyVal {
    
    inline def setCoins(value: All): Self = StObject.set(x, "coins", value.asInstanceOf[js.Any])
    
    inline def setExchanges(value: Fetch): Self = StObject.set(x, "exchanges", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: () => js.Promise[Response[Any]]): Self = StObject.set(x, "global", js.Any.fromFunction0(value))
    
    inline def setPing(value: () => js.Promise[Response[Any]]): Self = StObject.set(x, "ping", js.Any.fromFunction0(value))
    
    inline def setSimple(value: Price): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
  }
}
