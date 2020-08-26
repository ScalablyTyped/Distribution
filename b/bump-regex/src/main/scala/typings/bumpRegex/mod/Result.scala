package typings.bumpRegex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends Options {
  var `new`: String = js.native
  var prev: String = js.native
}

object Result {
  @scala.inline
  def apply(`new`: String, prev: String): Result = {
    val __obj = js.Dynamic.literal(prev = prev.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setNew(value: String): Self = this.set("new", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
  }
  
}

