package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageAcceptance extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/types", "MessageAcceptance")
@js.native
object MessageAcceptance extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageAcceptance & String] = js.native
  
  @js.native
  sealed trait Accept
    extends StObject
       with MessageAcceptance
  /* "accept" */ val Accept: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageAcceptance.Accept & String = js.native
  
  @js.native
  sealed trait Ignore
    extends StObject
       with MessageAcceptance
  /* "ignore" */ val Ignore: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageAcceptance.Ignore & String = js.native
  
  @js.native
  sealed trait Reject
    extends StObject
       with MessageAcceptance
  /* "reject" */ val Reject: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageAcceptance.Reject & String = js.native
}
