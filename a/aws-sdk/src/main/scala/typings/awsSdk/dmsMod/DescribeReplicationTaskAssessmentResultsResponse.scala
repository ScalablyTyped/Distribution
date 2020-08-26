package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReplicationTaskAssessmentResultsResponse extends js.Object {
  /**
    * - The Amazon S3 bucket where the task assessment report is located. 
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The task assessment report. 
    */
  var ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList] = js.native
}

object DescribeReplicationTaskAssessmentResultsResponse {
  @scala.inline
  def apply(): DescribeReplicationTaskAssessmentResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTaskAssessmentResultsResponse]
  }
  @scala.inline
  implicit class DescribeReplicationTaskAssessmentResultsResponseOps[Self <: DescribeReplicationTaskAssessmentResultsResponse] (val x: Self) extends AnyVal {
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
    def setBucketName(value: String): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("BucketName", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setReplicationTaskAssessmentResultsVarargs(value: ReplicationTaskAssessmentResult*): Self = this.set("ReplicationTaskAssessmentResults", js.Array(value :_*))
    @scala.inline
    def setReplicationTaskAssessmentResults(value: ReplicationTaskAssessmentResultList): Self = this.set("ReplicationTaskAssessmentResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTaskAssessmentResults: Self = this.set("ReplicationTaskAssessmentResults", js.undefined)
  }
  
}

