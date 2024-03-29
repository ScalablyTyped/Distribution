package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcScorePeerStatsMod {
  
  trait PeerStats extends StObject {
    
    /** behavioural pattern penalties (applied by the router) */
    var behaviourPenalty: Double
    
    /** true if the peer is currently connected */
    var connected: Boolean
    
    /** expiration time of the score stats for disconnected peers */
    var expire: Double
    
    /** IP tracking; store as set for easy processing */
    var knownIPs: Set[String]
    
    /** per topic stats */
    var topics: Record[TopicStr, TopicStats]
  }
  object PeerStats {
    
    inline def apply(
      behaviourPenalty: Double,
      connected: Boolean,
      expire: Double,
      knownIPs: Set[String],
      topics: Record[TopicStr, TopicStats]
    ): PeerStats = {
      val __obj = js.Dynamic.literal(behaviourPenalty = behaviourPenalty.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], knownIPs = knownIPs.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerStats] (val x: Self) extends AnyVal {
      
      inline def setBehaviourPenalty(value: Double): Self = StObject.set(x, "behaviourPenalty", value.asInstanceOf[js.Any])
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setKnownIPs(value: Set[String]): Self = StObject.set(x, "knownIPs", value.asInstanceOf[js.Any])
      
      inline def setTopics(value: Record[TopicStr, TopicStats]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopicStats extends StObject {
    
    /** first message deliveries */
    var firstMessageDeliveries: Double
    
    /** time when the peer was (last) GRAFTed; valid only when in mesh */
    var graftTime: Double
    
    /** true if the peer is in the mesh */
    var inMesh: Boolean
    
    /** invalid message counter */
    var invalidMessageDeliveries: Double
    
    /** sticky mesh rate failure penalty counter */
    var meshFailurePenalty: Double
    
    /** mesh message deliveries */
    var meshMessageDeliveries: Double
    
    /** true if the peer has been enough time in the mesh to activate mess message deliveries */
    var meshMessageDeliveriesActive: Boolean
    
    /** time in mesh (updated during refresh/decay to avoid calling gettimeofday on every score invocation) */
    var meshTime: Double
  }
  object TopicStats {
    
    inline def apply(
      firstMessageDeliveries: Double,
      graftTime: Double,
      inMesh: Boolean,
      invalidMessageDeliveries: Double,
      meshFailurePenalty: Double,
      meshMessageDeliveries: Double,
      meshMessageDeliveriesActive: Boolean,
      meshTime: Double
    ): TopicStats = {
      val __obj = js.Dynamic.literal(firstMessageDeliveries = firstMessageDeliveries.asInstanceOf[js.Any], graftTime = graftTime.asInstanceOf[js.Any], inMesh = inMesh.asInstanceOf[js.Any], invalidMessageDeliveries = invalidMessageDeliveries.asInstanceOf[js.Any], meshFailurePenalty = meshFailurePenalty.asInstanceOf[js.Any], meshMessageDeliveries = meshMessageDeliveries.asInstanceOf[js.Any], meshMessageDeliveriesActive = meshMessageDeliveriesActive.asInstanceOf[js.Any], meshTime = meshTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TopicStats] (val x: Self) extends AnyVal {
      
      inline def setFirstMessageDeliveries(value: Double): Self = StObject.set(x, "firstMessageDeliveries", value.asInstanceOf[js.Any])
      
      inline def setGraftTime(value: Double): Self = StObject.set(x, "graftTime", value.asInstanceOf[js.Any])
      
      inline def setInMesh(value: Boolean): Self = StObject.set(x, "inMesh", value.asInstanceOf[js.Any])
      
      inline def setInvalidMessageDeliveries(value: Double): Self = StObject.set(x, "invalidMessageDeliveries", value.asInstanceOf[js.Any])
      
      inline def setMeshFailurePenalty(value: Double): Self = StObject.set(x, "meshFailurePenalty", value.asInstanceOf[js.Any])
      
      inline def setMeshMessageDeliveries(value: Double): Self = StObject.set(x, "meshMessageDeliveries", value.asInstanceOf[js.Any])
      
      inline def setMeshMessageDeliveriesActive(value: Boolean): Self = StObject.set(x, "meshMessageDeliveriesActive", value.asInstanceOf[js.Any])
      
      inline def setMeshTime(value: Double): Self = StObject.set(x, "meshTime", value.asInstanceOf[js.Any])
    }
  }
}
