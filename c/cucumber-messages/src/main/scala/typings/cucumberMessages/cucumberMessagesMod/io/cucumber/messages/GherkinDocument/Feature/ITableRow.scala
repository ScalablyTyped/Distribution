package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.ITableCell
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TableRow. */
@js.native
trait ITableRow extends js.Object {
  
  /** TableRow cells */
  var cells: js.UndefOr[js.Array[ITableCell] | Null] = js.native
  
  /** TableRow id */
  var id: js.UndefOr[String | Null] = js.native
  
  /** TableRow location */
  var location: js.UndefOr[ILocation | Null] = js.native
}
object ITableRow {
  
  @scala.inline
  def apply(): ITableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableRow]
  }
  
  @scala.inline
  implicit class ITableRowOps[Self <: ITableRow] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: ITableCell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[ITableCell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    
    @scala.inline
    def setCellsNull: Self = this.set("cells", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setLocation(value: ILocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
  }
}
