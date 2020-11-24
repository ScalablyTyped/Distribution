package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarativeTableProperties extends js.Object {
  
  var columns: js.Array[DeclarativeTableColumn] = js.native
  
  var data: js.Array[js.Array[_]] = js.native
}
object DeclarativeTableProperties {
  
  @scala.inline
  def apply(columns: js.Array[DeclarativeTableColumn], data: js.Array[js.Array[_]]): DeclarativeTableProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableProperties]
  }
  
  @scala.inline
  implicit class DeclarativeTablePropertiesOps[Self <: DeclarativeTableProperties] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: DeclarativeTableColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[DeclarativeTableColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Array[js.Any]*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Array[_]]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
