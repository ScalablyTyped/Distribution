package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListFunctionsOutputMod {
  
  @js.native
  trait ListFunctionsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A list of Lambda functions.</p>
      */
    var Functions: js.UndefOr[js.Array[UnmarshalledFunctionConfiguration]] = js.native
    
    /**
      * <p>A string, present if there are more functions.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
  }
  object ListFunctionsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListFunctionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListFunctionsOutput]
    }
    
    @scala.inline
    implicit class ListFunctionsOutputMutableBuilder[Self <: ListFunctionsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctions(value: js.Array[UnmarshalledFunctionConfiguration]): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "Functions", js.undefined)
      
      @scala.inline
      def setFunctionsVarargs(value: UnmarshalledFunctionConfiguration*): Self = StObject.set(x, "Functions", js.Array(value :_*))
      
      @scala.inline
      def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    }
  }
}
