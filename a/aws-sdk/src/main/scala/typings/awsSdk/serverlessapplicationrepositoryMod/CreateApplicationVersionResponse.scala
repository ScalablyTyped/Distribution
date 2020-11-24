package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationVersionResponse extends js.Object {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.native
  
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.native
  
  /**
    * An array of parameter types supported by the application.
    */
  var ParameterDefinitions: js.UndefOr[listOfParameterDefinition] = js.native
  
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
  var RequiredCapabilities: js.UndefOr[listOfCapability] = js.native
  
  /**
    * Whether all of the AWS resources contained in this application are supported in the region
    in which it is being retrieved.
    */
  var ResourcesSupported: js.UndefOr[boolean] = js.native
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
  
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
  var TemplateUrl: js.UndefOr[string] = js.native
}
object CreateApplicationVersionResponse {
  
  @scala.inline
  def apply(): CreateApplicationVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationVersionResponse]
  }
  
  @scala.inline
  implicit class CreateApplicationVersionResponseOps[Self <: CreateApplicationVersionResponse] (val x: Self) extends AnyVal {
    
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
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: string): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setParameterDefinitionsVarargs(value: ParameterDefinition*): Self = this.set("ParameterDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setParameterDefinitions(value: listOfParameterDefinition): Self = this.set("ParameterDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterDefinitions: Self = this.set("ParameterDefinitions", js.undefined)
    
    @scala.inline
    def setRequiredCapabilitiesVarargs(value: Capability*): Self = this.set("RequiredCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setRequiredCapabilities(value: listOfCapability): Self = this.set("RequiredCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredCapabilities: Self = this.set("RequiredCapabilities", js.undefined)
    
    @scala.inline
    def setResourcesSupported(value: boolean): Self = this.set("ResourcesSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesSupported: Self = this.set("ResourcesSupported", js.undefined)
    
    @scala.inline
    def setSemanticVersion(value: string): Self = this.set("SemanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemanticVersion: Self = this.set("SemanticVersion", js.undefined)
    
    @scala.inline
    def setSourceCodeArchiveUrl(value: string): Self = this.set("SourceCodeArchiveUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeArchiveUrl: Self = this.set("SourceCodeArchiveUrl", js.undefined)
    
    @scala.inline
    def setSourceCodeUrl(value: string): Self = this.set("SourceCodeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeUrl: Self = this.set("SourceCodeUrl", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: string): Self = this.set("TemplateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("TemplateUrl", js.undefined)
  }
}
