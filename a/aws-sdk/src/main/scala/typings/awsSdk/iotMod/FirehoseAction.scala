package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseAction extends js.Object {
  
  /**
    * Whether to deliver the Kinesis Data Firehose stream as a batch by using  PutRecordBatch . The default value is false. When batchMode is true and the rule's SQL statement evaluates to an Array, each Array element forms one record in the  PutRecordBatch  request. The resulting array can't have more than 500 records.
    */
  var batchMode: js.UndefOr[BatchMode] = js.native
  
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: DeliveryStreamName = js.native
  
  /**
    * The IAM role that grants access to the Amazon Kinesis Firehose stream.
    */
  var roleArn: AwsArn = js.native
  
  /**
    * A character separator that will be used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[FirehoseSeparator] = js.native
}
object FirehoseAction {
  
  @scala.inline
  def apply(deliveryStreamName: DeliveryStreamName, roleArn: AwsArn): FirehoseAction = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseAction]
  }
  
  @scala.inline
  implicit class FirehoseActionOps[Self <: FirehoseAction] (val x: Self) extends AnyVal {
    
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
    def setDeliveryStreamName(value: DeliveryStreamName): Self = this.set("deliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchMode(value: BatchMode): Self = this.set("batchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchMode: Self = this.set("batchMode", js.undefined)
    
    @scala.inline
    def setSeparator(value: FirehoseSeparator): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
