package typings.datatablesNetKeytable.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMethods extends js.Object {
  /*
    * Focus on a cell
    */
  def focus(): Api = js.native
}

object CellMethods {
  @scala.inline
  def apply(focus: () => Api): CellMethods = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[CellMethods]
  }
  @scala.inline
  implicit class CellMethodsOps[Self <: CellMethods] (val x: Self) extends AnyVal {
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
    def setFocus(value: () => Api): Self = this.set("focus", js.Any.fromFunction0(value))
  }
  
}

