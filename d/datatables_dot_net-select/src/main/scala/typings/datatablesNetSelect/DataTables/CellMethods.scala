package typings.datatablesNetSelect.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMethods extends js.Object {
  /**
    * Deselect a cell
    */
  def deselect(): Api = js.native
  /**
    * Select cell
    */
  def select(): Api = js.native
}

object CellMethods {
  @scala.inline
  def apply(deselect: () => Api, select: () => Api): CellMethods = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
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
    def setDeselect(value: () => Api): Self = this.set("deselect", js.Any.fromFunction0(value))
    @scala.inline
    def setSelect(value: () => Api): Self = this.set("select", js.Any.fromFunction0(value))
  }
  
}

