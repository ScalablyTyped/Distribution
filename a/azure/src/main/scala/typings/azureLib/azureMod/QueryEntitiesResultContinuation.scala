package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryEntitiesResultContinuation extends QueryResultContinuation {
  var nextPartitionKey: java.lang.String = js.native
  var nextRowKey: java.lang.String = js.native
  var tableQuery: TableQuery = js.native
  def getNextPage(): scala.Unit = js.native
  def getNextPage(callback: QueryEntitiesCallback): scala.Unit = js.native
  def hasNextPage(): scala.Boolean = js.native
}

