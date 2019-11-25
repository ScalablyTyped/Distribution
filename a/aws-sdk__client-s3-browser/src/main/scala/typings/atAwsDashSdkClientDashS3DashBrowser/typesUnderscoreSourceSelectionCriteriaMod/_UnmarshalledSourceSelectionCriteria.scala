package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSourceSelectionCriteriaMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSseKmsEncryptedObjectsMod._UnmarshalledSseKmsEncryptedObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSourceSelectionCriteria extends _SourceSelectionCriteria {
  /**
    * <p> Container for filter information of selection of KMS Encrypted S3 objects. The element is required if you include <code>SourceSelectionCriteria</code> in the replication configuration. </p>
    */
  @JSName("SseKmsEncryptedObjects")
  var SseKmsEncryptedObjects__UnmarshalledSourceSelectionCriteria: js.UndefOr[_UnmarshalledSseKmsEncryptedObjects] = js.undefined
}

object _UnmarshalledSourceSelectionCriteria {
  @scala.inline
  def apply(SseKmsEncryptedObjects: _UnmarshalledSseKmsEncryptedObjects = null): _UnmarshalledSourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (SseKmsEncryptedObjects != null) __obj.updateDynamic("SseKmsEncryptedObjects")(SseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSourceSelectionCriteria]
  }
}

