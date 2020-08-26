package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bookmark2 extends js.Object {
  var collapsed: Boolean = js.native
  var end: js.Array[Double] = js.native
  var endOffset: Double = js.native
  var is2: Boolean = js.native
  var normalized: Boolean = js.native
  var start: js.Array[Double] = js.native
  var startOffset: Double = js.native
}

object bookmark2 {
  @scala.inline
  def apply(
    collapsed: Boolean,
    end: js.Array[Double],
    endOffset: Double,
    is2: Boolean,
    normalized: Boolean,
    start: js.Array[Double],
    startOffset: Double
  ): bookmark2 = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], is2 = is2.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[bookmark2]
  }
  @scala.inline
  implicit class bookmark2Ops[Self <: bookmark2] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndVarargs(value: Double*): Self = this.set("end", js.Array(value :_*))
    @scala.inline
    def setEnd(value: js.Array[Double]): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndOffset(value: Double): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs2(value: Boolean): Self = this.set("is2", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalized(value: Boolean): Self = this.set("normalized", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartVarargs(value: Double*): Self = this.set("start", js.Array(value :_*))
    @scala.inline
    def setStart(value: js.Array[Double]): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
  }
  
}

