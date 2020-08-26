package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublicKeyResult extends js.Object {
  /**
    * The current version of the public key. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The fully qualified URI of the new public key resource just created.
    */
  var Location: js.UndefOr[String] = js.native
  /**
    * Returned when you add a public key.
    */
  var PublicKey: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKey] = js.native
}

object CreatePublicKeyResult {
  @scala.inline
  def apply(): CreatePublicKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePublicKeyResult]
  }
  @scala.inline
  implicit class CreatePublicKeyResultOps[Self <: CreatePublicKeyResult] (val x: Self) extends AnyVal {
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
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setPublicKey(value: PublicKey): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("PublicKey", js.undefined)
  }
  
}

