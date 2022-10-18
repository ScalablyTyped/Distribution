package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageStatus extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/types", "MessageStatus")
@js.native
object MessageStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageStatus & String] = js.native
  
  @js.native
  sealed trait duplicate
    extends StObject
       with MessageStatus
  /* "duplicate" */ val duplicate: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus.duplicate & String = js.native
  
  @js.native
  sealed trait invalid
    extends StObject
       with MessageStatus
  /* "invalid" */ val invalid: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus.invalid & String = js.native
  
  @js.native
  sealed trait valid
    extends StObject
       with MessageStatus
  /* "valid" */ val valid: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus.valid & String = js.native
}
