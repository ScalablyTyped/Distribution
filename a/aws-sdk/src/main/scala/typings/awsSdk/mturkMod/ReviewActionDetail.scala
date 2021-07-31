package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewActionDetail extends StObject {
  
  /**
    * The unique identifier for the action.
    */
  var ActionId: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments, emitting results, and deciding which other actions will be necessary. 
    */
  var ActionName: js.UndefOr[String] = js.undefined
  
  /**
    *  The date when the action was completed.
    */
  var CompleteTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  Present only when the Results have a FAILED Status.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    *  A description of the outcome of the review.
    */
  var Result: js.UndefOr[String] = js.undefined
  
  /**
    *  The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED. 
    */
  var Status: js.UndefOr[ReviewActionStatus] = js.undefined
  
  /**
    *  The specific HITId or AssignmentID targeted by the action.
    */
  var TargetId: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  The type of object in TargetId.
    */
  var TargetType: js.UndefOr[String] = js.undefined
}
object ReviewActionDetail {
  
  @scala.inline
  def apply(): ReviewActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewActionDetail]
  }
  
  @scala.inline
  implicit class ReviewActionDetailMutableBuilder[Self <: ReviewActionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: EntityId): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "ActionId", js.undefined)
    
    @scala.inline
    def setActionName(value: String): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "ActionName", js.undefined)
    
    @scala.inline
    def setCompleteTime(value: Timestamp): Self = StObject.set(x, "CompleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteTimeUndefined: Self = StObject.set(x, "CompleteTime", js.undefined)
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    
    @scala.inline
    def setStatus(value: ReviewActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTargetId(value: EntityId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
    
    @scala.inline
    def setTargetType(value: String): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
  }
}
