package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.anon.AsyncValidationMcacheHit
import typings.chainsafeLibp2pGossipsub.anon.BehaviourPenaltyThreshold
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.MetricsRegister
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicStrToLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object metricsMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/metrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/metrics", "ChurnReason")
  @js.native
  object ChurnReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason & String] = js.native
    
    /* "bad_score" */ val BadScore: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.BadScore & String = js.native
    
    /* "disconnected" */ val Dc: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.Dc & String = js.native
    
    /* "excess" */ val Excess: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.Excess & String = js.native
    
    /* "prune" */ val Prune: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.Prune & String = js.native
    
    /* "unsubscribed" */ val Unsub: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.Unsub & String = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/metrics", "IHaveIgnoreReason")
  @js.native
  object IHaveIgnoreReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.IHaveIgnoreReason & String] = js.native
    
    /* "low_score" */ val LowScore: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.IHaveIgnoreReason.LowScore & String = js.native
    
    /* "max_iasked" */ val MaxIasked: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.IHaveIgnoreReason.MaxIasked & String = js.native
    
    /* "max_ihave" */ val MaxIhave: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.IHaveIgnoreReason.MaxIhave & String = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/metrics", "InclusionReason")
  @js.native
  object InclusionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason & String] = js.native
    
    /* "fanout" */ val Fanout: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Fanout & String = js.native
    
    /* "not_enough" */ val NotEnough: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.NotEnough & String = js.native
    
    /* "opportunistic" */ val Opportunistic: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Opportunistic & String = js.native
    
    /* "outbound" */ val Outbound: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Outbound & String = js.native
    
    /* "random" */ val Random: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Random & String = js.native
    
    /* "subscribed" */ val Subscribed: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Subscribed & String = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/metrics", "MessageSource")
  @js.native
  object MessageSource extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.MessageSource & String] = js.native
    
    /* "forward" */ val forward: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.MessageSource.forward & String = js.native
    
    /* "publish" */ val publish: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.MessageSource.publish & String = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/metrics", "ScorePenalty")
  @js.native
  object ScorePenalty extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty & String] = js.native
    
    /* "broken_promise" */ val BrokenPromise: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty.BrokenPromise & String = js.native
    
    /* "graft_backoff" */ val GraftBackoff: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty.GraftBackoff & String = js.native
    
    /* "IP_colocation" */ val IPColocation: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty.IPColocation & String = js.native
    
    /* "message_deficit" */ val MessageDeficit: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty.MessageDeficit & String = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/metrics", "ScoreThreshold")
  @js.native
  object ScoreThreshold extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold & String] = js.native
    
    /* "gossip" */ val gossip: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold.gossip & String = js.native
    
    /* "graylist" */ val graylist: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold.graylist & String = js.native
    
    /* "mesh" */ val mesh: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold.mesh & String = js.native
    
    /* "publish" */ val publish: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold.publish & String = js.native
  }
  
  inline def getMetrics(register: MetricsRegister, topicStrToLabel: TopicStrToLabel, opts: BehaviourPenaltyThreshold): AsyncValidationMcacheHit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetrics")(register.asInstanceOf[js.Any], topicStrToLabel.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AsyncValidationMcacheHit]
}
