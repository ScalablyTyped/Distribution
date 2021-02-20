package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceLinkedRoleDeletionStatusResponse extends StObject {
  
  /**
    * An object that contains details about the reason the deletion failed.
    */
  var Reason: js.UndefOr[DeletionTaskFailureReasonType] = js.native
  
  /**
    * The status of the deletion.
    */
  var Status: DeletionTaskStatusType = js.native
}
object GetServiceLinkedRoleDeletionStatusResponse {
  
  @scala.inline
  def apply(Status: DeletionTaskStatusType): GetServiceLinkedRoleDeletionStatusResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceLinkedRoleDeletionStatusResponse]
  }
  
  @scala.inline
  implicit class GetServiceLinkedRoleDeletionStatusResponseMutableBuilder[Self <: GetServiceLinkedRoleDeletionStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: DeletionTaskFailureReasonType): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    @scala.inline
    def setStatus(value: DeletionTaskStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
