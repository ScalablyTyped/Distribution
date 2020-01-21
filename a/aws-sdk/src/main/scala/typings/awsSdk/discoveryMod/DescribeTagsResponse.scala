package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsResponse extends js.Object {
  /**
    * The call returns a token. Use this token to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a specific configuration item.
    */
  var tags: js.UndefOr[ConfigurationTagSet] = js.native
}

object DescribeTagsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, tags: ConfigurationTagSet = null): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsResponse]
  }
}

