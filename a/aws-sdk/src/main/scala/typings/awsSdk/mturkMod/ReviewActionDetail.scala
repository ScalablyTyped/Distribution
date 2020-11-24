package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewActionDetail extends js.Object {
  
  /**
    * The unique identifier for the action.
    */
  var ActionId: js.UndefOr[EntityId] = js.native
  
  /**
    *  The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments, emitting results, and deciding which other actions will be necessary. 
    */
  var ActionName: js.UndefOr[String] = js.native
  
  /**
    *  The date when the action was completed.
    */
  var CompleteTime: js.UndefOr[Timestamp] = js.native
  
  /**
    *  Present only when the Results have a FAILED Status.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  
  /**
    *  A description of the outcome of the review.
    */
  var Result: js.UndefOr[String] = js.native
  
  /**
    *  The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED. 
    */
  var Status: js.UndefOr[ReviewActionStatus] = js.native
  
  /**
    *  The specific HITId or AssignmentID targeted by the action.
    */
  var TargetId: js.UndefOr[EntityId] = js.native
  
  /**
    *  The type of object in TargetId.
    */
  var TargetType: js.UndefOr[String] = js.native
}
object ReviewActionDetail {
  
  @scala.inline
  def apply(): ReviewActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewActionDetail]
  }
  
  @scala.inline
  implicit class ReviewActionDetailOps[Self <: ReviewActionDetail] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: EntityId): Self = this.set("ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("ActionId", js.undefined)
    
    @scala.inline
    def setActionName(value: String): Self = this.set("ActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionName: Self = this.set("ActionName", js.undefined)
    
    @scala.inline
    def setCompleteTime(value: Timestamp): Self = this.set("CompleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteTime: Self = this.set("CompleteTime", js.undefined)
    
    @scala.inline
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = this.set("Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
    
    @scala.inline
    def setStatus(value: ReviewActionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTargetId(value: EntityId): Self = this.set("TargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("TargetId", js.undefined)
    
    @scala.inline
    def setTargetType(value: String): Self = this.set("TargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetType: Self = this.set("TargetType", js.undefined)
  }
}
