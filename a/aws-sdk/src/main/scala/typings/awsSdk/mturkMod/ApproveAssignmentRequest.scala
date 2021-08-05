package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproveAssignmentRequest extends StObject {
  
  /**
    *  The ID of the assignment. The assignment must correspond to a HIT created by the Requester. 
    */
  var AssignmentId: EntityId
  
  /**
    *  A flag indicating that an assignment should be approved even if it was previously rejected. Defaults to False. 
    */
  var OverrideRejection: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  A message for the Worker, which the Worker can see in the Status section of the web site. 
    */
  var RequesterFeedback: js.UndefOr[String] = js.undefined
}
object ApproveAssignmentRequest {
  
  inline def apply(AssignmentId: EntityId): ApproveAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproveAssignmentRequest]
  }
  
  extension [Self <: ApproveAssignmentRequest](x: Self) {
    
    inline def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    inline def setOverrideRejection(value: Boolean): Self = StObject.set(x, "OverrideRejection", value.asInstanceOf[js.Any])
    
    inline def setOverrideRejectionUndefined: Self = StObject.set(x, "OverrideRejection", js.undefined)
    
    inline def setRequesterFeedback(value: String): Self = StObject.set(x, "RequesterFeedback", value.asInstanceOf[js.Any])
    
    inline def setRequesterFeedbackUndefined: Self = StObject.set(x, "RequesterFeedback", js.undefined)
  }
}
