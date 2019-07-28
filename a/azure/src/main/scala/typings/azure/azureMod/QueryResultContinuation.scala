package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResultContinuation extends js.Object {
  var tableService: TableService
}

object QueryResultContinuation {
  @scala.inline
  def apply(tableService: TableService): QueryResultContinuation = {
    val __obj = js.Dynamic.literal(tableService = tableService)
  
    __obj.asInstanceOf[QueryResultContinuation]
  }
}

