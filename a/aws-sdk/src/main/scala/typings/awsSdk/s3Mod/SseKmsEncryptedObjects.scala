package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SseKmsEncryptedObjects extends js.Object {
  /**
    * Specifies whether Amazon S3 replicates objects created with server-side encryption using a customer master key (CMK) stored in AWS Key Management Service.
    */
  var Status: SseKmsEncryptedObjectsStatus = js.native
}

object SseKmsEncryptedObjects {
  @scala.inline
  def apply(Status: SseKmsEncryptedObjectsStatus): SseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SseKmsEncryptedObjects]
  }
}

