package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageSource extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/metrics", "MessageSource")
@js.native
object MessageSource extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageSource & String] = js.native
  
  @js.native
  sealed trait forward
    extends StObject
       with MessageSource
  /* "forward" */ val forward: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.MessageSource.forward & String = js.native
  
  @js.native
  sealed trait publish
    extends StObject
       with MessageSource
  /* "publish" */ val publish: typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.MessageSource.publish & String = js.native
}
