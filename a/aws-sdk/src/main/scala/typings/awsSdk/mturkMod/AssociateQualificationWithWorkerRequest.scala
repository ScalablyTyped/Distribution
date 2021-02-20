package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateQualificationWithWorkerRequest extends StObject {
  
  /**
    * The value of the Qualification to assign.
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the Qualification type to use for the assigned Qualification.
    */
  var QualificationTypeId: EntityId = js.native
  
  /**
    *  Specifies whether to send a notification email message to the Worker saying that the qualification was assigned to the Worker. Note: this is true by default. 
    */
  var SendNotification: js.UndefOr[Boolean] = js.native
  
  /**
    *  The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted HIT assignments and Qualification requests. 
    */
  var WorkerId: CustomerId = js.native
}
object AssociateQualificationWithWorkerRequest {
  
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId): AssociateQualificationWithWorkerRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateQualificationWithWorkerRequest]
  }
  
  @scala.inline
  implicit class AssociateQualificationWithWorkerRequestMutableBuilder[Self <: AssociateQualificationWithWorkerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntegerValue(value: Integer): Self = StObject.set(x, "IntegerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "IntegerValue", js.undefined)
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotification(value: Boolean): Self = StObject.set(x, "SendNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotificationUndefined: Self = StObject.set(x, "SendNotification", js.undefined)
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
  }
}
