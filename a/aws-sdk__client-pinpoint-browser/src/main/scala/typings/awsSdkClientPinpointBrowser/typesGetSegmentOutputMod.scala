package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSegmentOutputMod {
  
  trait GetSegmentOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Segment definition.
      */
    var SegmentResponse: UnmarshalledSegmentResponse
  }
  object GetSegmentOutput {
    
    inline def apply($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): GetSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSegmentOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetSegmentOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setSegmentResponse(value: UnmarshalledSegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
    }
  }
}
