package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartContentUploadResponse extends StObject {
  
  /**
    * The headers to include in the upload.
    */
  var headersToInclude: Headers
  
  /**
    * The identifier of the upload.
    */
  var uploadId: UploadId
  
  /**
    * The URL of the upload.
    */
  var url: Url
  
  /**
    * The expiration time of the URL as an epoch timestamp.
    */
  var urlExpiry: js.Date
}
object StartContentUploadResponse {
  
  inline def apply(headersToInclude: Headers, uploadId: UploadId, url: Url, urlExpiry: js.Date): StartContentUploadResponse = {
    val __obj = js.Dynamic.literal(headersToInclude = headersToInclude.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlExpiry = urlExpiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContentUploadResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartContentUploadResponse] (val x: Self) extends AnyVal {
    
    inline def setHeadersToInclude(value: Headers): Self = StObject.set(x, "headersToInclude", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlExpiry(value: js.Date): Self = StObject.set(x, "urlExpiry", value.asInstanceOf[js.Any])
  }
}
