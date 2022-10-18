package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.anon.PartialPeerScoreThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcScorePeerScoreThresholdsMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score/peer-score-thresholds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPeerScoreThresholds(): PeerScoreThresholds = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreThresholds")().asInstanceOf[PeerScoreThresholds]
  inline def createPeerScoreThresholds(p: PartialPeerScoreThreshold): PeerScoreThresholds = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreThresholds")(p.asInstanceOf[js.Any]).asInstanceOf[PeerScoreThresholds]
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score/peer-score-thresholds", "defaultPeerScoreThresholds")
  @js.native
  val defaultPeerScoreThresholds: PeerScoreThresholds = js.native
  
  inline def validatePeerScoreThresholds(p: PeerScoreThresholds): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePeerScoreThresholds")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait PeerScoreThresholds extends StObject {
    
    /**
      * acceptPXThreshold is the score threshold below which PX will be ignored; this should be positive
      * and limited to scores attainable by bootstrappers and other trusted nodes.
      */
    var acceptPXThreshold: Double
    
    /**
      * gossipThreshold is the score threshold below which gossip propagation is supressed;
      * should be negative.
      */
    var gossipThreshold: Double
    
    /**
      * graylistThreshold is the score threshold below which message processing is supressed altogether,
      * implementing an effective graylist according to peer score; should be negative and <= PublisThreshold.
      */
    var graylistThreshold: Double
    
    /**
      * opportunisticGraftThreshold is the median mesh score threshold before triggering opportunistic
      * grafting; this should have a small positive value.
      */
    var opportunisticGraftThreshold: Double
    
    /**
      * publishThreshold is the score threshold below which we shouldn't publish when using flood
      * publishing (also applies to fanout and floodsub peers); should be negative and <= GossipThreshold.
      */
    var publishThreshold: Double
  }
  object PeerScoreThresholds {
    
    inline def apply(
      acceptPXThreshold: Double,
      gossipThreshold: Double,
      graylistThreshold: Double,
      opportunisticGraftThreshold: Double,
      publishThreshold: Double
    ): PeerScoreThresholds = {
      val __obj = js.Dynamic.literal(acceptPXThreshold = acceptPXThreshold.asInstanceOf[js.Any], gossipThreshold = gossipThreshold.asInstanceOf[js.Any], graylistThreshold = graylistThreshold.asInstanceOf[js.Any], opportunisticGraftThreshold = opportunisticGraftThreshold.asInstanceOf[js.Any], publishThreshold = publishThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerScoreThresholds]
    }
    
    extension [Self <: PeerScoreThresholds](x: Self) {
      
      inline def setAcceptPXThreshold(value: Double): Self = StObject.set(x, "acceptPXThreshold", value.asInstanceOf[js.Any])
      
      inline def setGossipThreshold(value: Double): Self = StObject.set(x, "gossipThreshold", value.asInstanceOf[js.Any])
      
      inline def setGraylistThreshold(value: Double): Self = StObject.set(x, "graylistThreshold", value.asInstanceOf[js.Any])
      
      inline def setOpportunisticGraftThreshold(value: Double): Self = StObject.set(x, "opportunisticGraftThreshold", value.asInstanceOf[js.Any])
      
      inline def setPublishThreshold(value: Double): Self = StObject.set(x, "publishThreshold", value.asInstanceOf[js.Any])
    }
  }
}
