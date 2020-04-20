package typings.azureKustoData.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KustoResponseDataSetV2[T] extends KustoResponseDataSet[T] {
  var version: String
  def getCridColumn(): String
  def getErrorColumn(): String
  def getStatusColumn(): String
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
}

