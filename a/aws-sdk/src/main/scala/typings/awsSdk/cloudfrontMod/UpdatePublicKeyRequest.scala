package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePublicKeyRequest extends js.Object {
  /**
    * ID of the public key to be updated.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the public key to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
  /**
    * Request to update public key information.
    */
  var PublicKeyConfig: typings.awsSdk.cloudfrontMod.PublicKeyConfig = js.native
}

object UpdatePublicKeyRequest {
  @scala.inline
  def apply(Id: String, PublicKeyConfig: PublicKeyConfig): UpdatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublicKeyRequest]
  }
  @scala.inline
  implicit class UpdatePublicKeyRequestOps[Self <: UpdatePublicKeyRequest] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKeyConfig(value: PublicKeyConfig): Self = this.set("PublicKeyConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
  }
  
}

