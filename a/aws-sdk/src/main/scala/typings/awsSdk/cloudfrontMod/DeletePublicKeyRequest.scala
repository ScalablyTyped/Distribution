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
  def apply(Id: String, IfMatch: String = null): DeletePublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublicKeyRequest]
  }
}

