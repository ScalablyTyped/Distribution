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
  def apply(): ProfilingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilingStatus]
  }
  @scala.inline
  implicit class ProfilingStatusOps[Self <: ProfilingStatus] (val x: Self) extends AnyVal {
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
    def setLatestAgentOrchestratedAt(value: Timestamp): Self = this.set("latestAgentOrchestratedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestAgentOrchestratedAt: Self = this.set("latestAgentOrchestratedAt", js.undefined)
    @scala.inline
    def setLatestAgentProfileReportedAt(value: Timestamp): Self = this.set("latestAgentProfileReportedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestAgentProfileReportedAt: Self = this.set("latestAgentProfileReportedAt", js.undefined)
    @scala.inline
    def setLatestAggregatedProfile(value: AggregatedProfileTime): Self = this.set("latestAggregatedProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestAggregatedProfile: Self = this.set("latestAggregatedProfile", js.undefined)
  }
  
}

