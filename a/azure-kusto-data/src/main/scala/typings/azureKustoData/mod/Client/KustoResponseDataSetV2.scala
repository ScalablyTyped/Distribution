package typings.azureKustoData.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KustoResponseDataSetV2[T] extends KustoResponseDataSet[T] {
  
  def getCridColumn(): String = js.native
  
  def getErrorColumn(): String = js.native
  
  def getStatusColumn(): String = js.native
  
  var version: String = js.native
}
object KustoResponseDataSetV2 {
  
  @scala.inline
  def apply[T](
    getCridColumn: () => String,
    getErrorColumn: () => String,
    getStatusColumn: () => String,
    primaryResults: js.Array[KustoResultTable[T]],
    statusTable: KustoResultTable[T],
    tableNames: js.Array[String],
    tables: js.Array[KustoResultTable[T]],
    version: String
  ): KustoResponseDataSetV2[T] = {
    val __obj = js.Dynamic.literal(getCridColumn = js.Any.fromFunction0(getCridColumn), getErrorColumn = js.Any.fromFunction0(getErrorColumn), getStatusColumn = js.Any.fromFunction0(getStatusColumn), primaryResults = primaryResults.asInstanceOf[js.Any], statusTable = statusTable.asInstanceOf[js.Any], tableNames = tableNames.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KustoResponseDataSetV2[T]]
  }
  
  @scala.inline
  implicit class KustoResponseDataSetV2Ops[Self <: KustoResponseDataSetV2[_], T] (val x: Self with KustoResponseDataSetV2[T]) extends AnyVal {
    
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
    def setGetCridColumn(value: () => String): Self = this.set("getCridColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorColumn(value: () => String): Self = this.set("getErrorColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatusColumn(value: () => String): Self = this.set("getStatusColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
