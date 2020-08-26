package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicKeyResult extends js.Object {
  /**
    * The current version of the public key. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the public key.
    */
  var PublicKey: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKey] = js.native
}

object GetPublicKeyResult {
  @scala.inline
  def apply(): GetPublicKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyResult]
  }
  @scala.inline
  implicit class GetPublicKeyResultOps[Self <: GetPublicKeyResult] (val x: Self) extends AnyVal {
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setPublicKey(value: PublicKey): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("PublicKey", js.undefined)
  }
  
}

