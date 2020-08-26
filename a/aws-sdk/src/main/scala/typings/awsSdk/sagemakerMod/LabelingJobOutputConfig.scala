package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobOutputConfig extends js.Object {
  /**
    * The AWS Key Management Service ID of the key used to encrypt the output data, if any. If you use a KMS key ID or an alias of your master key, the Amazon SageMaker execution role must include permissions to call kms:Encrypt. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with KMS-managed keys for LabelingJobOutputConfig. If you use a bucket policy with an s3:PutObject permission that only allows objects with server-side encryption, set the condition key of s3:x-amz-server-side-encryption to "aws:kms". For more information, see KMS-Managed Encryption Keys in the Amazon Simple Storage Service Developer Guide.  The KMS key policy must grant permission to the IAM role that you specify in your CreateLabelingJob request. For more information, see Using Key Policies in AWS KMS in the AWS Key Management Service Developer Guide.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * The Amazon S3 location to write output data.
    */
  var S3OutputPath: S3Uri = js.native
}

object LabelingJobOutputConfig {
  @scala.inline
  def apply(S3OutputPath: S3Uri): LabelingJobOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobOutputConfig]
  }
  @scala.inline
  implicit class LabelingJobOutputConfigOps[Self <: LabelingJobOutputConfig] (val x: Self) extends AnyVal {
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
    def setS3OutputPath(value: S3Uri): Self = this.set("S3OutputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
  }
  
}

