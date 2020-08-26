package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecuteResultSetNotificationParams extends js.Object {
  var ownerUri: String = js.native
  var resultSetSummary: ResultSetSummary = js.native
}

object QueryExecuteResultSetNotificationParams {
  @scala.inline
  def apply(ownerUri: String, resultSetSummary: ResultSetSummary): QueryExecuteResultSetNotificationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], resultSetSummary = resultSetSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteResultSetNotificationParams]
  }
  @scala.inline
  implicit class QueryExecuteResultSetNotificationParamsOps[Self <: QueryExecuteResultSetNotificationParams] (val x: Self) extends AnyVal {
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
    def setOwnerUri(value: String): Self = this.set("ownerUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultSetSummary(value: ResultSetSummary): Self = this.set("resultSetSummary", value.asInstanceOf[js.Any])
  }
  
}

