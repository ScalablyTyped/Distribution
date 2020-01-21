package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBSnapshotAttributesResult extends js.Object {
  var DBSnapshotAttributesResult: js.UndefOr[typings.awsSdk.rdsMod.DBSnapshotAttributesResult] = js.native
}

object DescribeDBSnapshotAttributesResult {
  @scala.inline
  def apply(DBSnapshotAttributesResult: DBSnapshotAttributesResult = null): DescribeDBSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshotAttributesResult != null) __obj.updateDynamic("DBSnapshotAttributesResult")(DBSnapshotAttributesResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBSnapshotAttributesResult]
  }
}

