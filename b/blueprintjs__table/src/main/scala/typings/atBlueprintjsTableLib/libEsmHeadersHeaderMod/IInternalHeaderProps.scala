package typings
package atBlueprintjsTableLib.libEsmHeadersHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInternalHeaderProps extends IHeaderProps {
  /**
    * Converts a point on the screen to a row or column index in the table grid.
    */
  var convertPointToIndex: js.UndefOr[
    js.Function2[
      /* clientXOrY */ scala.Double, 
      /* useMidpoint */ js.UndefOr[scala.Boolean], 
      scala.Double
    ]
  ] = js.native
  /**
    * The cardinality of a fully selected region. Should be FULL_COLUMNS for column headers and
    * FULL_ROWS for row headers.
    */
  var fullRegionCardinality: atBlueprintjsTableLib.libEsmRegionsMod.RegionCardinality = js.native
  /**
    * An optional callback invoked when the user double-clicks a resize handle, if resizing is enabled.
    */
  var handleResizeDoubleClick: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Unit]] = js.native
  /**
    * The name of the header-cell prop specifying whether the header cell is reorderable or not.
    */
  var headerCellIsReorderablePropName: java.lang.String = js.native
  /**
    * The name of the header-cell prop specifying whether the header cell is selected or not.
    */
  var headerCellIsSelectedPropName: java.lang.String = js.native
  /**
    * The highest cell index to render.
    */
  var indexEnd: scala.Double = js.native
  /**
    * The lowest cell index to render.
    */
  var indexStart: scala.Double = js.native
  /**
    * The maximum permitted size of the header in pixels. Corresponds to a width for column headers and
    * a height for row headers.
    */
  var maxSize: scala.Double = js.native
  /**
    * The minimum permitted size of the header in pixels. Corresponds to a width for column headers and
    * a height for row headers.
    */
  var minSize: scala.Double = js.native
  /**
    * The orientation of the resize handle. Should be VERTICAL for column headers and HORIZONTAL
    * for row headers.
    */
  var resizeOrientation: atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.Orientation = js.native
  /**
    * An array containing the table's selection Regions.
    */
  @JSName("selectedRegions")
  var selectedRegions_IInternalHeaderProps: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] = js.native
  /**
    * Provides any extrema classes for the provided index range in the table grid.
    */
  def getCellExtremaClasses(index: scala.Double, indexEnd: scala.Double): js.Array[java.lang.String] = js.native
  /**
    * Provides the index class for the cell. Should be Classes.columnCellIndexClass for column
    * headers or Classes.rowCellIndexClass for row headers.
    */
  def getCellIndexClass(index: scala.Double): java.lang.String = js.native
  /**
    * Returns the size of the specified header cell in pixels. Corresponds to a width for column
    * headers and a height for row headers.
    */
  def getCellSize(index: scala.Double): scala.Double = js.native
  /**
    * Returns the relevant single coordinate from the provided client coordinates. Should return
    * the x coordinate for column headers and the y coordinate for row headers.
    */
  def getDragCoordinate(clientCoords: atBlueprintjsTableLib.libEsmInteractionsDraggableMod.IClientCoordinates): scala.Double = js.native
  /**
    * A callback that returns the CSS index class for the specified index. Should be
    * Classes.columnIndexClass for column headers and Classes.rowIndexClass for row headers.
    */
  def getIndexClass(index: scala.Double): java.lang.String = js.native
  /**
    * Given a mouse event, returns the relevant client coordinate (clientX or clientY). Should be
    * clientX for column headers and clientY for row headers.
    */
  def getMouseCoordinate(event: stdLib.MouseEvent): scala.Double = js.native
  /**
    * A callback that renders a ghost cell for the provided index.
    */
  def ghostCellRenderer(index: scala.Double, extremaClasses: js.Array[java.lang.String]): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
    * Invoked when a resize interaction ends, if resizing is enabled.
    */
  def handleResizeEnd(index: scala.Double, size: scala.Double): scala.Unit = js.native
  /**
    * Invoked whenever the size changes during a resize interaction, if resizing is enabled.
    */
  def handleSizeChanged(index: scala.Double, size: scala.Double): scala.Unit = js.native
  /**
    * A callback that renders a regular header cell at the provided index.
    */
  def headerCellRenderer(index: scala.Double): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
    * Returns true if the specified cell (and therefore the full column/row) is selected.
    */
  def isCellSelected(index: scala.Double): scala.Boolean = js.native
  /**
    * Returns true if the specified cell is at a ghost index.
    */
  def isGhostIndex(index: scala.Double): scala.Boolean = js.native
  /**
    * Converts a range to a region. This should be Regions.column for column headers and
    * Regions.row for row headers.
    */
  def toRegion(index1: scala.Double): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  def toRegion(index1: scala.Double, index2: scala.Double): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * A callback that wraps the rendered cell components in additional parent elements as needed.
    */
  def wrapCells(cells: js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]): reactLib.reactMod.Global.JSXNs.Element = js.native
}

