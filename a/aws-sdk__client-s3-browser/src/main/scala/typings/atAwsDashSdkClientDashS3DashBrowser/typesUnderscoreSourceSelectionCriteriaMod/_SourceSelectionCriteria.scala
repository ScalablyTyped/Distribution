package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSourceSelectionCriteriaMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSseKmsEncryptedObjectsMod._SseKmsEncryptedObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SourceSelectionCriteria extends js.Object {
  /**
    * <p> Container for filter information of selection of KMS Encrypted S3 objects. The element is required if you include <code>SourceSelectionCriteria</code> in the replication configuration. </p>
    */
  var SseKmsEncryptedObjects: js.UndefOr[_SseKmsEncryptedObjects] = js.undefined
}

object _SourceSelectionCriteria {
  @scala.inline
  def apply(SseKmsEncryptedObjects: _SseKmsEncryptedObjects = null): _SourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (SseKmsEncryptedObjects != null) __obj.updateDynamic("SseKmsEncryptedObjects")(SseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SourceSelectionCriteria]
  }
}

