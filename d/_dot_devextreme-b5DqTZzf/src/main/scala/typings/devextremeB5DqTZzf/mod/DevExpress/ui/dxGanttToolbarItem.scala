package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.addTask
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.collapseAll
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.deleteTask
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.expandAll
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.fullScreen
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.redo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.resourceManager
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.separator
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.taskDetails
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.toggleDependencies
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.toggleResources
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.undo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.zoomIn
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.zoomOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttToolbarItem
  extends StObject
     with dxToolbarItem {
  
  /**
    * Specifies the toolbar item&apos;s name.
    */
  var name: js.UndefOr[
    separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | taskDetails | fullScreen | resourceManager | toggleResources | toggleDependencies | String
  ] = js.undefined
}
object dxGanttToolbarItem {
  
  inline def apply(): dxGanttToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttToolbarItem]
  }
  
  extension [Self <: dxGanttToolbarItem](x: Self) {
    
    inline def setName(
      value: separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | taskDetails | fullScreen | resourceManager | toggleResources | toggleDependencies | String
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
