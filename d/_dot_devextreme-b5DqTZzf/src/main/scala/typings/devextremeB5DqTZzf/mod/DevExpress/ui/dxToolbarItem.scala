package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.after
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.always
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.auto
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.before
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inMenu
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.never
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxToolbarItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies a CSS class to be applied to the item.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies when to display an item in the toolbar&apos;s overflow menu.
    */
  var locateInMenu: js.UndefOr[always | auto | never] = js.undefined
  
  /**
    * Specifies a location for the item on the toolbar.
    */
  var location: js.UndefOr[after | before | center] = js.undefined
  
  /**
    * Specifies a template that should be used to render a menu item.
    */
  var menuItemTemplate: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
  
  /**
    * Configures the DevExtreme UI component used as a toolbar item.
    */
  var options: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies when to display the text for the UI component item.
    */
  var showText: js.UndefOr[always | inMenu] = js.undefined
  
  /**
    * A UI component that presents a toolbar item. To configure it, use the options object.
    */
  var widget: js.UndefOr[
    typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxAutocomplete | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxButton | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxCheckBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxDateBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxMenu | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxSelectBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxTabs | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxTextBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxButtonGroup | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxDropDownButton
  ] = js.undefined
}
object dxToolbarItem {
  
  inline def apply(): dxToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToolbarItem]
  }
  
  extension [Self <: dxToolbarItem](x: Self) {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setLocateInMenu(value: always | auto | never): Self = StObject.set(x, "locateInMenu", value.asInstanceOf[js.Any])
    
    inline def setLocateInMenuUndefined: Self = StObject.set(x, "locateInMenu", js.undefined)
    
    inline def setLocation(value: after | before | center): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMenuItemTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "menuItemTemplate", value.asInstanceOf[js.Any])
    
    inline def setMenuItemTemplateFunction0(value: () => String | UserDefinedElement[Element]): Self = StObject.set(x, "menuItemTemplate", js.Any.fromFunction0(value))
    
    inline def setMenuItemTemplateUndefined: Self = StObject.set(x, "menuItemTemplate", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setShowText(value: always | inMenu): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    inline def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    inline def setWidget(
      value: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxAutocomplete | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxButton | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxCheckBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxDateBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxMenu | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxSelectBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxTabs | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxTextBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxButtonGroup | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxDropDownButton
    ): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
  }
}
