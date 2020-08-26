package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpEndpointDestinationUpdate extends js.Object {
  /**
    * Describes buffering options that can be applied to the data before it is delivered to the HTTPS endpoint destination. Kinesis Data Firehose teats these options as hints, and it might choose to use more optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if specify a value for one of them, you must also provide a value for the other. 
    */
  var BufferingHints: js.UndefOr[HttpEndpointBufferingHints] = js.native
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * Describes the configuration of the HTTP endpoint destination.
    */
  var EndpointConfiguration: js.UndefOr[HttpEndpointConfiguration] = js.native
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  /**
    * The configuration of the request sent to the HTTP endpoint specified as the destination.
    */
  var RequestConfiguration: js.UndefOr[HttpEndpointRequestConfiguration] = js.native
  /**
    * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP endpoint destination.
    */
  var RetryOptions: js.UndefOr[HttpEndpointRetryOptions] = js.native
  /**
    * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.firehoseMod.RoleARN] = js.native
  /**
    * Describes the S3 bucket backup options for the data that Kinesis Firehose delivers to the HTTP endpoint destination. You can back up all documents (AllData) or only the documents that Kinesis Data Firehose could not deliver to the specified HTTP endpoint destination (FailedDataOnly).
    */
  var S3BackupMode: js.UndefOr[HttpEndpointS3BackupMode] = js.native
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.native
}

object HttpEndpointDestinationUpdate {
  @scala.inline
  def apply(): HttpEndpointDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointDestinationUpdate]
  }
  @scala.inline
  implicit class HttpEndpointDestinationUpdateOps[Self <: HttpEndpointDestinationUpdate] (val x: Self) extends AnyVal {
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
    def setBufferingHints(value: HttpEndpointBufferingHints): Self = this.set("BufferingHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferingHints: Self = this.set("BufferingHints", js.undefined)
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = this.set("CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLoggingOptions: Self = this.set("CloudWatchLoggingOptions", js.undefined)
    @scala.inline
    def setEndpointConfiguration(value: HttpEndpointConfiguration): Self = this.set("EndpointConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointConfiguration: Self = this.set("EndpointConfiguration", js.undefined)
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = this.set("ProcessingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("ProcessingConfiguration", js.undefined)
    @scala.inline
    def setRequestConfiguration(value: HttpEndpointRequestConfiguration): Self = this.set("RequestConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestConfiguration: Self = this.set("RequestConfiguration", js.undefined)
    @scala.inline
    def setRetryOptions(value: HttpEndpointRetryOptions): Self = this.set("RetryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryOptions: Self = this.set("RetryOptions", js.undefined)
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    @scala.inline
    def setS3BackupMode(value: HttpEndpointS3BackupMode): Self = this.set("S3BackupMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BackupMode: Self = this.set("S3BackupMode", js.undefined)
    @scala.inline
    def setS3Update(value: S3DestinationUpdate): Self = this.set("S3Update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Update: Self = this.set("S3Update", js.undefined)
  }
  
}

