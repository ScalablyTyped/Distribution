package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitFeedbackRequest extends js.Object {
  /**
    * The universally unique identifier (UUID) of the  AnomalyInstance  object that is included in the analysis data.
    */
  var anomalyInstanceId: AnomalyInstanceId = js.native
  /**
    * Optional feedback about this anomaly.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * The name of the profiling group that is associated with the analysis data.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    *  The feedback tpye. Thee are two valid values, Positive and Negative. 
    */
  var `type`: FeedbackType = js.native
}

object SubmitFeedbackRequest {
  @scala.inline
  def apply(
    anomalyInstanceId: AnomalyInstanceId,
    profilingGroupName: ProfilingGroupName,
    `type`: FeedbackType,
    comment: String = null
  ): SubmitFeedbackRequest = {
    val __obj = js.Dynamic.literal(anomalyInstanceId = anomalyInstanceId.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitFeedbackRequest]
  }
}

