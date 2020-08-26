package typings.contentRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentRangeFormatOptions extends js.Object {
  var first: js.UndefOr[Double] = js.native
  var last: js.UndefOr[Double] = js.native
  var length: Double | Null = js.native
  var limit: js.UndefOr[Double] = js.native
  var unit: String = js.native
}

object ContentRangeFormatOptions {
  @scala.inline
  def apply(unit: String): ContentRangeFormatOptions = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeFormatOptions]
  }
  @scala.inline
  implicit class ContentRangeFormatOptionsOps[Self <: ContentRangeFormatOptions] (val x: Self) extends AnyVal {
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
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setLast(value: Double): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setLengthNull: Self = this.set("length", null)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
  
}

