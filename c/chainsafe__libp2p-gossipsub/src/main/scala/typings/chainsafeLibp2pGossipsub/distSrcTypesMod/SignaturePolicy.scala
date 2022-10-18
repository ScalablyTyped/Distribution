package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SignaturePolicy extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/types", "SignaturePolicy")
@js.native
object SignaturePolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SignaturePolicy & String] = js.native
  
  /**
    * On the producing side:
    * - Build messages without the signature, key, from and seqno fields.
    * - The corresponding protobuf key-value pairs are absent from the marshalled message, not just empty.
    *
    * On the consuming side:
    * - Enforce the fields to be absent, reject otherwise.
    * - Propagate only if the fields are absent, reject otherwise.
    * - A message_id function will not be able to use the above fields, and should instead rely on the data field. A commonplace strategy is to calculate a hash.
    */
  @js.native
  sealed trait StrictNoSign
    extends StObject
       with SignaturePolicy
  /* "StrictNoSign" */ val StrictNoSign: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.SignaturePolicy.StrictNoSign & String = js.native
  
  /**
    * On the producing side:
    * - Build messages with the signature, key (from may be enough for certain inlineable public key types), from and seqno fields.
    *
    * On the consuming side:
    * - Enforce the fields to be present, reject otherwise.
    * - Propagate only if the fields are valid and signature can be verified, reject otherwise.
    */
  @js.native
  sealed trait StrictSign
    extends StObject
       with SignaturePolicy
  /* "StrictSign" */ val StrictSign: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.SignaturePolicy.StrictSign & String = js.native
}
