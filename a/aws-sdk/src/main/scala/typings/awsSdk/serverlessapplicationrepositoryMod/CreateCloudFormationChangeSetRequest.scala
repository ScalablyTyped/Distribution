package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCloudFormationChangeSetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string
  
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
  var Capabilities: js.UndefOr[listOfString] = js.undefined
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var ChangeSetName: js.UndefOr[string] = js.undefined
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var ClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var NotificationArns: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of parameter values for the parameters of the application.
    */
  var ParameterOverrides: js.UndefOr[listOfParameterValue] = js.undefined
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var ResourceTypes: js.UndefOr[listOfString] = js.undefined
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.RollbackConfiguration] = js.undefined
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.undefined
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var StackName: string
  
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var Tags: js.UndefOr[listOfTag] = js.undefined
  
  /**
    * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
    */
  var TemplateId: js.UndefOr[string] = js.undefined
}
object CreateCloudFormationChangeSetRequest {
  
  inline def apply(ApplicationId: string, StackName: string): CreateCloudFormationChangeSetRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationChangeSetRequest]
  }
  
  extension [Self <: CreateCloudFormationChangeSetRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: listOfString): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: string*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    inline def setChangeSetName(value: string): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    inline def setClientToken(value: string): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setNotificationArns(value: listOfString): Self = StObject.set(x, "NotificationArns", value.asInstanceOf[js.Any])
    
    inline def setNotificationArnsUndefined: Self = StObject.set(x, "NotificationArns", js.undefined)
    
    inline def setNotificationArnsVarargs(value: string*): Self = StObject.set(x, "NotificationArns", js.Array(value :_*))
    
    inline def setParameterOverrides(value: listOfParameterValue): Self = StObject.set(x, "ParameterOverrides", value.asInstanceOf[js.Any])
    
    inline def setParameterOverridesUndefined: Self = StObject.set(x, "ParameterOverrides", js.undefined)
    
    inline def setParameterOverridesVarargs(value: ParameterValue*): Self = StObject.set(x, "ParameterOverrides", js.Array(value :_*))
    
    inline def setResourceTypes(value: listOfString): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: string*): Self = StObject.set(x, "ResourceTypes", js.Array(value :_*))
    
    inline def setRollbackConfiguration(value: RollbackConfiguration): Self = StObject.set(x, "RollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRollbackConfigurationUndefined: Self = StObject.set(x, "RollbackConfiguration", js.undefined)
    
    inline def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersionUndefined: Self = StObject.set(x, "SemanticVersion", js.undefined)
    
    inline def setStackName(value: string): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: listOfTag): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTemplateId(value: string): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
  }
}
