package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildConfiguration extends js.Object {
  /**
    * The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact in the S3 location S3-bucket/resources/application-name/codebuild/codebuild-version-label-artifact-name.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3 location S3-bucket/resources/application-name/codebuild/codebuild-version-label.zip. 
    */
  var ArtifactName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var CodeBuildServiceRole: NonEmptyString = js.native
  /**
    * Information about the compute resources the build project will use.    BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds     BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds     BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds   
    */
  var ComputeType: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ComputeType] = js.native
  /**
    * The ID of the Docker image to use for this build project.
    */
  var Image: NonEmptyString = js.native
  /**
    * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
    */
  var TimeoutInMinutes: js.UndefOr[BoxedInt] = js.native
}

object BuildConfiguration {
  @scala.inline
  def apply(CodeBuildServiceRole: NonEmptyString, Image: NonEmptyString): BuildConfiguration = {
    val __obj = js.Dynamic.literal(CodeBuildServiceRole = CodeBuildServiceRole.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildConfiguration]
  }
  @scala.inline
  implicit class BuildConfigurationOps[Self <: BuildConfiguration] (val x: Self) extends AnyVal {
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
    def setCodeBuildServiceRole(value: NonEmptyString): Self = this.set("CodeBuildServiceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: NonEmptyString): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactName(value: String): Self = this.set("ArtifactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactName: Self = this.set("ArtifactName", js.undefined)
    @scala.inline
    def setComputeType(value: ComputeType): Self = this.set("ComputeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeType: Self = this.set("ComputeType", js.undefined)
    @scala.inline
    def setTimeoutInMinutes(value: BoxedInt): Self = this.set("TimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInMinutes: Self = this.set("TimeoutInMinutes", js.undefined)
  }
  
}

