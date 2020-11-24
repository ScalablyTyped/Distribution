package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSetOperationResultSummary extends js.Object {
  
  /**
    * [Self-managed permissions] The name of the AWS account for this operation result.
    */
  var Account: js.UndefOr[typings.awsSdk.cloudformationMod.Account] = js.native
  
  /**
    * The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with stack set operations in an account
    */
  var AccountGateResult: js.UndefOr[typings.awsSdk.cloudformationMod.AccountGateResult] = js.native
  
  /**
    * [Service-managed permissions] The organization root ID or organizational unit (OU) IDs that you specified for DeploymentTargets.
    */
  var OrganizationalUnitId: js.UndefOr[typings.awsSdk.cloudformationMod.OrganizationalUnitId] = js.native
  
  /**
    * The name of the AWS Region for this operation result.
    */
  var Region: js.UndefOr[typings.awsSdk.cloudformationMod.Region] = js.native
  
  /**
    * The result status of the stack set operation for the given account in the given Region.    CANCELLED: The operation in the specified account and Region has been cancelled. This is either because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation has been exceeded.    FAILED: The operation in the specified account and Region failed.  If the stack set operation fails in enough accounts within a Region, the failure tolerance for the stack set operation as a whole might be exceeded.     RUNNING: The operation in the specified account and Region is currently in progress.    PENDING: The operation in the specified account and Region has yet to start.     SUCCEEDED: The operation in the specified account and Region completed successfully.  
    */
  var Status: js.UndefOr[StackSetOperationResultStatus] = js.native
  
  /**
    * The reason for the assigned result status.
    */
  var StatusReason: js.UndefOr[Reason] = js.native
}
object StackSetOperationResultSummary {
  
  @scala.inline
  def apply(): StackSetOperationResultSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperationResultSummary]
  }
  
  @scala.inline
  implicit class StackSetOperationResultSummaryOps[Self <: StackSetOperationResultSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount(value: Account): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
    
    @scala.inline
    def setAccountGateResult(value: AccountGateResult): Self = this.set("AccountGateResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountGateResult: Self = this.set("AccountGateResult", js.undefined)
    
    @scala.inline
    def setOrganizationalUnitId(value: OrganizationalUnitId): Self = this.set("OrganizationalUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnitId: Self = this.set("OrganizationalUnitId", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setStatus(value: StackSetOperationResultStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: Reason): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
  }
}
