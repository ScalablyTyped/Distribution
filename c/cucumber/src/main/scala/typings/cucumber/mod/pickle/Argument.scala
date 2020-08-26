package typings.cucumber.mod.pickle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Argument extends js.Object {
  var rows: js.Array[Cell] = js.native
}

object Argument {
  @scala.inline
  def apply(rows: js.Array[Cell]): Argument = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
  @scala.inline
  implicit class ArgumentOps[Self <: Argument] (val x: Self) extends AnyVal {
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
    def setRowsVarargs(value: Cell*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[Cell]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

