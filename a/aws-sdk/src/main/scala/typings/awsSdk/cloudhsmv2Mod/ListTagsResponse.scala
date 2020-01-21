package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsResponse extends js.Object {
  /**
    * An opaque string that indicates that the response contains only a subset of tags. Use this value in a subsequent ListTags request to get more tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.NextToken] = js.native
  /**
    * A list of tags.
    */
  var TagList: typings.awsSdk.cloudhsmv2Mod.TagList = js.native
}

object ListTagsResponse {
  @scala.inline
  def apply(TagList: TagList, NextToken: NextToken = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal(TagList = TagList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsResponse]
  }
}

