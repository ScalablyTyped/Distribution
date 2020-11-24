package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * [Service-managed permissions] The organization root ID or organizational unit (OU) IDs that you specified for DeploymentTargets.
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
  def apply(): StackSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSet]
  }
  
  @scala.inline
  implicit class StackSetOps[Self <: StackSet] (val x: Self) extends AnyVal {
    
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
    def setAdministrationRoleARN(value: RoleARN_): Self = this.set("AdministrationRoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrationRoleARN: Self = this.set("AdministrationRoleARN", js.undefined)
    
    @scala.inline
    def setAutoDeployment(value: AutoDeployment): Self = this.set("AutoDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDeployment: Self = this.set("AutoDeployment", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: Capabilities): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setExecutionRoleName(value: ExecutionRoleName): Self = this.set("ExecutionRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleName: Self = this.set("ExecutionRoleName", js.undefined)
    
    @scala.inline
    def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = this.set("OrganizationalUnitIds", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = this.set("OrganizationalUnitIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnitIds: Self = this.set("OrganizationalUnitIds", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setPermissionModel(value: PermissionModels): Self = this.set("PermissionModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionModel: Self = this.set("PermissionModel", js.undefined)
    
    @scala.inline
    def setStackSetARN(value: StackSetARN): Self = this.set("StackSetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetARN: Self = this.set("StackSetARN", js.undefined)
    
    @scala.inline
    def setStackSetDriftDetectionDetails(value: StackSetDriftDetectionDetails): Self = this.set("StackSetDriftDetectionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetDriftDetectionDetails: Self = this.set("StackSetDriftDetectionDetails", js.undefined)
    
    @scala.inline
    def setStackSetId(value: StackSetId): Self = this.set("StackSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetId: Self = this.set("StackSetId", js.undefined)
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = this.set("StackSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetName: Self = this.set("StackSetName", js.undefined)
    
    @scala.inline
    def setStatus(value: StackSetStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = this.set("TemplateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateBody: Self = this.set("TemplateBody", js.undefined)
  }
}
