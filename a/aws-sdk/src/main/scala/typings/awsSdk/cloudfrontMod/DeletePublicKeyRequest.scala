package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePublicKeyRequest extends js.Object {
  /**
    * The ID of the public key you want to remove from CloudFront.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the public key identity to delete. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object DeletePublicKeyRequest {
  @scala.inline
  def apply(Id: String): DeletePublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublicKeyRequest]
  }
  @scala.inline
  implicit class DeletePublicKeyRequestOps[Self <: DeletePublicKeyRequest] (val x: Self) extends AnyVal {
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
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
  }
  
}

