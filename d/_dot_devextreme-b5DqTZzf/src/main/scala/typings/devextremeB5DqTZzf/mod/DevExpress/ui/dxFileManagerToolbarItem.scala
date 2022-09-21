package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.clearSelection
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.copy
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.create
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.delete
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.download
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.move
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.refresh
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rename
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.separator
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.showNavPane
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.switchView
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.upload
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerToolbarItem
  extends StObject
     with dxToolbarItem {
  
  /**
    * Specifies the icon to be displayed on the toolbar item.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the toolbar item&apos;s name.
    */
  var name: js.UndefOr[
    showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator | String
  ] = js.undefined
  
  /**
    * 
    */
  @JSName("template")
  var template_dxFileManagerToolbarItem: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
}
object dxFileManagerToolbarItem {
  
  inline def apply(): dxFileManagerToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerToolbarItem]
  }
  
  extension [Self <: dxFileManagerToolbarItem](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(
      value: showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator | String
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction0(value: () => String | UserDefinedElement[Element]): Self = StObject.set(x, "template", js.Any.fromFunction0(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
