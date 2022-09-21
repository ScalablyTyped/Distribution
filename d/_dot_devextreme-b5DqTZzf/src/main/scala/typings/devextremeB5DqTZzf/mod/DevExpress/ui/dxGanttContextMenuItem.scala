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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttContextMenuItem
  extends StObject
     with dxContextMenuItem {
  
  /**
    * Specifies the context menu item name.
    */
  var name: js.UndefOr[
    undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails | resourceManager | String
  ] = js.undefined
}
object dxGanttContextMenuItem {
  
  inline def apply(): dxGanttContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttContextMenuItem]
  }
  
  extension [Self <: dxGanttContextMenuItem](x: Self) {
    
    inline def setName(
      value: undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails | resourceManager | String
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
