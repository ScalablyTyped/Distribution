package typings.blueprintjsTable

import typings.blueprintjsTable.cellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.esmRegionsMod.Region
import typings.blueprintjsTable.esmRegionsMod.RegionCardinality
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.tablePropsMod.TableProps
import typings.blueprintjsTable.tableStateMod.TableSnapshot
import typings.blueprintjsTable.tableStateMod.TableState
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHotkeysMod {
  
  @JSImport("@blueprintjs/table/lib/esm/tableHotkeys", "TableHotkeys")
  @js.native
  open class TableHotkeys protected () extends StObject {
    def this(props: TableProps, state: TableState, tableHandlers: TableHandlers) = this()
    
    /* private */ var grid: Any = js.native
    
    def handleCopy(e: KeyboardEvent): Unit = js.native
    
    /* private */ var handleFocusMove: Any = js.native
    
    def handleFocusMoveDown(e: KeyboardEvent): Unit = js.native
    
    def handleFocusMoveDownInternal(e: KeyboardEvent): Unit = js.native
    
    /* private */ var handleFocusMoveInternal: Any = js.native
    
    def handleFocusMoveLeft(e: KeyboardEvent): Unit = js.native
    
    def handleFocusMoveLeftInternal(e: KeyboardEvent): Unit = js.native
    
    def handleFocusMoveRight(e: KeyboardEvent): Unit = js.native
    
    def handleFocusMoveRightInternal(e: KeyboardEvent): Unit = js.native
    
    def handleFocusMoveUp(e: KeyboardEvent): Unit = js.native
    
    def handleFocusMoveUpInternal(e: KeyboardEvent): Unit = js.native
    
    def handleSelectAllHotkey(e: KeyboardEvent): Unit = js.native
    
    /* private */ var handleSelectionResize: Any = js.native
    
    def handleSelectionResizeDown(e: KeyboardEvent): Unit = js.native
    
    def handleSelectionResizeLeft(e: KeyboardEvent): Unit = js.native
    
    def handleSelectionResizeRight(e: KeyboardEvent): Unit = js.native
    
    def handleSelectionResizeUp(e: KeyboardEvent): Unit = js.native
    
    /* private */ var moveFocusCell: Any = js.native
    
    /* private */ var props: Any = js.native
    
    /* private */ var scrollBodyToFocusedCell: Any = js.native
    
    /* private */ var selectAll: Any = js.native
    
    def setGrid(grid: Grid): Unit = js.native
    
    def setProps(props: TableProps): Unit = js.native
    
    def setState(state: TableState): Unit = js.native
    
    /* private */ var state: Any = js.native
    
    /* private */ var tableHandlers: Any = js.native
    
    /**
      * Replaces the selected region at the specified array index, with the
      * region provided.
      */
    /* private */ var updateSelectedRegionAtIndex: Any = js.native
  }
  
  trait TableHandlers extends StObject {
    
    def getEnabledSelectionHandler(selectionMode: RegionCardinality): js.Function1[/* selectedRegions */ js.Array[Region], Unit]
    
    def handleFocus(focusedCell: FocusedCellCoordinates): Unit
    
    def handleSelection(selectedRegions: js.Array[Region]): Unit
    
    def syncViewportPosition(snapshot: TableSnapshot): Unit
  }
  object TableHandlers {
    
    inline def apply(
      getEnabledSelectionHandler: RegionCardinality => js.Function1[/* selectedRegions */ js.Array[Region], Unit],
      handleFocus: FocusedCellCoordinates => Unit,
      handleSelection: js.Array[Region] => Unit,
      syncViewportPosition: TableSnapshot => Unit
    ): TableHandlers = {
      val __obj = js.Dynamic.literal(getEnabledSelectionHandler = js.Any.fromFunction1(getEnabledSelectionHandler), handleFocus = js.Any.fromFunction1(handleFocus), handleSelection = js.Any.fromFunction1(handleSelection), syncViewportPosition = js.Any.fromFunction1(syncViewportPosition))
      __obj.asInstanceOf[TableHandlers]
    }
    
    extension [Self <: TableHandlers](x: Self) {
      
      inline def setGetEnabledSelectionHandler(value: RegionCardinality => js.Function1[/* selectedRegions */ js.Array[Region], Unit]): Self = StObject.set(x, "getEnabledSelectionHandler", js.Any.fromFunction1(value))
      
      inline def setHandleFocus(value: FocusedCellCoordinates => Unit): Self = StObject.set(x, "handleFocus", js.Any.fromFunction1(value))
      
      inline def setHandleSelection(value: js.Array[Region] => Unit): Self = StObject.set(x, "handleSelection", js.Any.fromFunction1(value))
      
      inline def setSyncViewportPosition(value: TableSnapshot => Unit): Self = StObject.set(x, "syncViewportPosition", js.Any.fromFunction1(value))
    }
  }
}
