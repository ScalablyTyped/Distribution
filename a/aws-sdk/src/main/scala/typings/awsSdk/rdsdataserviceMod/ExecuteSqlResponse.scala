package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteSqlResponse extends js.Object {
  /**
    * The results of the SQL statement or statements.
    */
  var sqlStatementResults: js.UndefOr[SqlStatementResults] = js.native
}

object ExecuteSqlResponse {
  @scala.inline
  def apply(sqlStatementResults: SqlStatementResults = null): ExecuteSqlResponse = {
    val __obj = js.Dynamic.literal()
    if (sqlStatementResults != null) __obj.updateDynamic("sqlStatementResults")(sqlStatementResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteSqlResponse]
  }
}

