package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsTable.anon.Loading
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.locatorMod.ILocator
import typings.blueprintjsTable.menuContextMod.IContextMenuRenderer
import typings.blueprintjsTable.menuContextMod.IMenuContext
import typings.blueprintjsTable.rectMod.Rect
import typings.blueprintjsTable.selectableMod.ISelectedRegionTransform
import typings.blueprintjsTable.tableBodyCellsMod.ITableBodyCellsProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBodyMod {
  
  @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
  @js.native
  class TableBody protected ()
    extends AbstractComponent2[ITableBodyProps, js.Object, js.Object] {
    def this(props: ITableBodyProps) = this()
    def this(props: ITableBodyProps, context: js.Any) = this()
    
    var activationCell: js.Any = js.native
    
    var handleSelectionEnd: js.Any = js.native
    
    var locateClick: js.Any = js.native
    
    var locateDrag: js.Any = js.native
    
    def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): Element = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTableBody(nextProps: ITableBodyProps): Boolean = js.native
  }
  /* static members */
  object TableBody {
    
    @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody.cellClassNames")
    @js.native
    def cellClassNames(rowIndex: Double, columnIndex: Double): js.Array[String] = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody.defaultProps")
    @js.native
    def defaultProps: Loading = js.native
    @scala.inline
    def defaultProps_=(x: Loading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsTable.selectableMod.ISelectableProps because var conflicts: focusedCell. Inlined enableMultipleSelection, onFocusedCell, onSelection, onSelectionEnd, selectedRegions, selectedRegionTransform */ @js.native
  trait ITableBodyProps extends ITableBodyCellsProps {
    
    /**
      * An optional callback for displaying a context menu when right-clicking
      * on the table body. The callback is supplied with an `IMenuContext`
      * containing the `IRegion`s of interest.
      */
    var bodyContextMenuRenderer: js.UndefOr[IContextMenuRenderer] = js.native
    
    /**
      * If `false`, only a single region of a single column/row/cell may be
      * selected at one time. Using `ctrl` or `meta` key will have no effect,
      * and a mouse drag will select the current column/row/cell only.
      * @default false
      */
    var enableMultipleSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Locates the row/column/cell given a mouse event.
      */
    var locator: ILocator = js.native
    
    /**
      * The number of columns to freeze to the left side of the table, counting from the leftmost column.
      */
    var numFrozenColumns: js.UndefOr[Double] = js.native
    
    /**
      * The number of rows to freeze to the top of the table, counting from the topmost row.
      */
    var numFrozenRows: js.UndefOr[Double] = js.native
    
    /**
      * When the user focuses something, this callback is called with new
      * focused cell coordinates. This should be considered the new focused cell
      * state for the entire table.
      */
    def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit = js.native
    
    /**
      * When the user selects something, this callback is called with a new
      * array of `Region`s. This array should be considered the new selection
      * state for the entire table.
      */
    def onSelection(regions: js.Array[IRegion]): Unit = js.native
    
    /**
      * An additional convenience callback invoked when the user releases the
      * mouse from either a click or a drag, indicating that the selection
      * interaction has ended.
      */
    var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
    
    /**
      * An optional transform function that will be applied to the located
      * `Region`.
      *
      * This allows you to, for example, convert cell `Region`s into row
      * `Region`s while maintaining the existing multi-select and meta-click
      * functionality.
      */
    var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.native
    
    /**
      * An array containing the table's selection Regions.
      * @default []
      */
    var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
  }
  object ITableBodyProps {
    
    @scala.inline
    def apply(
      cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement,
      columnIndexEnd: Double,
      columnIndexStart: Double,
      grid: Grid,
      loading: Boolean,
      locator: ILocator,
      onFocusedCell: IFocusedCellCoordinates => Unit,
      onSelection: js.Array[IRegion] => Unit,
      rowIndexEnd: Double,
      rowIndexStart: Double,
      viewportRect: Rect
    ): ITableBodyProps = {
      val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection), rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITableBodyProps]
    }
    
    @scala.inline
    implicit class ITableBodyPropsMutableBuilder[Self <: ITableBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyContextMenuRenderer(value: /* context */ IMenuContext => Element): Self = StObject.set(x, "bodyContextMenuRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyContextMenuRendererUndefined: Self = StObject.set(x, "bodyContextMenuRenderer", js.undefined)
      
      @scala.inline
      def setEnableMultipleSelection(value: Boolean): Self = StObject.set(x, "enableMultipleSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMultipleSelectionUndefined: Self = StObject.set(x, "enableMultipleSelection", js.undefined)
      
      @scala.inline
      def setLocator(value: ILocator): Self = StObject.set(x, "locator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumFrozenColumns(value: Double): Self = StObject.set(x, "numFrozenColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumFrozenColumnsUndefined: Self = StObject.set(x, "numFrozenColumns", js.undefined)
      
      @scala.inline
      def setNumFrozenRows(value: Double): Self = StObject.set(x, "numFrozenRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumFrozenRowsUndefined: Self = StObject.set(x, "numFrozenRows", js.undefined)
      
      @scala.inline
      def setOnFocusedCell(value: IFocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelection(value: js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelectionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionEndUndefined: Self = StObject.set(x, "onSelectionEnd", js.undefined)
      
      @scala.inline
      def setSelectedRegionTransform(
        value: (/* region */ IRegion, /* event */ typings.std.MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
      ): Self = StObject.set(x, "selectedRegionTransform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSelectedRegionTransformUndefined: Self = StObject.set(x, "selectedRegionTransform", js.undefined)
      
      @scala.inline
      def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
      
      @scala.inline
      def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
    }
  }
}
