package typings.chainsafeLibp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub/dist/src/score/peer-score-params.TopicScoreParams> */
trait PartialTopicScoreParams extends StObject {
  
  var firstMessageDeliveriesCap: js.UndefOr[Double] = js.undefined
  
  var firstMessageDeliveriesDecay: js.UndefOr[Double] = js.undefined
  
  var firstMessageDeliveriesWeight: js.UndefOr[Double] = js.undefined
  
  var invalidMessageDeliveriesDecay: js.UndefOr[Double] = js.undefined
  
  var invalidMessageDeliveriesWeight: js.UndefOr[Double] = js.undefined
  
  var meshFailurePenaltyDecay: js.UndefOr[Double] = js.undefined
  
  var meshFailurePenaltyWeight: js.UndefOr[Double] = js.undefined
  
  var meshMessageDeliveriesActivation: js.UndefOr[Double] = js.undefined
  
  var meshMessageDeliveriesCap: js.UndefOr[Double] = js.undefined
  
  var meshMessageDeliveriesDecay: js.UndefOr[Double] = js.undefined
  
  var meshMessageDeliveriesThreshold: js.UndefOr[Double] = js.undefined
  
  var meshMessageDeliveriesWeight: js.UndefOr[Double] = js.undefined
  
  var meshMessageDeliveriesWindow: js.UndefOr[Double] = js.undefined
  
  var timeInMeshCap: js.UndefOr[Double] = js.undefined
  
  var timeInMeshQuantum: js.UndefOr[Double] = js.undefined
  
  var timeInMeshWeight: js.UndefOr[Double] = js.undefined
  
  var topicWeight: js.UndefOr[Double] = js.undefined
}
object PartialTopicScoreParams {
  
  inline def apply(): PartialTopicScoreParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTopicScoreParams]
  }
  
  extension [Self <: PartialTopicScoreParams](x: Self) {
    
    inline def setFirstMessageDeliveriesCap(value: Double): Self = StObject.set(x, "firstMessageDeliveriesCap", value.asInstanceOf[js.Any])
    
    inline def setFirstMessageDeliveriesCapUndefined: Self = StObject.set(x, "firstMessageDeliveriesCap", js.undefined)
    
    inline def setFirstMessageDeliveriesDecay(value: Double): Self = StObject.set(x, "firstMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    inline def setFirstMessageDeliveriesDecayUndefined: Self = StObject.set(x, "firstMessageDeliveriesDecay", js.undefined)
    
    inline def setFirstMessageDeliveriesWeight(value: Double): Self = StObject.set(x, "firstMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    inline def setFirstMessageDeliveriesWeightUndefined: Self = StObject.set(x, "firstMessageDeliveriesWeight", js.undefined)
    
    inline def setInvalidMessageDeliveriesDecay(value: Double): Self = StObject.set(x, "invalidMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    inline def setInvalidMessageDeliveriesDecayUndefined: Self = StObject.set(x, "invalidMessageDeliveriesDecay", js.undefined)
    
    inline def setInvalidMessageDeliveriesWeight(value: Double): Self = StObject.set(x, "invalidMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    inline def setInvalidMessageDeliveriesWeightUndefined: Self = StObject.set(x, "invalidMessageDeliveriesWeight", js.undefined)
    
    inline def setMeshFailurePenaltyDecay(value: Double): Self = StObject.set(x, "meshFailurePenaltyDecay", value.asInstanceOf[js.Any])
    
    inline def setMeshFailurePenaltyDecayUndefined: Self = StObject.set(x, "meshFailurePenaltyDecay", js.undefined)
    
    inline def setMeshFailurePenaltyWeight(value: Double): Self = StObject.set(x, "meshFailurePenaltyWeight", value.asInstanceOf[js.Any])
    
    inline def setMeshFailurePenaltyWeightUndefined: Self = StObject.set(x, "meshFailurePenaltyWeight", js.undefined)
    
    inline def setMeshMessageDeliveriesActivation(value: Double): Self = StObject.set(x, "meshMessageDeliveriesActivation", value.asInstanceOf[js.Any])
    
    inline def setMeshMessageDeliveriesActivationUndefined: Self = StObject.set(x, "meshMessageDeliveriesActivation", js.undefined)
    
    inline def setMeshMessageDeliveriesCap(value: Double): Self = StObject.set(x, "meshMessageDeliveriesCap", value.asInstanceOf[js.Any])
    
    inline def setMeshMessageDeliveriesCapUndefined: Self = StObject.set(x, "meshMessageDeliveriesCap", js.undefined)
    
    inline def setMeshMessageDeliveriesDecay(value: Double): Self = StObject.set(x, "meshMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    inline def setMeshMessageDeliveriesDecayUndefined: Self = StObject.set(x, "meshMessageDeliveriesDecay", js.undefined)
    
    inline def setMeshMessageDeliveriesThreshold(value: Double): Self = StObject.set(x, "meshMessageDeliveriesThreshold", value.asInstanceOf[js.Any])
    
    inline def setMeshMessageDeliveriesThresholdUndefined: Self = StObject.set(x, "meshMessageDeliveriesThreshold", js.undefined)
    
    inline def setMeshMessageDeliveriesWeight(value: Double): Self = StObject.set(x, "meshMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    inline def setMeshMessageDeliveriesWeightUndefined: Self = StObject.set(x, "meshMessageDeliveriesWeight", js.undefined)
    
    inline def setMeshMessageDeliveriesWindow(value: Double): Self = StObject.set(x, "meshMessageDeliveriesWindow", value.asInstanceOf[js.Any])
    
    inline def setMeshMessageDeliveriesWindowUndefined: Self = StObject.set(x, "meshMessageDeliveriesWindow", js.undefined)
    
    inline def setTimeInMeshCap(value: Double): Self = StObject.set(x, "timeInMeshCap", value.asInstanceOf[js.Any])
    
    inline def setTimeInMeshCapUndefined: Self = StObject.set(x, "timeInMeshCap", js.undefined)
    
    inline def setTimeInMeshQuantum(value: Double): Self = StObject.set(x, "timeInMeshQuantum", value.asInstanceOf[js.Any])
    
    inline def setTimeInMeshQuantumUndefined: Self = StObject.set(x, "timeInMeshQuantum", js.undefined)
    
    inline def setTimeInMeshWeight(value: Double): Self = StObject.set(x, "timeInMeshWeight", value.asInstanceOf[js.Any])
    
    inline def setTimeInMeshWeightUndefined: Self = StObject.set(x, "timeInMeshWeight", js.undefined)
    
    inline def setTopicWeight(value: Double): Self = StObject.set(x, "topicWeight", value.asInstanceOf[js.Any])
    
    inline def setTopicWeightUndefined: Self = StObject.set(x, "topicWeight", js.undefined)
  }
}
