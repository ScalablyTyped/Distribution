package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackInstance extends js.Object {
  /**
    * [Self-managed permissions] The name of the AWS account that the stack instance is associated with.
    */
  var Account: js.UndefOr[typings.awsSdk.cloudformationMod.Account] = js.native
  /**
    * Status of the stack instance's actual configuration compared to the expected template and parameter configuration of the stack set to which it belongs.     DRIFTED: The stack differs from the expected template and parameter configuration of the stack set to which it belongs. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack instance differs from its expected stack set configuration.    IN_SYNC: The stack instance's actual configuration matches its expected stack set configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var DriftStatus: js.UndefOr[StackDriftStatus] = js.native
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack instance. This value will be NULL for any stack instance on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * [Service-managed permissions] The organization root ID or organizational unit (OU) ID that the stack instance is associated with.
    */
  var OrganizationalUnitId: js.UndefOr[typings.awsSdk.cloudformationMod.OrganizationalUnitId] = js.native
  /**
    * A list of parameters from the stack set template whose values have been overridden in this stack instance.
    */
  var ParameterOverrides: js.UndefOr[Parameters] = js.native
  /**
    * The name of the AWS region that the stack instance is associated with.
    */
  var Region: js.UndefOr[typings.awsSdk.cloudformationMod.Region] = js.native
  /**
    * The ID of the stack instance.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.native
  /**
    * The name or unique ID of the stack set that the stack instance is associated with.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetId] = js.native
  /**
    * The status of the stack instance, in terms of its synchronization with its associated stack set.    INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.    OUTDATED: The stack isn't currently up to date with the stack set because:   The associated stack failed during a CreateStackSet or UpdateStackSet operation.    The stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.       CURRENT: The stack is currently up to date with the stack set.  
    */
  var Status: js.UndefOr[StackInstanceStatus] = js.native
  /**
    * The explanation for the specific status code that is assigned to this stack instance.
    */
  var StatusReason: js.UndefOr[Reason] = js.native
}

object StackInstance {
  @scala.inline
  def apply(
    Account: Account = null,
    DriftStatus: StackDriftStatus = null,
    LastDriftCheckTimestamp: Timestamp = null,
    OrganizationalUnitId: OrganizationalUnitId = null,
    ParameterOverrides: Parameters = null,
    Region: Region = null,
    StackId: StackId = null,
    StackSetId: StackSetId = null,
    Status: StackInstanceStatus = null,
    StatusReason: Reason = null
  ): StackInstance = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    if (DriftStatus != null) __obj.updateDynamic("DriftStatus")(DriftStatus.asInstanceOf[js.Any])
    if (LastDriftCheckTimestamp != null) __obj.updateDynamic("LastDriftCheckTimestamp")(LastDriftCheckTimestamp.asInstanceOf[js.Any])
    if (OrganizationalUnitId != null) __obj.updateDynamic("OrganizationalUnitId")(OrganizationalUnitId.asInstanceOf[js.Any])
    if (ParameterOverrides != null) __obj.updateDynamic("ParameterOverrides")(ParameterOverrides.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (StackSetId != null) __obj.updateDynamic("StackSetId")(StackSetId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackInstance]
  }
}

