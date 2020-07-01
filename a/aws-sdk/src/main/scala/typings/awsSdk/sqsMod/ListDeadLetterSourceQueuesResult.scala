package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeadLetterSourceQueuesResult extends js.Object {
  /**
    * Pagination token to include in the next request.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of source queue URLs that have the RedrivePolicy queue attribute configured with a dead-letter queue.
    */
  var queueUrls: QueueUrlList = js.native
}

object ListDeadLetterSourceQueuesResult {
  @scala.inline
  def apply(queueUrls: QueueUrlList, NextToken: Token = null): ListDeadLetterSourceQueuesResult = {
    val __obj = js.Dynamic.literal(queueUrls = queueUrls.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesResult]
  }
}

