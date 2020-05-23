package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAcceleratorAttributesRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator that you want to update.
    */
  var AcceleratorArn: GenericString = js.native
  /**
    * Update whether flow logs are enabled. The default value is false. If the value is true, FlowLogsS3Bucket and FlowLogsS3Prefix must be specified. For more information, see Flow Logs in the AWS Global Accelerator Developer Guide.
    */
  var FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * The name of the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. The bucket must exist and have a bucket policy that grants AWS Global Accelerator permission to write to the bucket.
    */
  var FlowLogsS3Bucket: js.UndefOr[GenericString] = js.native
  /**
    * Update the prefix for the location in the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true.  If you don’t specify a prefix, the flow logs are stored in the root of the bucket. If you specify slash (/) for the S3 bucket prefix, the log file bucket folder structure will include a double slash (//), like the following: s3-bucket_name//AWSLogs/aws_account_id
    */
  var FlowLogsS3Prefix: js.UndefOr[GenericString] = js.native
}

object UpdateAcceleratorAttributesRequest {
  @scala.inline
  def apply(
    AcceleratorArn: GenericString,
    FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined,
    FlowLogsS3Bucket: GenericString = null,
    FlowLogsS3Prefix: GenericString = null
  ): UpdateAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    if (!js.isUndefined(FlowLogsEnabled)) __obj.updateDynamic("FlowLogsEnabled")(FlowLogsEnabled.get.asInstanceOf[js.Any])
    if (FlowLogsS3Bucket != null) __obj.updateDynamic("FlowLogsS3Bucket")(FlowLogsS3Bucket.asInstanceOf[js.Any])
    if (FlowLogsS3Prefix != null) __obj.updateDynamic("FlowLogsS3Prefix")(FlowLogsS3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAcceleratorAttributesRequest]
  }
}

