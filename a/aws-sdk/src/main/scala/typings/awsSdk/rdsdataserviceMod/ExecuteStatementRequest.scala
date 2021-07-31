package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementRequest extends StObject {
  
  /**
    * A value that indicates whether to continue running the statement after the call times out. By default, the statement stops running when the call times out.  For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL statement terminates before it is finished running, it can result in errors and possibly corrupted data structures. 
    */
  var continueAfterTimeout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.undefined
  
  /**
    * A value that indicates whether to include metadata in the results.
    */
  var includeResultMetadata: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The parameters for the SQL statement.  Array parameters are not supported. 
    */
  var parameters: js.UndefOr[SqlParametersList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn
  
  /**
    * Options that control how the result set is returned.
    */
  var resultSetOptions: js.UndefOr[ResultSetOptions] = js.undefined
  
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.undefined
  
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn
  
  /**
    * The SQL statement to run.
    */
  var sql: SqlStatement
  
  /**
    * The identifier of a transaction that was started by using the BeginTransaction operation. Specify the transaction ID of the transaction that you want to include the SQL statement in. If the SQL statement is not part of a transaction, don't set this parameter.
    */
  var transactionId: js.UndefOr[Id] = js.undefined
}
object ExecuteStatementRequest {
  
  @scala.inline
  def apply(resourceArn: Arn, secretArn: Arn, sql: SqlStatement): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
  
  @scala.inline
  implicit class ExecuteStatementRequestMutableBuilder[Self <: ExecuteStatementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinueAfterTimeout(value: Boolean): Self = StObject.set(x, "continueAfterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueAfterTimeoutUndefined: Self = StObject.set(x, "continueAfterTimeout", js.undefined)
    
    @scala.inline
    def setDatabase(value: DbName): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setIncludeResultMetadata(value: Boolean): Self = StObject.set(x, "includeResultMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeResultMetadataUndefined: Self = StObject.set(x, "includeResultMetadata", js.undefined)
    
    @scala.inline
    def setParameters(value: SqlParametersList): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SqlParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetOptions(value: ResultSetOptions): Self = StObject.set(x, "resultSetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetOptionsUndefined: Self = StObject.set(x, "resultSetOptions", js.undefined)
    
    @scala.inline
    def setSchema(value: DbName): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSecretArn(value: Arn): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSql(value: SqlStatement): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
