package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.copy
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.create
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.delete
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.download
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.move
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.refresh
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rename
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.upload
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFileManager.ContextMenuItem
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerContextMenuItem
  extends StObject
     with dxContextMenuItem {
  
  /**
    * Configures settings of a context menu item&apos;s subitems.
    */
  @JSName("items")
  var items_dxFileManagerContextMenuItem: js.UndefOr[js.Array[ContextMenuItem]] = js.undefined
  
  /**
    * Specifies the context menu item&apos;s name.
    */
  var name: js.UndefOr[create | upload | refresh | download | move | copy | rename | delete | String] = js.undefined
  
  /**
    * 
    */
  @JSName("template")
  var template_dxFileManagerContextMenuItem: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
}
object dxFileManagerContextMenuItem {
  
  inline def apply(): dxFileManagerContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerContextMenuItem]
  }
  
  extension [Self <: dxFileManagerContextMenuItem](x: Self) {
    
    inline def setItems(value: js.Array[ContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ContextMenuItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: create | upload | refresh | download | move | copy | rename | delete | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction0(value: () => String | UserDefinedElement[Element]): Self = StObject.set(x, "template", js.Any.fromFunction0(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
