package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVersionDescription extends js.Object {
  
  /**
    * The name of the application to which the application version belongs.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the application version.
    */
  var ApplicationVersionArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationVersionArn] = js.native
  
  /**
    * Reference to the artifact from the AWS CodeBuild build.
    */
  var BuildArn: js.UndefOr[String] = js.native
  
  /**
    * The creation date of the application version.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.native
  
  /**
    * The last modified date of the application version.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.native
  
  /**
    * The description of the application version.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  
  /**
    * If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the application version.
    */
  var SourceBuildInformation: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SourceBuildInformation] = js.native
  
  /**
    * The storage location of the application version's source bundle in Amazon S3.
    */
  var SourceBundle: js.UndefOr[S3Location] = js.native
  
  /**
    * The processing status of the application version. Reflects the state of the application version during its creation. Many of the values are only applicable if you specified True for the Process parameter of the CreateApplicationVersion action. The following list describes the possible values.    Unprocessed – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate configuration files during deployment of the application version to an environment.    Processing – Elastic Beanstalk is currently processing the application version.    Building – Application version is currently undergoing an AWS CodeBuild build.    Processed – Elastic Beanstalk was successfully pre-processed and validated.    Failed – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This application version isn't usable.  
    */
  var Status: js.UndefOr[ApplicationVersionStatus] = js.native
  
  /**
    * A unique identifier for the application version.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}
object ApplicationVersionDescription {
  
  @scala.inline
  def apply(): ApplicationVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescription]
  }
  
  @scala.inline
  implicit class ApplicationVersionDescriptionOps[Self <: ApplicationVersionDescription] (val x: Self) extends AnyVal {
    
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
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    
    @scala.inline
    def setApplicationVersionArn(value: ApplicationVersionArn): Self = this.set("ApplicationVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersionArn: Self = this.set("ApplicationVersionArn", js.undefined)
    
    @scala.inline
    def setBuildArn(value: String): Self = this.set("BuildArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildArn: Self = this.set("BuildArn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: CreationDate): Self = this.set("DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCreated: Self = this.set("DateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: UpdateDate): Self = this.set("DateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateUpdated: Self = this.set("DateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setSourceBuildInformation(value: SourceBuildInformation): Self = this.set("SourceBuildInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceBuildInformation: Self = this.set("SourceBuildInformation", js.undefined)
    
    @scala.inline
    def setSourceBundle(value: S3Location): Self = this.set("SourceBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceBundle: Self = this.set("SourceBundle", js.undefined)
    
    @scala.inline
    def setStatus(value: ApplicationVersionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = this.set("VersionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionLabel: Self = this.set("VersionLabel", js.undefined)
  }
}
