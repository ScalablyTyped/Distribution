package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsResponse extends js.Object {
  /**
    *  List of Tag for the requested Elasticsearch domain.
    */
  var TagList: js.UndefOr[typings.awsSdk.esMod.TagList] = js.native
}

object ListTagsResponse {
  @scala.inline
  def apply(TagList: TagList = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsResponse]
  }
}

