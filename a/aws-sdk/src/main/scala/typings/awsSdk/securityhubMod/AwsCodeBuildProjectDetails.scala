package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCodeBuildProjectDetails extends js.Object {
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the build output artifacts. You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK alias (using the format alias/alias-name). 
    */
  var EncryptionKey: js.UndefOr[NonEmptyString] = js.native
  /**
    * Information about the build environment for this build project.
    */
  var Environment: js.UndefOr[AwsCodeBuildProjectEnvironment] = js.native
  /**
    * The name of the build project.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var ServiceRole: js.UndefOr[NonEmptyString] = js.native
  /**
    * Information about the build input source code for this build project.
    */
  var Source: js.UndefOr[AwsCodeBuildProjectSource] = js.native
  /**
    * Information about the VPC configuration that AWS CodeBuild accesses.
    */
  var VpcConfig: js.UndefOr[AwsCodeBuildProjectVpcConfig] = js.native
}

object AwsCodeBuildProjectDetails {
  @scala.inline
  def apply(): AwsCodeBuildProjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectDetails]
  }
  @scala.inline
  implicit class AwsCodeBuildProjectDetailsOps[Self <: AwsCodeBuildProjectDetails] (val x: Self) extends AnyVal {
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
    def setEncryptionKey(value: NonEmptyString): Self = this.set("EncryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionKey: Self = this.set("EncryptionKey", js.undefined)
    @scala.inline
    def setEnvironment(value: AwsCodeBuildProjectEnvironment): Self = this.set("Environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setServiceRole(value: NonEmptyString): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRole: Self = this.set("ServiceRole", js.undefined)
    @scala.inline
    def setSource(value: AwsCodeBuildProjectSource): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setVpcConfig(value: AwsCodeBuildProjectVpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

