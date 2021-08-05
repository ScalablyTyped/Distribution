package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationVersionResponse extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.undefined
  
  /**
    * An array of parameter types supported by the application.
    */
  var ParameterDefinitions: js.UndefOr[listOfParameterDefinition] = js.undefined
  
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
  var RequiredCapabilities: js.UndefOr[listOfCapability] = js.undefined
  
  /**
    * Whether all of the AWS resources contained in this application are supported in the region
    in which it is being retrieved.
    */
  var ResourcesSupported: js.UndefOr[boolean] = js.undefined
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.undefined
  
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[string] = js.undefined
  
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[string] = js.undefined
  
  /**
    * A link to the packaged AWS SAM template of your application.
    */
  var TemplateUrl: js.UndefOr[string] = js.undefined
}
object CreateApplicationVersionResponse {
  
  inline def apply(): CreateApplicationVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationVersionResponse]
  }
  
  extension [Self <: CreateApplicationVersionResponse](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setCreationTime(value: string): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setParameterDefinitions(value: listOfParameterDefinition): Self = StObject.set(x, "ParameterDefinitions", value.asInstanceOf[js.Any])
    
    inline def setParameterDefinitionsUndefined: Self = StObject.set(x, "ParameterDefinitions", js.undefined)
    
    inline def setParameterDefinitionsVarargs(value: ParameterDefinition*): Self = StObject.set(x, "ParameterDefinitions", js.Array(value :_*))
    
    inline def setRequiredCapabilities(value: listOfCapability): Self = StObject.set(x, "RequiredCapabilities", value.asInstanceOf[js.Any])
    
    inline def setRequiredCapabilitiesUndefined: Self = StObject.set(x, "RequiredCapabilities", js.undefined)
    
    inline def setRequiredCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "RequiredCapabilities", js.Array(value :_*))
    
    inline def setResourcesSupported(value: boolean): Self = StObject.set(x, "ResourcesSupported", value.asInstanceOf[js.Any])
    
    inline def setResourcesSupportedUndefined: Self = StObject.set(x, "ResourcesSupported", js.undefined)
    
    inline def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersionUndefined: Self = StObject.set(x, "SemanticVersion", js.undefined)
    
    inline def setSourceCodeArchiveUrl(value: string): Self = StObject.set(x, "SourceCodeArchiveUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeArchiveUrlUndefined: Self = StObject.set(x, "SourceCodeArchiveUrl", js.undefined)
    
    inline def setSourceCodeUrl(value: string): Self = StObject.set(x, "SourceCodeUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeUrlUndefined: Self = StObject.set(x, "SourceCodeUrl", js.undefined)
    
    inline def setTemplateUrl(value: string): Self = StObject.set(x, "TemplateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "TemplateUrl", js.undefined)
  }
}
