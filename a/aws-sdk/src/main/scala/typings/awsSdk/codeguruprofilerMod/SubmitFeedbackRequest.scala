package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(anomalyInstanceId: AnomalyInstanceId, profilingGroupName: ProfilingGroupName, `type`: FeedbackType): SubmitFeedbackRequest = {
    val __obj = js.Dynamic.literal(anomalyInstanceId = anomalyInstanceId.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitFeedbackRequest]
  }
  
  @scala.inline
  implicit class SubmitFeedbackRequestOps[Self <: SubmitFeedbackRequest] (val x: Self) extends AnyVal {
    
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
    def setAnomalyInstanceId(value: AnomalyInstanceId): Self = this.set("anomalyInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FeedbackType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
  }
}
