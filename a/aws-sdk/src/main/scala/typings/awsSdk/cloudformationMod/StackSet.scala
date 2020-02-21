package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSet extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set. Use customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Prerequisites: Granting Permissions for Stack Set Operations in the AWS CloudFormation User Guide.
    */
  var AdministrationRoleARN: js.UndefOr[RoleARN_] = js.native
  /**
    * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to a target organization or organizational unit (OU).
    */
  var AutoDeployment: js.UndefOr[typings.awsSdk.cloudformationMod.AutoDeployment] = js.native
  /**
    * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM) users. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates. 
    */
  var Capabilities: js.UndefOr[typings.awsSdk.cloudformationMod.Capabilities] = js.native
  /**
    * A description of the stack set that you specify when the stack set is created or updated.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The name of the IAM execution role used to create or update the stack set.  Use customized execution roles to control which stack resources users and groups can include in their stack sets. 
    */
  var ExecutionRoleName: js.UndefOr[typings.awsSdk.cloudformationMod.ExecutionRoleName] = js.native
  /**
    * [Service-managed permissions] The organization root ID or organizational unit (OUs) IDs to which stacks in your stack set have been deployed.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.native
  /**
    * A list of input parameters for a stack set.
    */
  var Parameters: js.UndefOr[typings.awsSdk.cloudformationMod.Parameters] = js.native
  /**
    * Describes how the IAM roles required for stack set operations are created.   With self-managed permissions, you must create the administrator and execution roles required to deploy to target accounts. For more information, see Grant Self-Managed Stack Set Permissions.   With service-managed permissions, StackSets automatically creates the IAM roles required to deploy to accounts managed by AWS Organizations. For more information, see Grant Service-Managed Stack Set Permissions.  
    */
  var PermissionModel: js.UndefOr[PermissionModels] = js.native
  /**
    * The Amazon Resource Number (ARN) of the stack set.
    */
  var StackSetARN: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetARN] = js.native
  /**
    * Detailed information about the drift status of the stack set. For stack sets, contains information about the last completed drift operation performed on the stack set. Information about drift operations currently in progress is not included.
    */
  var StackSetDriftDetectionDetails: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetDriftDetectionDetails] = js.native
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetId] = js.native
  /**
    * The name that's associated with the stack set.
    */
  var StackSetName: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetName] = js.native
  /**
    * The status of the stack set.
    */
  var Status: js.UndefOr[StackSetStatus] = js.native
  /**
    * A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
    */
  var Tags: js.UndefOr[typings.awsSdk.cloudformationMod.Tags] = js.native
  /**
    * The structure that contains the body of the template that was used to create or update the stack set.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateBody] = js.native
}

object StackSet {
  @scala.inline
  def apply(
    AdministrationRoleARN: RoleARN_ = null,
    AutoDeployment: AutoDeployment = null,
    Capabilities: Capabilities = null,
    Description: Description = null,
    ExecutionRoleName: ExecutionRoleName = null,
    OrganizationalUnitIds: OrganizationalUnitIdList = null,
    Parameters: Parameters = null,
    PermissionModel: PermissionModels = null,
    StackSetARN: StackSetARN = null,
    StackSetDriftDetectionDetails: StackSetDriftDetectionDetails = null,
    StackSetId: StackSetId = null,
    StackSetName: StackSetName = null,
    Status: StackSetStatus = null,
    Tags: Tags = null,
    TemplateBody: TemplateBody = null
  ): StackSet = {
    val __obj = js.Dynamic.literal()
    if (AdministrationRoleARN != null) __obj.updateDynamic("AdministrationRoleARN")(AdministrationRoleARN.asInstanceOf[js.Any])
    if (AutoDeployment != null) __obj.updateDynamic("AutoDeployment")(AutoDeployment.asInstanceOf[js.Any])
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExecutionRoleName != null) __obj.updateDynamic("ExecutionRoleName")(ExecutionRoleName.asInstanceOf[js.Any])
    if (OrganizationalUnitIds != null) __obj.updateDynamic("OrganizationalUnitIds")(OrganizationalUnitIds.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (PermissionModel != null) __obj.updateDynamic("PermissionModel")(PermissionModel.asInstanceOf[js.Any])
    if (StackSetARN != null) __obj.updateDynamic("StackSetARN")(StackSetARN.asInstanceOf[js.Any])
    if (StackSetDriftDetectionDetails != null) __obj.updateDynamic("StackSetDriftDetectionDetails")(StackSetDriftDetectionDetails.asInstanceOf[js.Any])
    if (StackSetId != null) __obj.updateDynamic("StackSetId")(StackSetId.asInstanceOf[js.Any])
    if (StackSetName != null) __obj.updateDynamic("StackSetName")(StackSetName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSet]
  }
}

