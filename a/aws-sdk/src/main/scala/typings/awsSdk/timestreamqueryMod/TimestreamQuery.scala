package typings.awsSdk.timestreamqueryMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestreamQuery extends Service {
  
  /**
    *  Cancels a query that has been issued. Cancellation is guaranteed only if the query has not completed execution before the cancellation request was issued. Because cancellation is an idempotent operation, subsequent cancellation requests will return a CancellationMessage, indicating that the query has already been canceled. 
    */
  def cancelQuery(): Request[CancelQueryResponse, AWSError] = js.native
  def cancelQuery(callback: js.Function2[/* err */ AWSError, /* data */ CancelQueryResponse, Unit]): Request[CancelQueryResponse, AWSError] = js.native
  /**
    *  Cancels a query that has been issued. Cancellation is guaranteed only if the query has not completed execution before the cancellation request was issued. Because cancellation is an idempotent operation, subsequent cancellation requests will return a CancellationMessage, indicating that the query has already been canceled. 
    */
  def cancelQuery(params: CancelQueryRequest): Request[CancelQueryResponse, AWSError] = js.native
  def cancelQuery(
    params: CancelQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelQueryResponse, Unit]
  ): Request[CancelQueryResponse, AWSError] = js.native
  
  @JSName("config")
  var config_TimestreamQuery: ConfigBase with ClientConfiguration = js.native
  
  /**
    * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is available through both Write and Query. Because Timestream’s SDKs are designed to transparently work with the service’s architecture, including the management and mapping of the service endpoints, it is not recommended that you use this API unless:   Your application uses a programming language that does not yet have SDK support   You require better control over the client-side implementation   For detailed information on how to use DescribeEndpoints, see The Endpoint Discovery Pattern and REST APIs.
    */
  def describeEndpoints(): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is available through both Write and Query. Because Timestream’s SDKs are designed to transparently work with the service’s architecture, including the management and mapping of the service endpoints, it is not recommended that you use this API unless:   Your application uses a programming language that does not yet have SDK support   You require better control over the client-side implementation   For detailed information on how to use DescribeEndpoints, see The Endpoint Discovery Pattern and REST APIs.
    */
  def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(
    params: DescribeEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  
  /**
    *  Query is a synchronous operation that enables you to execute a query. Query will timeout after 60 seconds. You must update the default timeout in the SDK to support a timeout of 60 seconds. The result set will be truncated to 1MB. Service quotas apply. For more information, see Quotas in the Timestream Developer Guide. 
    */
  def query(): Request[QueryResponse, AWSError] = js.native
  def query(callback: js.Function2[/* err */ AWSError, /* data */ QueryResponse, Unit]): Request[QueryResponse, AWSError] = js.native
  /**
    *  Query is a synchronous operation that enables you to execute a query. Query will timeout after 60 seconds. You must update the default timeout in the SDK to support a timeout of 60 seconds. The result set will be truncated to 1MB. Service quotas apply. For more information, see Quotas in the Timestream Developer Guide. 
    */
  def query(params: QueryRequest): Request[QueryResponse, AWSError] = js.native
  def query(params: QueryRequest, callback: js.Function2[/* err */ AWSError, /* data */ QueryResponse, Unit]): Request[QueryResponse, AWSError] = js.native
}
