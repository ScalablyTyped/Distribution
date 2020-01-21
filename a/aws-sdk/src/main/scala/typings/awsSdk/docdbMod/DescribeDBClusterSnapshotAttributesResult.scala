package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBClusterSnapshotAttributesResult extends js.Object {
  var DBClusterSnapshotAttributesResult: js.UndefOr[typings.awsSdk.docdbMod.DBClusterSnapshotAttributesResult] = js.native
}

object DescribeDBClusterSnapshotAttributesResult {
  @scala.inline
  def apply(DBClusterSnapshotAttributesResult: DBClusterSnapshotAttributesResult = null): DescribeDBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshotAttributesResult != null) __obj.updateDynamic("DBClusterSnapshotAttributesResult")(DBClusterSnapshotAttributesResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesResult]
  }
}

