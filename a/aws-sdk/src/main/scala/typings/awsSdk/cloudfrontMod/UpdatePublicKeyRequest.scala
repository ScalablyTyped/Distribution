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
  def apply(Id: String, PublicKeyConfig: PublicKeyConfig, IfMatch: String = null): UpdatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublicKeyRequest]
  }
}

