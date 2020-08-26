package typings.awsSdkClientS3Browser.typesSsekmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _SSEKMS extends js.Object {
  /**
    * <p>Specifies the ID of the AWS Key Management Service (KMS) master encryption key to use for encrypting Inventory reports.</p>
    */
  var KeyId: String = js.native
}

object _SSEKMS {
  @scala.inline
  def apply(KeyId: String): _SSEKMS = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SSEKMS]
  }
  @scala.inline
  implicit class _SSEKMSOps[Self <: _SSEKMS] (val x: Self) extends AnyVal {
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
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
  }
  
}

