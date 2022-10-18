package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListVersionsByFunctionOutputMod {
  
  trait ListVersionsByFunctionOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A string, present if there are more function versions.</p>
      */
    var NextMarker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A list of Lambda function versions.</p>
      */
    var Versions: js.UndefOr[js.Array[UnmarshalledFunctionConfiguration]] = js.undefined
  }
  object ListVersionsByFunctionOutput {
    
    inline def apply($metadata: ResponseMetadata): ListVersionsByFunctionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListVersionsByFunctionOutput]
    }
    
    extension [Self <: ListVersionsByFunctionOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
      
      inline def setVersions(value: js.Array[UnmarshalledFunctionConfiguration]): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
      
      inline def setVersionsVarargs(value: UnmarshalledFunctionConfiguration*): Self = StObject.set(x, "Versions", js.Array(value*))
    }
  }
}
