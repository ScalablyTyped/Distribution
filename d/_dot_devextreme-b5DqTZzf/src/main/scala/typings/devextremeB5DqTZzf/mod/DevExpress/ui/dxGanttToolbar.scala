package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.addTask
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.collapseAll
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.deleteTask
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.expandAll
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.fullScreen
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.redo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.resourceManager
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.separator
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.showDependencies
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.showResources
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.taskDetails
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.undo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.zoomIn
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.zoomOut
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxGantt.ToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttToolbar extends StObject {
  
  /**
    * Configures toolbar items&apos; settings.
    */
  var items: js.UndefOr[
    js.Array[
      ToolbarItem | separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | taskDetails | fullScreen | resourceManager | showResources | showDependencies
    ]
  ] = js.undefined
}
object dxGanttToolbar {
  
  inline def apply(): dxGanttToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttToolbar]
  }
  
  extension [Self <: dxGanttToolbar](x: Self) {
    
    inline def setItems(
      value: js.Array[
          ToolbarItem | separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | taskDetails | fullScreen | resourceManager | showResources | showDependencies
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (ToolbarItem | separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | taskDetails | fullScreen | resourceManager | showResources | showDependencies)*
    ): Self = StObject.set(x, "items", js.Array(value*))
  }
}
