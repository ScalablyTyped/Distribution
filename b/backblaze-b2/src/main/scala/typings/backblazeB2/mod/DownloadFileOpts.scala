package typings.backblazeB2.mod

import typings.backblazeB2.backblazeB2Strings.arraybuffer
import typings.backblazeB2.backblazeB2Strings.blob
import typings.backblazeB2.backblazeB2Strings.document
import typings.backblazeB2.backblazeB2Strings.json
import typings.backblazeB2.backblazeB2Strings.stream
import typings.backblazeB2.backblazeB2Strings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFileOpts
  extends StObject
     with CommonArgs {
  
  var onDownloadProgress: js.UndefOr[UploadProgressFn | Null] = js.undefined
  
  var responseType: arraybuffer | blob | document | json | text | stream
}
object DownloadFileOpts {
  
  @scala.inline
  def apply(responseType: arraybuffer | blob | document | json | text | stream): DownloadFileOpts = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOpts]
  }
  
  @scala.inline
  implicit class DownloadFileOptsMutableBuilder[Self <: DownloadFileOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDownloadProgress(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDownloadProgressNull: Self = StObject.set(x, "onDownloadProgress", null)
    
    @scala.inline
    def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
    
    @scala.inline
    def setResponseType(value: arraybuffer | blob | document | json | text | stream): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
  }
}
