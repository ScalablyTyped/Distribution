package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchExecuteStatementRequest extends StObject {
  
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
  implicit class BatchExecuteStatementRequestMutableBuilder[Self <: BatchExecuteStatementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: DbName): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setParameterSets(value: SqlParameterSets): Self = StObject.set(x, "parameterSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterSetsUndefined: Self = StObject.set(x, "parameterSets", js.undefined)
    
    @scala.inline
    def setParameterSetsVarargs(value: SqlParametersList*): Self = StObject.set(x, "parameterSets", js.Array(value :_*))
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
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
