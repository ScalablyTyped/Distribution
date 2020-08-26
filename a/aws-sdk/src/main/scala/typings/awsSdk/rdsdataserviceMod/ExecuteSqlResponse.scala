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
  def apply(): ExecuteSqlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteSqlResponse]
  }
  @scala.inline
  implicit class ExecuteSqlResponseOps[Self <: ExecuteSqlResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSqlStatementResultsVarargs(value: SqlStatementResult*): Self = this.set("sqlStatementResults", js.Array(value :_*))
    @scala.inline
    def setSqlStatementResults(value: SqlStatementResults): Self = this.set("sqlStatementResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlStatementResults: Self = this.set("sqlStatementResults", js.undefined)
  }
  
}

