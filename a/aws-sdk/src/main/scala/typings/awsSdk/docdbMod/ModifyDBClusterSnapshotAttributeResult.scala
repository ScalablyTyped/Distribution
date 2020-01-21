package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterSnapshotAttributeResult extends js.Object {
  var DBClusterSnapshotAttributesResult: js.UndefOr[typings.awsSdk.docdbMod.DBClusterSnapshotAttributesResult] = js.native
}

object ModifyDBClusterSnapshotAttributeResult {
  @scala.inline
  def apply(DBClusterSnapshotAttributesResult: DBClusterSnapshotAttributesResult = null): ModifyDBClusterSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshotAttributesResult != null) __obj.updateDynamic("DBClusterSnapshotAttributesResult")(DBClusterSnapshotAttributesResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeResult]
  }
}

