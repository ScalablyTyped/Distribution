package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchExecuteStatementRequest extends js.Object {
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.native
  /**
    * The parameter set for the batch operation. The SQL statement is executed as many times as the number of parameter sets provided. To execute a SQL statement with no parameters, use one of the following options:   Specify one or more empty parameter sets.   Use the ExecuteStatement operation instead of the BatchExecuteStatement operation.    Array parameters are not supported. 
    */
  var parameterSets: js.UndefOr[SqlParameterSets] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn = js.native
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

object BatchExecuteStatementRequest {
  @scala.inline
  def apply(
    resourceArn: Arn,
    secretArn: Arn,
    sql: SqlStatement,
    database: DbName = null,
    parameterSets: SqlParameterSets = null,
    schema: DbName = null,
    transactionId: Id = null
  ): BatchExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (parameterSets != null) __obj.updateDynamic("parameterSets")(parameterSets.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchExecuteStatementRequest]
  }
}

