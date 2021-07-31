package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseAction extends StObject {
  
  /**
    * Whether to deliver the Kinesis Data Firehose stream as a batch by using  PutRecordBatch . The default value is false. When batchMode is true and the rule's SQL statement evaluates to an Array, each Array element forms one record in the  PutRecordBatch  request. The resulting array can't have more than 500 records.
    */
  var batchMode: js.UndefOr[BatchMode] = js.undefined
  
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: DeliveryStreamName
  
  /**
    * The IAM role that grants access to the Amazon Kinesis Firehose stream.
    */
  var roleArn: AwsArn
  
  /**
    * A character separator that will be used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[FirehoseSeparator] = js.undefined
}
object FirehoseAction {
  
  @scala.inline
  def apply(deliveryStreamName: DeliveryStreamName, roleArn: AwsArn): FirehoseAction = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseAction]
  }
  
  @scala.inline
  implicit class FirehoseActionMutableBuilder[Self <: FirehoseAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchMode(value: BatchMode): Self = StObject.set(x, "batchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchModeUndefined: Self = StObject.set(x, "batchMode", js.undefined)
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "deliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: FirehoseSeparator): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
