package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.after
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.before
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPopupToolbarItem extends StObject {
  
  /**
    * Specifies whether the toolbar item responds to user interaction.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the HTML markup to be inserted into the toolbar item element.
    */
  var html: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a location for the item on the toolbar.
    */
  var location: js.UndefOr[after | before | center] = js.undefined
  
  /**
    * Configures the DevExtreme UI component used as a toolbar item.
    */
  var options: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies a template that should be used to render this item only.
    */
  var template: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.core.template] = js.undefined
  
  /**
    * Specifies text displayed for the toolbar item.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the item is displayed on a top or bottom toolbar.
    */
  var toolbar: js.UndefOr[bottom | top] = js.undefined
  
  /**
    * Specifies whether or not a UI component item must be displayed.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A UI component that presents a toolbar item.
    */
  var widget: js.UndefOr[
    typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxAutocomplete | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxButton | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxCheckBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxDateBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxMenu | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxSelectBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxTabs | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxTextBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxButtonGroup | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxDropDownButton
  ] = js.undefined
}
object dxPopupToolbarItem {
  
  inline def apply(): dxPopupToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopupToolbarItem]
  }
  
  extension [Self <: dxPopupToolbarItem](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setLocation(value: after | before | center): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTemplate(value: template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setToolbar(value: bottom | top): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidget(
      value: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxAutocomplete | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxButton | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxCheckBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxDateBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxMenu | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxSelectBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxTabs | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxTextBox | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxButtonGroup | typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dxDropDownButton
    ): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
  }
}
