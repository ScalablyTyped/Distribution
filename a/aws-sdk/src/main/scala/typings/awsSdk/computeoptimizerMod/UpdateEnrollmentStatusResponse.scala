package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnrollmentStatusResponse extends StObject {
  
  /**
    * The enrollment status of the account.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The reason for the enrollment status of the account. For example, an account might show a status of Pending because member accounts of an organization require more time to be enrolled in the service.
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
}
object UpdateEnrollmentStatusResponse {
  
  @scala.inline
  def apply(): UpdateEnrollmentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEnrollmentStatusResponse]
  }
  
  @scala.inline
  implicit class UpdateEnrollmentStatusResponseMutableBuilder[Self <: UpdateEnrollmentStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
