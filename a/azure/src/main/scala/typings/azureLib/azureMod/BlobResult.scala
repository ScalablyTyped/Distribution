package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "BlobResult")
@js.native
class BlobResult () extends js.Object {
  def this(container: java.lang.String) = this()
  def this(container: java.lang.String, blob: java.lang.String) = this()
  var acceptRanges: java.lang.String = js.native
  var blob: java.lang.String = js.native
  var blobType: java.lang.String = js.native
  var cacheControl: java.lang.String = js.native
  var cacheControlHeader: java.lang.String = js.native
  var container: java.lang.String = js.native
  var contentDisposition: java.lang.String = js.native
  var contentDispositionHeader: java.lang.String = js.native
  var contentEncoding: java.lang.String = js.native
  var contentEncodingHeader: java.lang.String = js.native
  var contentLanguage: java.lang.String = js.native
  var contentLanguageHeader: java.lang.String = js.native
  var contentLength: scala.Double = js.native
  var contentLengthHeader: scala.Double = js.native
  var contentMD5: java.lang.String = js.native
  var contentMD5Header: java.lang.String = js.native
  var contentRange: java.lang.String = js.native
  var contentType: java.lang.String = js.native
  var contentTypeHeader: java.lang.String = js.native
  var copyCompletionTime: java.lang.String = js.native
  var copyId: java.lang.String = js.native
  var copyProgress: scala.Double = js.native
  var copyStatus: java.lang.String = js.native
  var copyStatusDescription: java.lang.String = js.native
  var etag: java.lang.String = js.native
  var getContentMd5: java.lang.String = js.native
  var lastModified: java.lang.String = js.native
  var leaseDuration: java.lang.String = js.native
  var leaseId: java.lang.String = js.native
  var leaseState: java.lang.String = js.native
  var leaseStatus: java.lang.String = js.native
  var metadata: StorageMetadata = js.native
  var range: java.lang.String = js.native
  var rangeHeader: java.lang.String = js.native
  var requestId: java.lang.String = js.native
  var sequenceNumber: java.lang.String = js.native
  def getPropertiesFromHeaders(headers: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("azure", "BlobResult")
@js.native
object BlobResult extends js.Object {
  def parse(blobXml: js.Any): azureLib.azureMod.BlobResult = js.native
  def setHeadersFromBlob(webResource: azureLib.azureMod.WebResource, blob: azureLib.azureMod.BlobResult): scala.Unit = js.native
}

