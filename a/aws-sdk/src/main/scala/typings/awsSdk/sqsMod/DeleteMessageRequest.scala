package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessageRequest extends js.Object {
  /**
    * The URL of the Amazon SQS queue from which messages are deleted. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
  /**
    * The receipt handle associated with the message to delete.
    */
  var ReceiptHandle: String = js.native
}

object DeleteMessageRequest {
  @scala.inline
  def apply(QueueUrl: String, ReceiptHandle: String): DeleteMessageRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMessageRequest]
  }
}

