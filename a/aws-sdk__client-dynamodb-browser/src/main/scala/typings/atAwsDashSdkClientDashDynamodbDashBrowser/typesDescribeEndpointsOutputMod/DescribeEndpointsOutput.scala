package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeEndpointsOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreEndpointMod._UnmarshalledEndpoint
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * _Endpoints shape
    */
  var Endpoints: js.Array[_UnmarshalledEndpoint]
}

object DescribeEndpointsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Endpoints: js.Array[_UnmarshalledEndpoint]): DescribeEndpointsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Endpoints = Endpoints.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeEndpointsOutput]
  }
}

