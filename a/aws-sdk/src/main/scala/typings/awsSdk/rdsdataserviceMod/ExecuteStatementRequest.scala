package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(resourceArn: Arn, secretArn: Arn, sql: SqlStatement): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
  
  @scala.inline
  implicit class ExecuteStatementRequestOps[Self <: ExecuteStatementRequest] (val x: Self) extends AnyVal {
    
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
    def setContinueAfterTimeout(value: Boolean): Self = this.set("continueAfterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinueAfterTimeout: Self = this.set("continueAfterTimeout", js.undefined)
    
    @scala.inline
    def setDatabase(value: DbName): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setIncludeResultMetadata(value: Boolean): Self = this.set("includeResultMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeResultMetadata: Self = this.set("includeResultMetadata", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SqlParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: SqlParametersList): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setResultSetOptions(value: ResultSetOptions): Self = this.set("resultSetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSetOptions: Self = this.set("resultSetOptions", js.undefined)
    
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
