package typings.chrome.chrome.debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetInfo extends js.Object {
  
  /** True if debugger is already attached. */
  var attached: Boolean = js.native
  
  /**
    * Optional.
    * Since Chrome 30.
    * The extension id, defined if type = 'background_page'.
    */
  var extensionId: js.UndefOr[String] = js.native
  
  /** Optional. Target favicon URL.  */
  var faviconUrl: js.UndefOr[String] = js.native
  
  /** Target id. */
  var id: String = js.native
  
  /**
    * Optional.
    * Since Chrome 30.
    * The tab id, defined if type == 'page'.
    */
  var tabId: js.UndefOr[Double] = js.native
  
  /** Target page title. */
  var title: String = js.native
  
  /** Target type. */
  var `type`: String = js.native
  
  /** Target URL. */
  var url: String = js.native
}
object TargetInfo {
  
  @scala.inline
  def apply(attached: Boolean, id: String, title: String, `type`: String, url: String): TargetInfo = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfo]
  }
  
  @scala.inline
  implicit class TargetInfoOps[Self <: TargetInfo] (val x: Self) extends AnyVal {
    
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
    def setAttached(value: Boolean): Self = this.set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionId(value: String): Self = this.set("extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionId: Self = this.set("extensionId", js.undefined)
    
    @scala.inline
    def setFaviconUrl(value: String): Self = this.set("faviconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaviconUrl: Self = this.set("faviconUrl", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
  }
}
