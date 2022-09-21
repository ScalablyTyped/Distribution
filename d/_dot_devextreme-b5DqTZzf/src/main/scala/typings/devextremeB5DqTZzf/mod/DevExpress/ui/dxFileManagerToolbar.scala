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
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFileManager.ToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerToolbar extends StObject {
  
  /**
    * Configures settings of the toolbar items that are visible when users select files.
    */
  var fileSelectionItems: js.UndefOr[
    js.Array[
      ToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
    ]
  ] = js.undefined
  
  /**
    * Configures toolbar items&apos; settings.
    */
  var items: js.UndefOr[
    js.Array[
      ToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
    ]
  ] = js.undefined
}
object dxFileManagerToolbar {
  
  inline def apply(): dxFileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerToolbar]
  }
  
  extension [Self <: dxFileManagerToolbar](x: Self) {
    
    inline def setFileSelectionItems(
      value: js.Array[
          ToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
        ]
    ): Self = StObject.set(x, "fileSelectionItems", value.asInstanceOf[js.Any])
    
    inline def setFileSelectionItemsUndefined: Self = StObject.set(x, "fileSelectionItems", js.undefined)
    
    inline def setFileSelectionItemsVarargs(
      value: (ToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator)*
    ): Self = StObject.set(x, "fileSelectionItems", js.Array(value*))
    
    inline def setItems(
      value: js.Array[
          ToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (ToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator)*
    ): Self = StObject.set(x, "items", js.Array(value*))
  }
}
