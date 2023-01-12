package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListFunctionsOutputMod {
  
  trait ListFunctionsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of Lambda functions.</p>
      */
    var Functions: js.UndefOr[js.Array[UnmarshalledFunctionConfiguration]] = js.undefined
    
    /**
      * <p>A string, present if there are more functions.</p>
      */
    var NextMarker: js.UndefOr[String] = js.undefined
  }
  object ListFunctionsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListFunctionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListFunctionsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListFunctionsOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: js.Array[UnmarshalledFunctionConfiguration]): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "Functions", js.undefined)
      
      inline def setFunctionsVarargs(value: UnmarshalledFunctionConfiguration*): Self = StObject.set(x, "Functions", js.Array(value*))
      
      inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    }
  }
}
