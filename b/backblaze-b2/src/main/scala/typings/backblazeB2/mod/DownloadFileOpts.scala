package typings.backblazeB2.mod

import typings.backblazeB2.backblazeB2Strings.arraybuffer
import typings.backblazeB2.backblazeB2Strings.blob
import typings.backblazeB2.backblazeB2Strings.document
import typings.backblazeB2.backblazeB2Strings.json
import typings.backblazeB2.backblazeB2Strings.stream
import typings.backblazeB2.backblazeB2Strings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadFileOpts extends CommonArgs {
  
  var onDownloadProgress: js.UndefOr[UploadProgressFn | Null] = js.native
  
  var responseType: arraybuffer | blob | document | json | text | stream = js.native
}
object DownloadFileOpts {
  
  @scala.inline
  def apply(responseType: arraybuffer | blob | document | json | text | stream): DownloadFileOpts = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOpts]
  }
  
  @scala.inline
  implicit class DownloadFileOptsOps[Self <: DownloadFileOpts] (val x: Self) extends AnyVal {
    
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
    def setResponseType(value: arraybuffer | blob | document | json | text | stream): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDownloadProgress(value: /* event */ js.Any => Unit): Self = this.set("onDownloadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDownloadProgress: Self = this.set("onDownloadProgress", js.undefined)
    
    @scala.inline
    def setOnDownloadProgressNull: Self = this.set("onDownloadProgress", null)
  }
}
