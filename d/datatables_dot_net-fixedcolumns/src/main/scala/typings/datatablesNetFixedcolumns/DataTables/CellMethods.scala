package typings.datatablesNetFixedcolumns.DataTables

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellMethods extends js.Object {
  
  /**
    * @description Get the fixed column cell node for a cell or the cell from the original DataTable if there is no matching fixed cell found.
    * @see {@link https://datatables.net/reference/api/cell().fixedNode()}
    */
  def fixedNode(): Node = js.native
}
object CellMethods {
  
  @scala.inline
  def apply(fixedNode: () => Node): CellMethods = {
    val __obj = js.Dynamic.literal(fixedNode = js.Any.fromFunction0(fixedNode))
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
    def setFixedNode(value: () => Node): Self = this.set("fixedNode", js.Any.fromFunction0(value))
  }
}
