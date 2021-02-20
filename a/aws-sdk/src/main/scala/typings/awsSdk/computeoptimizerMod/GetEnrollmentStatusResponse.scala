package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEnrollmentStatusResponse extends StObject {
  
  /**
    * Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.
    */
  var memberAccountsEnrolled: js.UndefOr[MemberAccountsEnrolled] = js.native
  
  /**
    * The enrollment status of the account.
    */
  var status: js.UndefOr[Status] = js.native
  
  /**
    * The reason for the enrollment status of the account. For example, an account might show a status of Pending because member accounts of an organization require more time to be enrolled in the service.
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
}
object GetEnrollmentStatusResponse {
  
  @scala.inline
  def apply(): GetEnrollmentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnrollmentStatusResponse]
  }
  
  @scala.inline
  implicit class GetEnrollmentStatusResponseMutableBuilder[Self <: GetEnrollmentStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccountsEnrolled(value: MemberAccountsEnrolled): Self = StObject.set(x, "memberAccountsEnrolled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountsEnrolledUndefined: Self = StObject.set(x, "memberAccountsEnrolled", js.undefined)
    
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
