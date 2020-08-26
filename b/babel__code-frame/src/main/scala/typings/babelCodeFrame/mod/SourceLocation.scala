package typings.babelCodeFrame.mod

import typings.babelCodeFrame.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceLocation extends js.Object {
  var end: js.UndefOr[Column] = js.native
  var start: Column = js.native
}

object SourceLocation {
  @scala.inline
  def apply(start: Column): SourceLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
  @scala.inline
  implicit class SourceLocationOps[Self <: SourceLocation] (val x: Self) extends AnyVal {
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
    def setStart(value: Column): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Column): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
  }
  
}

