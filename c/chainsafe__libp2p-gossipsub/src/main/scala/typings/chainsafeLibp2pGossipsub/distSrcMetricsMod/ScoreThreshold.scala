package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScoreThreshold extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/metrics", "ScoreThreshold")
@js.native
object ScoreThreshold extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScoreThreshold & String] = js.native
  
  @js.native
  sealed trait gossip
    extends StObject
       with ScoreThreshold
  /* "gossip" */ val gossip: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold.gossip & String = js.native
  
  @js.native
  sealed trait graylist
    extends StObject
       with ScoreThreshold
  /* "graylist" */ val graylist: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold.graylist & String = js.native
  
  @js.native
  sealed trait mesh
    extends StObject
       with ScoreThreshold
  /* "mesh" */ val mesh: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold.mesh & String = js.native
  
  @js.native
  sealed trait publish
    extends StObject
       with ScoreThreshold
  /* "publish" */ val publish: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold.publish & String = js.native
}
