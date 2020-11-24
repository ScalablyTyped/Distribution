package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChangeSetInput extends js.Object {
  
  /**
    * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order for AWS CloudFormation to create the stack.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your AWS account; for example, by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.    If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.    If you don't specify either of these capabilities, AWS CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we recommend that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group      AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User      AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some template contain macros. Macros perform custom processing on templates; this can include simple actions like find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users typically create a change set from the processed template, so that they can review the changes resulting from the macros before actually creating the stack. If your stack template contains one or more macros, and you choose to create a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by AWS CloudFormation.  This capacity does not apply to creating change sets, and specifying it when creating change sets has no effect. If you want to create a stack from a stack template that contains macros and nested stacks, you must create or update the stack directly from the template using the CreateStack or UpdateStack action, and specifying this capability.  For more information on macros, see Using AWS CloudFormation Macros to Perform Custom Processing on Templates.  
    */
  var Capabilities: js.UndefOr[typings.awsSdk.cloudformationMod.Capabilities] = js.native
  
  /**
    * The name of the change set. The name must be unique among all change sets that are associated with the specified stack. A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start with an alphabetic character and cannot exceed 128 characters.
    */
  var ChangeSetName: typings.awsSdk.cloudformationMod.ChangeSetName = js.native
  
  /**
    * The type of change set operation. To create a change set for a new stack, specify CREATE. To create a change set for an existing stack, specify UPDATE. To create a change set for an import operation, specify IMPORT. If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but no template or resources. The stack will be in the  REVIEW_IN_PROGRESS  state until you execute the change set. By default, AWS CloudFormation specifies UPDATE. You can't use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
    */
  var ChangeSetType: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSetType] = js.native
  
  /**
    * A unique identifier for this CreateChangeSet request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to create another change set with the same name. You might retry CreateChangeSet requests to ensure that AWS CloudFormation successfully received them.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.cloudformationMod.ClientToken] = js.native
  
  /**
    * A description to help you identify this change set.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * Creates a change set for the all nested stacks specified in the template. The default behavior of this action is set to False. To include nested sets in a change set, specify True.
    */
  var IncludeNestedStacks: js.UndefOr[typings.awsSdk.cloudformationMod.IncludeNestedStacks] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS CloudFormation associates with the stack. To remove all associated notification topics, specify an empty list.
    */
  var NotificationARNs: js.UndefOr[typings.awsSdk.cloudformationMod.NotificationARNs] = js.native
  
  /**
    * A list of Parameter structures that specify input parameters for the change set. For more information, see the Parameter data type.
    */
  var Parameters: js.UndefOr[typings.awsSdk.cloudformationMod.Parameters] = js.native
  
  /**
    * The template resource types that you have permissions to work with if you execute this change set, such as AWS::EC2::Instance, AWS::EC2::*, or Custom::MyCustomInstance. If the list of resource types doesn't include a resource type that you're updating, the stack update fails. By default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM) uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more information, see Controlling Access with AWS Identity and Access Management in the AWS CloudFormation User Guide.
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceTypes] = js.native
  
  /**
    * The resources to import into your stack.
    */
  var ResourcesToImport: js.UndefOr[typings.awsSdk.cloudformationMod.ResourcesToImport] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation assumes when executing the change set. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS CloudFormation uses this role for all future operations on the stack. As long as users have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role grants least privilege. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
    */
  var RoleARN: js.UndefOr[RoleARN_] = js.native
  
  /**
    * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsSdk.cloudformationMod.RollbackConfiguration] = js.native
  
  /**
    * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates the change set by comparing this stack's information with the information that you submit, such as a modified template or different parameter input values.
    */
  var StackName: StackNameOrId = js.native
  
  /**
    * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources in the stack. You can specify a maximum of 50 tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.cloudformationMod.Tags] = js.native
  
  /**
    * A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum length of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the template of the stack that you specified. Conditional: You must specify only TemplateBody or TemplateURL.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateBody] = js.native
  
  /**
    * The location of the file that contains the revised template. The URL must point to a template (max size: 460,800 bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing this template with the stack that you specified. Conditional: You must specify only TemplateBody or TemplateURL.
    */
  var TemplateURL: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateURL] = js.native
  
  /**
    * Whether to reuse the template that is associated with the stack to create the change set.
    */
  var UsePreviousTemplate: js.UndefOr[typings.awsSdk.cloudformationMod.UsePreviousTemplate] = js.native
}
object CreateChangeSetInput {
  
  @scala.inline
  def apply(ChangeSetName: ChangeSetName, StackName: StackNameOrId): CreateChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChangeSetInput]
  }
  
  @scala.inline
  implicit class CreateChangeSetInputOps[Self <: CreateChangeSetInput] (val x: Self) extends AnyVal {
    
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
    def setChangeSetName(value: ChangeSetName): Self = this.set("ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackName(value: StackNameOrId): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: Capabilities): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    
    @scala.inline
    def setChangeSetType(value: ChangeSetType): Self = this.set("ChangeSetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetType: Self = this.set("ChangeSetType", js.undefined)
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIncludeNestedStacks(value: IncludeNestedStacks): Self = this.set("IncludeNestedStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNestedStacks: Self = this.set("IncludeNestedStacks", js.undefined)
    
    @scala.inline
    def setNotificationARNsVarargs(value: NotificationARN*): Self = this.set("NotificationARNs", js.Array(value :_*))
    
    @scala.inline
    def setNotificationARNs(value: NotificationARNs): Self = this.set("NotificationARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationARNs: Self = this.set("NotificationARNs", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ResourceType*): Self = this.set("ResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: ResourceTypes): Self = this.set("ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypes: Self = this.set("ResourceTypes", js.undefined)
    
    @scala.inline
    def setResourcesToImportVarargs(value: ResourceToImport*): Self = this.set("ResourcesToImport", js.Array(value :_*))
    
    @scala.inline
    def setResourcesToImport(value: ResourcesToImport): Self = this.set("ResourcesToImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesToImport: Self = this.set("ResourcesToImport", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN_): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    
    @scala.inline
    def setRollbackConfiguration(value: RollbackConfiguration): Self = this.set("RollbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackConfiguration: Self = this.set("RollbackConfiguration", js.undefined)
    
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
    
    @scala.inline
    def setTemplateURL(value: TemplateURL): Self = this.set("TemplateURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateURL: Self = this.set("TemplateURL", js.undefined)
    
    @scala.inline
    def setUsePreviousTemplate(value: UsePreviousTemplate): Self = this.set("UsePreviousTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePreviousTemplate: Self = this.set("UsePreviousTemplate", js.undefined)
  }
}
