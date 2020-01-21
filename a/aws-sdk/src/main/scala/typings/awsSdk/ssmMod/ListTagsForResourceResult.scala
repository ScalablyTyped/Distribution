package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResult extends js.Object {
  /**
    * A list of tags.
    */
  var TagList: js.UndefOr[typings.awsSdk.ssmMod.TagList] = js.native
}

object ListTagsForResourceResult {
  @scala.inline
  def apply(TagList: TagList = null): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
}

