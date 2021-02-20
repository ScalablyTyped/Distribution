package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationVersionMessage extends StObject {
  
  /**
    *  The name of the application. If no application is found with this name, and AutoCreateApplication is false, returns an InvalidParameterValue error. 
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  
  /**
    * Set to true to create an application with the specified name if it doesn't already exist.
    */
  var AutoCreateApplication: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.AutoCreateApplication] = js.native
  
  /**
    * Settings for an AWS CodeBuild build.
    */
  var BuildConfiguration: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.BuildConfiguration] = js.native
  
  /**
    * A description of this application version.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  
  /**
    * Pre-processes and validates the environment manifest (env.yaml) and configuration files (*.config files in the .ebextensions folder) in the source bundle. Validating configuration files can identify issues prior to deploying the application version to an environment. You must turn processing on for application versions that you create using AWS CodeBuild or AWS CodeCommit. For application versions built from a source bundle in Amazon S3, processing is optional.  The Process option validates Elastic Beanstalk configuration files. It doesn't validate your application's configuration files, like proxy server or Docker configuration. 
    */
  var Process: js.UndefOr[ApplicationVersionProccess] = js.native
  
  /**
    * Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application version.
    */
  var SourceBuildInformation: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SourceBuildInformation] = js.native
  
  /**
    * The Amazon S3 bucket and key that identify the location of the source bundle for this version.  The Amazon S3 bucket must be in the same region as the environment.  Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with SourceBuildInformation), but not both. If neither SourceBundle nor SourceBuildInformation are provided, Elastic Beanstalk uses a sample application.
    */
  var SourceBundle: js.UndefOr[S3Location] = js.native
  
  /**
    * Specifies the tags applied to the application version. Elastic Beanstalk applies these tags only to the application version. Environments that use the application version don't inherit the tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Tags] = js.native
  
  /**
    * A label identifying this version. Constraint: Must be unique per application. If an application version already exists with this label for the specified application, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
    */
  var VersionLabel: typings.awsSdk.elasticbeanstalkMod.VersionLabel = js.native
}
object CreateApplicationVersionMessage {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel): CreateApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationVersionMessage]
  }
  
  @scala.inline
  implicit class CreateApplicationVersionMessageMutableBuilder[Self <: CreateApplicationVersionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateApplication(value: AutoCreateApplication): Self = StObject.set(x, "AutoCreateApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateApplicationUndefined: Self = StObject.set(x, "AutoCreateApplication", js.undefined)
    
    @scala.inline
    def setBuildConfiguration(value: BuildConfiguration): Self = StObject.set(x, "BuildConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildConfigurationUndefined: Self = StObject.set(x, "BuildConfiguration", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setProcess(value: ApplicationVersionProccess): Self = StObject.set(x, "Process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessUndefined: Self = StObject.set(x, "Process", js.undefined)
    
    @scala.inline
    def setSourceBuildInformation(value: SourceBuildInformation): Self = StObject.set(x, "SourceBuildInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBuildInformationUndefined: Self = StObject.set(x, "SourceBuildInformation", js.undefined)
    
    @scala.inline
    def setSourceBundle(value: S3Location): Self = StObject.set(x, "SourceBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBundleUndefined: Self = StObject.set(x, "SourceBundle", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
  }
}
