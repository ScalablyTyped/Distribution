package typings.blueprintjsTable

import typings.blueprintjsTable.anon.Col
import typings.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmRegionsMod {
  
  @js.native
  sealed trait ColumnLoadingOption extends StObject
  @JSImport("@blueprintjs/table/lib/esm/regions", "ColumnLoadingOption")
  @js.native
  object ColumnLoadingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColumnLoadingOption & String] = js.native
    
    @js.native
    sealed trait CELLS
      extends StObject
         with ColumnLoadingOption
    /* "cells" */ val CELLS: typings.blueprintjsTable.libEsmRegionsMod.ColumnLoadingOption.CELLS & String = js.native
    
    @js.native
    sealed trait HEADER
      extends StObject
         with ColumnLoadingOption
    /* "column-header" */ val HEADER: typings.blueprintjsTable.libEsmRegionsMod.ColumnLoadingOption.HEADER & String = js.native
  }
  
  @js.native
  sealed trait RegionCardinality extends StObject
  @JSImport("@blueprintjs/table/lib/esm/regions", "RegionCardinality")
  @js.native
  object RegionCardinality extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RegionCardinality & String] = js.native
    
    /**
      * A region that contains a finite rectangular group of table cells
      */
    @js.native
    sealed trait CELLS
      extends StObject
         with RegionCardinality
    /* "cells" */ val CELLS: typings.blueprintjsTable.libEsmRegionsMod.RegionCardinality.CELLS & String = js.native
    
    /**
      * A region that represents all cells within 1 or more columns.
      */
    @js.native
    sealed trait FULL_COLUMNS
      extends StObject
         with RegionCardinality
    /* "full-columns" */ val FULL_COLUMNS: typings.blueprintjsTable.libEsmRegionsMod.RegionCardinality.FULL_COLUMNS & String = js.native
    
    /**
      * A region that represents all cells within 1 or more rows.
      */
    @js.native
    sealed trait FULL_ROWS
      extends StObject
         with RegionCardinality
    /* "full-rows" */ val FULL_ROWS: typings.blueprintjsTable.libEsmRegionsMod.RegionCardinality.FULL_ROWS & String = js.native
    
    /**
      * A region that represents all cells in the table.
      */
    @js.native
    sealed trait FULL_TABLE
      extends StObject
         with RegionCardinality
    /* "full-table" */ val FULL_TABLE: typings.blueprintjsTable.libEsmRegionsMod.RegionCardinality.FULL_TABLE & String = js.native
  }
  
  @JSImport("@blueprintjs/table/lib/esm/regions", "Regions")
  @js.native
  open class Regions () extends StObject
  /* static members */
  object Regions {
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the region to the end of a cloned copy of the supplied region
      * array.
      */
    inline def add(regions: js.Array[Region], region: Region): js.Array[IRegion] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRegion]]
    
    /**
      * Returns a region containing one or more cells.
      */
    inline def cell(row: Double, col: Double): NonNullRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("cell")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[NonNullRegion]
    inline def cell(row: Double, col: Double, row2: Double): NonNullRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("cell")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], row2.asInstanceOf[js.Any])).asInstanceOf[NonNullRegion]
    inline def cell(row: Double, col: Double, row2: Double, col2: Double): NonNullRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("cell")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], row2.asInstanceOf[js.Any], col2.asInstanceOf[js.Any])).asInstanceOf[NonNullRegion]
    inline def cell(row: Double, col: Double, row2: Unit, col2: Double): NonNullRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("cell")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], row2.asInstanceOf[js.Any], col2.asInstanceOf[js.Any])).asInstanceOf[NonNullRegion]
    
    /**
      * Clamps the region's start and end indices between 0 and the provided
      * maximum values.
      */
    inline def clampRegion(region: Region, maxRowIndex: Double, maxColumnIndex: Double): IRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("clampRegion")(region.asInstanceOf[js.Any], maxRowIndex.asInstanceOf[js.Any], maxColumnIndex.asInstanceOf[js.Any])).asInstanceOf[IRegion]
    
    /**
      * Returns a region containing one or more full columns.
      */
    inline def column(col: Double): Region = ^.asInstanceOf[js.Dynamic].applyDynamic("column")(col.asInstanceOf[js.Any]).asInstanceOf[Region]
    inline def column(col: Double, col2: Double): Region = (^.asInstanceOf[js.Dynamic].applyDynamic("column")(col.asInstanceOf[js.Any], col2.asInstanceOf[js.Any])).asInstanceOf[Region]
    
    /**
      * Returns true if the regions fully contain the query region.
      */
    inline def containsRegion(regions: js.Array[Region], query: Region): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsRegion")(regions.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns a deep copy of the provided region.
      */
    inline def copy(region: Region): Region = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(region.asInstanceOf[js.Any]).asInstanceOf[Region]
    
    /**
      * Iterates over the cells within an `Region`, invoking the callback with
      * each cell's coordinates.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.eachCellInRegion")
    @js.native
    def eachCellInRegion: Any = js.native
    inline def eachCellInRegion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eachCellInRegion")(x.asInstanceOf[js.Any])
    
    inline def eachUniqueFullColumn(regions: js.Array[Region], iteratee: js.Function1[/* col */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachUniqueFullColumn")(regions.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def eachUniqueFullRow(regions: js.Array[Region], iteratee: js.Function1[/* row */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachUniqueFullRow")(regions.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Using the supplied array of non-contiguous `Region`s, this method
      * returns an ordered array of every unique cell that exists in those
      * regions.
      */
    inline def enumerateUniqueCells(regions: js.Array[Region], numRows: Double, numCols: Double): js.Array[CellCoordinate] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateUniqueCells")(regions.asInstanceOf[js.Any], numRows.asInstanceOf[js.Any], numCols.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellCoordinate]]
    inline def enumerateUniqueCells(regions: Null, numRows: Double, numCols: Double): js.Array[CellCoordinate] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateUniqueCells")(regions.asInstanceOf[js.Any], numRows.asInstanceOf[js.Any], numCols.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellCoordinate]]
    inline def enumerateUniqueCells(regions: Unit, numRows: Double, numCols: Double): js.Array[CellCoordinate] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateUniqueCells")(regions.asInstanceOf[js.Any], numRows.asInstanceOf[js.Any], numCols.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellCoordinate]]
    
    /**
      * Expands an old region to the minimal bounding region that also contains
      * the new region. If the regions have different cardinalities, then the new
      * region is returned. Useful for expanding a selected region on
      * shift+click, for instance.
      */
    inline def expandRegion(oldRegion: Region, newRegion: Region): Region = (^.asInstanceOf[js.Dynamic].applyDynamic("expandRegion")(oldRegion.asInstanceOf[js.Any], newRegion.asInstanceOf[js.Any])).asInstanceOf[Region]
    
    /**
      * Returns the index of the region that wholly contains the supplied
      * parameter. Returns -1 if no such region is found.
      */
    inline def findContainingRegion(regions: js.Array[Region], region: Region): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findContainingRegion")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findContainingRegion(regions: Null, region: Region): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findContainingRegion")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findContainingRegion(regions: Unit, region: Region): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findContainingRegion")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the index of the region that is equal to the supplied
      * parameter. Returns -1 if no such region is found.
      */
    inline def findMatchingRegion(regions: js.Array[Region], region: Region): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchingRegion")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findMatchingRegion(regions: Null, region: Region): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchingRegion")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findMatchingRegion(regions: Unit, region: Region): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchingRegion")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the smallest single contiguous `Region` that contains all cells in the
      * supplied array.
      */
    inline def getBoundingRegion(cells: js.Array[CellCoordinate]): js.UndefOr[NonNullRegion] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingRegion")(cells.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NonNullRegion]]
    
    /**
      * Using the supplied region, returns an "equivalent" region of
      * type CELLS that define the bounds of the given region
      */
    inline def getCellRegionFromRegion(region: Region, numRows: Double, numCols: Double): NonNullRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellRegionFromRegion")(region.asInstanceOf[js.Any], numRows.asInstanceOf[js.Any], numCols.asInstanceOf[js.Any])).asInstanceOf[NonNullRegion]
    
    inline def getFocusCellCoordinatesFromRegion(region: Region): Col = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusCellCoordinatesFromRegion")(region.asInstanceOf[js.Any]).asInstanceOf[Col]
    
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
    inline def getRegionCardinality(region: Region): RegionCardinality = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegionCardinality")(region.asInstanceOf[js.Any]).asInstanceOf[RegionCardinality]
    
    /**
      * Returns true if the regions contain a region that has FULL_COLUMNS
      * cardinality and contains the specified column index.
      */
    inline def hasFullColumn(regions: js.Array[Region], col: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFullColumn")(regions.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasFullColumn(regions: Null, col: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFullColumn")(regions.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasFullColumn(regions: Unit, col: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFullColumn")(regions.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns true if the regions contain a region that has FULL_ROWS
      * cardinality and contains the specified row index.
      */
    inline def hasFullRow(regions: js.Array[Region], row: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFullRow")(regions.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasFullRow(regions: Null, row: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFullRow")(regions.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasFullRow(regions: Unit, row: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFullRow")(regions.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns true if the regions contain a region that has FULL_TABLE cardinality
      */
    inline def hasFullTable(regions: js.Array[Region]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFullTable")(regions.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.intervalContains")
    @js.native
    def intervalContains: Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.intervalContainsIndex")
    @js.native
    def intervalContainsIndex: Any = js.native
    inline def intervalContainsIndex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalContainsIndex")(x.asInstanceOf[js.Any])
    
    inline def intervalContains_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalContains")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.intervalOverlaps")
    @js.native
    def intervalOverlaps: Any = js.native
    inline def intervalOverlaps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalOverlaps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.intervalsEqual")
    @js.native
    def intervalsEqual: Any = js.native
    inline def intervalsEqual_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalsEqual")(x.asInstanceOf[js.Any])
    
    inline def isRegionValidForTable(region: Region, numRows: Double, numCols: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRegionValidForTable")(region.asInstanceOf[js.Any], numRows.asInstanceOf[js.Any], numCols.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isValid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")().asInstanceOf[Boolean]
    inline def isValid(region: Region): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(region.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def joinStyledRegionGroups(selectedRegions: js.Array[Region], otherRegions: js.Array[StyledRegionGroup]): js.Array[IStyledRegionGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinStyledRegionGroups")(selectedRegions.asInstanceOf[js.Any], otherRegions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IStyledRegionGroup]]
    inline def joinStyledRegionGroups(
      selectedRegions: js.Array[Region],
      otherRegions: js.Array[StyledRegionGroup],
      focusedCell: FocusedCellCoordinates
    ): js.Array[IStyledRegionGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinStyledRegionGroups")(selectedRegions.asInstanceOf[js.Any], otherRegions.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[js.Array[IStyledRegionGroup]]
    
    /**
      * Returns true iff the specified region is equal to the last region in
      * the region list. This allows us to avoid immediate additive re-selection.
      */
    inline def lastRegionIsEqual(regions: js.Array[Region], region: Region): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lastRegionIsEqual")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def lastRegionIsEqual(regions: Null, region: Region): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lastRegionIsEqual")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def lastRegionIsEqual(regions: Unit, region: Region): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lastRegionIsEqual")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.normalizeInterval")
    @js.native
    def normalizeInterval: Any = js.native
    inline def normalizeInterval_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizeInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.numericalComparator")
    @js.native
    def numericalComparator: Any = js.native
    inline def numericalComparator_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numericalComparator")(x.asInstanceOf[js.Any])
    
    /**
      * Returns true if the regions at least partially overlap the query region.
      */
    inline def overlapsRegion(regions: js.Array[Region], query: Region): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("overlapsRegion")(regions.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def overlapsRegion(regions: js.Array[Region], query: Region, allowPartialOverlap: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("overlapsRegion")(regions.asInstanceOf[js.Any], query.asInstanceOf[js.Any], allowPartialOverlap.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.regionContains")
    @js.native
    def regionContains: Any = js.native
    inline def regionContains_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regionContains")(x.asInstanceOf[js.Any])
    
    inline def regionsEqual(regionA: Region, regionB: Region): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("regionsEqual")(regionA.asInstanceOf[js.Any], regionB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns a region containing one or more full rows.
      */
    inline def row(row: Double): Region = ^.asInstanceOf[js.Dynamic].applyDynamic("row")(row.asInstanceOf[js.Any]).asInstanceOf[Region]
    inline def row(row: Double, row2: Double): Region = (^.asInstanceOf[js.Dynamic].applyDynamic("row")(row.asInstanceOf[js.Any], row2.asInstanceOf[js.Any])).asInstanceOf[Region]
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.rowFirstComparator")
    @js.native
    def rowFirstComparator: Any = js.native
    inline def rowFirstComparator_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowFirstComparator")(x.asInstanceOf[js.Any])
    
    /**
      * Maps a dense array of cell coordinates to a sparse 2-dimensional array
      * of cell values.
      *
      * We create a new 2-dimensional array representing the smallest single
      * contiguous `Region` that contains all cells in the supplied array. We
      * invoke the mapper callback only on the cells in the supplied coordinate
      * array and store the result. Returns the resulting 2-dimensional array.
      *
      * If there is no contiguous `Region` which contains all the cells, we
      * return `undefined`.
      */
    inline def sparseMapCells[T](cells: js.Array[CellCoordinate], mapper: js.Function2[/* row */ Double, /* col */ Double, T]): js.UndefOr[js.Array[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseMapCells")(cells.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[js.Array[T]]]]
    
    /**
      * Returns a region containing the entire table.
      */
    inline def table(): Region = ^.asInstanceOf[js.Dynamic].applyDynamic("table")().asInstanceOf[Region]
    
    /**
      * Replaces the region at the end of a cloned copy of the supplied region
      * array, or at the specific index if one is provided.
      */
    inline def update(regions: js.Array[Region], region: Region): js.Array[IRegion] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRegion]]
    inline def update(regions: js.Array[Region], region: Region, index: Double): js.Array[IRegion] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(regions.asInstanceOf[js.Any], region.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRegion]]
  }
  
  @js.native
  sealed trait RowLoadingOption extends StObject
  @JSImport("@blueprintjs/table/lib/esm/regions", "RowLoadingOption")
  @js.native
  object RowLoadingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RowLoadingOption & String] = js.native
    
    @js.native
    sealed trait CELLS
      extends StObject
         with RowLoadingOption
    /* "cells" */ val CELLS: typings.blueprintjsTable.libEsmRegionsMod.RowLoadingOption.CELLS & String = js.native
    
    @js.native
    sealed trait HEADER
      extends StObject
         with RowLoadingOption
    /* "row-header" */ val HEADER: typings.blueprintjsTable.libEsmRegionsMod.RowLoadingOption.HEADER & String = js.native
  }
  
  object SelectionModes {
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.ALL")
    @js.native
    def ALL: js.Array[RegionCardinality] = js.native
    inline def ALL_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.COLUMNS_AND_CELLS")
    @js.native
    def COLUMNS_AND_CELLS: js.Array[RegionCardinality] = js.native
    inline def COLUMNS_AND_CELLS_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMNS_AND_CELLS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.COLUMNS_ONLY")
    @js.native
    def COLUMNS_ONLY: js.Array[RegionCardinality] = js.native
    inline def COLUMNS_ONLY_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMNS_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.NONE")
    @js.native
    def NONE: js.Array[RegionCardinality] = js.native
    inline def NONE_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.ROWS_AND_CELLS")
    @js.native
    def ROWS_AND_CELLS: js.Array[RegionCardinality] = js.native
    inline def ROWS_AND_CELLS_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROWS_AND_CELLS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.ROWS_ONLY")
    @js.native
    def ROWS_ONLY: js.Array[RegionCardinality] = js.native
    inline def ROWS_ONLY_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROWS_ONLY")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait TableLoadingOption extends StObject
  @JSImport("@blueprintjs/table/lib/esm/regions", "TableLoadingOption")
  @js.native
  object TableLoadingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableLoadingOption & String] = js.native
    
    @js.native
    sealed trait CELLS
      extends StObject
         with TableLoadingOption
    /* "cells" */ val CELLS: typings.blueprintjsTable.libEsmRegionsMod.TableLoadingOption.CELLS & String = js.native
    
    @js.native
    sealed trait COLUMN_HEADERS
      extends StObject
         with TableLoadingOption
    /* "column-header" */ val COLUMN_HEADERS: typings.blueprintjsTable.libEsmRegionsMod.TableLoadingOption.COLUMN_HEADERS & String = js.native
    
    @js.native
    sealed trait ROW_HEADERS
      extends StObject
         with TableLoadingOption
    /* "row-header" */ val ROW_HEADERS: typings.blueprintjsTable.libEsmRegionsMod.TableLoadingOption.ROW_HEADERS & String = js.native
  }
  
  type CellCoordinate = ICellCoordinate
  
  type CellInterval = ICellInterval
  
  type ICellCoordinate = js.Tuple2[Double, Double]
  
  type ICellInterval = js.Tuple2[Double, Double]
  
  trait IRegion extends StObject {
    
    /**
      * The first and last column indices in the region, inclusive and
      * zero-indexed. If `cols` is `null`, then all columns are understood to be
      * included in the region.
      */
    var cols: js.UndefOr[CellInterval | Null] = js.undefined
    
    /**
      * The first and last row indices in the region, inclusive and zero-indexed.
      * If `rows` is `null`, then all rows are understood to be included in the
      * region.
      */
    var rows: js.UndefOr[CellInterval | Null] = js.undefined
  }
  object IRegion {
    
    inline def apply(): IRegion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRegion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRegion] (val x: Self) extends AnyVal {
      
      inline def setCols(value: CellInterval): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsNull: Self = StObject.set(x, "cols", null)
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setRows(value: CellInterval): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsNull: Self = StObject.set(x, "rows", null)
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  trait IStyledRegionGroup extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var regions: js.Array[Region]
  }
  object IStyledRegionGroup {
    
    inline def apply(regions: js.Array[Region]): IStyledRegionGroup = {
      val __obj = js.Dynamic.literal(regions = regions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStyledRegionGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStyledRegionGroup] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setRegions(value: js.Array[Region]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "regions", js.Array(value*))
    }
  }
  
  /* Inlined std.Required<{[ P in keyof @blueprintjs/table.@blueprintjs/table/lib/esm/regions.Region ]: std.NonNullable<@blueprintjs/table.@blueprintjs/table/lib/esm/regions.Region[P]>}> */
  trait NonNullRegion extends StObject {
    
    var cols: NonNullable[js.UndefOr[CellInterval | Null]]
    
    var rows: NonNullable[js.UndefOr[CellInterval | Null]]
  }
  object NonNullRegion {
    
    inline def apply(): NonNullRegion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NonNullRegion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NonNullRegion] (val x: Self) extends AnyVal {
      
      inline def setCols(value: NonNullable[js.UndefOr[CellInterval | Null]]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsNull: Self = StObject.set(x, "cols", null)
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setRows(value: NonNullable[js.UndefOr[CellInterval | Null]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsNull: Self = StObject.set(x, "rows", null)
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  type Region = IRegion
  
  type StyledRegionGroup = IStyledRegionGroup
}
