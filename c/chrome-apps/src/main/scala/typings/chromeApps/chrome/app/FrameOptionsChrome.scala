package typings.chromeApps.chrome.app

import typings.chromeApps.chromeAppsStrings.chrome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameOptionsChrome extends js.Object {
  
  /**
    * Allows the frame color of the window when active to be set. Frame coloring is only available if the frame type is chrome.
    * Frame coloring is only available if the frame type is chrome.
    * @since Frame coloring is new in Chrome 36.
    */
  var activeColor: js.UndefOr[String] = js.native
  
  /**
    * Allows the frame color to be set. Frame coloring is only available if the frame type is chrome.
    * @since Frame coloring is new in Chrome 36.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Allows the frame color of the window when inactive to be set differently to the active color. Frame coloring is only available if the frame type is chrome.
    * inactiveColor must be used in conjunction with color.
    * @since Frame coloring is new in Chrome 36.
    */
  var inactiveColor: js.UndefOr[String] = js.native
  
  /**
    * Frame type: none or chrome (defaults to chrome).
    *
    * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
    * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
    */
  var `type`: chrome = js.native
}
object FrameOptionsChrome {
  
  @scala.inline
  def apply(`type`: chrome): FrameOptionsChrome = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameOptionsChrome]
  }
  
  @scala.inline
  implicit class FrameOptionsChromeOps[Self <: FrameOptionsChrome] (val x: Self) extends AnyVal {
    
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
    def setType(value: chrome): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColor(value: String): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveColor: Self = this.set("activeColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setInactiveColor(value: String): Self = this.set("inactiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveColor: Self = this.set("inactiveColor", js.undefined)
  }
}
