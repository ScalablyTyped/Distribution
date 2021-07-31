package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem extends StObject {
  
  /** Indicates this item should be drawn with a check. */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates this item is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** String that will be passed to callbacks referencing this MenuItem. */
  var id: String
  
  /** Optional. Text displayed in the menu for this item. */
  var label: js.UndefOr[String] = js.undefined
  
  /** Optional. The type of menu item. */
  var style: js.UndefOr[String] = js.undefined
  
  /** Optional. Indicates this item is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MenuItem {
  
  @scala.inline
  def apply(id: String): MenuItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  @scala.inline
  implicit class MenuItemMutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
