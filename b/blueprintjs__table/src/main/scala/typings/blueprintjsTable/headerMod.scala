package typings.blueprintjsTable

import typings.blueprintjsTable.cellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.commonMod.Grid
import typings.blueprintjsTable.dragTypesMod.IClientCoordinates
import typings.blueprintjsTable.esmRegionsMod.Region
import typings.blueprintjsTable.esmRegionsMod.RegionCardinality
import typings.blueprintjsTable.locatorMod.ILocator
import typings.blueprintjsTable.reorderableMod.IReorderableProps
import typings.blueprintjsTable.resizeHandleMod.ILockableLayout
import typings.blueprintjsTable.resizeHandleMod.Orientation
import typings.blueprintjsTable.selectableMod.ISelectedRegionTransform
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/header", "Header")
  @js.native
  open class Header protected () extends Component[IInternalHeaderProps, IHeaderState, Any] {
    def this(props: IInternalHeaderProps) = this()
    
    /* protected */ var activationIndex: Double | Null = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MHeader(_underscore: IInternalHeaderProps, prevState: IHeaderState): Unit = js.native
    
    /* private */ var convertEventToIndex: Any = js.native
    
    /* private */ var handleDragSelectableSelection: Any = js.native
    
    /* private */ var handleDragSelectableSelectionEnd: Any = js.native
    
    /* private */ var isColumnHeader: Any = js.native
    
    /* private */ var isDragReorderableDisabled: Any = js.native
    
    /* private */ var isDragSelectableDisabled: Any = js.native
    
    /* private */ var isEntireCellTargetReorderable: Any = js.native
    
    /* private */ var isReorderHandleEnabled: Any = js.native
    
    /* private */ var isSelectedRegionsControlledAndNonEmpty: Any = js.native
    
    /* private */ var locateClick: Any = js.native
    
    /* private */ var locateDragForReordering: Any = js.native
    
    /* private */ var locateDragForSelection: Any = js.native
    
    /* private */ var maybeRenderReorderHandle: Any = js.native
    
    /* private */ var renderCell: Any = js.native
    
    /* private */ var renderCells: Any = js.native
    
    /* private */ var renderNewCell: Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MHeader(nextProps: IInternalHeaderProps, nextState: IHeaderState): Boolean = js.native
    
    /* private */ var wrapInDragReorderable: Any = js.native
  }
  
  type IHeaderCellRenderer = js.Function1[/* index */ Double, ReactElement]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsTable.selectableMod.ISelectableProps because var conflicts: selectedRegions. Inlined enableMultipleSelection, focusedCell, onSelectionEnd, selectedRegionTransform */ @js.native
  trait IHeaderProps
    extends StObject
       with ILockableLayout
       with IReorderableProps {
    
    /**
      * If `false`, only a single region of a single column/row/cell may be
      * selected at one time. Using `ctrl` or `meta` key will have no effect,
      * and a mouse drag will select the current column/row/cell only.
      *
      * @default false
      */
    var enableMultipleSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * The currently focused cell.
      */
    var focusedCell: js.UndefOr[FocusedCellCoordinates] = js.native
    
    /**
      * The grid computes sizes of cells, rows, or columns from the
      * configurable `columnWidths` and `rowHeights`.
      */
    var grid: Grid = js.native
    
    /**
      * Enables/disables the resize interaction.
      *
      * @default true
      */
    var isResizable: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, all header cells render their loading state except for those
      * who have their `loading` prop explicitly set to false.
      *
      * @default false;
      */
    var loading: js.UndefOr[Boolean] = js.native
    
    /**
      * Locates the row/column/cell given a mouse event.
      */
    var locator: ILocator = js.native
    
    /**
      * This callback is called while the user is resizing a header cell. The guides
      * array contains pixel offsets for where to display the resize guides in
      * the table body's overlay layer. `guides` will be null if this is the end
      * or cancellation of a resize interaction.
      */
    def onResizeGuide(): Unit = js.native
    def onResizeGuide(guides: js.Array[Double]): Unit = js.native
    
    /**
      * An additional convenience callback invoked when the user releases the
      * mouse from either a click or a drag, indicating that the selection
      * interaction has ended.
      */
    var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[Region], Unit]] = js.native
    
    /**
      * An optional transform function that will be applied to the located
      * `Region`.
      *
      * This allows you to, for example, convert cell `Region`s into row
      * `Region`s while maintaining the existing multi-select and meta-click
      * functionality.
      */
    var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.native
  }
  
  trait IHeaderState extends StObject {
    
    /**
      * Whether the component has a valid selection specified either via props
      * (i.e. controlled mode) or via a completed drag-select interaction. When
      * true, DragReorderable will know that it can override the click-and-drag
      * interactions that would normally be reserved for drag-select behavior.
      */
    var hasValidSelection: Boolean
  }
  object IHeaderState {
    
    inline def apply(hasValidSelection: Boolean): IHeaderState = {
      val __obj = js.Dynamic.literal(hasValidSelection = hasValidSelection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHeaderState]
    }
    
    extension [Self <: IHeaderState](x: Self) {
      
      inline def setHasValidSelection(value: Boolean): Self = StObject.set(x, "hasValidSelection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IInternalHeaderProps
    extends StObject
       with IHeaderProps {
    
    /**
      * Converts a point on the screen to a row or column index in the table grid.
      */
    def convertPointToIndex(clientXOrY: Double): Double = js.native
    def convertPointToIndex(clientXOrY: Double, useMidpoint: Boolean): Double = js.native
    
    /**
      * The cardinality of a fully selected region. Should be FULL_COLUMNS for column headers and
      * FULL_ROWS for row headers.
      */
    var fullRegionCardinality: RegionCardinality = js.native
    
    /**
      * Provides any extrema classes for the provided index range in the table grid.
      */
    def getCellExtremaClasses(index: Double, indexEnd: Double): js.Array[String] = js.native
    
    /**
      * Provides the index class for the cell. Should be Classes.columnCellIndexClass for column
      * headers or Classes.rowCellIndexClass for row headers.
      */
    def getCellIndexClass(index: Double): String = js.native
    
    /**
      * Returns the size of the specified header cell in pixels. Corresponds to a width for column
      * headers and a height for row headers.
      */
    def getCellSize(index: Double): Double = js.native
    
    /**
      * Returns the relevant single coordinate from the provided client coordinates. Should return
      * the x coordinate for column headers and the y coordinate for row headers.
      */
    def getDragCoordinate(clientCoords: IClientCoordinates): Double = js.native
    
    /**
      * A callback that returns the CSS index class for the specified index. Should be
      * Classes.columnIndexClass for column headers and Classes.rowIndexClass for row headers.
      */
    def getIndexClass(index: Double): String = js.native
    
    /**
      * Given a mouse event, returns the relevant client coordinate (clientX or clientY). Should be
      * clientX for column headers and clientY for row headers.
      */
    def getMouseCoordinate(event: MouseEvent): Double = js.native
    
    /**
      * A callback that renders a ghost cell for the provided index.
      */
    def ghostCellRenderer(index: Double, extremaClasses: js.Array[String]): Element = js.native
    
    /**
      * An optional callback invoked when the user double-clicks a resize handle, if resizing is enabled.
      */
    var handleResizeDoubleClick: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
    
    /**
      * Invoked when a resize interaction ends, if resizing is enabled.
      */
    def handleResizeEnd(index: Double, size: Double): Unit = js.native
    
    /**
      * Invoked whenever the size changes during a resize interaction, if resizing is enabled.
      */
    def handleSizeChanged(index: Double, size: Double): Unit = js.native
    
    /**
      * The name of the header-cell prop specifying whether the header cell is reorderable or not.
      */
    var headerCellIsReorderablePropName: String = js.native
    
    /**
      * The name of the header-cell prop specifying whether the header cell is selected or not.
      */
    var headerCellIsSelectedPropName: String = js.native
    
    /**
      * A callback that renders a regular header cell at the provided index.
      */
    def headerCellRenderer(index: Double): Element | Null = js.native
    
    /**
      * The highest cell index to render.
      */
    var indexEnd: Double = js.native
    
    /**
      * The lowest cell index to render.
      */
    var indexStart: Double = js.native
    
    /**
      * Returns true if the specified cell (and therefore the full column/row) is selected.
      */
    def isCellSelected(index: Double): Boolean = js.native
    
    /**
      * Returns true if the specified cell is at a ghost index.
      */
    def isGhostIndex(index: Double): Boolean = js.native
    
    /**
      * The maximum permitted size of the header in pixels. Corresponds to a width for column headers and
      * a height for row headers.
      */
    var maxSize: Double = js.native
    
    /**
      * The minimum permitted size of the header in pixels. Corresponds to a width for column headers and
      * a height for row headers.
      */
    var minSize: Double = js.native
    
    /**
      * The orientation of the resize handle. Should be VERTICAL for column headers and HORIZONTAL
      * for row headers.
      */
    var resizeOrientation: Orientation = js.native
    
    /**
      * An array containing the table's selection Regions.
      */
    @JSName("selectedRegions")
    var selectedRegions_IInternalHeaderProps: js.Array[Region] = js.native
    
    /**
      * Converts a range to a region. This should be Regions.column for column headers and
      * Regions.row for row headers.
      */
    def toRegion(index1: Double): Region = js.native
    def toRegion(index1: Double, index2: Double): Region = js.native
    
    /**
      * A callback that wraps the rendered cell components in additional parent elements as needed.
      */
    def wrapCells(cells: js.Array[ReactElement]): Element = js.native
  }
}
