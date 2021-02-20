package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: string = js.native
  
  /**
    * The date and time this resource was created.
    */
  var CreationTime: string = js.native
  
  /**
    * An array of parameter types supported by the application.
    */
  var ParameterDefinitions: listOfParameterDefinition = js.native
  
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
    AWS::SNS::TopicPolicy.Applications that contain one or more nested applications require you to specify
    CAPABILITY_AUTO_EXPAND.If your application template contains any of the above resources, we recommend that you review
    all permissions associated with the application before deploying. If you don't specify
    this parameter for an application that requires capabilities, the call will fail.
    */
  var RequiredCapabilities: listOfCapability = js.native
  
  /**
    * Whether all of the AWS resources contained in this application are supported in the region
    in which it is being retrieved.
    */
  var ResourcesSupported: boolean = js.native
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: string = js.native
  
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[string] = js.native
  
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[string] = js.native
  
  /**
    * A link to the packaged AWS SAM template of your application.
    */
  var TemplateUrl: string = js.native
}
object Version {
  
  @scala.inline
  def apply(
    ApplicationId: string,
    CreationTime: string,
    ParameterDefinitions: listOfParameterDefinition,
    RequiredCapabilities: listOfCapability,
    ResourcesSupported: boolean,
    SemanticVersion: string,
    TemplateUrl: string
  ): Version = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], ParameterDefinitions = ParameterDefinitions.asInstanceOf[js.Any], RequiredCapabilities = RequiredCapabilities.asInstanceOf[js.Any], ResourcesSupported = ResourcesSupported.asInstanceOf[js.Any], SemanticVersion = SemanticVersion.asInstanceOf[js.Any], TemplateUrl = TemplateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: string): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterDefinitions(value: listOfParameterDefinition): Self = StObject.set(x, "ParameterDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterDefinitionsVarargs(value: ParameterDefinition*): Self = StObject.set(x, "ParameterDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setRequiredCapabilities(value: listOfCapability): Self = StObject.set(x, "RequiredCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "RequiredCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setResourcesSupported(value: boolean): Self = StObject.set(x, "ResourcesSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeArchiveUrl(value: string): Self = StObject.set(x, "SourceCodeArchiveUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeArchiveUrlUndefined: Self = StObject.set(x, "SourceCodeArchiveUrl", js.undefined)
    
    @scala.inline
    def setSourceCodeUrl(value: string): Self = StObject.set(x, "SourceCodeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeUrlUndefined: Self = StObject.set(x, "SourceCodeUrl", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: string): Self = StObject.set(x, "TemplateUrl", value.asInstanceOf[js.Any])
  }
}
