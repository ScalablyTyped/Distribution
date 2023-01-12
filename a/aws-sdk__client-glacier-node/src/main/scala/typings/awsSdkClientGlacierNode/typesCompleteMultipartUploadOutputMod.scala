package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCompleteMultipartUploadOutputMod {
  
  trait CompleteMultipartUploadOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The ID of the archive. This value is also included as part of the location.</p>
      */
    var archiveId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The checksum of the archive computed by Amazon Glacier.</p>
      */
    var checksum: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The relative URI path of the newly added archive resource.</p>
      */
    var location: js.UndefOr[String] = js.undefined
  }
  object CompleteMultipartUploadOutput {
    
    inline def apply($metadata: ResponseMetadata): CompleteMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteMultipartUploadOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompleteMultipartUploadOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setArchiveId(value: String): Self = StObject.set(x, "archiveId", value.asInstanceOf[js.Any])
      
      inline def setArchiveIdUndefined: Self = StObject.set(x, "archiveId", js.undefined)
      
      inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
