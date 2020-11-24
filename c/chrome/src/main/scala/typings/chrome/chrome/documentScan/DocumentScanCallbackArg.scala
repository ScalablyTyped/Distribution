package typings.chrome.chrome.documentScan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentScanCallbackArg extends js.Object {
  
  /** The data image URLs in a form that can be passed as the "src" value to an image tag. */
  var dataUrls: js.Array[String] = js.native
  
  /** The MIME type of dataUrls. */
  var mimeType: String = js.native
}
object DocumentScanCallbackArg {
  
  @scala.inline
  def apply(dataUrls: js.Array[String], mimeType: String): DocumentScanCallbackArg = {
    val __obj = js.Dynamic.literal(dataUrls = dataUrls.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentScanCallbackArg]
  }
  
  @scala.inline
  implicit class DocumentScanCallbackArgOps[Self <: DocumentScanCallbackArg] (val x: Self) extends AnyVal {
    
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
    def setDataUrlsVarargs(value: String*): Self = this.set("dataUrls", js.Array(value :_*))
    
    @scala.inline
    def setDataUrls(value: js.Array[String]): Self = this.set("dataUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
  }
}
