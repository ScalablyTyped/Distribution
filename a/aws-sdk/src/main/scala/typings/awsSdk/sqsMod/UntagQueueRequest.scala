package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagQueueRequest extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: String = js.native
  /**
    * The list of tags to be removed from the specified queue.
    */
  var TagKeys: TagKeyList = js.native
}

object UntagQueueRequest {
  @scala.inline
  def apply(QueueUrl: String, TagKeys: TagKeyList): UntagQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagQueueRequest]
  }
}

