package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreParamsMod.PeerScoreParams
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerStatsMod.PeerStats
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcScoreScoreMetricsMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score/scoreMetrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeAllPeersScoreWeights(
    peerIdStrs: js.Iterable[String],
    peerStats: Map[String, PeerStats],
    params: PeerScoreParams,
    peerIPs: Map[String, Set[String]],
    topicStrToLabel: TopicStrToLabel
  ): ScoreWeights[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAllPeersScoreWeights")(peerIdStrs.asInstanceOf[js.Any], peerStats.asInstanceOf[js.Any], params.asInstanceOf[js.Any], peerIPs.asInstanceOf[js.Any], topicStrToLabel.asInstanceOf[js.Any])).asInstanceOf[ScoreWeights[js.Array[Double]]]
  
  inline def computeScoreWeights(
    peer: String,
    pstats: PeerStats,
    params: PeerScoreParams,
    peerIPs: Map[String, Set[String]],
    topicStrToLabel: TopicStrToLabel
  ): ScoreWeights[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeScoreWeights")(peer.asInstanceOf[js.Any], pstats.asInstanceOf[js.Any], params.asInstanceOf[js.Any], peerIPs.asInstanceOf[js.Any], topicStrToLabel.asInstanceOf[js.Any])).asInstanceOf[ScoreWeights[Double]]
  
  trait ScoreWeights[T] extends StObject {
    
    var byTopic: Map[TopicLabel, TopicScoreWeights[T]]
    
    var p5w: T
    
    var p6w: T
    
    var p7w: T
    
    var score: T
  }
  object ScoreWeights {
    
    inline def apply[T](byTopic: Map[TopicLabel, TopicScoreWeights[T]], p5w: T, p6w: T, p7w: T, score: T): ScoreWeights[T] = {
      val __obj = js.Dynamic.literal(byTopic = byTopic.asInstanceOf[js.Any], p5w = p5w.asInstanceOf[js.Any], p6w = p6w.asInstanceOf[js.Any], p7w = p7w.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScoreWeights[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScoreWeights[?], T] (val x: Self & ScoreWeights[T]) extends AnyVal {
      
      inline def setByTopic(value: Map[TopicLabel, TopicScoreWeights[T]]): Self = StObject.set(x, "byTopic", value.asInstanceOf[js.Any])
      
      inline def setP5w(value: T): Self = StObject.set(x, "p5w", value.asInstanceOf[js.Any])
      
      inline def setP6w(value: T): Self = StObject.set(x, "p6w", value.asInstanceOf[js.Any])
      
      inline def setP7w(value: T): Self = StObject.set(x, "p7w", value.asInstanceOf[js.Any])
      
      inline def setScore(value: T): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  type TopicLabel = String
  
  trait TopicScoreWeights[T] extends StObject {
    
    var p1w: T
    
    var p2w: T
    
    var p3bw: T
    
    var p3w: T
    
    var p4w: T
  }
  object TopicScoreWeights {
    
    inline def apply[T](p1w: T, p2w: T, p3bw: T, p3w: T, p4w: T): TopicScoreWeights[T] = {
      val __obj = js.Dynamic.literal(p1w = p1w.asInstanceOf[js.Any], p2w = p2w.asInstanceOf[js.Any], p3bw = p3bw.asInstanceOf[js.Any], p3w = p3w.asInstanceOf[js.Any], p4w = p4w.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicScoreWeights[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TopicScoreWeights[?], T] (val x: Self & TopicScoreWeights[T]) extends AnyVal {
      
      inline def setP1w(value: T): Self = StObject.set(x, "p1w", value.asInstanceOf[js.Any])
      
      inline def setP2w(value: T): Self = StObject.set(x, "p2w", value.asInstanceOf[js.Any])
      
      inline def setP3bw(value: T): Self = StObject.set(x, "p3bw", value.asInstanceOf[js.Any])
      
      inline def setP3w(value: T): Self = StObject.set(x, "p3w", value.asInstanceOf[js.Any])
      
      inline def setP4w(value: T): Self = StObject.set(x, "p4w", value.asInstanceOf[js.Any])
    }
  }
  
  type TopicStr = String
  
  type TopicStrToLabel = Map[TopicStr, TopicLabel]
}
