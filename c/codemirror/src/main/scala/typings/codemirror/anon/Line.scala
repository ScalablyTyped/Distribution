package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line extends js.Object {
  var ch: Double = js.native
  var line: Double = js.native
}

object Line {
  @scala.inline
  def apply(ch: Double, line: Double): Line = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
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
    def setCh(value: Double): Self = this.set("ch", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
  }
  
}

