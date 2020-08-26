package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReplicationTaskAssessmentRunsResponse extends js.Object {
  /**
    * A pagination token returned for you to pass to a subsequent request. If you pass this token as the Marker value in a subsequent request, the response includes only records beyond the marker, up to the value specified in the request by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * One or more premigration assessment runs as specified by Filters.
    */
  var ReplicationTaskAssessmentRuns: js.UndefOr[ReplicationTaskAssessmentRunList] = js.native
}

object DescribeReplicationTaskAssessmentRunsResponse {
  @scala.inline
  def apply(): DescribeReplicationTaskAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTaskAssessmentRunsResponse]
  }
  @scala.inline
  implicit class DescribeReplicationTaskAssessmentRunsResponseOps[Self <: DescribeReplicationTaskAssessmentRunsResponse] (val x: Self) extends AnyVal {
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
    def setReplicationTaskAssessmentRunsVarargs(value: ReplicationTaskAssessmentRun*): Self = this.set("ReplicationTaskAssessmentRuns", js.Array(value :_*))
    @scala.inline
    def setReplicationTaskAssessmentRuns(value: ReplicationTaskAssessmentRunList): Self = this.set("ReplicationTaskAssessmentRuns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTaskAssessmentRuns: Self = this.set("ReplicationTaskAssessmentRuns", js.undefined)
  }
  
}

