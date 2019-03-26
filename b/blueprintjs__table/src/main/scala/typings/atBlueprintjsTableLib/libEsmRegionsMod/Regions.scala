package typings
package atBlueprintjsTableLib.libEsmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/regions", "Regions")
@js.native
class Regions () extends js.Object

/* static members */
@JSImport("@blueprintjs/table/lib/esm/regions", "Regions")
@js.native
object Regions extends js.Object {
  /**
    * Adds the region to the end of a cloned copy of the supplied region
    * array.
    */
  def add(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ): js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] = js.native
  /**
    * Returns a region containing one or more cells.
    */
  def cell(row: scala.Double, col: scala.Double): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  def cell(row: scala.Double, col: scala.Double, row2: scala.Double): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  def cell(row: scala.Double, col: scala.Double, row2: scala.Double, col2: scala.Double): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * Clamps the region's start and end indices between 0 and the provided
    * maximum values.
    */
  def clampRegion(
    region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion,
    maxRowIndex: scala.Double,
    maxColumnIndex: scala.Double
  ): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * Returns a region containing one or more full columns.
    */
  def column(col: scala.Double): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  def column(col: scala.Double, col2: scala.Double): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * Returns true if the regions fully contain the query region.
    */
  def containsRegion(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    query: atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ): scala.Boolean = js.native
  /**
    * Returns a deep copy of the provided region.
    */
  def copy(region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * Iterates over the cells within an `IRegion`, invoking the callback with
    * each cell's coordinates.
    */
  /* private */ def eachCellInRegion(region: js.Any, numRows: js.Any, numCols: js.Any, iteratee: js.Any): js.Any = js.native
  def eachUniqueFullColumn(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    iteratee: js.Function1[/* col */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def eachUniqueFullRow(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    iteratee: js.Function1[/* row */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Using the supplied array of non-contiguous `IRegion`s, this method
    * returns an ordered array of every unique cell that exists in those
    * regions.
    */
  def enumerateUniqueCells(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    numRows: scala.Double,
    numCols: scala.Double
  ): js.Array[atBlueprintjsTableLib.libEsmRegionsMod.ICellCoordinate] = js.native
  /**
    * Expands an old region to the minimal bounding region that also contains
    * the new region. If the regions have different cardinalities, then the new
    * region is returned. Useful for expanding a selected region on
    * shift+click, for instance.
    */
  def expandRegion(
    oldRegion: atBlueprintjsTableLib.libEsmRegionsMod.IRegion,
    newRegion: atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * Returns the index of the region that wholly contains the supplied
    * parameter. Returns -1 if no such region is found.
    */
  def findContainingRegion(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ): scala.Double = js.native
  /**
    * Returns the index of the region that is equal to the supplied
    * parameter. Returns -1 if no such region is found.
    */
  def findMatchingRegion(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ): scala.Double = js.native
  /**
    * Returns the smallest single contiguous `IRegion` that contains all cells in the
    * supplied array.
    */
  def getBoundingRegion(cells: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.ICellCoordinate]): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * Using the supplied region, returns an "equivalent" region of
    * type CELLS that define the bounds of the given region
    */
  def getCellRegionFromRegion(
    region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion,
    numRows: scala.Double,
    numCols: scala.Double
  ): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  def getFocusCellCoordinatesFromRegion(region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion): atBlueprintjsTableLib.Anon_Col = js.native
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
  def getRegionCardinality(region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion): atBlueprintjsTableLib.libEsmRegionsMod.RegionCardinality = js.native
  /**
    * Returns true if the regions contain a region that has FULL_COLUMNS
    * cardinality and contains the specified column index.
    */
  def hasFullColumn(regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion], col: scala.Double): scala.Boolean = js.native
  /**
    * Returns true if the regions contain a region that has FULL_ROWS
    * cardinality and contains the specified row index.
    */
  def hasFullRow(regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion], row: scala.Double): scala.Boolean = js.native
  /**
    * Returns true if the regions contain a region that has FULL_TABLE cardinality
    */
  def hasFullTable(regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion]): scala.Boolean = js.native
  /* private */ def intervalContains(ivalA: js.Any, ivalB: js.Any): js.Any = js.native
  /* private */ def intervalContainsIndex(interval: js.Any, index: js.Any): js.Any = js.native
  /* private */ def intervalOverlaps(ivalA: js.Any, ivalB: js.Any): js.Any = js.native
  /* private */ def intervalsEqual(ivalA: js.Any, ivalB: js.Any): js.Any = js.native
  def isRegionValidForTable(
    region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion,
    numRows: scala.Double,
    numCols: scala.Double
  ): scala.Boolean = js.native
  def isValid(region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion): scala.Boolean = js.native
  def joinStyledRegionGroups(
    selectedRegions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    otherRegions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IStyledRegionGroup],
    focusedCell: atBlueprintjsTableLib.libEsmCommonCellMod.IFocusedCellCoordinates
  ): js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IStyledRegionGroup] = js.native
  /**
    * Returns true iff the specified region is equal to the last region in
    * the region list. This allows us to avoid immediate additive re-selection.
    */
  def lastRegionIsEqual(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ): scala.Boolean = js.native
  /* private */ def normalizeInterval(coord: js.Any): js.Any = js.native
  /* private */ def normalizeInterval(coord: js.Any, coord2: js.Any): js.Any = js.native
  /* private */ def numericalComparator(a: js.Any, b: js.Any): js.Any = js.native
  /**
    * Returns true if the regions at least partially overlap the query region.
    */
  def overlapsRegion(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    query: atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ): scala.Boolean = js.native
  def overlapsRegion(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    query: atBlueprintjsTableLib.libEsmRegionsMod.IRegion,
    allowPartialOverlap: scala.Boolean
  ): scala.Boolean = js.native
  /* private */ def regionContains(regionA: js.Any, regionB: js.Any): js.Any = js.native
  def regionsEqual(
    regionA: atBlueprintjsTableLib.libEsmRegionsMod.IRegion,
    regionB: atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ): scala.Boolean = js.native
  /**
    * Returns a region containing one or more full rows.
    */
  def row(row: scala.Double): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  def row(row: scala.Double, row2: scala.Double): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /* private */ def rowFirstComparator(a: js.Any, b: js.Any): js.Any = js.native
  /**
    * Maps a dense array of cell coordinates to a sparse 2-dimensional array
    * of cell values.
    *
    * We create a new 2-dimensional array representing the smallest single
    * contiguous `IRegion` that contains all cells in the supplied array. We
    * invoke the mapper callback only on the cells in the supplied coordinate
    * array and store the result. Returns the resulting 2-dimensional array.
    */
  def sparseMapCells[T](
    cells: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.ICellCoordinate],
    mapper: js.Function2[/* row */ scala.Double, /* col */ scala.Double, T]
  ): js.Array[js.Array[T]] = js.native
  /**
    * Returns a region containing the entire table.
    */
  def table(): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * Replaces the region at the end of a cloned copy of the supplied region
    * array, or at the specific index if one is provided.
    */
  def update(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ): js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] = js.native
  def update(
    regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion],
    region: atBlueprintjsTableLib.libEsmRegionsMod.IRegion,
    index: scala.Double
  ): js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] = js.native
}

