package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFieldLevelEncryptionConfigRequest extends js.Object {
  /**
    * The ID of the configuration you want to delete from CloudFront.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the configuration identity to delete. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object DeleteFieldLevelEncryptionConfigRequest {
  @scala.inline
  def apply(Id: String, IfMatch: String = null): DeleteFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFieldLevelEncryptionConfigRequest]
  }
}

