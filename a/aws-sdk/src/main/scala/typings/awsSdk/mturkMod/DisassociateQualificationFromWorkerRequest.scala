package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateQualificationFromWorkerRequest extends js.Object {
  
  /**
    * The ID of the Qualification type of the Qualification to be revoked.
    */
  var QualificationTypeId: EntityId = js.native
  
  /**
    * A text message that explains why the Qualification was revoked. The user who had the Qualification sees this message.
    */
  var Reason: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Worker who possesses the Qualification to be revoked.
    */
  var WorkerId: CustomerId = js.native
}
object DisassociateQualificationFromWorkerRequest {
  
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId): DisassociateQualificationFromWorkerRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateQualificationFromWorkerRequest]
  }
  
  @scala.inline
  implicit class DisassociateQualificationFromWorkerRequestOps[Self <: DisassociateQualificationFromWorkerRequest] (val x: Self) extends AnyVal {
    
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
    def setReason(value: String): Self = this.set("Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
  }
}
