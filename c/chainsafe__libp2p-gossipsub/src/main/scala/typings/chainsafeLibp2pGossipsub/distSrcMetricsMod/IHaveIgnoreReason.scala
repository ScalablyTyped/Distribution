package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IHaveIgnoreReason extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/metrics", "IHaveIgnoreReason")
@js.native
object IHaveIgnoreReason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IHaveIgnoreReason & String] = js.native
  
  @js.native
  sealed trait LowScore
    extends StObject
       with IHaveIgnoreReason
  /* "low_score" */ val LowScore: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.IHaveIgnoreReason.LowScore & String = js.native
  
  @js.native
  sealed trait MaxIasked
    extends StObject
       with IHaveIgnoreReason
  /* "max_iasked" */ val MaxIasked: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.IHaveIgnoreReason.MaxIasked & String = js.native
  
  @js.native
  sealed trait MaxIhave
    extends StObject
       with IHaveIgnoreReason
  /* "max_ihave" */ val MaxIhave: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.IHaveIgnoreReason.MaxIhave & String = js.native
}
