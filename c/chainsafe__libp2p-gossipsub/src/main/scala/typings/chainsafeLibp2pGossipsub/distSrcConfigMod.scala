package typings.chainsafeLibp2pGossipsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigMod {
  
  trait GossipsubOptsSpec extends StObject {
    
    /** D sets the optimal degree for a Gossipsub topic mesh. */
    var D: Double
    
    /** Dhi sets the upper bound on the number of peers we keep in a Gossipsub topic mesh. */
    var Dhi: Double
    
    /** Dlazy affects how many peers we will emit gossip to at each heartbeat. */
    var Dlazy: Double
    
    /** Dlo sets the lower bound on the number of peers we keep in a Gossipsub topic mesh. */
    var Dlo: Double
    
    /** Dout sets the quota for the number of outbound connections to maintain in a topic mesh. */
    var Dout: Double
    
    /** Dscore affects how peers are selected when pruning a mesh due to over subscription. */
    var Dscore: Double
    
    /**
      * fanoutTTL controls how long we keep track of the fanout state. If it's been
      * fanoutTTL milliseconds since we've published to a topic that we're not subscribed to,
      * we'll delete the fanout map for that topic.
      */
    var fanoutTTL: Double
    
    /** heartbeatInterval is the time between heartbeats in milliseconds */
    var heartbeatInterval: Double
    
    /** mcacheGossip is the number of windows to gossip about */
    var mcacheGossip: Double
    
    /** mcacheLength is the number of windows to retain full messages for IWANT responses */
    var mcacheLength: Double
    
    /** seenTTL is the number of milliseconds to retain message IDs in the seen cache */
    var seenTTL: Double
  }
  object GossipsubOptsSpec {
    
    inline def apply(
      D: Double,
      Dhi: Double,
      Dlazy: Double,
      Dlo: Double,
      Dout: Double,
      Dscore: Double,
      fanoutTTL: Double,
      heartbeatInterval: Double,
      mcacheGossip: Double,
      mcacheLength: Double,
      seenTTL: Double
    ): GossipsubOptsSpec = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], Dhi = Dhi.asInstanceOf[js.Any], Dlazy = Dlazy.asInstanceOf[js.Any], Dlo = Dlo.asInstanceOf[js.Any], Dout = Dout.asInstanceOf[js.Any], Dscore = Dscore.asInstanceOf[js.Any], fanoutTTL = fanoutTTL.asInstanceOf[js.Any], heartbeatInterval = heartbeatInterval.asInstanceOf[js.Any], mcacheGossip = mcacheGossip.asInstanceOf[js.Any], mcacheLength = mcacheLength.asInstanceOf[js.Any], seenTTL = seenTTL.asInstanceOf[js.Any])
      __obj.asInstanceOf[GossipsubOptsSpec]
    }
    
    extension [Self <: GossipsubOptsSpec](x: Self) {
      
      inline def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setDhi(value: Double): Self = StObject.set(x, "Dhi", value.asInstanceOf[js.Any])
      
      inline def setDlazy(value: Double): Self = StObject.set(x, "Dlazy", value.asInstanceOf[js.Any])
      
      inline def setDlo(value: Double): Self = StObject.set(x, "Dlo", value.asInstanceOf[js.Any])
      
      inline def setDout(value: Double): Self = StObject.set(x, "Dout", value.asInstanceOf[js.Any])
      
      inline def setDscore(value: Double): Self = StObject.set(x, "Dscore", value.asInstanceOf[js.Any])
      
      inline def setFanoutTTL(value: Double): Self = StObject.set(x, "fanoutTTL", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
      
      inline def setMcacheGossip(value: Double): Self = StObject.set(x, "mcacheGossip", value.asInstanceOf[js.Any])
      
      inline def setMcacheLength(value: Double): Self = StObject.set(x, "mcacheLength", value.asInstanceOf[js.Any])
      
      inline def setSeenTTL(value: Double): Self = StObject.set(x, "seenTTL", value.asInstanceOf[js.Any])
    }
  }
}
