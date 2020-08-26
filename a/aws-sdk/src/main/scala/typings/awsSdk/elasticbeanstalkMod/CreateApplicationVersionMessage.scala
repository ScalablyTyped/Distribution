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
  def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel): CreateApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationVersionMessage]
  }
  @scala.inline
  implicit class CreateApplicationVersionMessageOps[Self <: CreateApplicationVersionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = this.set("VersionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoCreateApplication(value: AutoCreateApplication): Self = this.set("AutoCreateApplication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCreateApplication: Self = this.set("AutoCreateApplication", js.undefined)
    @scala.inline
    def setBuildConfiguration(value: BuildConfiguration): Self = this.set("BuildConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildConfiguration: Self = this.set("BuildConfiguration", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setProcess(value: ApplicationVersionProccess): Self = this.set("Process", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcess: Self = this.set("Process", js.undefined)
    @scala.inline
    def setSourceBuildInformation(value: SourceBuildInformation): Self = this.set("SourceBuildInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceBuildInformation: Self = this.set("SourceBuildInformation", js.undefined)
    @scala.inline
    def setSourceBundle(value: S3Location): Self = this.set("SourceBundle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceBundle: Self = this.set("SourceBundle", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

