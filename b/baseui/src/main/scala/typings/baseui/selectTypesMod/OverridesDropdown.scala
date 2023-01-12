package typings.baseui.selectTypesMod

import typings.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverridesDropdown extends StObject {
  
  var Dropdown: js.UndefOr[Override[Any]] = js.undefined
  
  var DropdownContainer: js.UndefOr[Override[Any]] = js.undefined
  
  var DropdownListItem: js.UndefOr[Override[Any]] = js.undefined
  
  var DropdownOption: js.UndefOr[Override[Any]] = js.undefined
  
  var OptionContent: js.UndefOr[Override[Any]] = js.undefined
  
  var StatefulMenu: js.UndefOr[Override[Any]] = js.undefined
}
object OverridesDropdown {
  
  inline def apply(): OverridesDropdown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverridesDropdown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverridesDropdown] (val x: Self) extends AnyVal {
    
    inline def setDropdown(value: Override[Any]): Self = StObject.set(x, "Dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownContainer(value: Override[Any]): Self = StObject.set(x, "DropdownContainer", value.asInstanceOf[js.Any])
    
    inline def setDropdownContainerUndefined: Self = StObject.set(x, "DropdownContainer", js.undefined)
    
    inline def setDropdownListItem(value: Override[Any]): Self = StObject.set(x, "DropdownListItem", value.asInstanceOf[js.Any])
    
    inline def setDropdownListItemUndefined: Self = StObject.set(x, "DropdownListItem", js.undefined)
    
    inline def setDropdownOption(value: Override[Any]): Self = StObject.set(x, "DropdownOption", value.asInstanceOf[js.Any])
    
    inline def setDropdownOptionUndefined: Self = StObject.set(x, "DropdownOption", js.undefined)
    
    inline def setDropdownUndefined: Self = StObject.set(x, "Dropdown", js.undefined)
    
    inline def setOptionContent(value: Override[Any]): Self = StObject.set(x, "OptionContent", value.asInstanceOf[js.Any])
    
    inline def setOptionContentUndefined: Self = StObject.set(x, "OptionContent", js.undefined)
    
    inline def setStatefulMenu(value: Override[Any]): Self = StObject.set(x, "StatefulMenu", value.asInstanceOf[js.Any])
    
    inline def setStatefulMenuUndefined: Self = StObject.set(x, "StatefulMenu", js.undefined)
  }
}
