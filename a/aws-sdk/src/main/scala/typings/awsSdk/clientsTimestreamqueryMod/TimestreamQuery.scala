package typings.awsSdk.clientsTimestreamqueryMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestreamQuery extends Service {
  
  /**
    *  Cancels a query that has been issued. Cancellation is provided only if the query has not completed running before the cancellation request was issued. Because cancellation is an idempotent operation, subsequent cancellation requests will return a CancellationMessage, indicating that the query has already been canceled. See code sample for details. 
    */
  def cancelQuery(): Request[CancelQueryResponse, AWSError] = js.native
  def cancelQuery(callback: js.Function2[/* err */ AWSError, /* data */ CancelQueryResponse, Unit]): Request[CancelQueryResponse, AWSError] = js.native
  /**
    *  Cancels a query that has been issued. Cancellation is provided only if the query has not completed running before the cancellation request was issued. Because cancellation is an idempotent operation, subsequent cancellation requests will return a CancellationMessage, indicating that the query has already been canceled. See code sample for details. 
    */
  def cancelQuery(params: CancelQueryRequest): Request[CancelQueryResponse, AWSError] = js.native
  def cancelQuery(
    params: CancelQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelQueryResponse, Unit]
  ): Request[CancelQueryResponse, AWSError] = js.native
  
  @JSName("config")
  var config_TimestreamQuery: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Create a scheduled query that will be run on your behalf at the configured schedule. Timestream assumes the execution role provided as part of the ScheduledQueryExecutionRoleArn parameter to run the query. You can use the NotificationConfiguration parameter to configure notification for your scheduled query operations.
    */
  def createScheduledQuery(): Request[CreateScheduledQueryResponse, AWSError] = js.native
  def createScheduledQuery(callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduledQueryResponse, Unit]): Request[CreateScheduledQueryResponse, AWSError] = js.native
  /**
    *  Create a scheduled query that will be run on your behalf at the configured schedule. Timestream assumes the execution role provided as part of the ScheduledQueryExecutionRoleArn parameter to run the query. You can use the NotificationConfiguration parameter to configure notification for your scheduled query operations.
    */
  def createScheduledQuery(params: CreateScheduledQueryRequest): Request[CreateScheduledQueryResponse, AWSError] = js.native
  def createScheduledQuery(
    params: CreateScheduledQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduledQueryResponse, Unit]
  ): Request[CreateScheduledQueryResponse, AWSError] = js.native
  
  /**
    * Deletes a given scheduled query. This is an irreversible operation. 
    */
  def deleteScheduledQuery(): Request[js.Object, AWSError] = js.native
  def deleteScheduledQuery(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a given scheduled query. This is an irreversible operation. 
    */
  def deleteScheduledQuery(params: DeleteScheduledQueryRequest): Request[js.Object, AWSError] = js.native
  def deleteScheduledQuery(
    params: DeleteScheduledQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is available through both Write and Query. Because the Timestream SDKs are designed to transparently work with the service’s architecture, including the management and mapping of the service endpoints, it is not recommended that you use this API unless:   You are using VPC endpoints (Amazon Web Services PrivateLink) with Timestream     Your application uses a programming language that does not yet have SDK support   You require better control over the client-side implementation   For detailed information on how and when to use and implement DescribeEndpoints, see The Endpoint Discovery Pattern.
    */
  def describeEndpoints(): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is available through both Write and Query. Because the Timestream SDKs are designed to transparently work with the service’s architecture, including the management and mapping of the service endpoints, it is not recommended that you use this API unless:   You are using VPC endpoints (Amazon Web Services PrivateLink) with Timestream     Your application uses a programming language that does not yet have SDK support   You require better control over the client-side implementation   For detailed information on how and when to use and implement DescribeEndpoints, see The Endpoint Discovery Pattern.
    */
  def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(
    params: DescribeEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  
  /**
    * Provides detailed information about a scheduled query.
    */
  def describeScheduledQuery(): Request[DescribeScheduledQueryResponse, AWSError] = js.native
  def describeScheduledQuery(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledQueryResponse, Unit]): Request[DescribeScheduledQueryResponse, AWSError] = js.native
  /**
    * Provides detailed information about a scheduled query.
    */
  def describeScheduledQuery(params: DescribeScheduledQueryRequest): Request[DescribeScheduledQueryResponse, AWSError] = js.native
  def describeScheduledQuery(
    params: DescribeScheduledQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledQueryResponse, Unit]
  ): Request[DescribeScheduledQueryResponse, AWSError] = js.native
  
  /**
    *  You can use this API to run a scheduled query manually. 
    */
  def executeScheduledQuery(): Request[js.Object, AWSError] = js.native
  def executeScheduledQuery(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  You can use this API to run a scheduled query manually. 
    */
  def executeScheduledQuery(params: ExecuteScheduledQueryRequest): Request[js.Object, AWSError] = js.native
  def executeScheduledQuery(
    params: ExecuteScheduledQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets a list of all scheduled queries in the caller's Amazon account and Region. ListScheduledQueries is eventually consistent. 
    */
  def listScheduledQueries(): Request[ListScheduledQueriesResponse, AWSError] = js.native
  def listScheduledQueries(callback: js.Function2[/* err */ AWSError, /* data */ ListScheduledQueriesResponse, Unit]): Request[ListScheduledQueriesResponse, AWSError] = js.native
  /**
    * Gets a list of all scheduled queries in the caller's Amazon account and Region. ListScheduledQueries is eventually consistent. 
    */
  def listScheduledQueries(params: ListScheduledQueriesRequest): Request[ListScheduledQueriesResponse, AWSError] = js.native
  def listScheduledQueries(
    params: ListScheduledQueriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListScheduledQueriesResponse, Unit]
  ): Request[ListScheduledQueriesResponse, AWSError] = js.native
  
  /**
    * List all tags on a Timestream query resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List all tags on a Timestream query resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * A synchronous operation that allows you to submit a query with parameters to be stored by Timestream for later running. Timestream only supports using this operation with the PrepareQueryRequest$ValidateOnly set to true. 
    */
  def prepareQuery(): Request[PrepareQueryResponse, AWSError] = js.native
  def prepareQuery(callback: js.Function2[/* err */ AWSError, /* data */ PrepareQueryResponse, Unit]): Request[PrepareQueryResponse, AWSError] = js.native
  /**
    * A synchronous operation that allows you to submit a query with parameters to be stored by Timestream for later running. Timestream only supports using this operation with the PrepareQueryRequest$ValidateOnly set to true. 
    */
  def prepareQuery(params: PrepareQueryRequest): Request[PrepareQueryResponse, AWSError] = js.native
  def prepareQuery(
    params: PrepareQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PrepareQueryResponse, Unit]
  ): Request[PrepareQueryResponse, AWSError] = js.native
  
  /**
    *  Query is a synchronous operation that enables you to run a query against your Amazon Timestream data. Query will time out after 60 seconds. You must update the default timeout in the SDK to support a timeout of 60 seconds. See the code sample for details.  Your query request will fail in the following cases:    If you submit a Query request with the same client token outside of the 5-minute idempotency window.     If you submit a Query request with the same client token, but change other parameters, within the 5-minute idempotency window.     If the size of the row (including the query metadata) exceeds 1 MB, then the query will fail with the following error message:   Query aborted as max page response size has been exceeded by the output result row     If the IAM principal of the query initiator and the result reader are not the same and/or the query initiator and the result reader do not have the same query string in the query requests, the query will fail with an Invalid pagination token error.   
    */
  def query(): Request[QueryResponse, AWSError] = js.native
  def query(callback: js.Function2[/* err */ AWSError, /* data */ QueryResponse, Unit]): Request[QueryResponse, AWSError] = js.native
  /**
    *  Query is a synchronous operation that enables you to run a query against your Amazon Timestream data. Query will time out after 60 seconds. You must update the default timeout in the SDK to support a timeout of 60 seconds. See the code sample for details.  Your query request will fail in the following cases:    If you submit a Query request with the same client token outside of the 5-minute idempotency window.     If you submit a Query request with the same client token, but change other parameters, within the 5-minute idempotency window.     If the size of the row (including the query metadata) exceeds 1 MB, then the query will fail with the following error message:   Query aborted as max page response size has been exceeded by the output result row     If the IAM principal of the query initiator and the result reader are not the same and/or the query initiator and the result reader do not have the same query string in the query requests, the query will fail with an Invalid pagination token error.   
    */
  def query(params: QueryRequest): Request[QueryResponse, AWSError] = js.native
  def query(params: QueryRequest, callback: js.Function2[/* err */ AWSError, /* data */ QueryResponse, Unit]): Request[QueryResponse, AWSError] = js.native
  
  /**
    * Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the association of tags from a Timestream query resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the association of tags from a Timestream query resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Update a scheduled query.
    */
  def updateScheduledQuery(): Request[js.Object, AWSError] = js.native
  def updateScheduledQuery(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Update a scheduled query.
    */
  def updateScheduledQuery(params: UpdateScheduledQueryRequest): Request[js.Object, AWSError] = js.native
  def updateScheduledQuery(
    params: UpdateScheduledQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
