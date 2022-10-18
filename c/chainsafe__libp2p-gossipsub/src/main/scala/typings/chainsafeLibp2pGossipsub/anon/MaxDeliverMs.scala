package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubBooleans.`true`
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.PromiseDeliveredStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxDeliverMs
  extends StObject
     with PromiseDeliveredStats {
  
  var expired: `true`
  
  var maxDeliverMs: Double
}
object MaxDeliverMs {
  
  inline def apply(maxDeliverMs: Double): MaxDeliverMs = {
    val __obj = js.Dynamic.literal(expired = true, maxDeliverMs = maxDeliverMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxDeliverMs]
  }
  
  extension [Self <: MaxDeliverMs](x: Self) {
    
    inline def setExpired(value: `true`): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setMaxDeliverMs(value: Double): Self = StObject.set(x, "maxDeliverMs", value.asInstanceOf[js.Any])
  }
}
