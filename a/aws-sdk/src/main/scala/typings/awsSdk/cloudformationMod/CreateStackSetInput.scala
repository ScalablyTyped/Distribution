package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStackSetInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to use to create this stack set. Specify an IAM role only if you are using customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Prerequisites: Granting Permissions for Stack Set Operations in the CloudFormation User Guide.
    */
  var AdministrationRoleARN: js.UndefOr[RoleARN_] = js.undefined
  
  /**
    * Describes whether StackSets automatically deploys to Organizations accounts that are added to the target organization or organizational unit (OU). Specify only if PermissionModel is SERVICE_MANAGED.
    */
  var AutoDeployment: js.UndefOr[typings.awsSdk.cloudformationMod.AutoDeployment] = js.undefined
  
  /**
    * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. By default, SELF is specified. Use SELF for stack sets with self-managed permissions.   To create a stack set with service-managed permissions while signed in to the management account, specify SELF.   To create a stack set with service-managed permissions while signed in to a delegated administrator account, specify DELEGATED_ADMIN. Your Amazon Web Services account must be registered as a delegated admin in the management account. For more information, see Register a delegated administrator in the CloudFormation User Guide.   Stack sets with service-managed permissions are created in the management account, including stack sets that are created by delegated administrators.
    */
  var CallAs: js.UndefOr[typings.awsSdk.cloudformationMod.CallAs] = js.undefined
  
  /**
    * In some cases, you must explicitly acknowledge that your stack set template contains certain capabilities in order for CloudFormation to create the stack set and related stack instances.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your Amazon Web Services account; for example, by creating new Identity and Access Management (IAM) users. For those stack sets, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.   If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.   If you don't specify either of these capabilities, CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we recommend that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group     AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User     AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some templates reference macros. If your stack set template references one or more macros, you must create the stack set directly from the processed template, without first reviewing the resulting changes in a change set. To create the stack set directly, you must acknowledge this capability. For more information, see Using CloudFormation Macros to Perform Custom Processing on Templates.  Stack sets with service-managed permissions don't currently support the use of macros in templates. (This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by CloudFormation.) Even if you specify this capability for a stack set with service-managed permissions, if you reference a macro in your template the stack set operation will fail.   
    */
  var Capabilities: js.UndefOr[typings.awsSdk.cloudformationMod.Capabilities] = js.undefined
  
  /**
    * A unique identifier for this CreateStackSet request. Specify this token if you plan to retry requests so that CloudFormation knows that you're not attempting to create another stack set with the same name. You might retry CreateStackSet requests to ensure that CloudFormation successfully received them. If you don't specify an operation ID, the SDK generates one automatically.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.cloudformationMod.ClientRequestToken] = js.undefined
  
  /**
    * A description of the stack set. You can use the description to identify the stack set's purpose or other important information.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.undefined
  
  /**
    * The name of the IAM execution role to use to create the stack set. If you do not specify an execution role, CloudFormation uses the AWSCloudFormationStackSetExecutionRole role for the stack set operation. Specify an IAM role only if you are using customized execution roles to control which stack resources users and groups can include in their stack sets.
    */
  var ExecutionRoleName: js.UndefOr[typings.awsSdk.cloudformationMod.ExecutionRoleName] = js.undefined
  
  /**
    * Describes whether StackSets performs non-conflicting operations concurrently and queues conflicting operations.
    */
  var ManagedExecution: js.UndefOr[typings.awsSdk.cloudformationMod.ManagedExecution] = js.undefined
  
  /**
    * The input parameters for the stack set template.
    */
  var Parameters: js.UndefOr[typings.awsSdk.cloudformationMod.Parameters] = js.undefined
  
  /**
    * Describes how the IAM roles required for stack set operations are created. By default, SELF-MANAGED is specified.   With self-managed permissions, you must create the administrator and execution roles required to deploy to target accounts. For more information, see Grant Self-Managed Stack Set Permissions.   With service-managed permissions, StackSets automatically creates the IAM roles required to deploy to accounts managed by Organizations. For more information, see Grant Service-Managed Stack Set Permissions.  
    */
  var PermissionModel: js.UndefOr[PermissionModels] = js.undefined
  
  /**
    * The stack ID you are importing into a new stack set. Specify the Amazon Resource Name (ARN) of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.undefined
  
  /**
    * The name to associate with the stack set. The name must be unique in the Region where you create your stack set.  A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and can't be longer than 128 characters. 
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName
  
  /**
    * The key-value pairs to associate with this stack set and the stacks created from it. CloudFormation also propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be specified. If you specify tags as part of a CreateStackSet action, CloudFormation checks to see if you have the required IAM permission to tag resources. If you don't, the entire CreateStackSet action fails with an access denied error, and the stack set is not created.
    */
  var Tags: js.UndefOr[typings.awsSdk.cloudformationMod.Tags] = js.undefined
  
  /**
    * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information, see Template Anatomy in the CloudFormation User Guide. Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateBody] = js.undefined
  
  /**
    * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800 bytes) that's located in an Amazon S3 bucket or a Systems Manager document. For more information, see Template Anatomy in the CloudFormation User Guide. Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
    */
  var TemplateURL: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateURL] = js.undefined
}
object CreateStackSetInput {
  
  inline def apply(StackSetName: StackSetName): CreateStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackSetInput]
  }
  
  extension [Self <: CreateStackSetInput](x: Self) {
    
    inline def setAdministrationRoleARN(value: RoleARN_): Self = StObject.set(x, "AdministrationRoleARN", value.asInstanceOf[js.Any])
    
    inline def setAdministrationRoleARNUndefined: Self = StObject.set(x, "AdministrationRoleARN", js.undefined)
    
    inline def setAutoDeployment(value: AutoDeployment): Self = StObject.set(x, "AutoDeployment", value.asInstanceOf[js.Any])
    
    inline def setAutoDeploymentUndefined: Self = StObject.set(x, "AutoDeployment", js.undefined)
    
    inline def setCallAs(value: CallAs): Self = StObject.set(x, "CallAs", value.asInstanceOf[js.Any])
    
    inline def setCallAsUndefined: Self = StObject.set(x, "CallAs", js.undefined)
    
    inline def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value*))
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExecutionRoleName(value: ExecutionRoleName): Self = StObject.set(x, "ExecutionRoleName", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleNameUndefined: Self = StObject.set(x, "ExecutionRoleName", js.undefined)
    
    inline def setManagedExecution(value: ManagedExecution): Self = StObject.set(x, "ManagedExecution", value.asInstanceOf[js.Any])
    
    inline def setManagedExecutionUndefined: Self = StObject.set(x, "ManagedExecution", js.undefined)
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setPermissionModel(value: PermissionModels): Self = StObject.set(x, "PermissionModel", value.asInstanceOf[js.Any])
    
    inline def setPermissionModelUndefined: Self = StObject.set(x, "PermissionModel", js.undefined)
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
    
    inline def setTemplateURL(value: TemplateURL): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
    
    inline def setTemplateURLUndefined: Self = StObject.set(x, "TemplateURL", js.undefined)
  }
}
