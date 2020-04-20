package typings.azureKustoData.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KustoResponseDataSet[T] extends js.Object {
  var primaryResults: js.Array[KustoResultTable[T]]
  var statusTable: KustoResultTable[T]
  var tableNames: js.Array[String]
  var tables: js.Array[KustoResultTable[T]]
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
}

