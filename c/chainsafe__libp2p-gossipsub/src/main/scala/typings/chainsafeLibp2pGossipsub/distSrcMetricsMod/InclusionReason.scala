package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InclusionReason extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/metrics", "InclusionReason")
@js.native
object InclusionReason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InclusionReason & String] = js.native
  
  /** Peer was a fanaout peer. */
  @js.native
  sealed trait Fanout
    extends StObject
       with InclusionReason
  /* "fanout" */ val Fanout: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Fanout & String = js.native
  
  /** On heartbeat, not enough peers in mesh */
  @js.native
  sealed trait NotEnough
    extends StObject
       with InclusionReason
  /* "not_enough" */ val NotEnough: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.NotEnough & String = js.native
  
  /** On heartbeat opportunistic grafting due to low mesh score */
  @js.native
  sealed trait Opportunistic
    extends StObject
       with InclusionReason
  /* "opportunistic" */ val Opportunistic: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Opportunistic & String = js.native
  
  /** On heartbeat, peer was included to fill the outbound quota. */
  @js.native
  sealed trait Outbound
    extends StObject
       with InclusionReason
  /* "outbound" */ val Outbound: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Outbound & String = js.native
  
  /** Included from random selection. */
  @js.native
  sealed trait Random
    extends StObject
       with InclusionReason
  /* "random" */ val Random: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Random & String = js.native
  
  /** Peer subscribed. */
  @js.native
  sealed trait Subscribed
    extends StObject
       with InclusionReason
  /* "subscribed" */ val Subscribed: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason.Subscribed & String = js.native
}
