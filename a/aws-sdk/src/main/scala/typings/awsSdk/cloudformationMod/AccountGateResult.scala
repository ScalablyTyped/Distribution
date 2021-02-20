package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountGateResult extends StObject {
  
  /**
    * The status of the account gate function.    SUCCEEDED: The account gate function has determined that the account and Region passes any requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in that account and Region.     FAILED: The account gate function has determined that the account and Region does not meet the requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in that account and Region, and sets the stack set operation result status for that account and Region to FAILED.     SKIPPED: AWS CloudFormation has skipped calling the account gate function for this account and Region, for one of the following reasons:   An account gate function has not been specified for the account and Region. AWS CloudFormation proceeds with the stack set operation in this account and Region.   The AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke the function. AWS CloudFormation proceeds with the stack set operation in this account and Region.   Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack set operation in this account and Region.    
    */
  var Status: js.UndefOr[AccountGateStatus] = js.native
  
  /**
    * The reason for the account gate status assigned to this account and Region for the stack set operation.
    */
  var StatusReason: js.UndefOr[AccountGateStatusReason] = js.native
}
object AccountGateResult {
  
  @scala.inline
  def apply(): AccountGateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountGateResult]
  }
  
  @scala.inline
  implicit class AccountGateResultMutableBuilder[Self <: AccountGateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: AccountGateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: AccountGateStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
