package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.IPickleTableCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleTableRow. */
@js.native
trait IPickleTableRow extends js.Object {
  
  /** PickleTableRow cells */
  var cells: js.UndefOr[js.Array[IPickleTableCell] | Null] = js.native
}
object IPickleTableRow {
  
  @scala.inline
  def apply(): IPickleTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleTableRow]
  }
  
  @scala.inline
  implicit class IPickleTableRowOps[Self <: IPickleTableRow] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: IPickleTableCell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[IPickleTableCell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    
    @scala.inline
    def setCellsNull: Self = this.set("cells", null)
  }
}
