package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationVersionMessage extends js.Object {
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
  def apply(
    ApplicationName: ApplicationName,
    VersionLabel: VersionLabel,
    AutoCreateApplication: js.UndefOr[Boolean] = js.undefined,
    BuildConfiguration: BuildConfiguration = null,
    Description: Description = null,
    Process: js.UndefOr[Boolean] = js.undefined,
    SourceBuildInformation: SourceBuildInformation = null,
    SourceBundle: S3Location = null,
    Tags: Tags = null
  ): CreateApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoCreateApplication)) __obj.updateDynamic("AutoCreateApplication")(AutoCreateApplication.asInstanceOf[js.Any])
    if (BuildConfiguration != null) __obj.updateDynamic("BuildConfiguration")(BuildConfiguration.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Process)) __obj.updateDynamic("Process")(Process.asInstanceOf[js.Any])
    if (SourceBuildInformation != null) __obj.updateDynamic("SourceBuildInformation")(SourceBuildInformation.asInstanceOf[js.Any])
    if (SourceBundle != null) __obj.updateDynamic("SourceBundle")(SourceBundle.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationVersionMessage]
  }
}

