package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnomalyInstance extends js.Object {
  /**
    *  The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The universally unique identifier (UUID) of an instance of an anomaly in a metric. 
    */
  var id: String = js.native
  /**
    *  The start time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: Timestamp = js.native
  /**
    * Feedback type on a specific instance of anomaly submitted by the user.
    */
  var userFeedback: js.UndefOr[UserFeedback] = js.native
}

object AnomalyInstance {
  @scala.inline
  def apply(id: String, startTime: Timestamp, endTime: Timestamp = null, userFeedback: UserFeedback = null): AnomalyInstance = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (userFeedback != null) __obj.updateDynamic("userFeedback")(userFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyInstance]
  }
}

