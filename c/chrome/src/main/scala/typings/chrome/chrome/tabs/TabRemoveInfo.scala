package typings.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabRemoveInfo extends StObject {
  
  /** True when the tab is being closed because its window is being closed. */
  var isWindowClosing: Boolean
  
  /**
    * The window whose tab is closed.
    * @since Chrome 25.
    */
  var windowId: Double
}
object TabRemoveInfo {
  
  @scala.inline
  def apply(isWindowClosing: Boolean, windowId: Double): TabRemoveInfo = {
    val __obj = js.Dynamic.literal(isWindowClosing = isWindowClosing.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabRemoveInfo]
  }
  
  @scala.inline
  implicit class TabRemoveInfoMutableBuilder[Self <: TabRemoveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsWindowClosing(value: Boolean): Self = StObject.set(x, "isWindowClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
