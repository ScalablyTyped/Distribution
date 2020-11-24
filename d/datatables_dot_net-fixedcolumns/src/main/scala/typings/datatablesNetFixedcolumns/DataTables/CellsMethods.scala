package typings.datatablesNetFixedcolumns.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellsMethods extends js.Object {
  
  /**
    * @description Get the fixed column cell nodes for multiple cells or an Api instance containing
    * the cells from the original DataTable if there is no matching fixed cell found.
    * @see {@link https://datatables.net/reference/api/cells().fixedNodes()}
    */
  def fixedNodes(): Api = js.native
}
object CellsMethods {
  
  @scala.inline
  def apply(fixedNodes: () => Api): CellsMethods = {
    val __obj = js.Dynamic.literal(fixedNodes = js.Any.fromFunction0(fixedNodes))
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
    def setFixedNodes(value: () => Api): Self = this.set("fixedNodes", js.Any.fromFunction0(value))
  }
}
