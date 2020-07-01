package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteStatementRequest extends js.Object {
  /**
    * Specifies the parameters for the parameterized statement in the request.
    */
  var Parameters: js.UndefOr[StatementParameters] = js.native
  /**
    * Specifies the statement of the request.
    */
  var Statement: typings.awsSdk.qldbsessionMod.Statement = js.native
  /**
    * Specifies the transaction ID of the request.
    */
  var TransactionId: typings.awsSdk.qldbsessionMod.TransactionId = js.native
}

object ExecuteStatementRequest {
  @scala.inline
  def apply(Statement: Statement, TransactionId: TransactionId, Parameters: StatementParameters = null): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
}

