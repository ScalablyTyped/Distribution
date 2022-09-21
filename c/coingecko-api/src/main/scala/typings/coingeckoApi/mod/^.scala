package typings.coingeckoApi.mod

import typings.coingeckoApi.anon.All
import typings.coingeckoApi.anon.Fetch
import typings.coingeckoApi.anon.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("coingecko-api", JSImport.Namespace)
@js.native
open class ^ ()
  extends StObject
     with CoinGecko {
  
  /* CompleteClass */
  var coins: All = js.native
  
  /* CompleteClass */
  var exchanges: Fetch = js.native
  
  /**
    * Get cryptocurrency global data
    */
  /* CompleteClass */
  override def global(): js.Promise[Response[Any]] = js.native
  
  /**
    * Check API server status
    */
  /* CompleteClass */
  override def ping(): js.Promise[Response[Any]] = js.native
  
  /* CompleteClass */
  var simple: Price = js.native
}
