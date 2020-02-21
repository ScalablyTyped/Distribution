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
  def apply(
    EncryptionKey: NonEmptyString = null,
    Environment: AwsCodeBuildProjectEnvironment = null,
    Name: NonEmptyString = null,
    ServiceRole: NonEmptyString = null,
    Source: AwsCodeBuildProjectSource = null,
    VpcConfig: AwsCodeBuildProjectVpcConfig = null
  ): AwsCodeBuildProjectDetails = {
    val __obj = js.Dynamic.literal()
    if (EncryptionKey != null) __obj.updateDynamic("EncryptionKey")(EncryptionKey.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCodeBuildProjectDetails]
  }
}

