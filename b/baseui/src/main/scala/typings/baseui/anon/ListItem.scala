package typings.baseui.anon

import typings.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem extends StObject {
  
  var ChildMenuPopover: js.UndefOr[Override[Any]] = js.undefined
  
  var ListItem: js.UndefOr[Override[Any]] = js.undefined
  
  var ListItemAnchor: js.UndefOr[Override[Any]] = js.undefined
}
object ListItem {
  
  inline def apply(): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
    
    inline def setChildMenuPopover(value: Override[Any]): Self = StObject.set(x, "ChildMenuPopover", value.asInstanceOf[js.Any])
    
    inline def setChildMenuPopoverUndefined: Self = StObject.set(x, "ChildMenuPopover", js.undefined)
    
    inline def setListItem(value: Override[Any]): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
    
    inline def setListItemAnchor(value: Override[Any]): Self = StObject.set(x, "ListItemAnchor", value.asInstanceOf[js.Any])
    
    inline def setListItemAnchorUndefined: Self = StObject.set(x, "ListItemAnchor", js.undefined)
    
    inline def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
  }
}
