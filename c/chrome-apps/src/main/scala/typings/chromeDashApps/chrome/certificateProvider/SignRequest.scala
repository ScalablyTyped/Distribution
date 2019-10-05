package typings.chromeDashApps.chrome.certificateProvider

import typings.chromeDashApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignRequest extends js.Object {
  /**
    * The DER encoding of a X.509 certificate. The app must sign
    * *digest* using the associated private key.
    */
  var certificate: ArrayBuffer
  /** The digest that must be signed */
  var digest: ArrayBuffer
  /** Refers to the hash algorithm that was used to create *digest*. */
  var hash: Hash
  /**
    * The unique ID to be used by the app should it need to call a method
    * that requires it, e.g. requestPin.
    */
  var signRequestId: integer
}

object SignRequest {
  @scala.inline
  def apply(certificate: ArrayBuffer, digest: ArrayBuffer, hash: Hash, signRequestId: integer): SignRequest = {
    val __obj = js.Dynamic.literal(certificate = certificate, digest = digest, hash = hash, signRequestId = signRequestId)
  
    __obj.asInstanceOf[SignRequest]
  }
}

