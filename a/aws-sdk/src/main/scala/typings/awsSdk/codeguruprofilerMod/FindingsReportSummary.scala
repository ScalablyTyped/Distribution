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
  def apply(
    id: FindingsReportId = null,
    profileEndTime: Timestamp = null,
    profileStartTime: Timestamp = null,
    profilingGroupName: String = null,
    totalNumberOfFindings: js.UndefOr[Integer] = js.undefined
  ): FindingsReportSummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (profileEndTime != null) __obj.updateDynamic("profileEndTime")(profileEndTime.asInstanceOf[js.Any])
    if (profileStartTime != null) __obj.updateDynamic("profileStartTime")(profileStartTime.asInstanceOf[js.Any])
    if (profilingGroupName != null) __obj.updateDynamic("profilingGroupName")(profilingGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(totalNumberOfFindings)) __obj.updateDynamic("totalNumberOfFindings")(totalNumberOfFindings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingsReportSummary]
  }
}

