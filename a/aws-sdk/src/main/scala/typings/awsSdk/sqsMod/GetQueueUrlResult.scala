package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueueUrlResult extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: js.UndefOr[String] = js.native
}

object GetQueueUrlResult {
  @scala.inline
  def apply(QueueUrl: String = null): GetQueueUrlResult = {
    val __obj = js.Dynamic.literal()
    if (QueueUrl != null) __obj.updateDynamic("QueueUrl")(QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueUrlResult]
  }
}

