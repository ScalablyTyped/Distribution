package typings.chartmogulNode.mod.Tag

import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tags extends js.Object {
  var tags: Strings = js.native
}

object Tags {
  @scala.inline
  def apply(tags: Strings): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  @scala.inline
  implicit class TagsOps[Self <: Tags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Strings): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

