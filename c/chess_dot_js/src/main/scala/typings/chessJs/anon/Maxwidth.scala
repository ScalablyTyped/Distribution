package typings.chessJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maxwidth extends js.Object {
  /** the maximum width of a line */
  var max_width: js.UndefOr[Double] = js.native
  /** Specific newline character */
  var newline_char: js.UndefOr[String] = js.native
}

object Maxwidth {
  @scala.inline
  def apply(): Maxwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxwidth]
  }
  @scala.inline
  implicit class MaxwidthOps[Self <: Maxwidth] (val x: Self) extends AnyVal {
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
    def setMax_width(value: Double): Self = this.set("max_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_width: Self = this.set("max_width", js.undefined)
    @scala.inline
    def setNewline_char(value: String): Self = this.set("newline_char", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewline_char: Self = this.set("newline_char", js.undefined)
  }
  
}

