package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesEventSourceMappingConfigurationMod.UnmarshalledEventSourceMappingConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListEventSourceMappingsOutputMod {
  
  @js.native
  trait ListEventSourceMappingsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>An array of <code>EventSourceMappingConfiguration</code> objects.</p>
      */
    var EventSourceMappings: js.UndefOr[js.Array[UnmarshalledEventSourceMappingConfiguration]] = js.native
    
    /**
      * <p>A string, present if there are more event source mappings.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
  }
  object ListEventSourceMappingsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListEventSourceMappingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListEventSourceMappingsOutput]
    }
    
    @scala.inline
    implicit class ListEventSourceMappingsOutputMutableBuilder[Self <: ListEventSourceMappingsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceMappings(value: js.Array[UnmarshalledEventSourceMappingConfiguration]): Self = StObject.set(x, "EventSourceMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceMappingsUndefined: Self = StObject.set(x, "EventSourceMappings", js.undefined)
      
      @scala.inline
      def setEventSourceMappingsVarargs(value: UnmarshalledEventSourceMappingConfiguration*): Self = StObject.set(x, "EventSourceMappings", js.Array(value :_*))
      
      @scala.inline
      def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    }
  }
}
