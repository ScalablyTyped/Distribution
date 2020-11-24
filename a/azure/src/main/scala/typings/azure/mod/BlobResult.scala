package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "BlobResult")
@js.native
class BlobResult () extends js.Object {
  def this(container: String) = this()
  def this(container: String, blob: String) = this()
  
  var acceptRanges: String = js.native
  
  var blob: String = js.native
  
  var blobType: String = js.native
  
  var cacheControl: String = js.native
  
  var cacheControlHeader: String = js.native
  
  var container: String = js.native
  
  var contentDisposition: String = js.native
  
  var contentDispositionHeader: String = js.native
  
  var contentEncoding: String = js.native
  
  var contentEncodingHeader: String = js.native
  
  var contentLanguage: String = js.native
  
  var contentLanguageHeader: String = js.native
  
  var contentLength: Double = js.native
  
  var contentLengthHeader: Double = js.native
  
  var contentMD5: String = js.native
  
  var contentMD5Header: String = js.native
  
  var contentRange: String = js.native
  
  var contentType: String = js.native
  
  var contentTypeHeader: String = js.native
  
  var copyCompletionTime: String = js.native
  
  var copyId: String = js.native
  
  var copyProgress: Double = js.native
  
  var copyStatus: String = js.native
  
  var copyStatusDescription: String = js.native
  
  var etag: String = js.native
  
  var getContentMd5: String = js.native
  
  def getPropertiesFromHeaders(headers: js.Any): Unit = js.native
  
  var lastModified: String = js.native
  
  var leaseDuration: String = js.native
  
  var leaseId: String = js.native
  
  var leaseState: String = js.native
  
  var leaseStatus: String = js.native
  
  var metadata: StorageMetadata = js.native
  
  var range: String = js.native
  
  var rangeHeader: String = js.native
  
  var requestId: String = js.native
  
  var sequenceNumber: String = js.native
}
/* static members */
@JSImport("azure", "BlobResult")
@js.native
object BlobResult extends js.Object {
  
  def parse(blobXml: js.Any): BlobResult = js.native
  
  def setHeadersFromBlob(webResource: WebResource, blob: BlobResult): Unit = js.native
}
