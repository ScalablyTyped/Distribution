package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesEndpointMod.UnmarshalledEndpoint
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeEndpointsOutputMod {
  
  @js.native
  trait DescribeEndpointsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * _Endpoints shape
      */
    var Endpoints: js.Array[UnmarshalledEndpoint] = js.native
  }
  object DescribeEndpointsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, Endpoints: js.Array[UnmarshalledEndpoint]): DescribeEndpointsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Endpoints = Endpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeEndpointsOutput]
    }
    
    @scala.inline
    implicit class DescribeEndpointsOutputMutableBuilder[Self <: DescribeEndpointsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoints(value: js.Array[UnmarshalledEndpoint]): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsVarargs(value: UnmarshalledEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
    }
  }
}
