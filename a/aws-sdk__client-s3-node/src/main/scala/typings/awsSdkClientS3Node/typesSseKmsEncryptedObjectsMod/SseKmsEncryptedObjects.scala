package typings.awsSdkClientS3Node.typesSseKmsEncryptedObjectsMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SseKmsEncryptedObjects extends js.Object {
  /**
    * <p>The replication for KMS encrypted S3 objects is disabled if status is not Enabled.</p>
    */
  var Status: Enabled | Disabled | String = js.native
}

object SseKmsEncryptedObjects {
  @scala.inline
  def apply(Status: Enabled | Disabled | String): SseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SseKmsEncryptedObjects]
  }
  @scala.inline
  implicit class SseKmsEncryptedObjectsOps[Self <: SseKmsEncryptedObjects] (val x: Self) extends AnyVal {
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
    def setStatus(value: Enabled | Disabled | String): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

