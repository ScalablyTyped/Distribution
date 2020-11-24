package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCloudFormationChangeSetRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  
  /**
    * A list of values that you must specify before you can deploy certain applications.
    Some applications might include resources that can affect permissions in your AWS
    account, for example, by creating new AWS Identity and Access Management (IAM) users.
    For those applications, you must explicitly acknowledge their capabilities by
    specifying this parameter.The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM,
    CAPABILITY_RESOURCE_POLICY, and CAPABILITY_AUTO_EXPAND.The following resources require you to specify CAPABILITY_IAM or
    CAPABILITY_NAMED_IAM:
    AWS::IAM::Group,
    AWS::IAM::InstanceProfile,
    AWS::IAM::Policy, and
    AWS::IAM::Role.
    If the application contains IAM resources, you can specify either CAPABILITY_IAM
    or CAPABILITY_NAMED_IAM. If the application contains IAM resources
    with custom names, you must specify CAPABILITY_NAMED_IAM.The following resources require you to specify CAPABILITY_RESOURCE_POLICY:
    AWS::Lambda::Permission,
    AWS::IAM:Policy,
    AWS::ApplicationAutoScaling::ScalingPolicy,
    AWS::S3::BucketPolicy,
    AWS::SQS::QueuePolicy, and
    AWS::SNS:TopicPolicy.Applications that contain one or more nested applications require you to specify
    CAPABILITY_AUTO_EXPAND.If your application template contains any of the above resources, we recommend that you review
    all permissions associated with the application before deploying. If you don't specify
    this parameter for an application that requires capabilities, the call will fail.
    */
  var Capabilities: js.UndefOr[listOfString] = js.native
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var ChangeSetName: js.UndefOr[string] = js.native
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var ClientToken: js.UndefOr[string] = js.native
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var NotificationArns: js.UndefOr[listOfString] = js.native
  
  /**
    * A list of parameter values for the parameters of the application.
    */
  var ParameterOverrides: js.UndefOr[listOfParameterValue] = js.native
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var ResourceTypes: js.UndefOr[listOfString] = js.native
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.RollbackConfiguration] = js.native
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var StackName: string = js.native
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var Tags: js.UndefOr[listOfTag] = js.native
  
  /**
    * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
    */
  var TemplateId: js.UndefOr[string] = js.native
}
object CreateCloudFormationChangeSetRequest {
  
  @scala.inline
  def apply(ApplicationId: string, StackName: string): CreateCloudFormationChangeSetRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationChangeSetRequest]
  }
  
  @scala.inline
  implicit class CreateCloudFormationChangeSetRequestOps[Self <: CreateCloudFormationChangeSetRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackName(value: string): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesVarargs(value: string*): Self = this.set("Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: listOfString): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    
    @scala.inline
    def setChangeSetName(value: string): Self = this.set("ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetName: Self = this.set("ChangeSetName", js.undefined)
    
    @scala.inline
    def setClientToken(value: string): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setNotificationArnsVarargs(value: string*): Self = this.set("NotificationArns", js.Array(value :_*))
    
    @scala.inline
    def setNotificationArns(value: listOfString): Self = this.set("NotificationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationArns: Self = this.set("NotificationArns", js.undefined)
    
    @scala.inline
    def setParameterOverridesVarargs(value: ParameterValue*): Self = this.set("ParameterOverrides", js.Array(value :_*))
    
    @scala.inline
    def setParameterOverrides(value: listOfParameterValue): Self = this.set("ParameterOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterOverrides: Self = this.set("ParameterOverrides", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: string*): Self = this.set("ResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: listOfString): Self = this.set("ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypes: Self = this.set("ResourceTypes", js.undefined)
    
    @scala.inline
    def setRollbackConfiguration(value: RollbackConfiguration): Self = this.set("RollbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackConfiguration: Self = this.set("RollbackConfiguration", js.undefined)
    
    @scala.inline
    def setSemanticVersion(value: string): Self = this.set("SemanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemanticVersion: Self = this.set("SemanticVersion", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: listOfTag): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTemplateId(value: string): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("TemplateId", js.undefined)
  }
}
