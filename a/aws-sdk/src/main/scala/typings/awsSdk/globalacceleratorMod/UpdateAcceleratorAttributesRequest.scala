package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(AcceleratorArn: GenericString): UpdateAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAcceleratorAttributesRequest]
  }
  
  @scala.inline
  implicit class UpdateAcceleratorAttributesRequestOps[Self <: UpdateAcceleratorAttributesRequest] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorArn(value: GenericString): Self = this.set("AcceleratorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogsEnabled(value: GenericBoolean): Self = this.set("FlowLogsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowLogsEnabled: Self = this.set("FlowLogsEnabled", js.undefined)
    
    @scala.inline
    def setFlowLogsS3Bucket(value: GenericString): Self = this.set("FlowLogsS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowLogsS3Bucket: Self = this.set("FlowLogsS3Bucket", js.undefined)
    
    @scala.inline
    def setFlowLogsS3Prefix(value: GenericString): Self = this.set("FlowLogsS3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowLogsS3Prefix: Self = this.set("FlowLogsS3Prefix", js.undefined)
  }
}
