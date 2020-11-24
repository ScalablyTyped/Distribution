package typings.blueprintjsTable.columnHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnWidths extends js.Object {
  
  var defaultColumnWidth: js.UndefOr[Double] = js.native
  
  var maxColumnWidth: js.UndefOr[Double] = js.native
  
  var minColumnWidth: js.UndefOr[Double] = js.native
}
object IColumnWidths {
  
  @scala.inline
  def apply(): IColumnWidths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnWidths]
  }
  
  @scala.inline
  implicit class IColumnWidthsOps[Self <: IColumnWidths] (val x: Self) extends AnyVal {
    
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
    def setDefaultColumnWidth(value: Double): Self = this.set("defaultColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColumnWidth: Self = this.set("defaultColumnWidth", js.undefined)
    
    @scala.inline
    def setMaxColumnWidth(value: Double): Self = this.set("maxColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxColumnWidth: Self = this.set("maxColumnWidth", js.undefined)
    
    @scala.inline
    def setMinColumnWidth(value: Double): Self = this.set("minColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinColumnWidth: Self = this.set("minColumnWidth", js.undefined)
  }
}
