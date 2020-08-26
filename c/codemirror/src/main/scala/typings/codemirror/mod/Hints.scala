package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hints extends js.Object {
  var from: Position = js.native
  var list: js.Array[Hint | String] = js.native
  var to: Position = js.native
}

object Hints {
  @scala.inline
  def apply(from: Position, list: js.Array[Hint | String], to: Position): Hints = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hints]
  }
  @scala.inline
  implicit class HintsOps[Self <: Hints] (val x: Self) extends AnyVal {
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
    def setFrom(value: Position): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setListVarargs(value: (Hint | String)*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[Hint | String]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: Position): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

