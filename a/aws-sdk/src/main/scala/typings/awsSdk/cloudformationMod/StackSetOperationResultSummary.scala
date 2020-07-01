package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Account: Account = null,
    AccountGateResult: AccountGateResult = null,
    OrganizationalUnitId: OrganizationalUnitId = null,
    Region: Region = null,
    Status: StackSetOperationResultStatus = null,
    StatusReason: Reason = null
  ): StackSetOperationResultSummary = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    if (AccountGateResult != null) __obj.updateDynamic("AccountGateResult")(AccountGateResult.asInstanceOf[js.Any])
    if (OrganizationalUnitId != null) __obj.updateDynamic("OrganizationalUnitId")(OrganizationalUnitId.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetOperationResultSummary]
  }
}

