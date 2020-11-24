package typings.azureKustoData.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KustoResponseDataSet[T] extends js.Object {
  
  var primaryResults: js.Array[KustoResultTable[T]] = js.native
  
  var statusTable: KustoResultTable[T] = js.native
  
  var tableNames: js.Array[String] = js.native
  
  var tables: js.Array[KustoResultTable[T]] = js.native
}
object KustoResponseDataSet {
  
  @scala.inline
  def apply[T](
    primaryResults: js.Array[KustoResultTable[T]],
    statusTable: KustoResultTable[T],
    tableNames: js.Array[String],
    tables: js.Array[KustoResultTable[T]]
  ): KustoResponseDataSet[T] = {
    val __obj = js.Dynamic.literal(primaryResults = primaryResults.asInstanceOf[js.Any], statusTable = statusTable.asInstanceOf[js.Any], tableNames = tableNames.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[KustoResponseDataSet[T]]
  }
  
  @scala.inline
  implicit class KustoResponseDataSetOps[Self <: KustoResponseDataSet[_], T] (val x: Self with KustoResponseDataSet[T]) extends AnyVal {
    
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
    def setPrimaryResultsVarargs(value: KustoResultTable[T]*): Self = this.set("primaryResults", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryResults(value: js.Array[KustoResultTable[T]]): Self = this.set("primaryResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTable(value: KustoResultTable[T]): Self = this.set("statusTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNamesVarargs(value: String*): Self = this.set("tableNames", js.Array(value :_*))
    
    @scala.inline
    def setTableNames(value: js.Array[String]): Self = this.set("tableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesVarargs(value: KustoResultTable[T]*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[KustoResultTable[T]]): Self = this.set("tables", value.asInstanceOf[js.Any])
  }
}
