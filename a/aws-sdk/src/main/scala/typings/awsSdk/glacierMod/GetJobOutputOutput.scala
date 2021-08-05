package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobOutputOutput extends StObject {
  
  /**
    * Indicates the range units accepted. For more information, see RFC2616. 
    */
  var acceptRanges: js.UndefOr[String] = js.undefined
  
  /**
    * The description of an archive.
    */
  var archiveDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The job data, either archive data or inventory data.
    */
  var body: js.UndefOr[Stream] = js.undefined
  
  /**
    * The checksum of the data in the response. This header is returned only when retrieving the output for an archive retrieval job. Furthermore, this header appears only under the following conditions:   You get the entire range of the archive.   You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if you have an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then the x-amz-sha256-tree-hash is returned as a response header.   You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at 3.1 MB (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.  
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The range of bytes returned by Amazon S3 Glacier. If only partial output is downloaded, the response provides the range of bytes Amazon S3 Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB from 8 MB.
    */
  var contentRange: js.UndefOr[String] = js.undefined
  
  /**
    * The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data, the Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you initiated the job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as JSON, and the Content-Type is application/json.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP response code for a job output request. The value depends on whether a range was specified in the request.
    */
  var status: js.UndefOr[httpstatus] = js.undefined
}
object GetJobOutputOutput {
  
  inline def apply(): GetJobOutputOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobOutputOutput]
  }
  
  extension [Self <: GetJobOutputOutput](x: Self) {
    
    inline def setAcceptRanges(value: String): Self = StObject.set(x, "acceptRanges", value.asInstanceOf[js.Any])
    
    inline def setAcceptRangesUndefined: Self = StObject.set(x, "acceptRanges", js.undefined)
    
    inline def setArchiveDescription(value: String): Self = StObject.set(x, "archiveDescription", value.asInstanceOf[js.Any])
    
    inline def setArchiveDescriptionUndefined: Self = StObject.set(x, "archiveDescription", js.undefined)
    
    inline def setBody(value: Stream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setContentRange(value: String): Self = StObject.set(x, "contentRange", value.asInstanceOf[js.Any])
    
    inline def setContentRangeUndefined: Self = StObject.set(x, "contentRange", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setStatus(value: httpstatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
