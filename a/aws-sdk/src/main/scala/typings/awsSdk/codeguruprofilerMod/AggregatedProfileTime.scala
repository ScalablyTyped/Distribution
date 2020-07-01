package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedProfileTime extends js.Object {
  /**
    *  The aggregation period. This indicates the period during which an aggregation profile collects posted agent profiles for a profiling group. Use one of three valid durations that are specified using the ISO 8601 format.     P1D — 1 day     PT1H — 1 hour     PT5M — 5 minutes   
    */
  var period: js.UndefOr[AggregationPeriod] = js.native
  /**
    *  The time that aggregation of posted agent profiles for a profiling group starts. The aggregation profile contains profiles posted by the agent starting at this time for an aggregation period specified by the period property of the AggregatedProfileTime object.   Specify start using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var start: js.UndefOr[Timestamp] = js.native
}

object AggregatedProfileTime {
  @scala.inline
  def apply(period: AggregationPeriod = null, start: Timestamp = null): AggregatedProfileTime = {
    val __obj = js.Dynamic.literal()
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedProfileTime]
  }
}

