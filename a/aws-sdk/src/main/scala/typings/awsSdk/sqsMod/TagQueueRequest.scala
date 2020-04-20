package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagQueueRequest extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: String = js.native
  /**
    * The list of tags to be added to the specified queue.
    */
  var Tags: TagMap = js.native
}

object TagQueueRequest {
  @scala.inline
  def apply(QueueUrl: String, Tags: TagMap): TagQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagQueueRequest]
  }
}

