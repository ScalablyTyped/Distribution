package typings.baseui.menuTypesMod

import typings.baseui.overridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuOverrides extends StObject {
  
  var EmptyState: js.UndefOr[Override[Any]] = js.undefined
  
  var List: js.UndefOr[Override[Any]] = js.undefined
  
  var ListItem: js.UndefOr[Override[Any]] = js.undefined
  
  var MenuDivider: js.UndefOr[Override[Any]] = js.undefined
  
  var OptgroupHeader: js.UndefOr[Override[Any]] = js.undefined
  
  var Option: js.UndefOr[Override[Any]] = js.undefined
}
object MenuOverrides {
  
  inline def apply(): MenuOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOverrides]
  }
  
  extension [Self <: MenuOverrides](x: Self) {
    
    inline def setEmptyState(value: Override[Any]): Self = StObject.set(x, "EmptyState", value.asInstanceOf[js.Any])
    
    inline def setEmptyStateUndefined: Self = StObject.set(x, "EmptyState", js.undefined)
    
    inline def setList(value: Override[Any]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
    
    inline def setListItem(value: Override[Any]): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
    
    inline def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
    
    inline def setListUndefined: Self = StObject.set(x, "List", js.undefined)
    
    inline def setMenuDivider(value: Override[Any]): Self = StObject.set(x, "MenuDivider", value.asInstanceOf[js.Any])
    
    inline def setMenuDividerUndefined: Self = StObject.set(x, "MenuDivider", js.undefined)
    
    inline def setOptgroupHeader(value: Override[Any]): Self = StObject.set(x, "OptgroupHeader", value.asInstanceOf[js.Any])
    
    inline def setOptgroupHeaderUndefined: Self = StObject.set(x, "OptgroupHeader", js.undefined)
    
    inline def setOption(value: Override[Any]): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "Option", js.undefined)
  }
}
