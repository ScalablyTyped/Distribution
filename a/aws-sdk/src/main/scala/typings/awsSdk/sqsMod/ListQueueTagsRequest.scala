package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueueTagsRequest extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: String = js.native
}

object ListQueueTagsRequest {
  @scala.inline
  def apply(QueueUrl: String): ListQueueTagsRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListQueueTagsRequest]
  }
}

