package typings.awsSdk.glueMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Glue extends Service {
  @JSName("config")
  var config_Glue: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates one or more partitions in a batch operation.
    */
  def batchCreatePartition(): Request[BatchCreatePartitionResponse, AWSError] = js.native
  def batchCreatePartition(callback: js.Function2[/* err */ AWSError, /* data */ BatchCreatePartitionResponse, Unit]): Request[BatchCreatePartitionResponse, AWSError] = js.native
  /**
    * Creates one or more partitions in a batch operation.
    */
  def batchCreatePartition(params: BatchCreatePartitionRequest): Request[BatchCreatePartitionResponse, AWSError] = js.native
  def batchCreatePartition(
    params: BatchCreatePartitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreatePartitionResponse, Unit]
  ): Request[BatchCreatePartitionResponse, AWSError] = js.native
  /**
    * Deletes a list of connection definitions from the Data Catalog.
    */
  def batchDeleteConnection(): Request[BatchDeleteConnectionResponse, AWSError] = js.native
  def batchDeleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteConnectionResponse, Unit]): Request[BatchDeleteConnectionResponse, AWSError] = js.native
  /**
    * Deletes a list of connection definitions from the Data Catalog.
    */
  def batchDeleteConnection(params: BatchDeleteConnectionRequest): Request[BatchDeleteConnectionResponse, AWSError] = js.native
  def batchDeleteConnection(
    params: BatchDeleteConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteConnectionResponse, Unit]
  ): Request[BatchDeleteConnectionResponse, AWSError] = js.native
  /**
    * Deletes one or more partitions in a batch operation.
    */
  def batchDeletePartition(): Request[BatchDeletePartitionResponse, AWSError] = js.native
  def batchDeletePartition(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeletePartitionResponse, Unit]): Request[BatchDeletePartitionResponse, AWSError] = js.native
  /**
    * Deletes one or more partitions in a batch operation.
    */
  def batchDeletePartition(params: BatchDeletePartitionRequest): Request[BatchDeletePartitionResponse, AWSError] = js.native
  def batchDeletePartition(
    params: BatchDeletePartitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeletePartitionResponse, Unit]
  ): Request[BatchDeletePartitionResponse, AWSError] = js.native
  /**
    * Deletes multiple tables at once.  After completing this operation, you no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure the immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def batchDeleteTable(): Request[BatchDeleteTableResponse, AWSError] = js.native
  def batchDeleteTable(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteTableResponse, Unit]): Request[BatchDeleteTableResponse, AWSError] = js.native
  /**
    * Deletes multiple tables at once.  After completing this operation, you no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure the immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def batchDeleteTable(params: BatchDeleteTableRequest): Request[BatchDeleteTableResponse, AWSError] = js.native
  def batchDeleteTable(
    params: BatchDeleteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteTableResponse, Unit]
  ): Request[BatchDeleteTableResponse, AWSError] = js.native
  /**
    * Deletes a specified batch of versions of a table.
    */
  def batchDeleteTableVersion(): Request[BatchDeleteTableVersionResponse, AWSError] = js.native
  def batchDeleteTableVersion(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteTableVersionResponse, Unit]): Request[BatchDeleteTableVersionResponse, AWSError] = js.native
  /**
    * Deletes a specified batch of versions of a table.
    */
  def batchDeleteTableVersion(params: BatchDeleteTableVersionRequest): Request[BatchDeleteTableVersionResponse, AWSError] = js.native
  def batchDeleteTableVersion(
    params: BatchDeleteTableVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteTableVersionResponse, Unit]
  ): Request[BatchDeleteTableVersionResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of crawler names. After calling the ListCrawlers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetCrawlers(): Request[BatchGetCrawlersResponse, AWSError] = js.native
  def batchGetCrawlers(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetCrawlersResponse, Unit]): Request[BatchGetCrawlersResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of crawler names. After calling the ListCrawlers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetCrawlers(params: BatchGetCrawlersRequest): Request[BatchGetCrawlersResponse, AWSError] = js.native
  def batchGetCrawlers(
    params: BatchGetCrawlersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetCrawlersResponse, Unit]
  ): Request[BatchGetCrawlersResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of development endpoint names. After calling the ListDevEndpoints operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetDevEndpoints(): Request[BatchGetDevEndpointsResponse, AWSError] = js.native
  def batchGetDevEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDevEndpointsResponse, Unit]): Request[BatchGetDevEndpointsResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of development endpoint names. After calling the ListDevEndpoints operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetDevEndpoints(params: BatchGetDevEndpointsRequest): Request[BatchGetDevEndpointsResponse, AWSError] = js.native
  def batchGetDevEndpoints(
    params: BatchGetDevEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDevEndpointsResponse, Unit]
  ): Request[BatchGetDevEndpointsResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of job names. After calling the ListJobs operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags. 
    */
  def batchGetJobs(): Request[BatchGetJobsResponse, AWSError] = js.native
  def batchGetJobs(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetJobsResponse, Unit]): Request[BatchGetJobsResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of job names. After calling the ListJobs operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags. 
    */
  def batchGetJobs(params: BatchGetJobsRequest): Request[BatchGetJobsResponse, AWSError] = js.native
  def batchGetJobs(
    params: BatchGetJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetJobsResponse, Unit]
  ): Request[BatchGetJobsResponse, AWSError] = js.native
  /**
    * Retrieves partitions in a batch request.
    */
  def batchGetPartition(): Request[BatchGetPartitionResponse, AWSError] = js.native
  def batchGetPartition(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetPartitionResponse, Unit]): Request[BatchGetPartitionResponse, AWSError] = js.native
  /**
    * Retrieves partitions in a batch request.
    */
  def batchGetPartition(params: BatchGetPartitionRequest): Request[BatchGetPartitionResponse, AWSError] = js.native
  def batchGetPartition(
    params: BatchGetPartitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetPartitionResponse, Unit]
  ): Request[BatchGetPartitionResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of trigger names. After calling the ListTriggers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetTriggers(): Request[BatchGetTriggersResponse, AWSError] = js.native
  def batchGetTriggers(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetTriggersResponse, Unit]): Request[BatchGetTriggersResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of trigger names. After calling the ListTriggers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetTriggers(params: BatchGetTriggersRequest): Request[BatchGetTriggersResponse, AWSError] = js.native
  def batchGetTriggers(
    params: BatchGetTriggersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetTriggersResponse, Unit]
  ): Request[BatchGetTriggersResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of workflow names. After calling the ListWorkflows operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetWorkflows(): Request[BatchGetWorkflowsResponse, AWSError] = js.native
  def batchGetWorkflows(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetWorkflowsResponse, Unit]): Request[BatchGetWorkflowsResponse, AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of workflow names. After calling the ListWorkflows operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetWorkflows(params: BatchGetWorkflowsRequest): Request[BatchGetWorkflowsResponse, AWSError] = js.native
  def batchGetWorkflows(
    params: BatchGetWorkflowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetWorkflowsResponse, Unit]
  ): Request[BatchGetWorkflowsResponse, AWSError] = js.native
  /**
    * Stops one or more job runs for a specified job definition.
    */
  def batchStopJobRun(): Request[BatchStopJobRunResponse, AWSError] = js.native
  def batchStopJobRun(callback: js.Function2[/* err */ AWSError, /* data */ BatchStopJobRunResponse, Unit]): Request[BatchStopJobRunResponse, AWSError] = js.native
  /**
    * Stops one or more job runs for a specified job definition.
    */
  def batchStopJobRun(params: BatchStopJobRunRequest): Request[BatchStopJobRunResponse, AWSError] = js.native
  def batchStopJobRun(
    params: BatchStopJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchStopJobRunResponse, Unit]
  ): Request[BatchStopJobRunResponse, AWSError] = js.native
  /**
    * Cancels (stops) a task run. Machine learning task runs are asynchronous tasks that AWS Glue runs on your behalf as part of various machine learning workflows. You can cancel a machine learning task run at any time by calling CancelMLTaskRun with a task run's parent transform's TransformID and the task run's TaskRunId. 
    */
  def cancelMLTaskRun(): Request[CancelMLTaskRunResponse, AWSError] = js.native
  def cancelMLTaskRun(callback: js.Function2[/* err */ AWSError, /* data */ CancelMLTaskRunResponse, Unit]): Request[CancelMLTaskRunResponse, AWSError] = js.native
  /**
    * Cancels (stops) a task run. Machine learning task runs are asynchronous tasks that AWS Glue runs on your behalf as part of various machine learning workflows. You can cancel a machine learning task run at any time by calling CancelMLTaskRun with a task run's parent transform's TransformID and the task run's TaskRunId. 
    */
  def cancelMLTaskRun(params: CancelMLTaskRunRequest): Request[CancelMLTaskRunResponse, AWSError] = js.native
  def cancelMLTaskRun(
    params: CancelMLTaskRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelMLTaskRunResponse, Unit]
  ): Request[CancelMLTaskRunResponse, AWSError] = js.native
  /**
    * Creates a classifier in the user's account. This can be a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field of the request is present.
    */
  def createClassifier(): Request[CreateClassifierResponse, AWSError] = js.native
  def createClassifier(callback: js.Function2[/* err */ AWSError, /* data */ CreateClassifierResponse, Unit]): Request[CreateClassifierResponse, AWSError] = js.native
  /**
    * Creates a classifier in the user's account. This can be a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field of the request is present.
    */
  def createClassifier(params: CreateClassifierRequest): Request[CreateClassifierResponse, AWSError] = js.native
  def createClassifier(
    params: CreateClassifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClassifierResponse, Unit]
  ): Request[CreateClassifierResponse, AWSError] = js.native
  /**
    * Creates a connection definition in the Data Catalog.
    */
  def createConnection(): Request[CreateConnectionResponse, AWSError] = js.native
  def createConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionResponse, Unit]): Request[CreateConnectionResponse, AWSError] = js.native
  /**
    * Creates a connection definition in the Data Catalog.
    */
  def createConnection(params: CreateConnectionRequest): Request[CreateConnectionResponse, AWSError] = js.native
  def createConnection(
    params: CreateConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionResponse, Unit]
  ): Request[CreateConnectionResponse, AWSError] = js.native
  /**
    * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
    */
  def createCrawler(): Request[CreateCrawlerResponse, AWSError] = js.native
  def createCrawler(callback: js.Function2[/* err */ AWSError, /* data */ CreateCrawlerResponse, Unit]): Request[CreateCrawlerResponse, AWSError] = js.native
  /**
    * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
    */
  def createCrawler(params: CreateCrawlerRequest): Request[CreateCrawlerResponse, AWSError] = js.native
  def createCrawler(
    params: CreateCrawlerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCrawlerResponse, Unit]
  ): Request[CreateCrawlerResponse, AWSError] = js.native
  /**
    * Creates a new database in a Data Catalog.
    */
  def createDatabase(): Request[CreateDatabaseResponse, AWSError] = js.native
  def createDatabase(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatabaseResponse, Unit]): Request[CreateDatabaseResponse, AWSError] = js.native
  /**
    * Creates a new database in a Data Catalog.
    */
  def createDatabase(params: CreateDatabaseRequest): Request[CreateDatabaseResponse, AWSError] = js.native
  def createDatabase(
    params: CreateDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatabaseResponse, Unit]
  ): Request[CreateDatabaseResponse, AWSError] = js.native
  /**
    * Creates a new development endpoint.
    */
  def createDevEndpoint(): Request[CreateDevEndpointResponse, AWSError] = js.native
  def createDevEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateDevEndpointResponse, Unit]): Request[CreateDevEndpointResponse, AWSError] = js.native
  /**
    * Creates a new development endpoint.
    */
  def createDevEndpoint(params: CreateDevEndpointRequest): Request[CreateDevEndpointResponse, AWSError] = js.native
  def createDevEndpoint(
    params: CreateDevEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDevEndpointResponse, Unit]
  ): Request[CreateDevEndpointResponse, AWSError] = js.native
  /**
    * Creates a new job definition.
    */
  def createJob(): Request[CreateJobResponse, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]): Request[CreateJobResponse, AWSError] = js.native
  /**
    * Creates a new job definition.
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResponse, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]
  ): Request[CreateJobResponse, AWSError] = js.native
  /**
    * Creates an AWS Glue machine learning transform. This operation creates the transform and all the necessary parameters to train it. Call this operation as the first step in the process of using a machine learning transform (such as the FindMatches transform) for deduplicating data. You can provide an optional Description, in addition to the parameters that you want to use for your algorithm. You must also specify certain parameters for the tasks that AWS Glue runs on your behalf as part of learning from your data and creating a high-quality machine learning transform. These parameters include Role, and optionally, AllocatedCapacity, Timeout, and MaxRetries. For more information, see Jobs.
    */
  def createMLTransform(): Request[CreateMLTransformResponse, AWSError] = js.native
  def createMLTransform(callback: js.Function2[/* err */ AWSError, /* data */ CreateMLTransformResponse, Unit]): Request[CreateMLTransformResponse, AWSError] = js.native
  /**
    * Creates an AWS Glue machine learning transform. This operation creates the transform and all the necessary parameters to train it. Call this operation as the first step in the process of using a machine learning transform (such as the FindMatches transform) for deduplicating data. You can provide an optional Description, in addition to the parameters that you want to use for your algorithm. You must also specify certain parameters for the tasks that AWS Glue runs on your behalf as part of learning from your data and creating a high-quality machine learning transform. These parameters include Role, and optionally, AllocatedCapacity, Timeout, and MaxRetries. For more information, see Jobs.
    */
  def createMLTransform(params: CreateMLTransformRequest): Request[CreateMLTransformResponse, AWSError] = js.native
  def createMLTransform(
    params: CreateMLTransformRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMLTransformResponse, Unit]
  ): Request[CreateMLTransformResponse, AWSError] = js.native
  /**
    * Creates a new partition.
    */
  def createPartition(): Request[CreatePartitionResponse, AWSError] = js.native
  def createPartition(callback: js.Function2[/* err */ AWSError, /* data */ CreatePartitionResponse, Unit]): Request[CreatePartitionResponse, AWSError] = js.native
  /**
    * Creates a new partition.
    */
  def createPartition(params: CreatePartitionRequest): Request[CreatePartitionResponse, AWSError] = js.native
  def createPartition(
    params: CreatePartitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePartitionResponse, Unit]
  ): Request[CreatePartitionResponse, AWSError] = js.native
  /**
    * Transforms a directed acyclic graph (DAG) into code.
    */
  def createScript(): Request[CreateScriptResponse, AWSError] = js.native
  def createScript(callback: js.Function2[/* err */ AWSError, /* data */ CreateScriptResponse, Unit]): Request[CreateScriptResponse, AWSError] = js.native
  /**
    * Transforms a directed acyclic graph (DAG) into code.
    */
  def createScript(params: CreateScriptRequest): Request[CreateScriptResponse, AWSError] = js.native
  def createScript(
    params: CreateScriptRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateScriptResponse, Unit]
  ): Request[CreateScriptResponse, AWSError] = js.native
  /**
    * Creates a new security configuration. A security configuration is a set of security properties that can be used by AWS Glue. You can use a security configuration to encrypt data at rest. For information about using security configurations in AWS Glue, see Encrypting Data Written by Crawlers, Jobs, and Development Endpoints.
    */
  def createSecurityConfiguration(): Request[CreateSecurityConfigurationResponse, AWSError] = js.native
  def createSecurityConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityConfigurationResponse, Unit]): Request[CreateSecurityConfigurationResponse, AWSError] = js.native
  /**
    * Creates a new security configuration. A security configuration is a set of security properties that can be used by AWS Glue. You can use a security configuration to encrypt data at rest. For information about using security configurations in AWS Glue, see Encrypting Data Written by Crawlers, Jobs, and Development Endpoints.
    */
  def createSecurityConfiguration(params: CreateSecurityConfigurationRequest): Request[CreateSecurityConfigurationResponse, AWSError] = js.native
  def createSecurityConfiguration(
    params: CreateSecurityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityConfigurationResponse, Unit]
  ): Request[CreateSecurityConfigurationResponse, AWSError] = js.native
  /**
    * Creates a new table definition in the Data Catalog.
    */
  def createTable(): Request[CreateTableResponse, AWSError] = js.native
  def createTable(callback: js.Function2[/* err */ AWSError, /* data */ CreateTableResponse, Unit]): Request[CreateTableResponse, AWSError] = js.native
  /**
    * Creates a new table definition in the Data Catalog.
    */
  def createTable(params: CreateTableRequest): Request[CreateTableResponse, AWSError] = js.native
  def createTable(
    params: CreateTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTableResponse, Unit]
  ): Request[CreateTableResponse, AWSError] = js.native
  /**
    * Creates a new trigger.
    */
  def createTrigger(): Request[CreateTriggerResponse, AWSError] = js.native
  def createTrigger(callback: js.Function2[/* err */ AWSError, /* data */ CreateTriggerResponse, Unit]): Request[CreateTriggerResponse, AWSError] = js.native
  /**
    * Creates a new trigger.
    */
  def createTrigger(params: CreateTriggerRequest): Request[CreateTriggerResponse, AWSError] = js.native
  def createTrigger(
    params: CreateTriggerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTriggerResponse, Unit]
  ): Request[CreateTriggerResponse, AWSError] = js.native
  /**
    * Creates a new function definition in the Data Catalog.
    */
  def createUserDefinedFunction(): Request[CreateUserDefinedFunctionResponse, AWSError] = js.native
  def createUserDefinedFunction(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserDefinedFunctionResponse, Unit]): Request[CreateUserDefinedFunctionResponse, AWSError] = js.native
  /**
    * Creates a new function definition in the Data Catalog.
    */
  def createUserDefinedFunction(params: CreateUserDefinedFunctionRequest): Request[CreateUserDefinedFunctionResponse, AWSError] = js.native
  def createUserDefinedFunction(
    params: CreateUserDefinedFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserDefinedFunctionResponse, Unit]
  ): Request[CreateUserDefinedFunctionResponse, AWSError] = js.native
  /**
    * Creates a new workflow.
    */
  def createWorkflow(): Request[CreateWorkflowResponse, AWSError] = js.native
  def createWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowResponse, Unit]): Request[CreateWorkflowResponse, AWSError] = js.native
  /**
    * Creates a new workflow.
    */
  def createWorkflow(params: CreateWorkflowRequest): Request[CreateWorkflowResponse, AWSError] = js.native
  def createWorkflow(
    params: CreateWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowResponse, Unit]
  ): Request[CreateWorkflowResponse, AWSError] = js.native
  /**
    * Removes a classifier from the Data Catalog.
    */
  def deleteClassifier(): Request[DeleteClassifierResponse, AWSError] = js.native
  def deleteClassifier(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClassifierResponse, Unit]): Request[DeleteClassifierResponse, AWSError] = js.native
  /**
    * Removes a classifier from the Data Catalog.
    */
  def deleteClassifier(params: DeleteClassifierRequest): Request[DeleteClassifierResponse, AWSError] = js.native
  def deleteClassifier(
    params: DeleteClassifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClassifierResponse, Unit]
  ): Request[DeleteClassifierResponse, AWSError] = js.native
  /**
    * Deletes a connection from the Data Catalog.
    */
  def deleteConnection(): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]): Request[DeleteConnectionResponse, AWSError] = js.native
  /**
    * Deletes a connection from the Data Catalog.
    */
  def deleteConnection(params: DeleteConnectionRequest): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]
  ): Request[DeleteConnectionResponse, AWSError] = js.native
  /**
    * Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is RUNNING.
    */
  def deleteCrawler(): Request[DeleteCrawlerResponse, AWSError] = js.native
  def deleteCrawler(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCrawlerResponse, Unit]): Request[DeleteCrawlerResponse, AWSError] = js.native
  /**
    * Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is RUNNING.
    */
  def deleteCrawler(params: DeleteCrawlerRequest): Request[DeleteCrawlerResponse, AWSError] = js.native
  def deleteCrawler(
    params: DeleteCrawlerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCrawlerResponse, Unit]
  ): Request[DeleteCrawlerResponse, AWSError] = js.native
  /**
    * Removes a specified database from a Data Catalog.  After completing this operation, you no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure the immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
    */
  def deleteDatabase(): Request[DeleteDatabaseResponse, AWSError] = js.native
  def deleteDatabase(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatabaseResponse, Unit]): Request[DeleteDatabaseResponse, AWSError] = js.native
  /**
    * Removes a specified database from a Data Catalog.  After completing this operation, you no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure the immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
    */
  def deleteDatabase(params: DeleteDatabaseRequest): Request[DeleteDatabaseResponse, AWSError] = js.native
  def deleteDatabase(
    params: DeleteDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatabaseResponse, Unit]
  ): Request[DeleteDatabaseResponse, AWSError] = js.native
  /**
    * Deletes a specified development endpoint.
    */
  def deleteDevEndpoint(): Request[DeleteDevEndpointResponse, AWSError] = js.native
  def deleteDevEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDevEndpointResponse, Unit]): Request[DeleteDevEndpointResponse, AWSError] = js.native
  /**
    * Deletes a specified development endpoint.
    */
  def deleteDevEndpoint(params: DeleteDevEndpointRequest): Request[DeleteDevEndpointResponse, AWSError] = js.native
  def deleteDevEndpoint(
    params: DeleteDevEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDevEndpointResponse, Unit]
  ): Request[DeleteDevEndpointResponse, AWSError] = js.native
  /**
    * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
    */
  def deleteJob(): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]): Request[DeleteJobResponse, AWSError] = js.native
  /**
    * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
    */
  def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(
    params: DeleteJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]
  ): Request[DeleteJobResponse, AWSError] = js.native
  /**
    * Deletes an AWS Glue machine learning transform. Machine learning transforms are a special type of transform that use machine learning to learn the details of the transformation to be performed by learning from examples provided by humans. These transformations are then saved by AWS Glue. If you no longer need a transform, you can delete it by calling DeleteMLTransforms. However, any AWS Glue jobs that still reference the deleted transform will no longer succeed.
    */
  def deleteMLTransform(): Request[DeleteMLTransformResponse, AWSError] = js.native
  def deleteMLTransform(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMLTransformResponse, Unit]): Request[DeleteMLTransformResponse, AWSError] = js.native
  /**
    * Deletes an AWS Glue machine learning transform. Machine learning transforms are a special type of transform that use machine learning to learn the details of the transformation to be performed by learning from examples provided by humans. These transformations are then saved by AWS Glue. If you no longer need a transform, you can delete it by calling DeleteMLTransforms. However, any AWS Glue jobs that still reference the deleted transform will no longer succeed.
    */
  def deleteMLTransform(params: DeleteMLTransformRequest): Request[DeleteMLTransformResponse, AWSError] = js.native
  def deleteMLTransform(
    params: DeleteMLTransformRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMLTransformResponse, Unit]
  ): Request[DeleteMLTransformResponse, AWSError] = js.native
  /**
    * Deletes a specified partition.
    */
  def deletePartition(): Request[DeletePartitionResponse, AWSError] = js.native
  def deletePartition(callback: js.Function2[/* err */ AWSError, /* data */ DeletePartitionResponse, Unit]): Request[DeletePartitionResponse, AWSError] = js.native
  /**
    * Deletes a specified partition.
    */
  def deletePartition(params: DeletePartitionRequest): Request[DeletePartitionResponse, AWSError] = js.native
  def deletePartition(
    params: DeletePartitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePartitionResponse, Unit]
  ): Request[DeletePartitionResponse, AWSError] = js.native
  /**
    * Deletes a specified policy.
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  /**
    * Deletes a specified policy.
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]
  ): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  /**
    * Deletes a specified security configuration.
    */
  def deleteSecurityConfiguration(): Request[DeleteSecurityConfigurationResponse, AWSError] = js.native
  def deleteSecurityConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityConfigurationResponse, Unit]): Request[DeleteSecurityConfigurationResponse, AWSError] = js.native
  /**
    * Deletes a specified security configuration.
    */
  def deleteSecurityConfiguration(params: DeleteSecurityConfigurationRequest): Request[DeleteSecurityConfigurationResponse, AWSError] = js.native
  def deleteSecurityConfiguration(
    params: DeleteSecurityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityConfigurationResponse, Unit]
  ): Request[DeleteSecurityConfigurationResponse, AWSError] = js.native
  /**
    * Removes a table definition from the Data Catalog.  After completing this operation, you no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure the immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def deleteTable(): Request[DeleteTableResponse, AWSError] = js.native
  def deleteTable(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTableResponse, Unit]): Request[DeleteTableResponse, AWSError] = js.native
  /**
    * Removes a table definition from the Data Catalog.  After completing this operation, you no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure the immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def deleteTable(params: DeleteTableRequest): Request[DeleteTableResponse, AWSError] = js.native
  def deleteTable(
    params: DeleteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTableResponse, Unit]
  ): Request[DeleteTableResponse, AWSError] = js.native
  /**
    * Deletes a specified version of a table.
    */
  def deleteTableVersion(): Request[DeleteTableVersionResponse, AWSError] = js.native
  def deleteTableVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTableVersionResponse, Unit]): Request[DeleteTableVersionResponse, AWSError] = js.native
  /**
    * Deletes a specified version of a table.
    */
  def deleteTableVersion(params: DeleteTableVersionRequest): Request[DeleteTableVersionResponse, AWSError] = js.native
  def deleteTableVersion(
    params: DeleteTableVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTableVersionResponse, Unit]
  ): Request[DeleteTableVersionResponse, AWSError] = js.native
  /**
    * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
    */
  def deleteTrigger(): Request[DeleteTriggerResponse, AWSError] = js.native
  def deleteTrigger(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTriggerResponse, Unit]): Request[DeleteTriggerResponse, AWSError] = js.native
  /**
    * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
    */
  def deleteTrigger(params: DeleteTriggerRequest): Request[DeleteTriggerResponse, AWSError] = js.native
  def deleteTrigger(
    params: DeleteTriggerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTriggerResponse, Unit]
  ): Request[DeleteTriggerResponse, AWSError] = js.native
  /**
    * Deletes an existing function definition from the Data Catalog.
    */
  def deleteUserDefinedFunction(): Request[DeleteUserDefinedFunctionResponse, AWSError] = js.native
  def deleteUserDefinedFunction(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserDefinedFunctionResponse, Unit]): Request[DeleteUserDefinedFunctionResponse, AWSError] = js.native
  /**
    * Deletes an existing function definition from the Data Catalog.
    */
  def deleteUserDefinedFunction(params: DeleteUserDefinedFunctionRequest): Request[DeleteUserDefinedFunctionResponse, AWSError] = js.native
  def deleteUserDefinedFunction(
    params: DeleteUserDefinedFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserDefinedFunctionResponse, Unit]
  ): Request[DeleteUserDefinedFunctionResponse, AWSError] = js.native
  /**
    * Deletes a workflow.
    */
  def deleteWorkflow(): Request[DeleteWorkflowResponse, AWSError] = js.native
  def deleteWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkflowResponse, Unit]): Request[DeleteWorkflowResponse, AWSError] = js.native
  /**
    * Deletes a workflow.
    */
  def deleteWorkflow(params: DeleteWorkflowRequest): Request[DeleteWorkflowResponse, AWSError] = js.native
  def deleteWorkflow(
    params: DeleteWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkflowResponse, Unit]
  ): Request[DeleteWorkflowResponse, AWSError] = js.native
  /**
    * Retrieves the status of a migration operation.
    */
  def getCatalogImportStatus(): Request[GetCatalogImportStatusResponse, AWSError] = js.native
  def getCatalogImportStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetCatalogImportStatusResponse, Unit]): Request[GetCatalogImportStatusResponse, AWSError] = js.native
  /**
    * Retrieves the status of a migration operation.
    */
  def getCatalogImportStatus(params: GetCatalogImportStatusRequest): Request[GetCatalogImportStatusResponse, AWSError] = js.native
  def getCatalogImportStatus(
    params: GetCatalogImportStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCatalogImportStatusResponse, Unit]
  ): Request[GetCatalogImportStatusResponse, AWSError] = js.native
  /**
    * Retrieve a classifier by name.
    */
  def getClassifier(): Request[GetClassifierResponse, AWSError] = js.native
  def getClassifier(callback: js.Function2[/* err */ AWSError, /* data */ GetClassifierResponse, Unit]): Request[GetClassifierResponse, AWSError] = js.native
  /**
    * Retrieve a classifier by name.
    */
  def getClassifier(params: GetClassifierRequest): Request[GetClassifierResponse, AWSError] = js.native
  def getClassifier(
    params: GetClassifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetClassifierResponse, Unit]
  ): Request[GetClassifierResponse, AWSError] = js.native
  /**
    * Lists all classifier objects in the Data Catalog.
    */
  def getClassifiers(): Request[GetClassifiersResponse, AWSError] = js.native
  def getClassifiers(callback: js.Function2[/* err */ AWSError, /* data */ GetClassifiersResponse, Unit]): Request[GetClassifiersResponse, AWSError] = js.native
  /**
    * Lists all classifier objects in the Data Catalog.
    */
  def getClassifiers(params: GetClassifiersRequest): Request[GetClassifiersResponse, AWSError] = js.native
  def getClassifiers(
    params: GetClassifiersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetClassifiersResponse, Unit]
  ): Request[GetClassifiersResponse, AWSError] = js.native
  /**
    * Retrieves a connection definition from the Data Catalog.
    */
  def getConnection(): Request[GetConnectionResponse, AWSError] = js.native
  def getConnection(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionResponse, Unit]): Request[GetConnectionResponse, AWSError] = js.native
  /**
    * Retrieves a connection definition from the Data Catalog.
    */
  def getConnection(params: GetConnectionRequest): Request[GetConnectionResponse, AWSError] = js.native
  def getConnection(
    params: GetConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionResponse, Unit]
  ): Request[GetConnectionResponse, AWSError] = js.native
  /**
    * Retrieves a list of connection definitions from the Data Catalog.
    */
  def getConnections(): Request[GetConnectionsResponse, AWSError] = js.native
  def getConnections(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionsResponse, Unit]): Request[GetConnectionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of connection definitions from the Data Catalog.
    */
  def getConnections(params: GetConnectionsRequest): Request[GetConnectionsResponse, AWSError] = js.native
  def getConnections(
    params: GetConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionsResponse, Unit]
  ): Request[GetConnectionsResponse, AWSError] = js.native
  /**
    * Retrieves metadata for a specified crawler.
    */
  def getCrawler(): Request[GetCrawlerResponse, AWSError] = js.native
  def getCrawler(callback: js.Function2[/* err */ AWSError, /* data */ GetCrawlerResponse, Unit]): Request[GetCrawlerResponse, AWSError] = js.native
  /**
    * Retrieves metadata for a specified crawler.
    */
  def getCrawler(params: GetCrawlerRequest): Request[GetCrawlerResponse, AWSError] = js.native
  def getCrawler(
    params: GetCrawlerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCrawlerResponse, Unit]
  ): Request[GetCrawlerResponse, AWSError] = js.native
  /**
    * Retrieves metrics about specified crawlers.
    */
  def getCrawlerMetrics(): Request[GetCrawlerMetricsResponse, AWSError] = js.native
  def getCrawlerMetrics(callback: js.Function2[/* err */ AWSError, /* data */ GetCrawlerMetricsResponse, Unit]): Request[GetCrawlerMetricsResponse, AWSError] = js.native
  /**
    * Retrieves metrics about specified crawlers.
    */
  def getCrawlerMetrics(params: GetCrawlerMetricsRequest): Request[GetCrawlerMetricsResponse, AWSError] = js.native
  def getCrawlerMetrics(
    params: GetCrawlerMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCrawlerMetricsResponse, Unit]
  ): Request[GetCrawlerMetricsResponse, AWSError] = js.native
  /**
    * Retrieves metadata for all crawlers defined in the customer account.
    */
  def getCrawlers(): Request[GetCrawlersResponse, AWSError] = js.native
  def getCrawlers(callback: js.Function2[/* err */ AWSError, /* data */ GetCrawlersResponse, Unit]): Request[GetCrawlersResponse, AWSError] = js.native
  /**
    * Retrieves metadata for all crawlers defined in the customer account.
    */
  def getCrawlers(params: GetCrawlersRequest): Request[GetCrawlersResponse, AWSError] = js.native
  def getCrawlers(
    params: GetCrawlersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCrawlersResponse, Unit]
  ): Request[GetCrawlersResponse, AWSError] = js.native
  /**
    * Retrieves the security configuration for a specified catalog.
    */
  def getDataCatalogEncryptionSettings(): Request[GetDataCatalogEncryptionSettingsResponse, AWSError] = js.native
  def getDataCatalogEncryptionSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataCatalogEncryptionSettingsResponse, Unit]
  ): Request[GetDataCatalogEncryptionSettingsResponse, AWSError] = js.native
  /**
    * Retrieves the security configuration for a specified catalog.
    */
  def getDataCatalogEncryptionSettings(params: GetDataCatalogEncryptionSettingsRequest): Request[GetDataCatalogEncryptionSettingsResponse, AWSError] = js.native
  def getDataCatalogEncryptionSettings(
    params: GetDataCatalogEncryptionSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataCatalogEncryptionSettingsResponse, Unit]
  ): Request[GetDataCatalogEncryptionSettingsResponse, AWSError] = js.native
  /**
    * Retrieves the definition of a specified database.
    */
  def getDatabase(): Request[GetDatabaseResponse, AWSError] = js.native
  def getDatabase(callback: js.Function2[/* err */ AWSError, /* data */ GetDatabaseResponse, Unit]): Request[GetDatabaseResponse, AWSError] = js.native
  /**
    * Retrieves the definition of a specified database.
    */
  def getDatabase(params: GetDatabaseRequest): Request[GetDatabaseResponse, AWSError] = js.native
  def getDatabase(
    params: GetDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatabaseResponse, Unit]
  ): Request[GetDatabaseResponse, AWSError] = js.native
  /**
    * Retrieves all databases defined in a given Data Catalog.
    */
  def getDatabases(): Request[GetDatabasesResponse, AWSError] = js.native
  def getDatabases(callback: js.Function2[/* err */ AWSError, /* data */ GetDatabasesResponse, Unit]): Request[GetDatabasesResponse, AWSError] = js.native
  /**
    * Retrieves all databases defined in a given Data Catalog.
    */
  def getDatabases(params: GetDatabasesRequest): Request[GetDatabasesResponse, AWSError] = js.native
  def getDatabases(
    params: GetDatabasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatabasesResponse, Unit]
  ): Request[GetDatabasesResponse, AWSError] = js.native
  /**
    * Transforms a Python script into a directed acyclic graph (DAG). 
    */
  def getDataflowGraph(): Request[GetDataflowGraphResponse, AWSError] = js.native
  def getDataflowGraph(callback: js.Function2[/* err */ AWSError, /* data */ GetDataflowGraphResponse, Unit]): Request[GetDataflowGraphResponse, AWSError] = js.native
  /**
    * Transforms a Python script into a directed acyclic graph (DAG). 
    */
  def getDataflowGraph(params: GetDataflowGraphRequest): Request[GetDataflowGraphResponse, AWSError] = js.native
  def getDataflowGraph(
    params: GetDataflowGraphRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataflowGraphResponse, Unit]
  ): Request[GetDataflowGraphResponse, AWSError] = js.native
  /**
    * Retrieves information about a specified development endpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoint(): Request[GetDevEndpointResponse, AWSError] = js.native
  def getDevEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetDevEndpointResponse, Unit]): Request[GetDevEndpointResponse, AWSError] = js.native
  /**
    * Retrieves information about a specified development endpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoint(params: GetDevEndpointRequest): Request[GetDevEndpointResponse, AWSError] = js.native
  def getDevEndpoint(
    params: GetDevEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevEndpointResponse, Unit]
  ): Request[GetDevEndpointResponse, AWSError] = js.native
  /**
    * Retrieves all the development endpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoints(): Request[GetDevEndpointsResponse, AWSError] = js.native
  def getDevEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ GetDevEndpointsResponse, Unit]): Request[GetDevEndpointsResponse, AWSError] = js.native
  /**
    * Retrieves all the development endpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoints(params: GetDevEndpointsRequest): Request[GetDevEndpointsResponse, AWSError] = js.native
  def getDevEndpoints(
    params: GetDevEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevEndpointsResponse, Unit]
  ): Request[GetDevEndpointsResponse, AWSError] = js.native
  /**
    * Retrieves an existing job definition.
    */
  def getJob(): Request[GetJobResponse, AWSError] = js.native
  def getJob(callback: js.Function2[/* err */ AWSError, /* data */ GetJobResponse, Unit]): Request[GetJobResponse, AWSError] = js.native
  /**
    * Retrieves an existing job definition.
    */
  def getJob(params: GetJobRequest): Request[GetJobResponse, AWSError] = js.native
  def getJob(params: GetJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetJobResponse, Unit]): Request[GetJobResponse, AWSError] = js.native
  /**
    * Returns information on a job bookmark entry.
    */
  def getJobBookmark(): Request[GetJobBookmarkResponse, AWSError] = js.native
  def getJobBookmark(callback: js.Function2[/* err */ AWSError, /* data */ GetJobBookmarkResponse, Unit]): Request[GetJobBookmarkResponse, AWSError] = js.native
  /**
    * Returns information on a job bookmark entry.
    */
  def getJobBookmark(params: GetJobBookmarkRequest): Request[GetJobBookmarkResponse, AWSError] = js.native
  def getJobBookmark(
    params: GetJobBookmarkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobBookmarkResponse, Unit]
  ): Request[GetJobBookmarkResponse, AWSError] = js.native
  /**
    * Retrieves the metadata for a given job run.
    */
  def getJobRun(): Request[GetJobRunResponse, AWSError] = js.native
  def getJobRun(callback: js.Function2[/* err */ AWSError, /* data */ GetJobRunResponse, Unit]): Request[GetJobRunResponse, AWSError] = js.native
  /**
    * Retrieves the metadata for a given job run.
    */
  def getJobRun(params: GetJobRunRequest): Request[GetJobRunResponse, AWSError] = js.native
  def getJobRun(
    params: GetJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobRunResponse, Unit]
  ): Request[GetJobRunResponse, AWSError] = js.native
  /**
    * Retrieves metadata for all runs of a given job definition.
    */
  def getJobRuns(): Request[GetJobRunsResponse, AWSError] = js.native
  def getJobRuns(callback: js.Function2[/* err */ AWSError, /* data */ GetJobRunsResponse, Unit]): Request[GetJobRunsResponse, AWSError] = js.native
  /**
    * Retrieves metadata for all runs of a given job definition.
    */
  def getJobRuns(params: GetJobRunsRequest): Request[GetJobRunsResponse, AWSError] = js.native
  def getJobRuns(
    params: GetJobRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobRunsResponse, Unit]
  ): Request[GetJobRunsResponse, AWSError] = js.native
  /**
    * Retrieves all current job definitions.
    */
  def getJobs(): Request[GetJobsResponse, AWSError] = js.native
  def getJobs(callback: js.Function2[/* err */ AWSError, /* data */ GetJobsResponse, Unit]): Request[GetJobsResponse, AWSError] = js.native
  /**
    * Retrieves all current job definitions.
    */
  def getJobs(params: GetJobsRequest): Request[GetJobsResponse, AWSError] = js.native
  def getJobs(
    params: GetJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobsResponse, Unit]
  ): Request[GetJobsResponse, AWSError] = js.native
  /**
    * Gets details for a specific task run on a machine learning transform. Machine learning task runs are asynchronous tasks that AWS Glue runs on your behalf as part of various machine learning workflows. You can check the stats of any task run by calling GetMLTaskRun with the TaskRunID and its parent transform's TransformID.
    */
  def getMLTaskRun(): Request[GetMLTaskRunResponse, AWSError] = js.native
  def getMLTaskRun(callback: js.Function2[/* err */ AWSError, /* data */ GetMLTaskRunResponse, Unit]): Request[GetMLTaskRunResponse, AWSError] = js.native
  /**
    * Gets details for a specific task run on a machine learning transform. Machine learning task runs are asynchronous tasks that AWS Glue runs on your behalf as part of various machine learning workflows. You can check the stats of any task run by calling GetMLTaskRun with the TaskRunID and its parent transform's TransformID.
    */
  def getMLTaskRun(params: GetMLTaskRunRequest): Request[GetMLTaskRunResponse, AWSError] = js.native
  def getMLTaskRun(
    params: GetMLTaskRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMLTaskRunResponse, Unit]
  ): Request[GetMLTaskRunResponse, AWSError] = js.native
  /**
    * Gets a list of runs for a machine learning transform. Machine learning task runs are asynchronous tasks that AWS Glue runs on your behalf as part of various machine learning workflows. You can get a sortable, filterable list of machine learning task runs by calling GetMLTaskRuns with their parent transform's TransformID and other optional parameters as documented in this section. This operation returns a list of historic runs and must be paginated.
    */
  def getMLTaskRuns(): Request[GetMLTaskRunsResponse, AWSError] = js.native
  def getMLTaskRuns(callback: js.Function2[/* err */ AWSError, /* data */ GetMLTaskRunsResponse, Unit]): Request[GetMLTaskRunsResponse, AWSError] = js.native
  /**
    * Gets a list of runs for a machine learning transform. Machine learning task runs are asynchronous tasks that AWS Glue runs on your behalf as part of various machine learning workflows. You can get a sortable, filterable list of machine learning task runs by calling GetMLTaskRuns with their parent transform's TransformID and other optional parameters as documented in this section. This operation returns a list of historic runs and must be paginated.
    */
  def getMLTaskRuns(params: GetMLTaskRunsRequest): Request[GetMLTaskRunsResponse, AWSError] = js.native
  def getMLTaskRuns(
    params: GetMLTaskRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMLTaskRunsResponse, Unit]
  ): Request[GetMLTaskRunsResponse, AWSError] = js.native
  /**
    * Gets an AWS Glue machine learning transform artifact and all its corresponding metadata. Machine learning transforms are a special type of transform that use machine learning to learn the details of the transformation to be performed by learning from examples provided by humans. These transformations are then saved by AWS Glue. You can retrieve their metadata by calling GetMLTransform.
    */
  def getMLTransform(): Request[GetMLTransformResponse, AWSError] = js.native
  def getMLTransform(callback: js.Function2[/* err */ AWSError, /* data */ GetMLTransformResponse, Unit]): Request[GetMLTransformResponse, AWSError] = js.native
  /**
    * Gets an AWS Glue machine learning transform artifact and all its corresponding metadata. Machine learning transforms are a special type of transform that use machine learning to learn the details of the transformation to be performed by learning from examples provided by humans. These transformations are then saved by AWS Glue. You can retrieve their metadata by calling GetMLTransform.
    */
  def getMLTransform(params: GetMLTransformRequest): Request[GetMLTransformResponse, AWSError] = js.native
  def getMLTransform(
    params: GetMLTransformRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMLTransformResponse, Unit]
  ): Request[GetMLTransformResponse, AWSError] = js.native
  /**
    * Gets a sortable, filterable list of existing AWS Glue machine learning transforms. Machine learning transforms are a special type of transform that use machine learning to learn the details of the transformation to be performed by learning from examples provided by humans. These transformations are then saved by AWS Glue, and you can retrieve their metadata by calling GetMLTransforms.
    */
  def getMLTransforms(): Request[GetMLTransformsResponse, AWSError] = js.native
  def getMLTransforms(callback: js.Function2[/* err */ AWSError, /* data */ GetMLTransformsResponse, Unit]): Request[GetMLTransformsResponse, AWSError] = js.native
  /**
    * Gets a sortable, filterable list of existing AWS Glue machine learning transforms. Machine learning transforms are a special type of transform that use machine learning to learn the details of the transformation to be performed by learning from examples provided by humans. These transformations are then saved by AWS Glue, and you can retrieve their metadata by calling GetMLTransforms.
    */
  def getMLTransforms(params: GetMLTransformsRequest): Request[GetMLTransformsResponse, AWSError] = js.native
  def getMLTransforms(
    params: GetMLTransformsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMLTransformsResponse, Unit]
  ): Request[GetMLTransformsResponse, AWSError] = js.native
  /**
    * Creates mappings.
    */
  def getMapping(): Request[GetMappingResponse, AWSError] = js.native
  def getMapping(callback: js.Function2[/* err */ AWSError, /* data */ GetMappingResponse, Unit]): Request[GetMappingResponse, AWSError] = js.native
  /**
    * Creates mappings.
    */
  def getMapping(params: GetMappingRequest): Request[GetMappingResponse, AWSError] = js.native
  def getMapping(
    params: GetMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMappingResponse, Unit]
  ): Request[GetMappingResponse, AWSError] = js.native
  /**
    * Retrieves information about a specified partition.
    */
  def getPartition(): Request[GetPartitionResponse, AWSError] = js.native
  def getPartition(callback: js.Function2[/* err */ AWSError, /* data */ GetPartitionResponse, Unit]): Request[GetPartitionResponse, AWSError] = js.native
  /**
    * Retrieves information about a specified partition.
    */
  def getPartition(params: GetPartitionRequest): Request[GetPartitionResponse, AWSError] = js.native
  def getPartition(
    params: GetPartitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPartitionResponse, Unit]
  ): Request[GetPartitionResponse, AWSError] = js.native
  /**
    * Retrieves information about the partitions in a table.
    */
  def getPartitions(): Request[GetPartitionsResponse, AWSError] = js.native
  def getPartitions(callback: js.Function2[/* err */ AWSError, /* data */ GetPartitionsResponse, Unit]): Request[GetPartitionsResponse, AWSError] = js.native
  /**
    * Retrieves information about the partitions in a table.
    */
  def getPartitions(params: GetPartitionsRequest): Request[GetPartitionsResponse, AWSError] = js.native
  def getPartitions(
    params: GetPartitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPartitionsResponse, Unit]
  ): Request[GetPartitionsResponse, AWSError] = js.native
  /**
    * Gets code to perform a specified mapping.
    */
  def getPlan(): Request[GetPlanResponse, AWSError] = js.native
  def getPlan(callback: js.Function2[/* err */ AWSError, /* data */ GetPlanResponse, Unit]): Request[GetPlanResponse, AWSError] = js.native
  /**
    * Gets code to perform a specified mapping.
    */
  def getPlan(params: GetPlanRequest): Request[GetPlanResponse, AWSError] = js.native
  def getPlan(
    params: GetPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPlanResponse, Unit]
  ): Request[GetPlanResponse, AWSError] = js.native
  /**
    * Retrieves a specified resource policy.
    */
  def getResourcePolicy(): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]): Request[GetResourcePolicyResponse, AWSError] = js.native
  /**
    * Retrieves a specified resource policy.
    */
  def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(
    params: GetResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]
  ): Request[GetResourcePolicyResponse, AWSError] = js.native
  /**
    * Retrieves a specified security configuration.
    */
  def getSecurityConfiguration(): Request[GetSecurityConfigurationResponse, AWSError] = js.native
  def getSecurityConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetSecurityConfigurationResponse, Unit]): Request[GetSecurityConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves a specified security configuration.
    */
  def getSecurityConfiguration(params: GetSecurityConfigurationRequest): Request[GetSecurityConfigurationResponse, AWSError] = js.native
  def getSecurityConfiguration(
    params: GetSecurityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSecurityConfigurationResponse, Unit]
  ): Request[GetSecurityConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves a list of all security configurations.
    */
  def getSecurityConfigurations(): Request[GetSecurityConfigurationsResponse, AWSError] = js.native
  def getSecurityConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ GetSecurityConfigurationsResponse, Unit]): Request[GetSecurityConfigurationsResponse, AWSError] = js.native
  /**
    * Retrieves a list of all security configurations.
    */
  def getSecurityConfigurations(params: GetSecurityConfigurationsRequest): Request[GetSecurityConfigurationsResponse, AWSError] = js.native
  def getSecurityConfigurations(
    params: GetSecurityConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSecurityConfigurationsResponse, Unit]
  ): Request[GetSecurityConfigurationsResponse, AWSError] = js.native
  /**
    * Retrieves the Table definition in a Data Catalog for a specified table.
    */
  def getTable(): Request[GetTableResponse, AWSError] = js.native
  def getTable(callback: js.Function2[/* err */ AWSError, /* data */ GetTableResponse, Unit]): Request[GetTableResponse, AWSError] = js.native
  /**
    * Retrieves the Table definition in a Data Catalog for a specified table.
    */
  def getTable(params: GetTableRequest): Request[GetTableResponse, AWSError] = js.native
  def getTable(
    params: GetTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTableResponse, Unit]
  ): Request[GetTableResponse, AWSError] = js.native
  /**
    * Retrieves a specified version of a table.
    */
  def getTableVersion(): Request[GetTableVersionResponse, AWSError] = js.native
  def getTableVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetTableVersionResponse, Unit]): Request[GetTableVersionResponse, AWSError] = js.native
  /**
    * Retrieves a specified version of a table.
    */
  def getTableVersion(params: GetTableVersionRequest): Request[GetTableVersionResponse, AWSError] = js.native
  def getTableVersion(
    params: GetTableVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTableVersionResponse, Unit]
  ): Request[GetTableVersionResponse, AWSError] = js.native
  /**
    * Retrieves a list of strings that identify available versions of a specified table.
    */
  def getTableVersions(): Request[GetTableVersionsResponse, AWSError] = js.native
  def getTableVersions(callback: js.Function2[/* err */ AWSError, /* data */ GetTableVersionsResponse, Unit]): Request[GetTableVersionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of strings that identify available versions of a specified table.
    */
  def getTableVersions(params: GetTableVersionsRequest): Request[GetTableVersionsResponse, AWSError] = js.native
  def getTableVersions(
    params: GetTableVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTableVersionsResponse, Unit]
  ): Request[GetTableVersionsResponse, AWSError] = js.native
  /**
    * Retrieves the definitions of some or all of the tables in a given Database.
    */
  def getTables(): Request[GetTablesResponse, AWSError] = js.native
  def getTables(callback: js.Function2[/* err */ AWSError, /* data */ GetTablesResponse, Unit]): Request[GetTablesResponse, AWSError] = js.native
  /**
    * Retrieves the definitions of some or all of the tables in a given Database.
    */
  def getTables(params: GetTablesRequest): Request[GetTablesResponse, AWSError] = js.native
  def getTables(
    params: GetTablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTablesResponse, Unit]
  ): Request[GetTablesResponse, AWSError] = js.native
  /**
    * Retrieves a list of tags associated with a resource.
    */
  def getTags(): Request[GetTagsResponse, AWSError] = js.native
  def getTags(callback: js.Function2[/* err */ AWSError, /* data */ GetTagsResponse, Unit]): Request[GetTagsResponse, AWSError] = js.native
  /**
    * Retrieves a list of tags associated with a resource.
    */
  def getTags(params: GetTagsRequest): Request[GetTagsResponse, AWSError] = js.native
  def getTags(
    params: GetTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTagsResponse, Unit]
  ): Request[GetTagsResponse, AWSError] = js.native
  /**
    * Retrieves the definition of a trigger.
    */
  def getTrigger(): Request[GetTriggerResponse, AWSError] = js.native
  def getTrigger(callback: js.Function2[/* err */ AWSError, /* data */ GetTriggerResponse, Unit]): Request[GetTriggerResponse, AWSError] = js.native
  /**
    * Retrieves the definition of a trigger.
    */
  def getTrigger(params: GetTriggerRequest): Request[GetTriggerResponse, AWSError] = js.native
  def getTrigger(
    params: GetTriggerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTriggerResponse, Unit]
  ): Request[GetTriggerResponse, AWSError] = js.native
  /**
    * Gets all the triggers associated with a job.
    */
  def getTriggers(): Request[GetTriggersResponse, AWSError] = js.native
  def getTriggers(callback: js.Function2[/* err */ AWSError, /* data */ GetTriggersResponse, Unit]): Request[GetTriggersResponse, AWSError] = js.native
  /**
    * Gets all the triggers associated with a job.
    */
  def getTriggers(params: GetTriggersRequest): Request[GetTriggersResponse, AWSError] = js.native
  def getTriggers(
    params: GetTriggersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTriggersResponse, Unit]
  ): Request[GetTriggersResponse, AWSError] = js.native
  /**
    * Retrieves a specified function definition from the Data Catalog.
    */
  def getUserDefinedFunction(): Request[GetUserDefinedFunctionResponse, AWSError] = js.native
  def getUserDefinedFunction(callback: js.Function2[/* err */ AWSError, /* data */ GetUserDefinedFunctionResponse, Unit]): Request[GetUserDefinedFunctionResponse, AWSError] = js.native
  /**
    * Retrieves a specified function definition from the Data Catalog.
    */
  def getUserDefinedFunction(params: GetUserDefinedFunctionRequest): Request[GetUserDefinedFunctionResponse, AWSError] = js.native
  def getUserDefinedFunction(
    params: GetUserDefinedFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserDefinedFunctionResponse, Unit]
  ): Request[GetUserDefinedFunctionResponse, AWSError] = js.native
  /**
    * Retrieves multiple function definitions from the Data Catalog.
    */
  def getUserDefinedFunctions(): Request[GetUserDefinedFunctionsResponse, AWSError] = js.native
  def getUserDefinedFunctions(callback: js.Function2[/* err */ AWSError, /* data */ GetUserDefinedFunctionsResponse, Unit]): Request[GetUserDefinedFunctionsResponse, AWSError] = js.native
  /**
    * Retrieves multiple function definitions from the Data Catalog.
    */
  def getUserDefinedFunctions(params: GetUserDefinedFunctionsRequest): Request[GetUserDefinedFunctionsResponse, AWSError] = js.native
  def getUserDefinedFunctions(
    params: GetUserDefinedFunctionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserDefinedFunctionsResponse, Unit]
  ): Request[GetUserDefinedFunctionsResponse, AWSError] = js.native
  /**
    * Retrieves resource metadata for a workflow.
    */
  def getWorkflow(): Request[GetWorkflowResponse, AWSError] = js.native
  def getWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowResponse, Unit]): Request[GetWorkflowResponse, AWSError] = js.native
  /**
    * Retrieves resource metadata for a workflow.
    */
  def getWorkflow(params: GetWorkflowRequest): Request[GetWorkflowResponse, AWSError] = js.native
  def getWorkflow(
    params: GetWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowResponse, Unit]
  ): Request[GetWorkflowResponse, AWSError] = js.native
  /**
    * Retrieves the metadata for a given workflow run. 
    */
  def getWorkflowRun(): Request[GetWorkflowRunResponse, AWSError] = js.native
  def getWorkflowRun(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowRunResponse, Unit]): Request[GetWorkflowRunResponse, AWSError] = js.native
  /**
    * Retrieves the metadata for a given workflow run. 
    */
  def getWorkflowRun(params: GetWorkflowRunRequest): Request[GetWorkflowRunResponse, AWSError] = js.native
  def getWorkflowRun(
    params: GetWorkflowRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowRunResponse, Unit]
  ): Request[GetWorkflowRunResponse, AWSError] = js.native
  /**
    * Retrieves the workflow run properties which were set during the run.
    */
  def getWorkflowRunProperties(): Request[GetWorkflowRunPropertiesResponse, AWSError] = js.native
  def getWorkflowRunProperties(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowRunPropertiesResponse, Unit]): Request[GetWorkflowRunPropertiesResponse, AWSError] = js.native
  /**
    * Retrieves the workflow run properties which were set during the run.
    */
  def getWorkflowRunProperties(params: GetWorkflowRunPropertiesRequest): Request[GetWorkflowRunPropertiesResponse, AWSError] = js.native
  def getWorkflowRunProperties(
    params: GetWorkflowRunPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowRunPropertiesResponse, Unit]
  ): Request[GetWorkflowRunPropertiesResponse, AWSError] = js.native
  /**
    * Retrieves metadata for all runs of a given workflow.
    */
  def getWorkflowRuns(): Request[GetWorkflowRunsResponse, AWSError] = js.native
  def getWorkflowRuns(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowRunsResponse, Unit]): Request[GetWorkflowRunsResponse, AWSError] = js.native
  /**
    * Retrieves metadata for all runs of a given workflow.
    */
  def getWorkflowRuns(params: GetWorkflowRunsRequest): Request[GetWorkflowRunsResponse, AWSError] = js.native
  def getWorkflowRuns(
    params: GetWorkflowRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowRunsResponse, Unit]
  ): Request[GetWorkflowRunsResponse, AWSError] = js.native
  /**
    * Imports an existing Amazon Athena Data Catalog to AWS Glue
    */
  def importCatalogToGlue(): Request[ImportCatalogToGlueResponse, AWSError] = js.native
  def importCatalogToGlue(callback: js.Function2[/* err */ AWSError, /* data */ ImportCatalogToGlueResponse, Unit]): Request[ImportCatalogToGlueResponse, AWSError] = js.native
  /**
    * Imports an existing Amazon Athena Data Catalog to AWS Glue
    */
  def importCatalogToGlue(params: ImportCatalogToGlueRequest): Request[ImportCatalogToGlueResponse, AWSError] = js.native
  def importCatalogToGlue(
    params: ImportCatalogToGlueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportCatalogToGlueResponse, Unit]
  ): Request[ImportCatalogToGlueResponse, AWSError] = js.native
  /**
    * Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listCrawlers(): Request[ListCrawlersResponse, AWSError] = js.native
  def listCrawlers(callback: js.Function2[/* err */ AWSError, /* data */ ListCrawlersResponse, Unit]): Request[ListCrawlersResponse, AWSError] = js.native
  /**
    * Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listCrawlers(params: ListCrawlersRequest): Request[ListCrawlersResponse, AWSError] = js.native
  def listCrawlers(
    params: ListCrawlersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCrawlersResponse, Unit]
  ): Request[ListCrawlersResponse, AWSError] = js.native
  /**
    * Retrieves the names of all DevEndpoint resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listDevEndpoints(): Request[ListDevEndpointsResponse, AWSError] = js.native
  def listDevEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListDevEndpointsResponse, Unit]): Request[ListDevEndpointsResponse, AWSError] = js.native
  /**
    * Retrieves the names of all DevEndpoint resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listDevEndpoints(params: ListDevEndpointsRequest): Request[ListDevEndpointsResponse, AWSError] = js.native
  def listDevEndpoints(
    params: ListDevEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevEndpointsResponse, Unit]
  ): Request[ListDevEndpointsResponse, AWSError] = js.native
  /**
    * Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listJobs(): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]): Request[ListJobsResponse, AWSError] = js.native
  /**
    * Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]
  ): Request[ListJobsResponse, AWSError] = js.native
  /**
    *  Retrieves a sortable, filterable list of existing AWS Glue machine learning transforms in this AWS account, or the resources with the specified tag. This operation takes the optional Tags field, which you can use as a filter of the responses so that tagged resources can be retrieved as a group. If you choose to use tag filtering, only resources with the tags are retrieved. 
    */
  def listMLTransforms(): Request[ListMLTransformsResponse, AWSError] = js.native
  def listMLTransforms(callback: js.Function2[/* err */ AWSError, /* data */ ListMLTransformsResponse, Unit]): Request[ListMLTransformsResponse, AWSError] = js.native
  /**
    *  Retrieves a sortable, filterable list of existing AWS Glue machine learning transforms in this AWS account, or the resources with the specified tag. This operation takes the optional Tags field, which you can use as a filter of the responses so that tagged resources can be retrieved as a group. If you choose to use tag filtering, only resources with the tags are retrieved. 
    */
  def listMLTransforms(params: ListMLTransformsRequest): Request[ListMLTransformsResponse, AWSError] = js.native
  def listMLTransforms(
    params: ListMLTransformsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMLTransformsResponse, Unit]
  ): Request[ListMLTransformsResponse, AWSError] = js.native
  /**
    * Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listTriggers(): Request[ListTriggersResponse, AWSError] = js.native
  def listTriggers(callback: js.Function2[/* err */ AWSError, /* data */ ListTriggersResponse, Unit]): Request[ListTriggersResponse, AWSError] = js.native
  /**
    * Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listTriggers(params: ListTriggersRequest): Request[ListTriggersResponse, AWSError] = js.native
  def listTriggers(
    params: ListTriggersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTriggersResponse, Unit]
  ): Request[ListTriggersResponse, AWSError] = js.native
  /**
    * Lists names of workflows created in the account.
    */
  def listWorkflows(): Request[ListWorkflowsResponse, AWSError] = js.native
  def listWorkflows(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowsResponse, Unit]): Request[ListWorkflowsResponse, AWSError] = js.native
  /**
    * Lists names of workflows created in the account.
    */
  def listWorkflows(params: ListWorkflowsRequest): Request[ListWorkflowsResponse, AWSError] = js.native
  def listWorkflows(
    params: ListWorkflowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowsResponse, Unit]
  ): Request[ListWorkflowsResponse, AWSError] = js.native
  /**
    * Sets the security configuration for a specified catalog. After the configuration has been set, the specified encryption is applied to every catalog write thereafter.
    */
  def putDataCatalogEncryptionSettings(): Request[PutDataCatalogEncryptionSettingsResponse, AWSError] = js.native
  def putDataCatalogEncryptionSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ PutDataCatalogEncryptionSettingsResponse, Unit]
  ): Request[PutDataCatalogEncryptionSettingsResponse, AWSError] = js.native
  /**
    * Sets the security configuration for a specified catalog. After the configuration has been set, the specified encryption is applied to every catalog write thereafter.
    */
  def putDataCatalogEncryptionSettings(params: PutDataCatalogEncryptionSettingsRequest): Request[PutDataCatalogEncryptionSettingsResponse, AWSError] = js.native
  def putDataCatalogEncryptionSettings(
    params: PutDataCatalogEncryptionSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDataCatalogEncryptionSettingsResponse, Unit]
  ): Request[PutDataCatalogEncryptionSettingsResponse, AWSError] = js.native
  /**
    * Sets the Data Catalog resource policy for access control.
    */
  def putResourcePolicy(): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]): Request[PutResourcePolicyResponse, AWSError] = js.native
  /**
    * Sets the Data Catalog resource policy for access control.
    */
  def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]
  ): Request[PutResourcePolicyResponse, AWSError] = js.native
  /**
    * Puts the specified workflow run properties for the given workflow run. If a property already exists for the specified run, then it overrides the value otherwise adds the property to existing properties.
    */
  def putWorkflowRunProperties(): Request[PutWorkflowRunPropertiesResponse, AWSError] = js.native
  def putWorkflowRunProperties(callback: js.Function2[/* err */ AWSError, /* data */ PutWorkflowRunPropertiesResponse, Unit]): Request[PutWorkflowRunPropertiesResponse, AWSError] = js.native
  /**
    * Puts the specified workflow run properties for the given workflow run. If a property already exists for the specified run, then it overrides the value otherwise adds the property to existing properties.
    */
  def putWorkflowRunProperties(params: PutWorkflowRunPropertiesRequest): Request[PutWorkflowRunPropertiesResponse, AWSError] = js.native
  def putWorkflowRunProperties(
    params: PutWorkflowRunPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutWorkflowRunPropertiesResponse, Unit]
  ): Request[PutWorkflowRunPropertiesResponse, AWSError] = js.native
  /**
    * Resets a bookmark entry.
    */
  def resetJobBookmark(): Request[ResetJobBookmarkResponse, AWSError] = js.native
  def resetJobBookmark(callback: js.Function2[/* err */ AWSError, /* data */ ResetJobBookmarkResponse, Unit]): Request[ResetJobBookmarkResponse, AWSError] = js.native
  /**
    * Resets a bookmark entry.
    */
  def resetJobBookmark(params: ResetJobBookmarkRequest): Request[ResetJobBookmarkResponse, AWSError] = js.native
  def resetJobBookmark(
    params: ResetJobBookmarkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetJobBookmarkResponse, Unit]
  ): Request[ResetJobBookmarkResponse, AWSError] = js.native
  /**
    * Searches a set of tables based on properties in the table metadata as well as on the parent database. You can search against text or filter conditions.  You can only get tables that you have access to based on the security policies defined in Lake Formation. You need at least a read-only access to the table for it to be returned. If you do not have access to all the columns in the table, these columns will not be searched against when returning the list of tables back to you. If you have access to the columns but not the data in the columns, those columns and the associated metadata for those columns will be included in the search. 
    */
  def searchTables(): Request[SearchTablesResponse, AWSError] = js.native
  def searchTables(callback: js.Function2[/* err */ AWSError, /* data */ SearchTablesResponse, Unit]): Request[SearchTablesResponse, AWSError] = js.native
  /**
    * Searches a set of tables based on properties in the table metadata as well as on the parent database. You can search against text or filter conditions.  You can only get tables that you have access to based on the security policies defined in Lake Formation. You need at least a read-only access to the table for it to be returned. If you do not have access to all the columns in the table, these columns will not be searched against when returning the list of tables back to you. If you have access to the columns but not the data in the columns, those columns and the associated metadata for those columns will be included in the search. 
    */
  def searchTables(params: SearchTablesRequest): Request[SearchTablesResponse, AWSError] = js.native
  def searchTables(
    params: SearchTablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchTablesResponse, Unit]
  ): Request[SearchTablesResponse, AWSError] = js.native
  /**
    * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
    */
  def startCrawler(): Request[StartCrawlerResponse, AWSError] = js.native
  def startCrawler(callback: js.Function2[/* err */ AWSError, /* data */ StartCrawlerResponse, Unit]): Request[StartCrawlerResponse, AWSError] = js.native
  /**
    * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
    */
  def startCrawler(params: StartCrawlerRequest): Request[StartCrawlerResponse, AWSError] = js.native
  def startCrawler(
    params: StartCrawlerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCrawlerResponse, Unit]
  ): Request[StartCrawlerResponse, AWSError] = js.native
  /**
    * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
    */
  def startCrawlerSchedule(): Request[StartCrawlerScheduleResponse, AWSError] = js.native
  def startCrawlerSchedule(callback: js.Function2[/* err */ AWSError, /* data */ StartCrawlerScheduleResponse, Unit]): Request[StartCrawlerScheduleResponse, AWSError] = js.native
  /**
    * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
    */
  def startCrawlerSchedule(params: StartCrawlerScheduleRequest): Request[StartCrawlerScheduleResponse, AWSError] = js.native
  def startCrawlerSchedule(
    params: StartCrawlerScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCrawlerScheduleResponse, Unit]
  ): Request[StartCrawlerScheduleResponse, AWSError] = js.native
  /**
    * Begins an asynchronous task to export all labeled data for a particular transform. This task is the only label-related API call that is not part of the typical active learning workflow. You typically use StartExportLabelsTaskRun when you want to work with all of your existing labels at the same time, such as when you want to remove or change labels that were previously submitted as truth. This API operation accepts the TransformId whose labels you want to export and an Amazon Simple Storage Service (Amazon S3) path to export the labels to. The operation returns a TaskRunId. You can check on the status of your task run by calling the GetMLTaskRun API.
    */
  def startExportLabelsTaskRun(): Request[StartExportLabelsTaskRunResponse, AWSError] = js.native
  def startExportLabelsTaskRun(callback: js.Function2[/* err */ AWSError, /* data */ StartExportLabelsTaskRunResponse, Unit]): Request[StartExportLabelsTaskRunResponse, AWSError] = js.native
  /**
    * Begins an asynchronous task to export all labeled data for a particular transform. This task is the only label-related API call that is not part of the typical active learning workflow. You typically use StartExportLabelsTaskRun when you want to work with all of your existing labels at the same time, such as when you want to remove or change labels that were previously submitted as truth. This API operation accepts the TransformId whose labels you want to export and an Amazon Simple Storage Service (Amazon S3) path to export the labels to. The operation returns a TaskRunId. You can check on the status of your task run by calling the GetMLTaskRun API.
    */
  def startExportLabelsTaskRun(params: StartExportLabelsTaskRunRequest): Request[StartExportLabelsTaskRunResponse, AWSError] = js.native
  def startExportLabelsTaskRun(
    params: StartExportLabelsTaskRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartExportLabelsTaskRunResponse, Unit]
  ): Request[StartExportLabelsTaskRunResponse, AWSError] = js.native
  /**
    * Enables you to provide additional labels (examples of truth) to be used to teach the machine learning transform and improve its quality. This API operation is generally used as part of the active learning workflow that starts with the StartMLLabelingSetGenerationTaskRun call and that ultimately results in improving the quality of your machine learning transform.  After the StartMLLabelingSetGenerationTaskRun finishes, AWS Glue machine learning will have generated a series of questions for humans to answer. (Answering these questions is often called 'labeling' in the machine learning workflows). In the case of the FindMatches transform, these questions are of the form, “What is the correct way to group these rows together into groups composed entirely of matching records?” After the labeling process is finished, users upload their answers/labels with a call to StartImportLabelsTaskRun. After StartImportLabelsTaskRun finishes, all future runs of the machine learning transform use the new and improved labels and perform a higher-quality transformation. By default, StartMLLabelingSetGenerationTaskRun continually learns from and combines all labels that you upload unless you set Replace to true. If you set Replace to true, StartImportLabelsTaskRun deletes and forgets all previously uploaded labels and learns only from the exact set that you upload. Replacing labels can be helpful if you realize that you previously uploaded incorrect labels, and you believe that they are having a negative effect on your transform quality. You can check on the status of your task run by calling the GetMLTaskRun operation. 
    */
  def startImportLabelsTaskRun(): Request[StartImportLabelsTaskRunResponse, AWSError] = js.native
  def startImportLabelsTaskRun(callback: js.Function2[/* err */ AWSError, /* data */ StartImportLabelsTaskRunResponse, Unit]): Request[StartImportLabelsTaskRunResponse, AWSError] = js.native
  /**
    * Enables you to provide additional labels (examples of truth) to be used to teach the machine learning transform and improve its quality. This API operation is generally used as part of the active learning workflow that starts with the StartMLLabelingSetGenerationTaskRun call and that ultimately results in improving the quality of your machine learning transform.  After the StartMLLabelingSetGenerationTaskRun finishes, AWS Glue machine learning will have generated a series of questions for humans to answer. (Answering these questions is often called 'labeling' in the machine learning workflows). In the case of the FindMatches transform, these questions are of the form, “What is the correct way to group these rows together into groups composed entirely of matching records?” After the labeling process is finished, users upload their answers/labels with a call to StartImportLabelsTaskRun. After StartImportLabelsTaskRun finishes, all future runs of the machine learning transform use the new and improved labels and perform a higher-quality transformation. By default, StartMLLabelingSetGenerationTaskRun continually learns from and combines all labels that you upload unless you set Replace to true. If you set Replace to true, StartImportLabelsTaskRun deletes and forgets all previously uploaded labels and learns only from the exact set that you upload. Replacing labels can be helpful if you realize that you previously uploaded incorrect labels, and you believe that they are having a negative effect on your transform quality. You can check on the status of your task run by calling the GetMLTaskRun operation. 
    */
  def startImportLabelsTaskRun(params: StartImportLabelsTaskRunRequest): Request[StartImportLabelsTaskRunResponse, AWSError] = js.native
  def startImportLabelsTaskRun(
    params: StartImportLabelsTaskRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartImportLabelsTaskRunResponse, Unit]
  ): Request[StartImportLabelsTaskRunResponse, AWSError] = js.native
  /**
    * Starts a job run using a job definition.
    */
  def startJobRun(): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]): Request[StartJobRunResponse, AWSError] = js.native
  /**
    * Starts a job run using a job definition.
    */
  def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(
    params: StartJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]
  ): Request[StartJobRunResponse, AWSError] = js.native
  /**
    * Starts a task to estimate the quality of the transform.  When you provide label sets as examples of truth, AWS Glue machine learning uses some of those examples to learn from them. The rest of the labels are used as a test to estimate quality. Returns a unique identifier for the run. You can call GetMLTaskRun to get more information about the stats of the EvaluationTaskRun.
    */
  def startMLEvaluationTaskRun(): Request[StartMLEvaluationTaskRunResponse, AWSError] = js.native
  def startMLEvaluationTaskRun(callback: js.Function2[/* err */ AWSError, /* data */ StartMLEvaluationTaskRunResponse, Unit]): Request[StartMLEvaluationTaskRunResponse, AWSError] = js.native
  /**
    * Starts a task to estimate the quality of the transform.  When you provide label sets as examples of truth, AWS Glue machine learning uses some of those examples to learn from them. The rest of the labels are used as a test to estimate quality. Returns a unique identifier for the run. You can call GetMLTaskRun to get more information about the stats of the EvaluationTaskRun.
    */
  def startMLEvaluationTaskRun(params: StartMLEvaluationTaskRunRequest): Request[StartMLEvaluationTaskRunResponse, AWSError] = js.native
  def startMLEvaluationTaskRun(
    params: StartMLEvaluationTaskRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMLEvaluationTaskRunResponse, Unit]
  ): Request[StartMLEvaluationTaskRunResponse, AWSError] = js.native
  /**
    * Starts the active learning workflow for your machine learning transform to improve the transform's quality by generating label sets and adding labels. When the StartMLLabelingSetGenerationTaskRun finishes, AWS Glue will have generated a "labeling set" or a set of questions for humans to answer. In the case of the FindMatches transform, these questions are of the form, “What is the correct way to group these rows together into groups composed entirely of matching records?”  After the labeling process is finished, you can upload your labels with a call to StartImportLabelsTaskRun. After StartImportLabelsTaskRun finishes, all future runs of the machine learning transform will use the new and improved labels and perform a higher-quality transformation.
    */
  def startMLLabelingSetGenerationTaskRun(): Request[StartMLLabelingSetGenerationTaskRunResponse, AWSError] = js.native
  def startMLLabelingSetGenerationTaskRun(
    callback: js.Function2[/* err */ AWSError, /* data */ StartMLLabelingSetGenerationTaskRunResponse, Unit]
  ): Request[StartMLLabelingSetGenerationTaskRunResponse, AWSError] = js.native
  /**
    * Starts the active learning workflow for your machine learning transform to improve the transform's quality by generating label sets and adding labels. When the StartMLLabelingSetGenerationTaskRun finishes, AWS Glue will have generated a "labeling set" or a set of questions for humans to answer. In the case of the FindMatches transform, these questions are of the form, “What is the correct way to group these rows together into groups composed entirely of matching records?”  After the labeling process is finished, you can upload your labels with a call to StartImportLabelsTaskRun. After StartImportLabelsTaskRun finishes, all future runs of the machine learning transform will use the new and improved labels and perform a higher-quality transformation.
    */
  def startMLLabelingSetGenerationTaskRun(params: StartMLLabelingSetGenerationTaskRunRequest): Request[StartMLLabelingSetGenerationTaskRunResponse, AWSError] = js.native
  def startMLLabelingSetGenerationTaskRun(
    params: StartMLLabelingSetGenerationTaskRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMLLabelingSetGenerationTaskRunResponse, Unit]
  ): Request[StartMLLabelingSetGenerationTaskRunResponse, AWSError] = js.native
  /**
    * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
    */
  def startTrigger(): Request[StartTriggerResponse, AWSError] = js.native
  def startTrigger(callback: js.Function2[/* err */ AWSError, /* data */ StartTriggerResponse, Unit]): Request[StartTriggerResponse, AWSError] = js.native
  /**
    * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
    */
  def startTrigger(params: StartTriggerRequest): Request[StartTriggerResponse, AWSError] = js.native
  def startTrigger(
    params: StartTriggerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTriggerResponse, Unit]
  ): Request[StartTriggerResponse, AWSError] = js.native
  /**
    * Starts a new run of the specified workflow.
    */
  def startWorkflowRun(): Request[StartWorkflowRunResponse, AWSError] = js.native
  def startWorkflowRun(callback: js.Function2[/* err */ AWSError, /* data */ StartWorkflowRunResponse, Unit]): Request[StartWorkflowRunResponse, AWSError] = js.native
  /**
    * Starts a new run of the specified workflow.
    */
  def startWorkflowRun(params: StartWorkflowRunRequest): Request[StartWorkflowRunResponse, AWSError] = js.native
  def startWorkflowRun(
    params: StartWorkflowRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartWorkflowRunResponse, Unit]
  ): Request[StartWorkflowRunResponse, AWSError] = js.native
  /**
    * If the specified crawler is running, stops the crawl.
    */
  def stopCrawler(): Request[StopCrawlerResponse, AWSError] = js.native
  def stopCrawler(callback: js.Function2[/* err */ AWSError, /* data */ StopCrawlerResponse, Unit]): Request[StopCrawlerResponse, AWSError] = js.native
  /**
    * If the specified crawler is running, stops the crawl.
    */
  def stopCrawler(params: StopCrawlerRequest): Request[StopCrawlerResponse, AWSError] = js.native
  def stopCrawler(
    params: StopCrawlerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopCrawlerResponse, Unit]
  ): Request[StopCrawlerResponse, AWSError] = js.native
  /**
    * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
    */
  def stopCrawlerSchedule(): Request[StopCrawlerScheduleResponse, AWSError] = js.native
  def stopCrawlerSchedule(callback: js.Function2[/* err */ AWSError, /* data */ StopCrawlerScheduleResponse, Unit]): Request[StopCrawlerScheduleResponse, AWSError] = js.native
  /**
    * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
    */
  def stopCrawlerSchedule(params: StopCrawlerScheduleRequest): Request[StopCrawlerScheduleResponse, AWSError] = js.native
  def stopCrawlerSchedule(
    params: StopCrawlerScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopCrawlerScheduleResponse, Unit]
  ): Request[StopCrawlerScheduleResponse, AWSError] = js.native
  /**
    * Stops a specified trigger.
    */
  def stopTrigger(): Request[StopTriggerResponse, AWSError] = js.native
  def stopTrigger(callback: js.Function2[/* err */ AWSError, /* data */ StopTriggerResponse, Unit]): Request[StopTriggerResponse, AWSError] = js.native
  /**
    * Stops a specified trigger.
    */
  def stopTrigger(params: StopTriggerRequest): Request[StopTriggerResponse, AWSError] = js.native
  def stopTrigger(
    params: StopTriggerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopTriggerResponse, Unit]
  ): Request[StopTriggerResponse, AWSError] = js.native
  /**
    * Stops the execution of the specified workflow run.
    */
  def stopWorkflowRun(): Request[StopWorkflowRunResponse, AWSError] = js.native
  def stopWorkflowRun(callback: js.Function2[/* err */ AWSError, /* data */ StopWorkflowRunResponse, Unit]): Request[StopWorkflowRunResponse, AWSError] = js.native
  /**
    * Stops the execution of the specified workflow run.
    */
  def stopWorkflowRun(params: StopWorkflowRunRequest): Request[StopWorkflowRunResponse, AWSError] = js.native
  def stopWorkflowRun(
    params: StopWorkflowRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopWorkflowRunResponse, Unit]
  ): Request[StopWorkflowRunResponse, AWSError] = js.native
  /**
    * Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only certain resources. For information about what resources you can tag, see AWS Tags in AWS Glue.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only certain resources. For information about what resources you can tag, see AWS Tags in AWS Glue.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Modifies an existing classifier (a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field is present).
    */
  def updateClassifier(): Request[UpdateClassifierResponse, AWSError] = js.native
  def updateClassifier(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClassifierResponse, Unit]): Request[UpdateClassifierResponse, AWSError] = js.native
  /**
    * Modifies an existing classifier (a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field is present).
    */
  def updateClassifier(params: UpdateClassifierRequest): Request[UpdateClassifierResponse, AWSError] = js.native
  def updateClassifier(
    params: UpdateClassifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClassifierResponse, Unit]
  ): Request[UpdateClassifierResponse, AWSError] = js.native
  /**
    * Updates a connection definition in the Data Catalog.
    */
  def updateConnection(): Request[UpdateConnectionResponse, AWSError] = js.native
  def updateConnection(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectionResponse, Unit]): Request[UpdateConnectionResponse, AWSError] = js.native
  /**
    * Updates a connection definition in the Data Catalog.
    */
  def updateConnection(params: UpdateConnectionRequest): Request[UpdateConnectionResponse, AWSError] = js.native
  def updateConnection(
    params: UpdateConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectionResponse, Unit]
  ): Request[UpdateConnectionResponse, AWSError] = js.native
  /**
    * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
    */
  def updateCrawler(): Request[UpdateCrawlerResponse, AWSError] = js.native
  def updateCrawler(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCrawlerResponse, Unit]): Request[UpdateCrawlerResponse, AWSError] = js.native
  /**
    * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
    */
  def updateCrawler(params: UpdateCrawlerRequest): Request[UpdateCrawlerResponse, AWSError] = js.native
  def updateCrawler(
    params: UpdateCrawlerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCrawlerResponse, Unit]
  ): Request[UpdateCrawlerResponse, AWSError] = js.native
  /**
    * Updates the schedule of a crawler using a cron expression. 
    */
  def updateCrawlerSchedule(): Request[UpdateCrawlerScheduleResponse, AWSError] = js.native
  def updateCrawlerSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCrawlerScheduleResponse, Unit]): Request[UpdateCrawlerScheduleResponse, AWSError] = js.native
  /**
    * Updates the schedule of a crawler using a cron expression. 
    */
  def updateCrawlerSchedule(params: UpdateCrawlerScheduleRequest): Request[UpdateCrawlerScheduleResponse, AWSError] = js.native
  def updateCrawlerSchedule(
    params: UpdateCrawlerScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCrawlerScheduleResponse, Unit]
  ): Request[UpdateCrawlerScheduleResponse, AWSError] = js.native
  /**
    * Updates an existing database definition in a Data Catalog.
    */
  def updateDatabase(): Request[UpdateDatabaseResponse, AWSError] = js.native
  def updateDatabase(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatabaseResponse, Unit]): Request[UpdateDatabaseResponse, AWSError] = js.native
  /**
    * Updates an existing database definition in a Data Catalog.
    */
  def updateDatabase(params: UpdateDatabaseRequest): Request[UpdateDatabaseResponse, AWSError] = js.native
  def updateDatabase(
    params: UpdateDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatabaseResponse, Unit]
  ): Request[UpdateDatabaseResponse, AWSError] = js.native
  /**
    * Updates a specified development endpoint.
    */
  def updateDevEndpoint(): Request[UpdateDevEndpointResponse, AWSError] = js.native
  def updateDevEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDevEndpointResponse, Unit]): Request[UpdateDevEndpointResponse, AWSError] = js.native
  /**
    * Updates a specified development endpoint.
    */
  def updateDevEndpoint(params: UpdateDevEndpointRequest): Request[UpdateDevEndpointResponse, AWSError] = js.native
  def updateDevEndpoint(
    params: UpdateDevEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDevEndpointResponse, Unit]
  ): Request[UpdateDevEndpointResponse, AWSError] = js.native
  /**
    * Updates an existing job definition.
    */
  def updateJob(): Request[UpdateJobResponse, AWSError] = js.native
  def updateJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobResponse, Unit]): Request[UpdateJobResponse, AWSError] = js.native
  /**
    * Updates an existing job definition.
    */
  def updateJob(params: UpdateJobRequest): Request[UpdateJobResponse, AWSError] = js.native
  def updateJob(
    params: UpdateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobResponse, Unit]
  ): Request[UpdateJobResponse, AWSError] = js.native
  /**
    * Updates an existing machine learning transform. Call this operation to tune the algorithm parameters to achieve better results. After calling this operation, you can call the StartMLEvaluationTaskRun operation to assess how well your new parameters achieved your goals (such as improving the quality of your machine learning transform, or making it more cost-effective).
    */
  def updateMLTransform(): Request[UpdateMLTransformResponse, AWSError] = js.native
  def updateMLTransform(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMLTransformResponse, Unit]): Request[UpdateMLTransformResponse, AWSError] = js.native
  /**
    * Updates an existing machine learning transform. Call this operation to tune the algorithm parameters to achieve better results. After calling this operation, you can call the StartMLEvaluationTaskRun operation to assess how well your new parameters achieved your goals (such as improving the quality of your machine learning transform, or making it more cost-effective).
    */
  def updateMLTransform(params: UpdateMLTransformRequest): Request[UpdateMLTransformResponse, AWSError] = js.native
  def updateMLTransform(
    params: UpdateMLTransformRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMLTransformResponse, Unit]
  ): Request[UpdateMLTransformResponse, AWSError] = js.native
  /**
    * Updates a partition.
    */
  def updatePartition(): Request[UpdatePartitionResponse, AWSError] = js.native
  def updatePartition(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePartitionResponse, Unit]): Request[UpdatePartitionResponse, AWSError] = js.native
  /**
    * Updates a partition.
    */
  def updatePartition(params: UpdatePartitionRequest): Request[UpdatePartitionResponse, AWSError] = js.native
  def updatePartition(
    params: UpdatePartitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePartitionResponse, Unit]
  ): Request[UpdatePartitionResponse, AWSError] = js.native
  /**
    * Updates a metadata table in the Data Catalog.
    */
  def updateTable(): Request[UpdateTableResponse, AWSError] = js.native
  def updateTable(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableResponse, Unit]): Request[UpdateTableResponse, AWSError] = js.native
  /**
    * Updates a metadata table in the Data Catalog.
    */
  def updateTable(params: UpdateTableRequest): Request[UpdateTableResponse, AWSError] = js.native
  def updateTable(
    params: UpdateTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableResponse, Unit]
  ): Request[UpdateTableResponse, AWSError] = js.native
  /**
    * Updates a trigger definition.
    */
  def updateTrigger(): Request[UpdateTriggerResponse, AWSError] = js.native
  def updateTrigger(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTriggerResponse, Unit]): Request[UpdateTriggerResponse, AWSError] = js.native
  /**
    * Updates a trigger definition.
    */
  def updateTrigger(params: UpdateTriggerRequest): Request[UpdateTriggerResponse, AWSError] = js.native
  def updateTrigger(
    params: UpdateTriggerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTriggerResponse, Unit]
  ): Request[UpdateTriggerResponse, AWSError] = js.native
  /**
    * Updates an existing function definition in the Data Catalog.
    */
  def updateUserDefinedFunction(): Request[UpdateUserDefinedFunctionResponse, AWSError] = js.native
  def updateUserDefinedFunction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserDefinedFunctionResponse, Unit]): Request[UpdateUserDefinedFunctionResponse, AWSError] = js.native
  /**
    * Updates an existing function definition in the Data Catalog.
    */
  def updateUserDefinedFunction(params: UpdateUserDefinedFunctionRequest): Request[UpdateUserDefinedFunctionResponse, AWSError] = js.native
  def updateUserDefinedFunction(
    params: UpdateUserDefinedFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserDefinedFunctionResponse, Unit]
  ): Request[UpdateUserDefinedFunctionResponse, AWSError] = js.native
  /**
    * Updates an existing workflow.
    */
  def updateWorkflow(): Request[UpdateWorkflowResponse, AWSError] = js.native
  def updateWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkflowResponse, Unit]): Request[UpdateWorkflowResponse, AWSError] = js.native
  /**
    * Updates an existing workflow.
    */
  def updateWorkflow(params: UpdateWorkflowRequest): Request[UpdateWorkflowResponse, AWSError] = js.native
  def updateWorkflow(
    params: UpdateWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkflowResponse, Unit]
  ): Request[UpdateWorkflowResponse, AWSError] = js.native
}

