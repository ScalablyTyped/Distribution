package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotSchedulesOutputMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the marker parameter and retrying the command. If the marker field is empty, all response records have been retrieved for the request.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of SnapshotSchedules.
    */
  var SnapshotSchedules: js.UndefOr[SnapshotScheduleList] = js.native
}

object DescribeSnapshotSchedulesOutputMessage {
  @scala.inline
  def apply(): DescribeSnapshotSchedulesOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotSchedulesOutputMessage]
  }
  @scala.inline
  implicit class DescribeSnapshotSchedulesOutputMessageOps[Self <: DescribeSnapshotSchedulesOutputMessage] (val x: Self) extends AnyVal {
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setSnapshotSchedulesVarargs(value: SnapshotSchedule*): Self = this.set("SnapshotSchedules", js.Array(value :_*))
    @scala.inline
    def setSnapshotSchedules(value: SnapshotScheduleList): Self = this.set("SnapshotSchedules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotSchedules: Self = this.set("SnapshotSchedules", js.undefined)
  }
  
}

