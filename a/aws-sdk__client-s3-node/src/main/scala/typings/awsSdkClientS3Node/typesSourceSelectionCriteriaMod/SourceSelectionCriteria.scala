package typings.awsSdkClientS3Node.typesSourceSelectionCriteriaMod

import typings.awsSdkClientS3Node.typesSseKmsEncryptedObjectsMod.SseKmsEncryptedObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSelectionCriteria extends js.Object {
  /**
    * <p> Container for filter information of selection of KMS Encrypted S3 objects. The element is required if you include <code>SourceSelectionCriteria</code> in the replication configuration. </p>
    */
  var SseKmsEncryptedObjects: js.UndefOr[typings.awsSdkClientS3Node.typesSseKmsEncryptedObjectsMod.SseKmsEncryptedObjects] = js.undefined
}

object SourceSelectionCriteria {
  @scala.inline
  def apply(SseKmsEncryptedObjects: SseKmsEncryptedObjects = null): SourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (SseKmsEncryptedObjects != null) __obj.updateDynamic("SseKmsEncryptedObjects")(SseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSelectionCriteria]
  }
}

