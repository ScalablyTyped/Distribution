package typings.datatablesNetSelect.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellsMethods extends js.Object {
  
  /**
    * Deselect cells
    */
  def deselect(): Api = js.native
  
  /**
    * Select multiple cells
    */
  def select(): Api = js.native
}
object CellsMethods {
  
  @scala.inline
  def apply(deselect: () => Api, select: () => Api): CellsMethods = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
    __obj.asInstanceOf[CellsMethods]
  }
  
  @scala.inline
  implicit class CellsMethodsOps[Self <: CellsMethods] (val x: Self) extends AnyVal {
    
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
