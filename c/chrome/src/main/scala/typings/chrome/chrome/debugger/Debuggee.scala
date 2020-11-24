package typings.chrome.chrome.debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debuggee extends js.Object {
  
  /**
    * Optional.
    * Since Chrome 27.
    * The id of the extension which you intend to debug. Attaching to an extension background page is only possible when 'silent-debugger-extension-api' flag is enabled on the target browser.
    */
  var extensionId: js.UndefOr[String] = js.native
  
  /** Optional. The id of the tab which you intend to debug.  */
  var tabId: js.UndefOr[Double] = js.native
  
  /**
    * Optional.
    * Since Chrome 28.
    * The opaque id of the debug target.
    */
  var targetId: js.UndefOr[String] = js.native
}
object Debuggee {
  
  @scala.inline
  def apply(): Debuggee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debuggee]
  }
  
  @scala.inline
  implicit class DebuggeeOps[Self <: Debuggee] (val x: Self) extends AnyVal {
    
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
    def setExtensionId(value: String): Self = this.set("extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionId: Self = this.set("extensionId", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
    
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
}
