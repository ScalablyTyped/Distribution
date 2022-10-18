package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubBooleans.`false`
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.PromiseDeliveredStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expired
  extends StObject
     with PromiseDeliveredStats {
  
  var expired: `false`
  
  var maxDeliverMs: Double
  
  var requestedCount: Double
}
object Expired {
  
  inline def apply(maxDeliverMs: Double, requestedCount: Double): Expired = {
    val __obj = js.Dynamic.literal(expired = false, maxDeliverMs = maxDeliverMs.asInstanceOf[js.Any], requestedCount = requestedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expired]
  }
  
  extension [Self <: Expired](x: Self) {
    
    inline def setExpired(value: `false`): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setMaxDeliverMs(value: Double): Self = StObject.set(x, "maxDeliverMs", value.asInstanceOf[js.Any])
    
    inline def setRequestedCount(value: Double): Self = StObject.set(x, "requestedCount", value.asInstanceOf[js.Any])
  }
}
