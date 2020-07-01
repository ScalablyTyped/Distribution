package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilingStatus extends js.Object {
  /**
    * The date and time when the profiling agent most recently pinged back. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var latestAgentOrchestratedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time when the most recent profile was received. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var latestAgentProfileReportedAt: js.UndefOr[Timestamp] = js.native
  /**
    *  An  AggregatedProfileTime  object that contains the aggregation period and start time for an aggregated profile. 
    */
  var latestAggregatedProfile: js.UndefOr[AggregatedProfileTime] = js.native
}

object ProfilingStatus {
  @scala.inline
  def apply(
    latestAgentOrchestratedAt: Timestamp = null,
    latestAgentProfileReportedAt: Timestamp = null,
    latestAggregatedProfile: AggregatedProfileTime = null
  ): ProfilingStatus = {
    val __obj = js.Dynamic.literal()
    if (latestAgentOrchestratedAt != null) __obj.updateDynamic("latestAgentOrchestratedAt")(latestAgentOrchestratedAt.asInstanceOf[js.Any])
    if (latestAgentProfileReportedAt != null) __obj.updateDynamic("latestAgentProfileReportedAt")(latestAgentProfileReportedAt.asInstanceOf[js.Any])
    if (latestAggregatedProfile != null) __obj.updateDynamic("latestAggregatedProfile")(latestAggregatedProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingStatus]
  }
}

