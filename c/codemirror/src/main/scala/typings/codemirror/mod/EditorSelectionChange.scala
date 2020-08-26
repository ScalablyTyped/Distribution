package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorSelectionChange extends js.Object {
  var origin: js.UndefOr[String] = js.native
  var ranges: js.Array[Range] = js.native
  def update(ranges: js.Array[Range]): Unit = js.native
}

object EditorSelectionChange {
  @scala.inline
  def apply(ranges: js.Array[Range], update: js.Array[Range] => Unit): EditorSelectionChange = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EditorSelectionChange]
  }
  @scala.inline
  implicit class EditorSelectionChangeOps[Self <: EditorSelectionChange] (val x: Self) extends AnyVal {
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
    def setRangesVarargs(value: Range*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[Range]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: js.Array[Range] => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

