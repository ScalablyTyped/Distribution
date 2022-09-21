package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesEndpointMod.UnmarshalledEndpoint
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeEndpointsOutputMod {
  
  trait DescribeEndpointsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * _Endpoints shape
      */
    var Endpoints: js.Array[UnmarshalledEndpoint]
  }
  object DescribeEndpointsOutput {
    
    inline def apply($metadata: ResponseMetadata, Endpoints: js.Array[UnmarshalledEndpoint]): DescribeEndpointsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Endpoints = Endpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeEndpointsOutput]
    }
    
    extension [Self <: DescribeEndpointsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEndpoints(value: js.Array[UnmarshalledEndpoint]): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: UnmarshalledEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    }
  }
}
