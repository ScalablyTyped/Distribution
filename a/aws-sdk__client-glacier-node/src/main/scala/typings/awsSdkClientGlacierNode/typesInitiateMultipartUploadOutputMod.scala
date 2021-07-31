package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInitiateMultipartUploadOutputMod {
  
  trait InitiateMultipartUploadOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The relative URI path of the multipart upload ID Amazon Glacier created.</p>
      */
    var location: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The ID of the multipart upload. This value is also included as part of the location.</p>
      */
    var uploadId: js.UndefOr[String] = js.undefined
  }
  object InitiateMultipartUploadOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): InitiateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitiateMultipartUploadOutput]
    }
    
    @scala.inline
    implicit class InitiateMultipartUploadOutputMutableBuilder[Self <: InitiateMultipartUploadOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
    }
  }
}
