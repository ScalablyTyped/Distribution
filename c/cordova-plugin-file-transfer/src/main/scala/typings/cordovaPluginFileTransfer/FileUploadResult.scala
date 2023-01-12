package typings.cordovaPluginFileTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A FileUploadResult object is passed to the success callback of the FileTransfer object's upload() method. */
trait FileUploadResult extends StObject {
  
  /** The number of bytes sent to the server as part of the upload. */
  var bytesSent: Double
  
  /** The HTTP response headers by the server. Currently supported on iOS only.*/
  var headers: Any
  
  /** The HTTP response returned by the server. */
  var response: String
  
  /** The HTTP response code returned by the server. */
  var responseCode: Double
}
object FileUploadResult {
  
  inline def apply(bytesSent: Double, headers: Any, response: String, responseCode: Double): FileUploadResult = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileUploadResult] (val x: Self) extends AnyVal {
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
  }
}
