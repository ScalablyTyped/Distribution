package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesEventSourceMappingConfigurationMod.UnmarshalledEventSourceMappingConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListEventSourceMappingsOutputMod {
  
  trait ListEventSourceMappingsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>An array of <code>EventSourceMappingConfiguration</code> objects.</p>
      */
    var EventSourceMappings: js.UndefOr[js.Array[UnmarshalledEventSourceMappingConfiguration]] = js.undefined
    
    /**
      * <p>A string, present if there are more event source mappings.</p>
      */
    var NextMarker: js.UndefOr[String] = js.undefined
  }
  object ListEventSourceMappingsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListEventSourceMappingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListEventSourceMappingsOutput]
    }
    
    extension [Self <: ListEventSourceMappingsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEventSourceMappings(value: js.Array[UnmarshalledEventSourceMappingConfiguration]): Self = StObject.set(x, "EventSourceMappings", value.asInstanceOf[js.Any])
      
      inline def setEventSourceMappingsUndefined: Self = StObject.set(x, "EventSourceMappings", js.undefined)
      
      inline def setEventSourceMappingsVarargs(value: UnmarshalledEventSourceMappingConfiguration*): Self = StObject.set(x, "EventSourceMappings", js.Array(value :_*))
      
      inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    }
  }
}
