package typings.d3pie.anon

import typings.d3pie.d3pieStrings.`label-asc`
import typings.d3pie.d3pieStrings.`label-desc`
import typings.d3pie.d3pieStrings.`value-asc`
import typings.d3pie.d3pieStrings.`value-desc`
import typings.d3pie.d3pieStrings.none
import typings.d3pie.d3pieStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  var content: js.Array[Label] = js.native
  var smallSegmentGrouping: js.UndefOr[Color] = js.native
  var sortOrder: js.UndefOr[none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc`] = js.native
}

object Content {
  @scala.inline
  def apply(content: js.Array[Label]): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: Label*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[Label]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmallSegmentGrouping(value: Color): Self = this.set("smallSegmentGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallSegmentGrouping: Self = this.set("smallSegmentGrouping", js.undefined)
    @scala.inline
    def setSortOrder(value: none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc`): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

