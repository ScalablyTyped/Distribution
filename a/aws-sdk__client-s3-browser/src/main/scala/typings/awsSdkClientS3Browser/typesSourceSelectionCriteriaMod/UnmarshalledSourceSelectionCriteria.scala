package typings.awsSdkClientS3Browser.typesSourceSelectionCriteriaMod

import typings.awsSdkClientS3Browser.typesSseKmsEncryptedObjectsMod.UnmarshalledSseKmsEncryptedObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSourceSelectionCriteria extends SourceSelectionCriteria {
  /**
    * <p> Container for filter information of selection of KMS Encrypted S3 objects. The element is required if you include <code>SourceSelectionCriteria</code> in the replication configuration. </p>
    */
  @JSName("SseKmsEncryptedObjects")
  var SseKmsEncryptedObjects_UnmarshalledSourceSelectionCriteria: js.UndefOr[UnmarshalledSseKmsEncryptedObjects] = js.undefined
}

object UnmarshalledSourceSelectionCriteria {
  @scala.inline
  def apply(SseKmsEncryptedObjects: UnmarshalledSseKmsEncryptedObjects = null): UnmarshalledSourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (SseKmsEncryptedObjects != null) __obj.updateDynamic("SseKmsEncryptedObjects")(SseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSourceSelectionCriteria]
  }
}

