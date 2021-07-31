package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListVersionsByFunctionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListVersionsByFunctionOutput]
    }
    
    @scala.inline
    implicit class ListVersionsByFunctionOutputMutableBuilder[Self <: ListVersionsByFunctionOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
      
      @scala.inline
      def setVersions(value: js.Array[UnmarshalledFunctionConfiguration]): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
      
      @scala.inline
      def setVersionsVarargs(value: UnmarshalledFunctionConfiguration*): Self = StObject.set(x, "Versions", js.Array(value :_*))
    }
  }
}
