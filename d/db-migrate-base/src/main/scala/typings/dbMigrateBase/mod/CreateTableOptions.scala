package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTableOptions extends js.Object {
  
  var columns: js.UndefOr[js.Array[ColumnSpec]] = js.native
  
  var ifNotExists: js.UndefOr[Boolean] = js.native
}
object CreateTableOptions {
  
  @scala.inline
  def apply(): CreateTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTableOptions]
  }
  
  @scala.inline
  implicit class CreateTableOptionsOps[Self <: CreateTableOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: ColumnSpec*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnSpec]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setIfNotExists(value: Boolean): Self = this.set("ifNotExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfNotExists: Self = this.set("ifNotExists", js.undefined)
  }
}
