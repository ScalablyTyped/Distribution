package typings.cliColor.columnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnsOptions extends js.Object {
  
  /**
    * columns: Per column customizations, as e.g. `[{ align: 'right' }, null, { align: 'left' }]`
    */
  var columns: js.UndefOr[js.Array[ColumnOptions | Null]] = js.native
  
  /**
    *  Custom colums separator (defaults to `|`)
    */
  var sep: js.UndefOr[String] = js.native
}
object ColumnsOptions {
  
  @scala.inline
  def apply(): ColumnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnsOptions]
  }
  
  @scala.inline
  implicit class ColumnsOptionsOps[Self <: ColumnsOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: (ColumnOptions | Null)*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnOptions | Null]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setSep(value: String): Self = this.set("sep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSep: Self = this.set("sep", js.undefined)
  }
}
