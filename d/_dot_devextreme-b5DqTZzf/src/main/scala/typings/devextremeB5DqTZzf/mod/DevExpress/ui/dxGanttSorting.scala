package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.multiple
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.single_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttSorting extends StObject {
  
  /**
    * Specifies text for the context menu item that sets an ascending sort order in a column.
    */
  var ascendingText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the context menu item that clears sorting settings for a column.
    */
  var clearText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the context menu item that sets a descending sort order in a column.
    */
  var descendingText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies sort mode.
    */
  var mode: js.UndefOr[multiple | none | single_] = js.undefined
  
  /**
    * Specifies whether to display sort indexes in column headers. Applies only when sorting.mode is &apos;multiple&apos; and data is sorted by two or more columns.
    */
  var showSortIndexes: js.UndefOr[Boolean] = js.undefined
}
object dxGanttSorting {
  
  inline def apply(): dxGanttSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttSorting]
  }
  
  extension [Self <: dxGanttSorting](x: Self) {
    
    inline def setAscendingText(value: String): Self = StObject.set(x, "ascendingText", value.asInstanceOf[js.Any])
    
    inline def setAscendingTextUndefined: Self = StObject.set(x, "ascendingText", js.undefined)
    
    inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
    
    inline def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
    
    inline def setDescendingText(value: String): Self = StObject.set(x, "descendingText", value.asInstanceOf[js.Any])
    
    inline def setDescendingTextUndefined: Self = StObject.set(x, "descendingText", js.undefined)
    
    inline def setMode(value: multiple | none | single_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setShowSortIndexes(value: Boolean): Self = StObject.set(x, "showSortIndexes", value.asInstanceOf[js.Any])
    
    inline def setShowSortIndexesUndefined: Self = StObject.set(x, "showSortIndexes", js.undefined)
  }
}
