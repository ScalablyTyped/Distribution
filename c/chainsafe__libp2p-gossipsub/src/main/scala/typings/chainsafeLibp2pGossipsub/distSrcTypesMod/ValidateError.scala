package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidateError extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/types", "ValidateError")
@js.native
object ValidateError extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidateError & String] = js.native
  
  @js.native
  sealed trait FromPresent
    extends StObject
       with ValidateError
  /* "from_present" */ val FromPresent: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.FromPresent & String = js.native
  
  @js.native
  sealed trait InvalidPeerId
    extends StObject
       with ValidateError
  /* "invalid_peerid" */ val InvalidPeerId: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.InvalidPeerId & String = js.native
  
  @js.native
  sealed trait InvalidSeqno
    extends StObject
       with ValidateError
  /* "invalid_seqno" */ val InvalidSeqno: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.InvalidSeqno & String = js.native
  
  @js.native
  sealed trait InvalidSignature
    extends StObject
       with ValidateError
  /* "invalid_signature" */ val InvalidSignature: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.InvalidSignature & String = js.native
  
  @js.native
  sealed trait SeqnoPresent
    extends StObject
       with ValidateError
  /* "seqno_present" */ val SeqnoPresent: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.SeqnoPresent & String = js.native
  
  @js.native
  sealed trait SignaturePresent
    extends StObject
       with ValidateError
  /* "signature_present" */ val SignaturePresent: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.SignaturePresent & String = js.native
  
  @js.native
  sealed trait TransformFailed
    extends StObject
       with ValidateError
  /* "transform_failed" */ val TransformFailed: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.TransformFailed & String = js.native
}
