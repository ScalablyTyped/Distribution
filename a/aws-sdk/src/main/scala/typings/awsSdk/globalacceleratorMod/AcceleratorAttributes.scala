package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorAttributes extends js.Object {
  /**
    * Indicates whether flow logs are enabled. The default value is false. If the value is true, FlowLogsS3Bucket and FlowLogsS3Prefix must be specified. For more information, see Flow Logs in the AWS Global Accelerator Developer Guide.
    */
  var FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * The name of the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. The bucket must exist and have a bucket policy that grants AWS Global Accelerator permission to write to the bucket.
    */
  var FlowLogsS3Bucket: js.UndefOr[GenericString] = js.native
  /**
    * The prefix for the location in the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. If you don’t specify a prefix, the flow logs are stored in the root of the bucket.
    */
  var FlowLogsS3Prefix: js.UndefOr[GenericString] = js.native
}

object AcceleratorAttributes {
  @scala.inline
  def apply(
    FlowLogsEnabled: js.UndefOr[Boolean] = js.undefined,
    FlowLogsS3Bucket: GenericString = null,
    FlowLogsS3Prefix: GenericString = null
  ): AcceleratorAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FlowLogsEnabled)) __obj.updateDynamic("FlowLogsEnabled")(FlowLogsEnabled.asInstanceOf[js.Any])
    if (FlowLogsS3Bucket != null) __obj.updateDynamic("FlowLogsS3Bucket")(FlowLogsS3Bucket.asInstanceOf[js.Any])
    if (FlowLogsS3Prefix != null) __obj.updateDynamic("FlowLogsS3Prefix")(FlowLogsS3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorAttributes]
  }
}

