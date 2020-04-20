package typings.awsSdkClientS3Node.typesSseKmsEncryptedObjectsMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SseKmsEncryptedObjects extends js.Object {
  /**
    * <p>The replication for KMS encrypted S3 objects is disabled if status is not Enabled.</p>
    */
  var Status: Enabled | Disabled | String
}

object SseKmsEncryptedObjects {
  @scala.inline
  def apply(Status: Enabled | Disabled | String): SseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SseKmsEncryptedObjects]
  }
}

