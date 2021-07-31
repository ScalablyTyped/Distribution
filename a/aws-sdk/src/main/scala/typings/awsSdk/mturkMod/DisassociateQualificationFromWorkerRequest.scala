package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateQualificationFromWorkerRequest extends StObject {
  
  /**
    * The ID of the Qualification type of the Qualification to be revoked.
    */
  var QualificationTypeId: EntityId
  
  /**
    * A text message that explains why the Qualification was revoked. The user who had the Qualification sees this message.
    */
  var Reason: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Worker who possesses the Qualification to be revoked.
    */
  var WorkerId: CustomerId
}
object DisassociateQualificationFromWorkerRequest {
  
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId): DisassociateQualificationFromWorkerRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateQualificationFromWorkerRequest]
  }
  
  @scala.inline
  implicit class DisassociateQualificationFromWorkerRequestMutableBuilder[Self <: DisassociateQualificationFromWorkerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
  }
}
