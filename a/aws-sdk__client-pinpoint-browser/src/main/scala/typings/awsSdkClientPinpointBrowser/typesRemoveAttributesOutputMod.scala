package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesAttributesResourceMod.UnmarshalledAttributesResource
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRemoveAttributesOutputMod {
  
  trait RemoveAttributesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Attributes.
      */
    var AttributesResource: UnmarshalledAttributesResource
  }
  object RemoveAttributesOutput {
    
    inline def apply($metadata: ResponseMetadata, AttributesResource: UnmarshalledAttributesResource): RemoveAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AttributesResource = AttributesResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAttributesOutput]
    }
    
    extension [Self <: RemoveAttributesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAttributesResource(value: UnmarshalledAttributesResource): Self = StObject.set(x, "AttributesResource", value.asInstanceOf[js.Any])
    }
  }
}
