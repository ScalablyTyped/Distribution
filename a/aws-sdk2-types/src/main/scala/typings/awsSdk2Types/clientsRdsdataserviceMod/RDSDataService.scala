package typings.awsSdk2Types.clientsRdsdataserviceMod

import typings.awsSdk2Types.libConfigBaseMod.ConfigBase
import typings.awsSdk2Types.libErrorMod.AWSError
import typings.awsSdk2Types.libRequestMod.Request
import typings.awsSdk2Types.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RDSDataService extends Service {
  
  /**
    * Runs a batch SQL statement over an array of data. You can run bulk update and insert operations for multiple records using a DML statement with different parameter sets. Bulk operations can provide a significant performance improvement over individual insert and update operations.  If a call isn't part of a transaction because it doesn't include the transactionID parameter, changes that result from the call are committed automatically. There isn't a fixed upper limit on the number of parameter sets. However, the maximum size of the HTTP request submitted through the Data API is 4 MiB. If the request exceeds this limit, the Data API returns an error and doesn't process the request. This 4-MiB limit includes the size of the HTTP headers and the JSON notation in the request. Thus, the number of parameter sets that you can include depends on a combination of factors, such as the size of the SQL statement and the size of each parameter set. The response size limit is 1 MiB. If the call returns more than 1 MiB of response data, the call is terminated. 
    */
  def batchExecuteStatement(): Request[BatchExecuteStatementResponse, AWSError] = js.native
  def batchExecuteStatement(callback: js.Function2[/* err */ AWSError, /* data */ BatchExecuteStatementResponse, Unit]): Request[BatchExecuteStatementResponse, AWSError] = js.native
  /**
    * Runs a batch SQL statement over an array of data. You can run bulk update and insert operations for multiple records using a DML statement with different parameter sets. Bulk operations can provide a significant performance improvement over individual insert and update operations.  If a call isn't part of a transaction because it doesn't include the transactionID parameter, changes that result from the call are committed automatically. There isn't a fixed upper limit on the number of parameter sets. However, the maximum size of the HTTP request submitted through the Data API is 4 MiB. If the request exceeds this limit, the Data API returns an error and doesn't process the request. This 4-MiB limit includes the size of the HTTP headers and the JSON notation in the request. Thus, the number of parameter sets that you can include depends on a combination of factors, such as the size of the SQL statement and the size of each parameter set. The response size limit is 1 MiB. If the call returns more than 1 MiB of response data, the call is terminated. 
    */
  def batchExecuteStatement(params: BatchExecuteStatementRequest): Request[BatchExecuteStatementResponse, AWSError] = js.native
  def batchExecuteStatement(
    params: BatchExecuteStatementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchExecuteStatementResponse, Unit]
  ): Request[BatchExecuteStatementResponse, AWSError] = js.native
  
  /**
    * Starts a SQL transaction.  A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after 24 hours. A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before it's committed, it's rolled back automatically. DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a separate ExecuteStatement call with continueAfterTimeout enabled. 
    */
  def beginTransaction(): Request[BeginTransactionResponse, AWSError] = js.native
  def beginTransaction(callback: js.Function2[/* err */ AWSError, /* data */ BeginTransactionResponse, Unit]): Request[BeginTransactionResponse, AWSError] = js.native
  /**
    * Starts a SQL transaction.  A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after 24 hours. A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before it's committed, it's rolled back automatically. DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a separate ExecuteStatement call with continueAfterTimeout enabled. 
    */
  def beginTransaction(params: BeginTransactionRequest): Request[BeginTransactionResponse, AWSError] = js.native
  def beginTransaction(
    params: BeginTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BeginTransactionResponse, Unit]
  ): Request[BeginTransactionResponse, AWSError] = js.native
  
  /**
    * Ends a SQL transaction started with the BeginTransaction operation and commits the changes.
    */
  def commitTransaction(): Request[CommitTransactionResponse, AWSError] = js.native
  def commitTransaction(callback: js.Function2[/* err */ AWSError, /* data */ CommitTransactionResponse, Unit]): Request[CommitTransactionResponse, AWSError] = js.native
  /**
    * Ends a SQL transaction started with the BeginTransaction operation and commits the changes.
    */
  def commitTransaction(params: CommitTransactionRequest): Request[CommitTransactionResponse, AWSError] = js.native
  def commitTransaction(
    params: CommitTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CommitTransactionResponse, Unit]
  ): Request[CommitTransactionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_RDSDataService: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Runs one or more SQL statements.  This operation is deprecated. Use the BatchExecuteStatement or ExecuteStatement operation. 
    */
  def executeSql(): Request[ExecuteSqlResponse, AWSError] = js.native
  def executeSql(callback: js.Function2[/* err */ AWSError, /* data */ ExecuteSqlResponse, Unit]): Request[ExecuteSqlResponse, AWSError] = js.native
  /**
    * Runs one or more SQL statements.  This operation is deprecated. Use the BatchExecuteStatement or ExecuteStatement operation. 
    */
  def executeSql(params: ExecuteSqlRequest): Request[ExecuteSqlResponse, AWSError] = js.native
  def executeSql(
    params: ExecuteSqlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteSqlResponse, Unit]
  ): Request[ExecuteSqlResponse, AWSError] = js.native
  
  /**
    * Runs a SQL statement against a database.  If a call isn't part of a transaction because it doesn't include the transactionID parameter, changes that result from the call are committed automatically. If the binary response data from the database is more than 1 MB, the call is terminated. 
    */
  def executeStatement(): Request[ExecuteStatementResponse, AWSError] = js.native
  def executeStatement(callback: js.Function2[/* err */ AWSError, /* data */ ExecuteStatementResponse, Unit]): Request[ExecuteStatementResponse, AWSError] = js.native
  /**
    * Runs a SQL statement against a database.  If a call isn't part of a transaction because it doesn't include the transactionID parameter, changes that result from the call are committed automatically. If the binary response data from the database is more than 1 MB, the call is terminated. 
    */
  def executeStatement(params: ExecuteStatementRequest): Request[ExecuteStatementResponse, AWSError] = js.native
  def executeStatement(
    params: ExecuteStatementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteStatementResponse, Unit]
  ): Request[ExecuteStatementResponse, AWSError] = js.native
  
  /**
    * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
    */
  def rollbackTransaction(): Request[RollbackTransactionResponse, AWSError] = js.native
  def rollbackTransaction(callback: js.Function2[/* err */ AWSError, /* data */ RollbackTransactionResponse, Unit]): Request[RollbackTransactionResponse, AWSError] = js.native
  /**
    * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
    */
  def rollbackTransaction(params: RollbackTransactionRequest): Request[RollbackTransactionResponse, AWSError] = js.native
  def rollbackTransaction(
    params: RollbackTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RollbackTransactionResponse, Unit]
  ): Request[RollbackTransactionResponse, AWSError] = js.native
}
