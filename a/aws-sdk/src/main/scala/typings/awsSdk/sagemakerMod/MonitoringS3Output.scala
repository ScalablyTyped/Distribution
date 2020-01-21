package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringS3Output extends js.Object {
  /**
    * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job. LocalPath is an absolute path for the output data.
    */
  var LocalPath: ProcessingLocalPath = js.native
  /**
    * Whether to upload the results of the monitoring job continuously or after the job completes.
    */
  var S3UploadMode: js.UndefOr[ProcessingS3UploadMode] = js.native
  /**
    * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
    */
  var S3Uri: MonitoringS3Uri = js.native
}

object MonitoringS3Output {
  @scala.inline
  def apply(
    LocalPath: ProcessingLocalPath,
    S3Uri: MonitoringS3Uri,
    S3UploadMode: ProcessingS3UploadMode = null
  ): MonitoringS3Output = {
    val __obj = js.Dynamic.literal(LocalPath = LocalPath.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    if (S3UploadMode != null) __obj.updateDynamic("S3UploadMode")(S3UploadMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringS3Output]
  }
}

