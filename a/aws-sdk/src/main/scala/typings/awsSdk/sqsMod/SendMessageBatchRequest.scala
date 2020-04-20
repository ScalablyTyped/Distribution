package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageBatchRequest extends js.Object {
  /**
    * A list of  SendMessageBatchRequestEntry  items.
    */
  var Entries: SendMessageBatchRequestEntryList = js.native
  /**
    * The URL of the Amazon SQS queue to which batched messages are sent. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object SendMessageBatchRequest {
  @scala.inline
  def apply(Entries: SendMessageBatchRequestEntryList, QueueUrl: String): SendMessageBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageBatchRequest]
  }
}

