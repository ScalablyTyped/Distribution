package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
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
    
    inline def apply($metadata: ResponseMetadata): InitiateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitiateMultipartUploadOutput]
    }
    
    extension [Self <: InitiateMultipartUploadOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
    }
  }
}
