package typings.awsSdk2Types.clientsRdsdataserviceMod

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
    * A value that indicates whether to format the result set as a single JSON string. This parameter only applies to SELECT statements and is ignored for other types of statements. Allowed values are NONE and JSON. The default value is NONE. The result is returned in the formattedRecords field. For usage information about the JSON format for result sets, see Using the Data API in the Amazon Aurora User Guide.
    */
  var formatRecordsAs: js.UndefOr[RecordsFormatType] = js.undefined
  
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
    * The name of the database schema.  Currently, the schema parameter isn't supported. 
    */
  var schema: js.UndefOr[DbName] = js.undefined
  
  /**
    * The ARN of the secret that enables access to the DB cluster. Enter the database user name and password for the credentials in the secret. For information about creating the secret, see Create a database secret.
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
  
  inline def apply(resourceArn: Arn, secretArn: Arn, sql: SqlStatement): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteStatementRequest] (val x: Self) extends AnyVal {
    
    inline def setContinueAfterTimeout(value: Boolean): Self = StObject.set(x, "continueAfterTimeout", value.asInstanceOf[js.Any])
    
    inline def setContinueAfterTimeoutUndefined: Self = StObject.set(x, "continueAfterTimeout", js.undefined)
    
    inline def setDatabase(value: DbName): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setFormatRecordsAs(value: RecordsFormatType): Self = StObject.set(x, "formatRecordsAs", value.asInstanceOf[js.Any])
    
    inline def setFormatRecordsAsUndefined: Self = StObject.set(x, "formatRecordsAs", js.undefined)
    
    inline def setIncludeResultMetadata(value: Boolean): Self = StObject.set(x, "includeResultMetadata", value.asInstanceOf[js.Any])
    
    inline def setIncludeResultMetadataUndefined: Self = StObject.set(x, "includeResultMetadata", js.undefined)
    
    inline def setParameters(value: SqlParametersList): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SqlParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResultSetOptions(value: ResultSetOptions): Self = StObject.set(x, "resultSetOptions", value.asInstanceOf[js.Any])
    
    inline def setResultSetOptionsUndefined: Self = StObject.set(x, "resultSetOptions", js.undefined)
    
    inline def setSchema(value: DbName): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSecretArn(value: Arn): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
    
    inline def setSql(value: SqlStatement): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
