package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateQualificationWithWorkerRequest extends js.Object {
  
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
  implicit class AssociateQualificationWithWorkerRequestOps[Self <: AssociateQualificationWithWorkerRequest] (val x: Self) extends AnyVal {
    
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
    def setQualificationTypeId(value: EntityId): Self = this.set("QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = this.set("WorkerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValue(value: Integer): Self = this.set("IntegerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValue: Self = this.set("IntegerValue", js.undefined)
    
    @scala.inline
    def setSendNotification(value: Boolean): Self = this.set("SendNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendNotification: Self = this.set("SendNotification", js.undefined)
  }
}
