package typings.awsSdkClientGlacierNode

import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetJobOutputOutputMod {
  
  trait GetJobOutputOutput[StreamType] extends StObject {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Indicates the range units accepted. For more information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">RFC2616</a>. </p>
      */
    var acceptRanges: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The description of an archive.</p>
      */
    var archiveDescription: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The job data, either archive data or inventory data.</p>
      */
    var body: js.UndefOr[StreamType] = js.undefined
    
    /**
      * <p>The checksum of the data in the response. This header is returned only when retrieving the output for an archive retrieval job. Furthermore, this header appears only under the following conditions:</p> <ul> <li> <p>You get the entire range of the archive.</p> </li> <li> <p>You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if you have an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then the x-amz-sha256-tree-hash is returned as a response header.</p> </li> <li> <p>You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at 3.1 MB (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.</p> </li> </ul>
      */
    var checksum: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response provides the range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB from 8 MB.</p>
      */
    var contentRange: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data, the Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you initiated the job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as JSON, and the Content-Type is application/json.</p>
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The HTTP response code for a job output request. The value depends on whether a range was specified in the request.</p>
      */
    var status: js.UndefOr[Double] = js.undefined
  }
  object GetJobOutputOutput {
    
    inline def apply[StreamType]($metadata: ResponseMetadata): GetJobOutputOutput[StreamType] = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetJobOutputOutput[StreamType]]
    }
    
    extension [Self <: GetJobOutputOutput[?], StreamType](x: Self & GetJobOutputOutput[StreamType]) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAcceptRanges(value: String): Self = StObject.set(x, "acceptRanges", value.asInstanceOf[js.Any])
      
      inline def setAcceptRangesUndefined: Self = StObject.set(x, "acceptRanges", js.undefined)
      
      inline def setArchiveDescription(value: String): Self = StObject.set(x, "archiveDescription", value.asInstanceOf[js.Any])
      
      inline def setArchiveDescriptionUndefined: Self = StObject.set(x, "archiveDescription", js.undefined)
      
      inline def setBody(value: StreamType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
      
      inline def setContentRange(value: String): Self = StObject.set(x, "contentRange", value.asInstanceOf[js.Any])
      
      inline def setContentRangeUndefined: Self = StObject.set(x, "contentRange", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
