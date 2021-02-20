package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesUploadListElementMod.UnmarshalledUploadListElement
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListMultipartUploadsOutputMod {
  
  @js.native
  trait ListMultipartUploadsOutput extends _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is <code>null</code>.</p>
      */
    var Marker: js.UndefOr[String] = js.native
    
    /**
      * <p>A list of in-progress multipart uploads.</p>
      */
    var UploadsList: js.UndefOr[js.Array[UnmarshalledUploadListElement]] = js.native
  }
  object ListMultipartUploadsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListMultipartUploadsOutput]
    }
    
    @scala.inline
    implicit class ListMultipartUploadsOutputMutableBuilder[Self <: ListMultipartUploadsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
      
      @scala.inline
      def setUploadsList(value: js.Array[UnmarshalledUploadListElement]): Self = StObject.set(x, "UploadsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadsListUndefined: Self = StObject.set(x, "UploadsList", js.undefined)
      
      @scala.inline
      def setUploadsListVarargs(value: UnmarshalledUploadListElement*): Self = StObject.set(x, "UploadsList", js.Array(value :_*))
    }
  }
}
