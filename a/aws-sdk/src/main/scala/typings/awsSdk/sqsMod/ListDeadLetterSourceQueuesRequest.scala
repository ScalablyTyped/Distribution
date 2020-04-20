package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeadLetterSourceQueuesRequest extends js.Object {
  /**
    * The URL of a dead-letter queue. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object ListDeadLetterSourceQueuesRequest {
  @scala.inline
  def apply(QueueUrl: String): ListDeadLetterSourceQueuesRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesRequest]
  }
}

