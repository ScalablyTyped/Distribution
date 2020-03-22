package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecuteResultSetNotificationParams extends js.Object {
  var ownerUri: String
  var resultSetSummary: ResultSetSummary
}

object QueryExecuteResultSetNotificationParams {
  @scala.inline
  def apply(ownerUri: String, resultSetSummary: ResultSetSummary): QueryExecuteResultSetNotificationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], resultSetSummary = resultSetSummary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryExecuteResultSetNotificationParams]
  }
}

