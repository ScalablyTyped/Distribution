package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxListItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies the text of a badge displayed for the list item.
    */
  var badge: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the list item&apos;s icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the list items group in a grouped list.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not to display a chevron for the list item.
    */
  var showChevron: js.UndefOr[Boolean] = js.undefined
}
object dxListItem {
  
  inline def apply(): dxListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxListItem]
  }
  
  extension [Self <: dxListItem](x: Self) {
    
    inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setShowChevron(value: Boolean): Self = StObject.set(x, "showChevron", value.asInstanceOf[js.Any])
    
    inline def setShowChevronUndefined: Self = StObject.set(x, "showChevron", js.undefined)
  }
}
