package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFindingsFeedbackRequest extends StObject {
  
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
  implicit class UpdateFindingsFeedbackRequestMutableBuilder[Self <: UpdateFindingsFeedbackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback(value: Feedback): Self = StObject.set(x, "Feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIds(value: FindingIds): Self = StObject.set(x, "FindingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "FindingIds", js.Array(value :_*))
  }
}
