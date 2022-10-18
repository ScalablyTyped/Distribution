package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreParamsMod.TopicScoreParams
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub/dist/src/score/peer-score-params.PeerScoreParams> */
trait PartialPeerScoreParams extends StObject {
  
  var IPColocationFactorThreshold: js.UndefOr[Double] = js.undefined
  
  var IPColocationFactorWeight: js.UndefOr[Double] = js.undefined
  
  var IPColocationFactorWhitelist: js.UndefOr[Set[String]] = js.undefined
  
  var appSpecificScore: js.UndefOr[js.Function1[/* p */ String, Double]] = js.undefined
  
  var appSpecificWeight: js.UndefOr[Double] = js.undefined
  
  var behaviourPenaltyDecay: js.UndefOr[Double] = js.undefined
  
  var behaviourPenaltyThreshold: js.UndefOr[Double] = js.undefined
  
  var behaviourPenaltyWeight: js.UndefOr[Double] = js.undefined
  
  var decayInterval: js.UndefOr[Double] = js.undefined
  
  var decayToZero: js.UndefOr[Double] = js.undefined
  
  var retainScore: js.UndefOr[Double] = js.undefined
  
  var topicScoreCap: js.UndefOr[Double] = js.undefined
  
  var topics: js.UndefOr[Record[String, TopicScoreParams]] = js.undefined
}
object PartialPeerScoreParams {
  
  inline def apply(): PartialPeerScoreParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPeerScoreParams]
  }
  
  extension [Self <: PartialPeerScoreParams](x: Self) {
    
    inline def setAppSpecificScore(value: /* p */ String => Double): Self = StObject.set(x, "appSpecificScore", js.Any.fromFunction1(value))
    
    inline def setAppSpecificScoreUndefined: Self = StObject.set(x, "appSpecificScore", js.undefined)
    
    inline def setAppSpecificWeight(value: Double): Self = StObject.set(x, "appSpecificWeight", value.asInstanceOf[js.Any])
    
    inline def setAppSpecificWeightUndefined: Self = StObject.set(x, "appSpecificWeight", js.undefined)
    
    inline def setBehaviourPenaltyDecay(value: Double): Self = StObject.set(x, "behaviourPenaltyDecay", value.asInstanceOf[js.Any])
    
    inline def setBehaviourPenaltyDecayUndefined: Self = StObject.set(x, "behaviourPenaltyDecay", js.undefined)
    
    inline def setBehaviourPenaltyThreshold(value: Double): Self = StObject.set(x, "behaviourPenaltyThreshold", value.asInstanceOf[js.Any])
    
    inline def setBehaviourPenaltyThresholdUndefined: Self = StObject.set(x, "behaviourPenaltyThreshold", js.undefined)
    
    inline def setBehaviourPenaltyWeight(value: Double): Self = StObject.set(x, "behaviourPenaltyWeight", value.asInstanceOf[js.Any])
    
    inline def setBehaviourPenaltyWeightUndefined: Self = StObject.set(x, "behaviourPenaltyWeight", js.undefined)
    
    inline def setDecayInterval(value: Double): Self = StObject.set(x, "decayInterval", value.asInstanceOf[js.Any])
    
    inline def setDecayIntervalUndefined: Self = StObject.set(x, "decayInterval", js.undefined)
    
    inline def setDecayToZero(value: Double): Self = StObject.set(x, "decayToZero", value.asInstanceOf[js.Any])
    
    inline def setDecayToZeroUndefined: Self = StObject.set(x, "decayToZero", js.undefined)
    
    inline def setIPColocationFactorThreshold(value: Double): Self = StObject.set(x, "IPColocationFactorThreshold", value.asInstanceOf[js.Any])
    
    inline def setIPColocationFactorThresholdUndefined: Self = StObject.set(x, "IPColocationFactorThreshold", js.undefined)
    
    inline def setIPColocationFactorWeight(value: Double): Self = StObject.set(x, "IPColocationFactorWeight", value.asInstanceOf[js.Any])
    
    inline def setIPColocationFactorWeightUndefined: Self = StObject.set(x, "IPColocationFactorWeight", js.undefined)
    
    inline def setIPColocationFactorWhitelist(value: Set[String]): Self = StObject.set(x, "IPColocationFactorWhitelist", value.asInstanceOf[js.Any])
    
    inline def setIPColocationFactorWhitelistUndefined: Self = StObject.set(x, "IPColocationFactorWhitelist", js.undefined)
    
    inline def setRetainScore(value: Double): Self = StObject.set(x, "retainScore", value.asInstanceOf[js.Any])
    
    inline def setRetainScoreUndefined: Self = StObject.set(x, "retainScore", js.undefined)
    
    inline def setTopicScoreCap(value: Double): Self = StObject.set(x, "topicScoreCap", value.asInstanceOf[js.Any])
    
    inline def setTopicScoreCapUndefined: Self = StObject.set(x, "topicScoreCap", js.undefined)
    
    inline def setTopics(value: Record[String, TopicScoreParams]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
  }
}
