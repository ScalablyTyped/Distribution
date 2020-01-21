package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordBatchInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * One or more records.
    */
  var Records: PutRecordBatchRequestEntryList = js.native
}

object PutRecordBatchInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Records: PutRecordBatchRequestEntryList): PutRecordBatchInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutRecordBatchInput]
  }
}

