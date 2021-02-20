package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEnrollmentStatusRequest extends StObject {
  
  /**
    * Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.
    */
  var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.native
  
  /**
    * The new enrollment status of the account. Accepted options are Active or Inactive. You will get an error if Pending or Failed are specified.
    */
  var status: Status = js.native
}
object UpdateEnrollmentStatusRequest {
  
  @scala.inline
  def apply(status: Status): UpdateEnrollmentStatusRequest = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnrollmentStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateEnrollmentStatusRequestMutableBuilder[Self <: UpdateEnrollmentStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeMemberAccounts(value: IncludeMemberAccounts): Self = StObject.set(x, "includeMemberAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMemberAccountsUndefined: Self = StObject.set(x, "includeMemberAccounts", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
