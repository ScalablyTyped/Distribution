package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotsResult extends js.Object {
  /**
    * The NextToken value to include in a future DescribeSnapshots request. When the results of a DescribeSnapshots request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the snapshots.
    */
  var Snapshots: js.UndefOr[SnapshotList] = js.native
}

object DescribeSnapshotsResult {
  @scala.inline
  def apply(): DescribeSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsResult]
  }
  @scala.inline
  implicit class DescribeSnapshotsResultOps[Self <: DescribeSnapshotsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSnapshotsVarargs(value: Snapshot*): Self = this.set("Snapshots", js.Array(value :_*))
    @scala.inline
    def setSnapshots(value: SnapshotList): Self = this.set("Snapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshots: Self = this.set("Snapshots", js.undefined)
  }
  
}

