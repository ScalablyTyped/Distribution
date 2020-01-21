package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * The record.
    */
  var Record: typings.awsSdk.firehoseMod.Record = js.native
}

object PutRecordInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Record: Record): PutRecordInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutRecordInput]
  }
}

