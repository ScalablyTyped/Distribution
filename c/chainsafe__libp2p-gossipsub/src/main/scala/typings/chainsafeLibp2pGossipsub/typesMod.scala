package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Ignore
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Reject
import typings.libp2pInterfacePubsub.mod.TopicValidatorResult
import typings.libp2pInterfacePubsub.mod.TopicValidatorResult.Accept
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object typesMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/types", "MessageStatus")
  @js.native
  object MessageStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus & String] = js.native
    
    /* "duplicate" */ val duplicate: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus.duplicate & String = js.native
    
    /* "invalid" */ val invalid: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus.invalid & String = js.native
    
    /* "valid" */ val valid: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus.valid & String = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/types", "PublishConfigType")
  @js.native
  object PublishConfigType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfigType & Double] = js.native
    
    /* 1 */ val Anonymous: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfigType.Anonymous & Double = js.native
    
    /* 0 */ val Signing: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfigType.Signing & Double = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/types", "RejectReason")
  @js.native
  object RejectReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason & String] = js.native
    
    /* "blacklisted" */ val Blacklisted: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Blacklisted & String = js.native
    
    /* "error" */ val Error: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error & String = js.native
    
    /* "ignore" */ val Ignore: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Ignore & String = js.native
    
    /* "reject" */ val Reject: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Reject & String = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/types", "SignaturePolicy")
  @js.native
  object SignaturePolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.SignaturePolicy & String] = js.native
    
    /* "StrictNoSign" */ val StrictNoSign: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.SignaturePolicy.StrictNoSign & String = js.native
    
    /* "StrictSign" */ val StrictSign: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.SignaturePolicy.StrictSign & String = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/types", "ValidateError")
  @js.native
  object ValidateError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError & String] = js.native
    
    /* "from_present" */ val FromPresent: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.FromPresent & String = js.native
    
    /* "invalid_peerid" */ val InvalidPeerId: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.InvalidPeerId & String = js.native
    
    /* "invalid_seqno" */ val InvalidSeqno: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.InvalidSeqno & String = js.native
    
    /* "invalid_signature" */ val InvalidSignature: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.InvalidSignature & String = js.native
    
    /* "seqno_present" */ val SeqnoPresent: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.SeqnoPresent & String = js.native
    
    /* "signature_present" */ val SignaturePresent: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.SignaturePresent & String = js.native
    
    /* "transform_failed" */ val TransformFailed: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError.TransformFailed & String = js.native
  }
  
  inline def rejectReasonFromAcceptance(acceptance: Exclude[TopicValidatorResult, Accept]): Ignore | Reject = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectReasonFromAcceptance")(acceptance.asInstanceOf[js.Any]).asInstanceOf[Ignore | Reject]
}
