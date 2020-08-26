package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCodeBuildProjectEnvironment extends js.Object {
  /**
    * The certificate to use with this build project.
    */
  var Certificate: js.UndefOr[NonEmptyString] = js.native
  /**
    * The type of credentials AWS CodeBuild uses to pull images in your build. Valid values:    CODEBUILD specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust the AWS CodeBuild service principal.    SERVICE_ROLE specifies that AWS CodeBuild uses your build project's service role.   When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
    */
  var ImagePullCredentialsType: js.UndefOr[NonEmptyString] = js.native
  /**
    * The credentials for access to a private registry.
    */
  var RegistryCredential: js.UndefOr[AwsCodeBuildProjectEnvironmentRegistryCredential] = js.native
  /**
    * The type of build environment to use for related builds. The environment type ARM_CONTAINER is available only in Regions US East (N. Virginia), US East (Ohio), US West (Oregon), Europe (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Sydney), and Europe (Frankfurt). The environment type LINUX_CONTAINER with compute type build.general1.2xlarge is available only in Regions US East (N. Virginia), US East (N. Virginia), US West (Oregon), Canada (Central), Europe (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia). The environment type LINUX_GPU_CONTAINER is available only in Regions US East (N. Virginia), US East (N. Virginia), US West (Oregon), Canada (Central), Europe (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia). Valid values: WINDOWS_CONTAINER | LINUX_CONTAINER | LINUX_GPU_CONTAINER | ARM_CONTAINER 
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
}

object AwsCodeBuildProjectEnvironment {
  @scala.inline
  def apply(): AwsCodeBuildProjectEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectEnvironment]
  }
  @scala.inline
  implicit class AwsCodeBuildProjectEnvironmentOps[Self <: AwsCodeBuildProjectEnvironment] (val x: Self) extends AnyVal {
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
    def setCertificate(value: NonEmptyString): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
    @scala.inline
    def setImagePullCredentialsType(value: NonEmptyString): Self = this.set("ImagePullCredentialsType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePullCredentialsType: Self = this.set("ImagePullCredentialsType", js.undefined)
    @scala.inline
    def setRegistryCredential(value: AwsCodeBuildProjectEnvironmentRegistryCredential): Self = this.set("RegistryCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryCredential: Self = this.set("RegistryCredential", js.undefined)
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

