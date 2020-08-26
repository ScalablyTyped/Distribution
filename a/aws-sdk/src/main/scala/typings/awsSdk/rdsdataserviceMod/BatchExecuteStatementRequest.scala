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
  def apply(resourceArn: Arn, secretArn: Arn, sql: SqlStatement): BatchExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchExecuteStatementRequest]
  }
  @scala.inline
  implicit class BatchExecuteStatementRequestOps[Self <: BatchExecuteStatementRequest] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: Arn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretArn(value: Arn): Self = this.set("secretArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSql(value: SqlStatement): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabase(value: DbName): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setParameterSetsVarargs(value: SqlParametersList*): Self = this.set("parameterSets", js.Array(value :_*))
    @scala.inline
    def setParameterSets(value: SqlParameterSets): Self = this.set("parameterSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterSets: Self = this.set("parameterSets", js.undefined)
    @scala.inline
    def setSchema(value: DbName): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setTransactionId(value: Id): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
  }
  
}

