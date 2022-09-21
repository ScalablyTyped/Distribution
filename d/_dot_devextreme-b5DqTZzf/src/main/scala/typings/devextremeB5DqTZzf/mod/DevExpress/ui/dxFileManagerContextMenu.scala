package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.copy
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.create
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.delete
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.download
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.move
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.refresh
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rename
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.upload
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFileManager.ContextMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerContextMenu extends StObject {
  
  /**
    * Configures context menu items&apos; settings.
    */
  var items: js.UndefOr[
    js.Array[
      ContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
    ]
  ] = js.undefined
}
object dxFileManagerContextMenu {
  
  inline def apply(): dxFileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerContextMenu]
  }
  
  extension [Self <: dxFileManagerContextMenu](x: Self) {
    
    inline def setItems(
      value: js.Array[
          ContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (ContextMenuItem | create | upload | refresh | download | move | copy | rename | delete)*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
