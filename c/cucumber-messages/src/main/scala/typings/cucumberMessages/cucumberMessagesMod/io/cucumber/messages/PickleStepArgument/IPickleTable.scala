package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.IPickleTableRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleTable. */
@js.native
trait IPickleTable extends js.Object {
  
  /** PickleTable rows */
  var rows: js.UndefOr[js.Array[IPickleTableRow] | Null] = js.native
}
object IPickleTable {
  
  @scala.inline
  def apply(): IPickleTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleTable]
  }
  
  @scala.inline
  implicit class IPickleTableOps[Self <: IPickleTable] (val x: Self) extends AnyVal {
    
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
    def setRowsVarargs(value: IPickleTableRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[IPickleTableRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setRowsNull: Self = this.set("rows", null)
  }
}
