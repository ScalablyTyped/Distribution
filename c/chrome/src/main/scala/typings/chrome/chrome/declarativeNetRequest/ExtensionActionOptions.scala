package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionActionOptions extends StObject {
  
  /** Whether to automatically display the action count for a page as the extension's badge text.
    * This preference is persisted across sessions.
    */
  var displayActionCountAsBadgeText: js.UndefOr[Boolean] = js.undefined
  
  /** Details of how the tab's action count should be adjusted. */
  var tabUpdate: js.UndefOr[TabActionCountUpdate] = js.undefined
}
object ExtensionActionOptions {
  
  inline def apply(): ExtensionActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionActionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionActionOptions] (val x: Self) extends AnyVal {
    
    inline def setDisplayActionCountAsBadgeText(value: Boolean): Self = StObject.set(x, "displayActionCountAsBadgeText", value.asInstanceOf[js.Any])
    
    inline def setDisplayActionCountAsBadgeTextUndefined: Self = StObject.set(x, "displayActionCountAsBadgeText", js.undefined)
    
    inline def setTabUpdate(value: TabActionCountUpdate): Self = StObject.set(x, "tabUpdate", value.asInstanceOf[js.Any])
    
    inline def setTabUpdateUndefined: Self = StObject.set(x, "tabUpdate", js.undefined)
  }
}
