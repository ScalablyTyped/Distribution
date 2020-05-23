package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteStatementRequest extends js.Object {
  /**
    * A value that indicates whether to continue running the statement after the call times out. By default, the statement stops running when the call times out.  For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL statement terminates before it is finished running, it can result in errors and possibly corrupted data structures. 
    */
  var continueAfterTimeout: js.UndefOr[Boolean] = js.native
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.native
  /**
    * A value that indicates whether to include metadata in the results.
    */
  var includeResultMetadata: js.UndefOr[Boolean] = js.native
  /**
    * The parameters for the SQL statement.  Array parameters are not supported. 
    */
  var parameters: js.UndefOr[SqlParametersList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn = js.native
  /**
    * Options that control how the result set is returned.
    */
  var resultSetOptions: js.UndefOr[ResultSetOptions] = js.native
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.native
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn = js.native
  /**
    * The SQL statement to run.
    */
  var sql: SqlStatement = js.native
  /**
    * The identifier of a transaction that was started by using the BeginTransaction operation. Specify the transaction ID of the transaction that you want to include the SQL statement in. If the SQL statement is not part of a transaction, don't set this parameter.
    */
  var transactionId: js.UndefOr[Id] = js.native
}

object ExecuteStatementRequest {
  @scala.inline
  def apply(
    resourceArn: Arn,
    secretArn: Arn,
    sql: SqlStatement,
    continueAfterTimeout: js.UndefOr[Boolean] = js.undefined,
    database: DbName = null,
    includeResultMetadata: js.UndefOr[Boolean] = js.undefined,
    parameters: SqlParametersList = null,
    resultSetOptions: ResultSetOptions = null,
    schema: DbName = null,
    transactionId: Id = null
  ): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    if (!js.isUndefined(continueAfterTimeout)) __obj.updateDynamic("continueAfterTimeout")(continueAfterTimeout.get.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResultMetadata)) __obj.updateDynamic("includeResultMetadata")(includeResultMetadata.get.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (resultSetOptions != null) __obj.updateDynamic("resultSetOptions")(resultSetOptions.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
}

