package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScorePenalty extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/metrics", "ScorePenalty")
@js.native
object ScorePenalty extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScorePenalty & String] = js.native
  
  @js.native
  sealed trait BrokenPromise
    extends StObject
       with ScorePenalty
  /* "broken_promise" */ val BrokenPromise: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty.BrokenPromise & String = js.native
  
  @js.native
  sealed trait GraftBackoff
    extends StObject
       with ScorePenalty
  /* "graft_backoff" */ val GraftBackoff: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty.GraftBackoff & String = js.native
  
  @js.native
  sealed trait IPColocation
    extends StObject
       with ScorePenalty
  /* "IP_colocation" */ val IPColocation: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty.IPColocation & String = js.native
  
  @js.native
  sealed trait MessageDeficit
    extends StObject
       with ScorePenalty
  /* "message_deficit" */ val MessageDeficit: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty.MessageDeficit & String = js.native
}
