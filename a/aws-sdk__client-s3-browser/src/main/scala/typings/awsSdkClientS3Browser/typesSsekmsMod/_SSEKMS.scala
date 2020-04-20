package typings.awsSdkClientS3Browser.typesSsekmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SSEKMS extends js.Object {
  /**
    * <p>Specifies the ID of the AWS Key Management Service (KMS) master encryption key to use for encrypting Inventory reports.</p>
    */
  var KeyId: String
}

object _SSEKMS {
  @scala.inline
  def apply(KeyId: String): _SSEKMS = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SSEKMS]
  }
}

