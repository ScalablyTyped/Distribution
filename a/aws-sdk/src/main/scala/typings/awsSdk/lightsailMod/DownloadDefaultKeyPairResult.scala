package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadDefaultKeyPairResult extends js.Object {
  /**
    * A base64-encoded RSA private key.
    */
  var privateKeyBase64: js.UndefOr[Base64] = js.native
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: js.UndefOr[Base64] = js.native
}

object DownloadDefaultKeyPairResult {
  @scala.inline
  def apply(): DownloadDefaultKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadDefaultKeyPairResult]
  }
  @scala.inline
  implicit class DownloadDefaultKeyPairResultOps[Self <: DownloadDefaultKeyPairResult] (val x: Self) extends AnyVal {
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
    def setPrivateKeyBase64(value: Base64): Self = this.set("privateKeyBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateKeyBase64: Self = this.set("privateKeyBase64", js.undefined)
    @scala.inline
    def setPublicKeyBase64(value: Base64): Self = this.set("publicKeyBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKeyBase64: Self = this.set("publicKeyBase64", js.undefined)
  }
  
}

