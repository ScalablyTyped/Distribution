package typings.chromeApps.chrome.certificateProvider

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignRequest extends js.Object {
  /**
    * The DER encoding of a X.509 certificate. The app must sign
    * *digest* using the associated private key.
    */
  var certificate: ArrayBuffer = js.native
  /** The digest that must be signed */
  var digest: ArrayBuffer = js.native
  /** Refers to the hash algorithm that was used to create *digest*. */
  var hash: Hash = js.native
  /**
    * The unique ID to be used by the app should it need to call a method
    * that requires it, e.g. requestPin.
    */
  var signRequestId: integer = js.native
}

object SignRequest {
  @scala.inline
  def apply(certificate: ArrayBuffer, digest: ArrayBuffer, hash: Hash, signRequestId: integer): SignRequest = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], signRequestId = signRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignRequest]
  }
  @scala.inline
  implicit class SignRequestOps[Self <: SignRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificate(value: ArrayBuffer): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDigest(value: ArrayBuffer): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: Hash): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignRequestId(value: integer): Self = this.set("signRequestId", value.asInstanceOf[js.Any])
  }
  
}

