package typings.chainsafeLibp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BehaviourPenaltyThreshold extends StObject {
  
  var behaviourPenaltyThreshold: Double
  
  var gossipPromiseExpireSec: Double
  
  var maxMeshMessageDeliveriesWindowSec: Double
}
object BehaviourPenaltyThreshold {
  
  inline def apply(
    behaviourPenaltyThreshold: Double,
    gossipPromiseExpireSec: Double,
    maxMeshMessageDeliveriesWindowSec: Double
  ): BehaviourPenaltyThreshold = {
    val __obj = js.Dynamic.literal(behaviourPenaltyThreshold = behaviourPenaltyThreshold.asInstanceOf[js.Any], gossipPromiseExpireSec = gossipPromiseExpireSec.asInstanceOf[js.Any], maxMeshMessageDeliveriesWindowSec = maxMeshMessageDeliveriesWindowSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviourPenaltyThreshold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BehaviourPenaltyThreshold] (val x: Self) extends AnyVal {
    
    inline def setBehaviourPenaltyThreshold(value: Double): Self = StObject.set(x, "behaviourPenaltyThreshold", value.asInstanceOf[js.Any])
    
    inline def setGossipPromiseExpireSec(value: Double): Self = StObject.set(x, "gossipPromiseExpireSec", value.asInstanceOf[js.Any])
    
    inline def setMaxMeshMessageDeliveriesWindowSec(value: Double): Self = StObject.set(x, "maxMeshMessageDeliveriesWindowSec", value.asInstanceOf[js.Any])
  }
}
