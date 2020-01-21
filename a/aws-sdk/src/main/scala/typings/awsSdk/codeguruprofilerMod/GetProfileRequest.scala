package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileRequest extends js.Object {
  /**
    * The format of the profile to return. Supports application/json or application/x-amzn-ion. Defaults to application/x-amzn-ion.
    */
  var accept: js.UndefOr[String] = js.native
  /**
    * The end time of the profile to get. Either period or endTime must be specified. Must be greater than start and the overall time range to be in the past and not larger than a week.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  var maxDepth: js.UndefOr[MaxDepth] = js.native
  /**
    * The period of the profile to get. Exactly two of startTime, period and endTime must be specified. Must be positive and the overall time range to be in the past and not larger than a week.
    */
  var period: js.UndefOr[Period] = js.native
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    * The start time of the profile to get.
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

