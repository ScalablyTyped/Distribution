package typings.cordovaPluginFileTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Optional parameters for upload method. */
trait FileUploadOptions extends StObject {
  
  /** Whether to upload the data in chunked streaming mode. Defaults to true. */
  var chunkedMode: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the form element. Defaults to file. */
  var fileKey: js.UndefOr[String] = js.undefined
  
  /** The file name to use when saving the file on the server. Defaults to image.jpg. */
  var fileName: js.UndefOr[String] = js.undefined
  
  /** A map of header name/header values. Use an array to specify more than one value. */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The HTTP method to use - either `PUT` or `POST`. Defaults to `POST`. */
  var httpMethod: js.UndefOr[String] = js.undefined
  
  /** The mime type of the data to upload. Defaults to image/jpeg. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** A set of optional key/value pairs to pass in the HTTP request. */
  var params: js.UndefOr[js.Object] = js.undefined
}
object FileUploadOptions {
  
  @scala.inline
  def apply(): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadOptions]
  }
  
  @scala.inline
  implicit class FileUploadOptionsMutableBuilder[Self <: FileUploadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkedMode(value: Boolean): Self = StObject.set(x, "chunkedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkedModeUndefined: Self = StObject.set(x, "chunkedMode", js.undefined)
    
    @scala.inline
    def setFileKey(value: String): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKeyUndefined: Self = StObject.set(x, "fileKey", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
