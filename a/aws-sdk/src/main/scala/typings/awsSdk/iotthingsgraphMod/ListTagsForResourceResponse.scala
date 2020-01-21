package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * The token that specifies the next page of results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * List of tags returned by the ListTagsForResource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, tags: TagList = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

