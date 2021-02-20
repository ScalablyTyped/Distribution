package typings.cordovaPluginFileTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Optional parameters for download method. */
@js.native
trait FileDownloadOptions extends StObject {
  
  /** A map of header name/header values. */
  var headers: js.UndefOr[js.Object] = js.native
}
object FileDownloadOptions {
  
  @scala.inline
  def apply(): FileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileDownloadOptions]
  }
  
  @scala.inline
  implicit class FileDownloadOptionsMutableBuilder[Self <: FileDownloadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
