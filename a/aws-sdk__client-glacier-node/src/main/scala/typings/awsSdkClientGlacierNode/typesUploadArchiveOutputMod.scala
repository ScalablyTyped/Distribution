package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUploadArchiveOutputMod {
  
  trait UploadArchiveOutput
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
  object UploadArchiveOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): UploadArchiveOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadArchiveOutput]
    }
    
    @scala.inline
    implicit class UploadArchiveOutputMutableBuilder[Self <: UploadArchiveOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveId(value: String): Self = StObject.set(x, "archiveId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveIdUndefined: Self = StObject.set(x, "archiveId", js.undefined)
      
      @scala.inline
      def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
