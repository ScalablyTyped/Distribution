package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileRequest extends js.Object {
  /**
    * The format of the profile to return. You can choose application/json or the default application/x-amzn-ion. 
    */
  var accept: js.UndefOr[String] = js.native
  /**
    *  You must specify exactly two of the following parameters: startTime, period, and endTime. 
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The maximum depth of the graph.
    */
  var maxDepth: js.UndefOr[MaxDepth] = js.native
  /**
    * The period of the profile to get. The time range must be in the past and not longer than one week.  You must specify exactly two of the following parameters: startTime, period, and endTime. 
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * The name of the profiling group to get.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    * The start time of the profile to get. You must specify exactly two of the following parameters: startTime, period, and endTime. 
    */
  var startTime: js.UndefOr[Timestamp] = js.native
}

object GetProfileRequest {
  @scala.inline
  def apply(
    profilingGroupName: ProfilingGroupName,
    accept: String = null,
    endTime: Timestamp = null,
    maxDepth: Int | Double = null,
    period: Period = null,
    startTime: Timestamp = null
  ): GetProfileRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProfileRequest]
  }
}

