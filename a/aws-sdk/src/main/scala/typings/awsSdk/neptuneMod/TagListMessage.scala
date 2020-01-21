package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagListMessage extends js.Object {
  /**
    * List of tags returned by the ListTagsForResource operation.
    */
  var TagList: js.UndefOr[typings.awsSdk.neptuneMod.TagList] = js.native
}

object TagListMessage {
  @scala.inline
  def apply(TagList: TagList = null): TagListMessage = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagListMessage]
  }
}

