package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingS3Input extends js.Object {
  /**
    * The local path to the Amazon S3 bucket where you want Amazon SageMaker to download the inputs to run a processing job. LocalPath is an absolute path to the input data.
    */
  var LocalPath: ProcessingLocalPath = js.native
  /**
    * Whether to use Gzip compression for Amazon S3 storage.
    */
  var S3CompressionType: js.UndefOr[ProcessingS3CompressionType] = js.native
  /**
    * Whether the data stored in Amazon S3 is FullyReplicated or ShardedByS3Key.
    */
  var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.native
  /**
    * Whether you use an S3Prefix or a ManifestFile for the data type. If you choose S3Prefix, S3Uri identifies a key name prefix. Amazon SageMaker uses all objects with the specified key name prefix for the processing job. If you choose ManifestFile, S3Uri identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to use for the processing job.
    */
  var S3DataType: ProcessingS3DataType = js.native
  /**
    * Whether to use File or Pipe input mode. In File mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In Pipe mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
    */
  var S3InputMode: ProcessingS3InputMode = js.native
  /**
    * The URI for the Amazon S3 storage where you want Amazon SageMaker to download the artifacts needed to run a processing job.
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri = js.native
}

object ProcessingS3Input {
  @scala.inline
  def apply(
    LocalPath: ProcessingLocalPath,
    S3DataType: ProcessingS3DataType,
    S3InputMode: ProcessingS3InputMode,
    S3Uri: S3Uri
  ): ProcessingS3Input = {
    val __obj = js.Dynamic.literal(LocalPath = LocalPath.asInstanceOf[js.Any], S3DataType = S3DataType.asInstanceOf[js.Any], S3InputMode = S3InputMode.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingS3Input]
  }
  @scala.inline
  implicit class ProcessingS3InputOps[Self <: ProcessingS3Input] (val x: Self) extends AnyVal {
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
    def setLocalPath(value: ProcessingLocalPath): Self = this.set("LocalPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3DataType(value: ProcessingS3DataType): Self = this.set("S3DataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3InputMode(value: ProcessingS3InputMode): Self = this.set("S3InputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3CompressionType(value: ProcessingS3CompressionType): Self = this.set("S3CompressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3CompressionType: Self = this.set("S3CompressionType", js.undefined)
    @scala.inline
    def setS3DataDistributionType(value: ProcessingS3DataDistributionType): Self = this.set("S3DataDistributionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3DataDistributionType: Self = this.set("S3DataDistributionType", js.undefined)
  }
  
}

