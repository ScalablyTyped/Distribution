package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesResult extends js.Object {
  /**
    * Pagination token to include in the next request.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of queue URLs, up to 1,000 entries, or the value of MaxResults that you sent in the request.
    */
  var QueueUrls: js.UndefOr[QueueUrlList] = js.native
}

object ListQueuesResult {
  @scala.inline
  def apply(NextToken: Token = null, QueueUrls: QueueUrlList = null): ListQueuesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (QueueUrls != null) __obj.updateDynamic("QueueUrls")(QueueUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesResult]
  }
}

