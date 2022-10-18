package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.chainsafeLibp2pGossipsub.anon.Expired
  - typings.chainsafeLibp2pGossipsub.anon.MaxDeliverMs
*/
trait PromiseDeliveredStats extends StObject
object PromiseDeliveredStats {
  
  inline def Expired(maxDeliverMs: Double, requestedCount: Double): typings.chainsafeLibp2pGossipsub.anon.Expired = {
    val __obj = js.Dynamic.literal(expired = false, maxDeliverMs = maxDeliverMs.asInstanceOf[js.Any], requestedCount = requestedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.chainsafeLibp2pGossipsub.anon.Expired]
  }
  
  inline def MaxDeliverMs(maxDeliverMs: Double): typings.chainsafeLibp2pGossipsub.anon.MaxDeliverMs = {
    val __obj = js.Dynamic.literal(expired = true, maxDeliverMs = maxDeliverMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.chainsafeLibp2pGossipsub.anon.MaxDeliverMs]
  }
}
