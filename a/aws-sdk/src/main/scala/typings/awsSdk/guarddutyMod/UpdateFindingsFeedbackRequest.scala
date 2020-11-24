package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFindingsFeedbackRequest extends js.Object {
  
  /**
    * Additional feedback about the GuardDuty findings.
    */
  var Comments: js.UndefOr[String] = js.native
  
  /**
    * The ID of the detector associated with the findings to update feedback for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The feedback for the finding.
    */
  var Feedback: typings.awsSdk.guarddutyMod.Feedback = js.native
  
  /**
    * The IDs of the findings that you want to mark as useful or not useful.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds = js.native
}
object UpdateFindingsFeedbackRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, Feedback: Feedback, FindingIds: FindingIds): UpdateFindingsFeedbackRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], Feedback = Feedback.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsFeedbackRequest]
  }
  
  @scala.inline
  implicit class UpdateFindingsFeedbackRequestOps[Self <: UpdateFindingsFeedbackRequest] (val x: Self) extends AnyVal {
    
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
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback(value: Feedback): Self = this.set("Feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdsVarargs(value: FindingId*): Self = this.set("FindingIds", js.Array(value :_*))
    
    @scala.inline
    def setFindingIds(value: FindingIds): Self = this.set("FindingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: String): Self = this.set("Comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("Comments", js.undefined)
  }
}
