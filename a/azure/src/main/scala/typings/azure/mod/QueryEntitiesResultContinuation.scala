package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryEntitiesResultContinuation extends QueryResultContinuation {
  var nextPartitionKey: String = js.native
  var nextRowKey: String = js.native
  var tableQuery: TableQuery = js.native
  def getNextPage(): Unit = js.native
  def getNextPage(callback: QueryEntitiesCallback): Unit = js.native
  def hasNextPage(): Boolean = js.native
}

