package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.addTask
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.collapseAll
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.deleteDependency
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.deleteTask
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.expandAll
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.redo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.resourceManager
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.taskDetails
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.undo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.zoomIn
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.zoomOut
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxGantt.ContextMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttContextMenu extends StObject {
  
  /**
    * Specifies whether the context menu is enabled in the UI component.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures context menu item settings.
    */
  var items: js.UndefOr[
    js.Array[
      ContextMenuItem | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails | resourceManager
    ]
  ] = js.undefined
}
object dxGanttContextMenu {
  
  inline def apply(): dxGanttContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttContextMenu]
  }
  
  extension [Self <: dxGanttContextMenu](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setItems(
      value: js.Array[
          ContextMenuItem | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails | resourceManager
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (ContextMenuItem | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails | resourceManager)*
    ): Self = StObject.set(x, "items", js.Array(value*))
  }
}
