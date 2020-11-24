package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadOptions extends js.Object {
  
  /** Optional. Post body.  */
  var body: js.UndefOr[String] = js.native
  
  /** Optional. The action to take if filename already exists.  */
  var conflictAction: js.UndefOr[String] = js.native
  
  /** Optional. A file path relative to the Downloads directory to contain the downloaded file, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will cause an error. onDeterminingFilename allows suggesting a filename after the file's MIME type and a tentative filename have been determined.  */
  var filename: js.UndefOr[String] = js.native
  
  /** Optional. Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented as a dictionary containing the keys name and either value or binaryValue, restricted to those allowed by XMLHttpRequest.  */
  var headers: js.UndefOr[js.Array[HeaderNameValuePair]] = js.native
  
  /** Optional. The HTTP method to use if the URL uses the HTTP[S] protocol.  */
  var method: js.UndefOr[String] = js.native
  
  /** Optional. Use a file-chooser to allow the user to select a filename regardless of whether filename is set or already exists.  */
  var saveAs: js.UndefOr[Boolean] = js.native
  
  /** The URL to download. */
  var url: String = js.native
}
object DownloadOptions {
  
  @scala.inline
  def apply(url: String): DownloadOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
  
  @scala.inline
  implicit class DownloadOptionsOps[Self <: DownloadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setConflictAction(value: String): Self = this.set("conflictAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictAction: Self = this.set("conflictAction", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: HeaderNameValuePair*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[HeaderNameValuePair]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setSaveAs(value: Boolean): Self = this.set("saveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveAs: Self = this.set("saveAs", js.undefined)
  }
}
