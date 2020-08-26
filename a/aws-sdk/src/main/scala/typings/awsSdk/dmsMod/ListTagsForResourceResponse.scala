package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * A list of tags for the resource.
    */
  var TagList: js.UndefOr[typings.awsSdk.dmsMod.TagList] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  @scala.inline
  implicit class ListTagsForResourceResponseOps[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
  }
  
}

