package typings.chrome.chrome.downloads

import typings.chrome.chromeStrings.GET
import typings.chrome.chromeStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadOptions extends StObject {
  
  /** Optional. Post body.  */
  var body: js.UndefOr[String] = js.undefined
  
  /** Optional. The action to take if filename already exists.  */
  var conflictAction: js.UndefOr[FilenameConflictAction] = js.undefined
  
  /** Optional. A file path relative to the Downloads directory to contain the downloaded file, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will cause an error. onDeterminingFilename allows suggesting a filename after the file's MIME type and a tentative filename have been determined.  */
  var filename: js.UndefOr[String] = js.undefined
  
  /** Optional. Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented as a dictionary containing the keys name and either value or binaryValue, restricted to those allowed by XMLHttpRequest.  */
  var headers: js.UndefOr[js.Array[HeaderNameValuePair]] = js.undefined
  
  /** Optional. The HTTP method to use if the URL uses the HTTP[S] protocol.  */
  var method: js.UndefOr[GET | POST] = js.undefined
  
  /** Optional. Use a file-chooser to allow the user to select a filename regardless of whether filename is set or already exists.  */
  var saveAs: js.UndefOr[Boolean] = js.undefined
  
  /** The URL to download. */
  var url: String
}
object DownloadOptions {
  
  inline def apply(url: String): DownloadOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setConflictAction(value: FilenameConflictAction): Self = StObject.set(x, "conflictAction", value.asInstanceOf[js.Any])
    
    inline def setConflictActionUndefined: Self = StObject.set(x, "conflictAction", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHeaders(value: js.Array[HeaderNameValuePair]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: HeaderNameValuePair*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSaveAs(value: Boolean): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
    
    inline def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
