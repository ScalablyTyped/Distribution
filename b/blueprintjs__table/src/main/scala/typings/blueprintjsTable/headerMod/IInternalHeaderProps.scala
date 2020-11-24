package typings.blueprintjsTable.headerMod

import typings.blueprintjsTable.dragTypesMod.IClientCoordinates
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.esmRegionsMod.RegionCardinality
import typings.blueprintjsTable.resizeHandleMod.Orientation
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInternalHeaderProps extends IHeaderProps {
  
  /**
    * Converts a point on the screen to a row or column index in the table grid.
    */
  var convertPointToIndex: js.UndefOr[
    js.Function2[/* clientXOrY */ Double, /* useMidpoint */ js.UndefOr[Boolean], Double]
  ] = js.native
  
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
  def headerCellRenderer(index: Double): Element = js.native
  
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
  var selectedRegions_IInternalHeaderProps: js.Array[IRegion] = js.native
  
  /**
    * Converts a range to a region. This should be Regions.column for column headers and
    * Regions.row for row headers.
    */
  def toRegion(index1: Double): IRegion = js.native
  def toRegion(index1: Double, index2: Double): IRegion = js.native
  
  /**
    * A callback that wraps the rendered cell components in additional parent elements as needed.
    */
  def wrapCells(cells: js.Array[ReactElement]): Element = js.native
}
