package typings.atBlueprintjsTable.atBlueprintjsTableMod

import typings.atBlueprintjsTable.Anon_Col
import typings.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typings.atBlueprintjsTable.libEsmRegionsMod.ICellCoordinate
import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
import typings.atBlueprintjsTable.libEsmRegionsMod.IStyledRegionGroup
import typings.atBlueprintjsTable.libEsmRegionsMod.RegionCardinality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "Regions")
@js.native
class Regions ()
  extends typings.atBlueprintjsTable.libEsmRegionsMod.Regions

/* static members */
@JSImport("@blueprintjs/table", "Regions")
@js.native
object Regions extends js.Object {
  /**
    * Iterates over the cells within an `IRegion`, invoking the callback with
    * each cell's coordinates.
    */
  var eachCellInRegion: js.Any = js.native
  var intervalContains: js.Any = js.native
  var intervalContainsIndex: js.Any = js.native
  var intervalOverlaps: js.Any = js.native
  var intervalsEqual: js.Any = js.native
  var normalizeInterval: js.Any = js.native
  var numericalComparator: js.Any = js.native
  var regionContains: js.Any = js.native
  var rowFirstComparator: js.Any = js.native
  /**
    * Adds the region to the end of a cloned copy of the supplied region
    * array.
    */
  def add(regions: js.Array[IRegion], region: IRegion): js.Array[IRegion] = js.native
  /**
    * Returns a region containing one or more cells.
    */
  def cell(row: Double, col: Double): IRegion = js.native
  def cell(row: Double, col: Double, row2: Double): IRegion = js.native
  def cell(row: Double, col: Double, row2: Double, col2: Double): IRegion = js.native
  /**
    * Clamps the region's start and end indices between 0 and the provided
    * maximum values.
    */
  def clampRegion(region: IRegion, maxRowIndex: Double, maxColumnIndex: Double): IRegion = js.native
  /**
    * Returns a region containing one or more full columns.
    */
  def column(col: Double): IRegion = js.native
  def column(col: Double, col2: Double): IRegion = js.native
  /**
    * Returns true if the regions fully contain the query region.
    */
  def containsRegion(regions: js.Array[IRegion], query: IRegion): Boolean = js.native
  /**
    * Returns a deep copy of the provided region.
    */
  def copy(region: IRegion): IRegion = js.native
  def eachUniqueFullColumn(regions: js.Array[IRegion], iteratee: js.Function1[/* col */ Double, Unit]): Unit = js.native
  def eachUniqueFullRow(regions: js.Array[IRegion], iteratee: js.Function1[/* row */ Double, Unit]): Unit = js.native
  /**
    * Using the supplied array of non-contiguous `IRegion`s, this method
    * returns an ordered array of every unique cell that exists in those
    * regions.
    */
  def enumerateUniqueCells(regions: js.Array[IRegion], numRows: Double, numCols: Double): js.Array[ICellCoordinate] = js.native
  /**
    * Expands an old region to the minimal bounding region that also contains
    * the new region. If the regions have different cardinalities, then the new
    * region is returned. Useful for expanding a selected region on
    * shift+click, for instance.
    */
  def expandRegion(oldRegion: IRegion, newRegion: IRegion): IRegion = js.native
  /**
    * Returns the index of the region that wholly contains the supplied
    * parameter. Returns -1 if no such region is found.
    */
  def findContainingRegion(regions: js.Array[IRegion], region: IRegion): Double = js.native
  /**
    * Returns the index of the region that is equal to the supplied
    * parameter. Returns -1 if no such region is found.
    */
  def findMatchingRegion(regions: js.Array[IRegion], region: IRegion): Double = js.native
  /**
    * Returns the smallest single contiguous `IRegion` that contains all cells in the
    * supplied array.
    */
  def getBoundingRegion(cells: js.Array[ICellCoordinate]): IRegion = js.native
  /**
    * Using the supplied region, returns an "equivalent" region of
    * type CELLS that define the bounds of the given region
    */
  def getCellRegionFromRegion(region: IRegion, numRows: Double, numCols: Double): IRegion = js.native
  def getFocusCellCoordinatesFromRegion(region: IRegion): Anon_Col = js.native
  /**
    * Determines the cardinality of a region. We use null values to indicate
    * an unbounded interval. Therefore, an example of a region containing the
    * second and third columns would be:
    *
    * ```js
    * { rows: null, cols: [1, 2] }
    * ```
    *
    * In this case, this method would return `RegionCardinality.FULL_COLUMNS`.
    *
    * If both rows and columns are unbounded, then the region covers the
    * entire table. Therefore, a region like this:
    *
    * ```js
    * { rows: null, cols: null }
    * ```
    *
    * will return `RegionCardinality.FULL_TABLE`.
    *
    * An example of a region containing a single cell in the table would be:
    *
    * ```js
    * { rows: [5, 5], cols: [2, 2] }
    * ```
    *
    * In this case, this method would return `RegionCardinality.CELLS`.
    */
  def getRegionCardinality(region: IRegion): RegionCardinality = js.native
  /**
    * Returns true if the regions contain a region that has FULL_COLUMNS
    * cardinality and contains the specified column index.
    */
  def hasFullColumn(regions: js.Array[IRegion], col: Double): Boolean = js.native
  /**
    * Returns true if the regions contain a region that has FULL_ROWS
    * cardinality and contains the specified row index.
    */
  def hasFullRow(regions: js.Array[IRegion], row: Double): Boolean = js.native
  /**
    * Returns true if the regions contain a region that has FULL_TABLE cardinality
    */
  def hasFullTable(regions: js.Array[IRegion]): Boolean = js.native
  def isRegionValidForTable(region: IRegion, numRows: Double, numCols: Double): Boolean = js.native
  def isValid(region: IRegion): Boolean = js.native
  def joinStyledRegionGroups(
    selectedRegions: js.Array[IRegion],
    otherRegions: js.Array[IStyledRegionGroup],
    focusedCell: IFocusedCellCoordinates
  ): js.Array[IStyledRegionGroup] = js.native
  /**
    * Returns true iff the specified region is equal to the last region in
    * the region list. This allows us to avoid immediate additive re-selection.
    */
  def lastRegionIsEqual(regions: js.Array[IRegion], region: IRegion): Boolean = js.native
  /**
    * Returns true if the regions at least partially overlap the query region.
    */
  def overlapsRegion(regions: js.Array[IRegion], query: IRegion): Boolean = js.native
  def overlapsRegion(regions: js.Array[IRegion], query: IRegion, allowPartialOverlap: Boolean): Boolean = js.native
  def regionsEqual(regionA: IRegion, regionB: IRegion): Boolean = js.native
  /**
    * Returns a region containing one or more full rows.
    */
  def row(row: Double): IRegion = js.native
  def row(row: Double, row2: Double): IRegion = js.native
  /**
    * Maps a dense array of cell coordinates to a sparse 2-dimensional array
    * of cell values.
    *
    * We create a new 2-dimensional array representing the smallest single
    * contiguous `IRegion` that contains all cells in the supplied array. We
    * invoke the mapper callback only on the cells in the supplied coordinate
    * array and store the result. Returns the resulting 2-dimensional array.
    */
  def sparseMapCells[T](cells: js.Array[ICellCoordinate], mapper: js.Function2[/* row */ Double, /* col */ Double, T]): js.Array[js.Array[T]] = js.native
  /**
    * Returns a region containing the entire table.
    */
  def table(): IRegion = js.native
  /**
    * Replaces the region at the end of a cloned copy of the supplied region
    * array, or at the specific index if one is provided.
    */
  def update(regions: js.Array[IRegion], region: IRegion): js.Array[IRegion] = js.native
  def update(regions: js.Array[IRegion], region: IRegion, index: Double): js.Array[IRegion] = js.native
}

