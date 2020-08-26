package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingsReportSummary extends js.Object {
  /**
    * The universally unique identifier (UUID) of the recommendation report.
    */
  var id: js.UndefOr[FindingsReportId] = js.native
  /**
    *  The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var profileEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var profileStartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the profiling group that is associated with the analysis data.
    */
  var profilingGroupName: js.UndefOr[String] = js.native
  /**
    * The total number of different recommendations that were found by the analysis.
    */
  var totalNumberOfFindings: js.UndefOr[Integer] = js.native
}

object FindingsReportSummary {
  @scala.inline
  def apply(): FindingsReportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingsReportSummary]
  }
  @scala.inline
  implicit class FindingsReportSummaryOps[Self <: FindingsReportSummary] (val x: Self) extends AnyVal {
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
    def setId(value: FindingsReportId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setProfileEndTime(value: Timestamp): Self = this.set("profileEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileEndTime: Self = this.set("profileEndTime", js.undefined)
    @scala.inline
    def setProfileStartTime(value: Timestamp): Self = this.set("profileStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileStartTime: Self = this.set("profileStartTime", js.undefined)
    @scala.inline
    def setProfilingGroupName(value: String): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfilingGroupName: Self = this.set("profilingGroupName", js.undefined)
    @scala.inline
    def setTotalNumberOfFindings(value: Integer): Self = this.set("totalNumberOfFindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalNumberOfFindings: Self = this.set("totalNumberOfFindings", js.undefined)
  }
  
}

