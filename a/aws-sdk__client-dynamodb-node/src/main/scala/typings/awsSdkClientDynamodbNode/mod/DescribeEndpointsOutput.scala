package typings.awsSdkClientDynamodbNode.mod

import typings.awsSdkClientDynamodbNode.typesEndpointMod.UnmarshalledEndpoint
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointsOutput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesDescribeEndpointsOutputMod.DescribeEndpointsOutput
object DescribeEndpointsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, Endpoints: js.Array[UnmarshalledEndpoint]): DescribeEndpointsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointsOutput]
  }
}
