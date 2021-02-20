package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVersionDescription extends StObject {
  
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
  implicit class ApplicationVersionDescriptionMutableBuilder[Self <: ApplicationVersionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    @scala.inline
    def setApplicationVersionArn(value: ApplicationVersionArn): Self = StObject.set(x, "ApplicationVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionArnUndefined: Self = StObject.set(x, "ApplicationVersionArn", js.undefined)
    
    @scala.inline
    def setBuildArn(value: String): Self = StObject.set(x, "BuildArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildArnUndefined: Self = StObject.set(x, "BuildArn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: CreationDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: UpdateDate): Self = StObject.set(x, "DateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdatedUndefined: Self = StObject.set(x, "DateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setSourceBuildInformation(value: SourceBuildInformation): Self = StObject.set(x, "SourceBuildInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBuildInformationUndefined: Self = StObject.set(x, "SourceBuildInformation", js.undefined)
    
    @scala.inline
    def setSourceBundle(value: S3Location): Self = StObject.set(x, "SourceBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBundleUndefined: Self = StObject.set(x, "SourceBundle", js.undefined)
    
    @scala.inline
    def setStatus(value: ApplicationVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionLabelUndefined: Self = StObject.set(x, "VersionLabel", js.undefined)
  }
}
