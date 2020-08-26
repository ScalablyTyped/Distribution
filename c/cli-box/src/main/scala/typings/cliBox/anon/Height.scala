package typings.cliBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  var height: Double = js.native
  var lines: js.Array[Offset] = js.native
  var marks: typings.cliBox.mod.Marks = js.native
  var width: Double = js.native
}

object Height {
  @scala.inline
  def apply(height: Double, lines: js.Array[Offset], marks: typings.cliBox.mod.Marks, width: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: Offset*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[Offset]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarks(value: typings.cliBox.mod.Marks): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

