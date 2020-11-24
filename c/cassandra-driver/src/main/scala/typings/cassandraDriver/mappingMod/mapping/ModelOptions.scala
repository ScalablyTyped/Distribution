package typings.cassandraDriver.mappingMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelOptions extends js.Object {
  
  var columns: js.UndefOr[StringDictionary[String | ModelColumnOptions]] = js.native
  
  var keyspace: js.UndefOr[String] = js.native
  
  var mappings: js.UndefOr[TableMappings] = js.native
  
  var tables: js.UndefOr[js.Array[ModelTables | String]] = js.native
}
object ModelOptions {
  
  @scala.inline
  def apply(): ModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelOptions]
  }
  
  @scala.inline
  implicit class ModelOptionsOps[Self <: ModelOptions] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: StringDictionary[String | ModelColumnOptions]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setKeyspace(value: String): Self = this.set("keyspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyspace: Self = this.set("keyspace", js.undefined)
    
    @scala.inline
    def setMappings(value: TableMappings): Self = this.set("mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMappings: Self = this.set("mappings", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: (ModelTables | String)*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[ModelTables | String]): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
}
