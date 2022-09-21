package typings.awsSdk.redshiftdataMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftData extends Service {
  
  /**
    * Runs one or more SQL statements, which can be data manipulation language (DML) or data definition language (DDL). Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def batchExecuteStatement(): Request[BatchExecuteStatementOutput, AWSError] = js.native
  def batchExecuteStatement(callback: js.Function2[/* err */ AWSError, /* data */ BatchExecuteStatementOutput, Unit]): Request[BatchExecuteStatementOutput, AWSError] = js.native
  /**
    * Runs one or more SQL statements, which can be data manipulation language (DML) or data definition language (DDL). Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def batchExecuteStatement(params: BatchExecuteStatementInput): Request[BatchExecuteStatementOutput, AWSError] = js.native
  def batchExecuteStatement(
    params: BatchExecuteStatementInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchExecuteStatementOutput, Unit]
  ): Request[BatchExecuteStatementOutput, AWSError] = js.native
  
  /**
    * Cancels a running query. To be canceled, a query must be running. 
    */
  def cancelStatement(): Request[CancelStatementResponse, AWSError] = js.native
  def cancelStatement(callback: js.Function2[/* err */ AWSError, /* data */ CancelStatementResponse, Unit]): Request[CancelStatementResponse, AWSError] = js.native
  /**
    * Cancels a running query. To be canceled, a query must be running. 
    */
  def cancelStatement(params: CancelStatementRequest): Request[CancelStatementResponse, AWSError] = js.native
  def cancelStatement(
    params: CancelStatementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelStatementResponse, Unit]
  ): Request[CancelStatementResponse, AWSError] = js.native
  
  @JSName("config")
  var config_RedshiftData: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Describes the details about a specific instance when a query was run by the Amazon Redshift Data API. The information includes when the query started, when it finished, the query status, the number of rows returned, and the SQL statement. 
    */
  def describeStatement(): Request[DescribeStatementResponse, AWSError] = js.native
  def describeStatement(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStatementResponse, Unit]): Request[DescribeStatementResponse, AWSError] = js.native
  /**
    * Describes the details about a specific instance when a query was run by the Amazon Redshift Data API. The information includes when the query started, when it finished, the query status, the number of rows returned, and the SQL statement. 
    */
  def describeStatement(params: DescribeStatementRequest): Request[DescribeStatementResponse, AWSError] = js.native
  def describeStatement(
    params: DescribeStatementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStatementResponse, Unit]
  ): Request[DescribeStatementResponse, AWSError] = js.native
  
  /**
    * Describes the detailed information about a table from metadata in the cluster. The information includes its columns. A token is returned to page through the column list. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def describeTable(): Request[DescribeTableResponse, AWSError] = js.native
  def describeTable(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableResponse, Unit]): Request[DescribeTableResponse, AWSError] = js.native
  /**
    * Describes the detailed information about a table from metadata in the cluster. The information includes its columns. A token is returned to page through the column list. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def describeTable(params: DescribeTableRequest): Request[DescribeTableResponse, AWSError] = js.native
  def describeTable(
    params: DescribeTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableResponse, Unit]
  ): Request[DescribeTableResponse, AWSError] = js.native
  
  /**
    * Runs an SQL statement, which can be data manipulation language (DML) or data definition language (DDL). This statement must be a single SQL statement. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def executeStatement(): Request[ExecuteStatementOutput, AWSError] = js.native
  def executeStatement(callback: js.Function2[/* err */ AWSError, /* data */ ExecuteStatementOutput, Unit]): Request[ExecuteStatementOutput, AWSError] = js.native
  /**
    * Runs an SQL statement, which can be data manipulation language (DML) or data definition language (DDL). This statement must be a single SQL statement. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def executeStatement(params: ExecuteStatementInput): Request[ExecuteStatementOutput, AWSError] = js.native
  def executeStatement(
    params: ExecuteStatementInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteStatementOutput, Unit]
  ): Request[ExecuteStatementOutput, AWSError] = js.native
  
  /**
    * Fetches the temporarily cached result of an SQL statement. A token is returned to page through the statement results. 
    */
  def getStatementResult(): Request[GetStatementResultResponse, AWSError] = js.native
  def getStatementResult(callback: js.Function2[/* err */ AWSError, /* data */ GetStatementResultResponse, Unit]): Request[GetStatementResultResponse, AWSError] = js.native
  /**
    * Fetches the temporarily cached result of an SQL statement. A token is returned to page through the statement results. 
    */
  def getStatementResult(params: GetStatementResultRequest): Request[GetStatementResultResponse, AWSError] = js.native
  def getStatementResult(
    params: GetStatementResultRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStatementResultResponse, Unit]
  ): Request[GetStatementResultResponse, AWSError] = js.native
  
  /**
    * List the databases in a cluster. A token is returned to page through the database list. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def listDatabases(): Request[ListDatabasesResponse, AWSError] = js.native
  def listDatabases(callback: js.Function2[/* err */ AWSError, /* data */ ListDatabasesResponse, Unit]): Request[ListDatabasesResponse, AWSError] = js.native
  /**
    * List the databases in a cluster. A token is returned to page through the database list. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def listDatabases(params: ListDatabasesRequest): Request[ListDatabasesResponse, AWSError] = js.native
  def listDatabases(
    params: ListDatabasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatabasesResponse, Unit]
  ): Request[ListDatabasesResponse, AWSError] = js.native
  
  /**
    * Lists the schemas in a database. A token is returned to page through the schema list. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def listSchemas(): Request[ListSchemasResponse, AWSError] = js.native
  def listSchemas(callback: js.Function2[/* err */ AWSError, /* data */ ListSchemasResponse, Unit]): Request[ListSchemasResponse, AWSError] = js.native
  /**
    * Lists the schemas in a database. A token is returned to page through the schema list. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def listSchemas(params: ListSchemasRequest): Request[ListSchemasResponse, AWSError] = js.native
  def listSchemas(
    params: ListSchemasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchemasResponse, Unit]
  ): Request[ListSchemasResponse, AWSError] = js.native
  
  /**
    * List of SQL statements. By default, only finished statements are shown. A token is returned to page through the statement list. 
    */
  def listStatements(): Request[ListStatementsResponse, AWSError] = js.native
  def listStatements(callback: js.Function2[/* err */ AWSError, /* data */ ListStatementsResponse, Unit]): Request[ListStatementsResponse, AWSError] = js.native
  /**
    * List of SQL statements. By default, only finished statements are shown. A token is returned to page through the statement list. 
    */
  def listStatements(params: ListStatementsRequest): Request[ListStatementsResponse, AWSError] = js.native
  def listStatements(
    params: ListStatementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStatementsResponse, Unit]
  ): Request[ListStatementsResponse, AWSError] = js.native
  
  /**
    * List the tables in a database. If neither SchemaPattern nor TablePattern are specified, then all tables in the database are returned. A token is returned to page through the table list. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def listTables(): Request[ListTablesResponse, AWSError] = js.native
  def listTables(callback: js.Function2[/* err */ AWSError, /* data */ ListTablesResponse, Unit]): Request[ListTablesResponse, AWSError] = js.native
  /**
    * List the tables in a database. If neither SchemaPattern nor TablePattern are specified, then all tables in the database are returned. A token is returned to page through the table list. Depending on the authorization method, use one of the following combinations of request parameters:    Secrets Manager - when connecting to a cluster, specify the Amazon Resource Name (ARN) of the secret, the database name, and the cluster identifier that matches the cluster in the secret. When connecting to a serverless workgroup, specify the Amazon Resource Name (ARN) of the secret and the database name.    Temporary credentials - when connecting to a cluster, specify the cluster identifier, the database name, and the database user name. Also, permission to call the redshift:GetClusterCredentials operation is required. When connecting to a serverless workgroup, specify the workgroup name and database name. Also, permission to call the redshift-serverless:GetCredentials operation is required.   
    */
  def listTables(params: ListTablesRequest): Request[ListTablesResponse, AWSError] = js.native
  def listTables(
    params: ListTablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTablesResponse, Unit]
  ): Request[ListTablesResponse, AWSError] = js.native
}
