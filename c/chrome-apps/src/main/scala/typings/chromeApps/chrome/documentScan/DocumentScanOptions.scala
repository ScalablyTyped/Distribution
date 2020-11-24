package typings.chromeApps.chrome.documentScan

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentScanOptions extends js.Object {
  
  /** The number of scanned images allowed (defaults to 1).  */
  var maxImages: js.UndefOr[integer] = js.native
  
  /** The MIME types that are accepted by the caller.  */
  var mimeTypes: js.UndefOr[js.Array[String]] = js.native
}
object DocumentScanOptions {
  
  @scala.inline
  def apply(): DocumentScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentScanOptions]
  }
  
  @scala.inline
  implicit class DocumentScanOptionsOps[Self <: DocumentScanOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxImages(value: integer): Self = this.set("maxImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxImages: Self = this.set("maxImages", js.undefined)
    
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = this.set("mimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
  }
}
