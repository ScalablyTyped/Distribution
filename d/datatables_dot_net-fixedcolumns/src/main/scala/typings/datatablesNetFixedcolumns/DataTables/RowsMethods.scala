package typings.datatablesNetFixedcolumns.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowsMethods extends js.Object {
  
  /**
    * @description Mark the heights of the selected rows (from rows()) to be recalculated on the next draw.
    * @see {@link https://datatables.net/reference/api/rows().recalcHeight()}
    */
  def recalcHeight(): Api = js.native
}
object RowsMethods {
  
  @scala.inline
  def apply(recalcHeight: () => Api): RowsMethods = {
    val __obj = js.Dynamic.literal(recalcHeight = js.Any.fromFunction0(recalcHeight))
    __obj.asInstanceOf[RowsMethods]
  }
  
  @scala.inline
  implicit class RowsMethodsOps[Self <: RowsMethods] (val x: Self) extends AnyVal {
    
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
    def setRecalcHeight(value: () => Api): Self = this.set("recalcHeight", js.Any.fromFunction0(value))
  }
}
