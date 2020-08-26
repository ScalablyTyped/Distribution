package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOutput extends js.Object {
  /**
    * The MIME type used to specify the output data. Amazon SageMaker uses the MIME type with each http call to transfer data from the transform job.
    */
  var Accept: js.UndefOr[typings.awsSdk.sagemakerMod.Accept] = js.native
  /**
    * Defines how to assemble the results of the transform job as a single S3 object. Choose a format that is most convenient to you. To concatenate the results in binary format, specify None. To add a newline character at the end of every transformed record, specify Line.
    */
  var AssembleWith: js.UndefOr[AssemblyType] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption. The KmsKeyId can be any of the following formats:    Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias    If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more information, see KMS-Managed Encryption Keys in the Amazon Simple Storage Service Developer Guide.  The KMS key policy must grant permission to the IAM role that you specify in your CreateModel request. For more information, see Using Key Policies in AWS KMS in the AWS Key Management Service Developer Guide.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job. For example, s3://bucket-name/key-name-prefix. For every S3 object used as input for the transform job, batch transform stores the transformed data with an .out suffix in a corresponding subfolder in the location in the output prefix. For example, for the input data stored at s3://bucket-name/input-name-prefix/dataset01/data.csv, batch transform stores the transformed data at s3://bucket-name/output-name-prefix/input-name-prefix/data.csv.out. Batch transform doesn't upload partially processed objects. For an input S3 object that contains multiple records, it creates an .out file only if the transform job succeeds on the entire file. When the input contains multiple S3 objects, the batch transform job processes the listed S3 objects and uploads only the output for successfully processed objects. If any object fails in the transform job batch transform marks the job as failed to prompt investigation.
    */
  var S3OutputPath: S3Uri = js.native
}

object TransformOutput {
  @scala.inline
  def apply(S3OutputPath: S3Uri): TransformOutput = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOutput]
  }
  @scala.inline
  implicit class TransformOutputOps[Self <: TransformOutput] (val x: Self) extends AnyVal {
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
    def setAccept(value: Accept): Self = this.set("Accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("Accept", js.undefined)
    @scala.inline
    def setAssembleWith(value: AssemblyType): Self = this.set("AssembleWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssembleWith: Self = this.set("AssembleWith", js.undefined)
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
  }
  
}

