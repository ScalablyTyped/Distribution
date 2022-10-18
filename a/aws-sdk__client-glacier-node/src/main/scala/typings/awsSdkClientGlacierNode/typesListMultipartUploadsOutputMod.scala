package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesUploadListElementMod.UnmarshalledUploadListElement
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListMultipartUploadsOutputMod {
  
  trait ListMultipartUploadsOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is <code>null</code>.</p>
      */
    var Marker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A list of in-progress multipart uploads.</p>
      */
    var UploadsList: js.UndefOr[js.Array[UnmarshalledUploadListElement]] = js.undefined
  }
  object ListMultipartUploadsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListMultipartUploadsOutput]
    }
    
    extension [Self <: ListMultipartUploadsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
      
      inline def setUploadsList(value: js.Array[UnmarshalledUploadListElement]): Self = StObject.set(x, "UploadsList", value.asInstanceOf[js.Any])
      
      inline def setUploadsListUndefined: Self = StObject.set(x, "UploadsList", js.undefined)
      
      inline def setUploadsListVarargs(value: UnmarshalledUploadListElement*): Self = StObject.set(x, "UploadsList", js.Array(value*))
    }
  }
}
