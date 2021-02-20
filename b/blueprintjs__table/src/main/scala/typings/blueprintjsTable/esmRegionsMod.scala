package typings.blueprintjsTable

import typings.blueprintjsTable.anon.Col
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmRegionsMod {
  
  @js.native
  sealed trait ColumnLoadingOption extends StObject
  @JSImport("@blueprintjs/table/lib/esm/regions", "ColumnLoadingOption")
  @js.native
  object ColumnLoadingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColumnLoadingOption with String] = js.native
    
    @js.native
    sealed trait CELLS extends ColumnLoadingOption
    /* "cells" */ val CELLS: typings.blueprintjsTable.esmRegionsMod.ColumnLoadingOption.CELLS with String = js.native
    
    @js.native
    sealed trait HEADER extends ColumnLoadingOption
    /* "column-header" */ val HEADER: typings.blueprintjsTable.esmRegionsMod.ColumnLoadingOption.HEADER with String = js.native
  }
  
  @js.native
  sealed trait RegionCardinality extends StObject
  @JSImport("@blueprintjs/table/lib/esm/regions", "RegionCardinality")
  @js.native
  object RegionCardinality extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RegionCardinality with String] = js.native
    
    /**
      * A region that contains a finite rectangular group of table cells
      */
    @js.native
    sealed trait CELLS extends RegionCardinality
    /* "cells" */ val CELLS: typings.blueprintjsTable.esmRegionsMod.RegionCardinality.CELLS with String = js.native
    
    /**
      * A region that represents all cells within 1 or more columns.
      */
    @js.native
    sealed trait FULL_COLUMNS extends RegionCardinality
    /* "full-columns" */ val FULL_COLUMNS: typings.blueprintjsTable.esmRegionsMod.RegionCardinality.FULL_COLUMNS with String = js.native
    
    /**
      * A region that represents all cells within 1 or more rows.
      */
    @js.native
    sealed trait FULL_ROWS extends RegionCardinality
    /* "full-rows" */ val FULL_ROWS: typings.blueprintjsTable.esmRegionsMod.RegionCardinality.FULL_ROWS with String = js.native
    
    /**
      * A region that represents all cells in the table.
      */
    @js.native
    sealed trait FULL_TABLE extends RegionCardinality
    /* "full-table" */ val FULL_TABLE: typings.blueprintjsTable.esmRegionsMod.RegionCardinality.FULL_TABLE with String = js.native
  }
  
  @JSImport("@blueprintjs/table/lib/esm/regions", "Regions")
  @js.native
  class Regions () extends StObject
  /* static members */
  object Regions {
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the region to the end of a cloned copy of the supplied region
      * array.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.add")
    @js.native
    def add(regions: js.Array[IRegion], region: IRegion): js.Array[IRegion] = js.native
    
    /**
      * Returns a region containing one or more cells.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.cell")
    @js.native
    def cell(row: Double, col: Double): IRegion = js.native
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.cell")
    @js.native
    def cell(row: Double, col: Double, row2: js.UndefOr[scala.Nothing], col2: Double): IRegion = js.native
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.cell")
    @js.native
    def cell(row: Double, col: Double, row2: Double): IRegion = js.native
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.cell")
    @js.native
    def cell(row: Double, col: Double, row2: Double, col2: Double): IRegion = js.native
    
    /**
      * Clamps the region's start and end indices between 0 and the provided
      * maximum values.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.clampRegion")
    @js.native
    def clampRegion(region: IRegion, maxRowIndex: Double, maxColumnIndex: Double): IRegion = js.native
    
    /**
      * Returns a region containing one or more full columns.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.column")
    @js.native
    def column(col: Double): IRegion = js.native
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.column")
    @js.native
    def column(col: Double, col2: Double): IRegion = js.native
    
    /**
      * Returns true if the regions fully contain the query region.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.containsRegion")
    @js.native
    def containsRegion(regions: js.Array[IRegion], query: IRegion): Boolean = js.native
    
    /**
      * Returns a deep copy of the provided region.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.copy")
    @js.native
    def copy(region: IRegion): IRegion = js.native
    
    /**
      * Iterates over the cells within an `IRegion`, invoking the callback with
      * each cell's coordinates.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.eachCellInRegion")
    @js.native
    def eachCellInRegion: js.Any = js.native
    @scala.inline
    def eachCellInRegion_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eachCellInRegion")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.eachUniqueFullColumn")
    @js.native
    def eachUniqueFullColumn(regions: js.Array[IRegion], iteratee: js.Function1[/* col */ Double, Unit]): Unit = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.eachUniqueFullRow")
    @js.native
    def eachUniqueFullRow(regions: js.Array[IRegion], iteratee: js.Function1[/* row */ Double, Unit]): Unit = js.native
    
    /**
      * Using the supplied array of non-contiguous `IRegion`s, this method
      * returns an ordered array of every unique cell that exists in those
      * regions.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.enumerateUniqueCells")
    @js.native
    def enumerateUniqueCells(regions: js.Array[IRegion], numRows: Double, numCols: Double): js.Array[ICellCoordinate] = js.native
    
    /**
      * Expands an old region to the minimal bounding region that also contains
      * the new region. If the regions have different cardinalities, then the new
      * region is returned. Useful for expanding a selected region on
      * shift+click, for instance.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.expandRegion")
    @js.native
    def expandRegion(oldRegion: IRegion, newRegion: IRegion): IRegion = js.native
    
    /**
      * Returns the index of the region that wholly contains the supplied
      * parameter. Returns -1 if no such region is found.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.findContainingRegion")
    @js.native
    def findContainingRegion(regions: js.Array[IRegion], region: IRegion): Double = js.native
    
    /**
      * Returns the index of the region that is equal to the supplied
      * parameter. Returns -1 if no such region is found.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.findMatchingRegion")
    @js.native
    def findMatchingRegion(regions: js.Array[IRegion], region: IRegion): Double = js.native
    
    /**
      * Returns the smallest single contiguous `IRegion` that contains all cells in the
      * supplied array.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.getBoundingRegion")
    @js.native
    def getBoundingRegion(cells: js.Array[ICellCoordinate]): IRegion = js.native
    
    /**
      * Using the supplied region, returns an "equivalent" region of
      * type CELLS that define the bounds of the given region
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.getCellRegionFromRegion")
    @js.native
    def getCellRegionFromRegion(region: IRegion, numRows: Double, numCols: Double): IRegion = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.getFocusCellCoordinatesFromRegion")
    @js.native
    def getFocusCellCoordinatesFromRegion(region: IRegion): Col = js.native
    
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
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.getRegionCardinality")
    @js.native
    def getRegionCardinality(region: IRegion): RegionCardinality = js.native
    
    /**
      * Returns true if the regions contain a region that has FULL_COLUMNS
      * cardinality and contains the specified column index.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.hasFullColumn")
    @js.native
    def hasFullColumn(regions: js.Array[IRegion], col: Double): Boolean = js.native
    
    /**
      * Returns true if the regions contain a region that has FULL_ROWS
      * cardinality and contains the specified row index.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.hasFullRow")
    @js.native
    def hasFullRow(regions: js.Array[IRegion], row: Double): Boolean = js.native
    
    /**
      * Returns true if the regions contain a region that has FULL_TABLE cardinality
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.hasFullTable")
    @js.native
    def hasFullTable(regions: js.Array[IRegion]): Boolean = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.intervalContains")
    @js.native
    def intervalContains: js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.intervalContainsIndex")
    @js.native
    def intervalContainsIndex: js.Any = js.native
    @scala.inline
    def intervalContainsIndex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalContainsIndex")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def intervalContains_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalContains")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.intervalOverlaps")
    @js.native
    def intervalOverlaps: js.Any = js.native
    @scala.inline
    def intervalOverlaps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalOverlaps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.intervalsEqual")
    @js.native
    def intervalsEqual: js.Any = js.native
    @scala.inline
    def intervalsEqual_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalsEqual")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.isRegionValidForTable")
    @js.native
    def isRegionValidForTable(region: IRegion, numRows: Double, numCols: Double): Boolean = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.isValid")
    @js.native
    def isValid(region: IRegion): Boolean = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.joinStyledRegionGroups")
    @js.native
    def joinStyledRegionGroups(
      selectedRegions: js.Array[IRegion],
      otherRegions: js.Array[IStyledRegionGroup],
      focusedCell: IFocusedCellCoordinates
    ): js.Array[IStyledRegionGroup] = js.native
    
    /**
      * Returns true iff the specified region is equal to the last region in
      * the region list. This allows us to avoid immediate additive re-selection.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.lastRegionIsEqual")
    @js.native
    def lastRegionIsEqual(regions: js.Array[IRegion], region: IRegion): Boolean = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.normalizeInterval")
    @js.native
    def normalizeInterval: js.Any = js.native
    @scala.inline
    def normalizeInterval_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizeInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.numericalComparator")
    @js.native
    def numericalComparator: js.Any = js.native
    @scala.inline
    def numericalComparator_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numericalComparator")(x.asInstanceOf[js.Any])
    
    /**
      * Returns true if the regions at least partially overlap the query region.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.overlapsRegion")
    @js.native
    def overlapsRegion(regions: js.Array[IRegion], query: IRegion): Boolean = js.native
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.overlapsRegion")
    @js.native
    def overlapsRegion(regions: js.Array[IRegion], query: IRegion, allowPartialOverlap: Boolean): Boolean = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.regionContains")
    @js.native
    def regionContains: js.Any = js.native
    @scala.inline
    def regionContains_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regionContains")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.regionsEqual")
    @js.native
    def regionsEqual(regionA: IRegion, regionB: IRegion): Boolean = js.native
    
    /**
      * Returns a region containing one or more full rows.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.row")
    @js.native
    def row(row: Double): IRegion = js.native
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.row")
    @js.native
    def row(row: Double, row2: Double): IRegion = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.rowFirstComparator")
    @js.native
    def rowFirstComparator: js.Any = js.native
    @scala.inline
    def rowFirstComparator_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowFirstComparator")(x.asInstanceOf[js.Any])
    
    /**
      * Maps a dense array of cell coordinates to a sparse 2-dimensional array
      * of cell values.
      *
      * We create a new 2-dimensional array representing the smallest single
      * contiguous `IRegion` that contains all cells in the supplied array. We
      * invoke the mapper callback only on the cells in the supplied coordinate
      * array and store the result. Returns the resulting 2-dimensional array.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.sparseMapCells")
    @js.native
    def sparseMapCells[T](cells: js.Array[ICellCoordinate], mapper: js.Function2[/* row */ Double, /* col */ Double, T]): js.Array[js.Array[T]] = js.native
    
    /**
      * Returns a region containing the entire table.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.table")
    @js.native
    def table(): IRegion = js.native
    
    /**
      * Replaces the region at the end of a cloned copy of the supplied region
      * array, or at the specific index if one is provided.
      */
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.update")
    @js.native
    def update(regions: js.Array[IRegion], region: IRegion): js.Array[IRegion] = js.native
    @JSImport("@blueprintjs/table/lib/esm/regions", "Regions.update")
    @js.native
    def update(regions: js.Array[IRegion], region: IRegion, index: Double): js.Array[IRegion] = js.native
  }
  
  @js.native
  sealed trait RowLoadingOption extends StObject
  @JSImport("@blueprintjs/table/lib/esm/regions", "RowLoadingOption")
  @js.native
  object RowLoadingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RowLoadingOption with String] = js.native
    
    @js.native
    sealed trait CELLS extends RowLoadingOption
    /* "cells" */ val CELLS: typings.blueprintjsTable.esmRegionsMod.RowLoadingOption.CELLS with String = js.native
    
    @js.native
    sealed trait HEADER extends RowLoadingOption
    /* "row-header" */ val HEADER: typings.blueprintjsTable.esmRegionsMod.RowLoadingOption.HEADER with String = js.native
  }
  
  object SelectionModes {
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.ALL")
    @js.native
    def ALL: js.Array[RegionCardinality] = js.native
    @scala.inline
    def ALL_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.COLUMNS_AND_CELLS")
    @js.native
    def COLUMNS_AND_CELLS: js.Array[RegionCardinality] = js.native
    @scala.inline
    def COLUMNS_AND_CELLS_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMNS_AND_CELLS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.COLUMNS_ONLY")
    @js.native
    def COLUMNS_ONLY: js.Array[RegionCardinality] = js.native
    @scala.inline
    def COLUMNS_ONLY_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMNS_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.NONE")
    @js.native
    def NONE: js.Array[RegionCardinality] = js.native
    @scala.inline
    def NONE_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.ROWS_AND_CELLS")
    @js.native
    def ROWS_AND_CELLS: js.Array[RegionCardinality] = js.native
    @scala.inline
    def ROWS_AND_CELLS_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROWS_AND_CELLS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/regions", "SelectionModes.ROWS_ONLY")
    @js.native
    def ROWS_ONLY: js.Array[RegionCardinality] = js.native
    @scala.inline
    def ROWS_ONLY_=(x: js.Array[RegionCardinality]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROWS_ONLY")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait TableLoadingOption extends StObject
  @JSImport("@blueprintjs/table/lib/esm/regions", "TableLoadingOption")
  @js.native
  object TableLoadingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableLoadingOption with String] = js.native
    
    @js.native
    sealed trait CELLS extends TableLoadingOption
    /* "cells" */ val CELLS: typings.blueprintjsTable.esmRegionsMod.TableLoadingOption.CELLS with String = js.native
    
    @js.native
    sealed trait COLUMN_HEADERS extends TableLoadingOption
    /* "column-header" */ val COLUMN_HEADERS: typings.blueprintjsTable.esmRegionsMod.TableLoadingOption.COLUMN_HEADERS with String = js.native
    
    @js.native
    sealed trait ROW_HEADERS extends TableLoadingOption
    /* "row-header" */ val ROW_HEADERS: typings.blueprintjsTable.esmRegionsMod.TableLoadingOption.ROW_HEADERS with String = js.native
  }
  
  type ICellCoordinate = js.Tuple2[Double, Double]
  
  type ICellInterval = js.Tuple2[Double, Double]
  
  @js.native
  trait IRegion extends StObject {
    
    /**
      * The first and last column indices in the region, inclusive and
      * zero-indexed. If `cols` is `null`, then all columns are understood to be
      * included in the region.
      */
    var cols: js.UndefOr[ICellInterval | Null] = js.native
    
    /**
      * The first and last row indices in the region, inclusive and zero-indexed.
      * If `rows` is `null`, then all rows are understood to be included in the
      * region.
      */
    var rows: js.UndefOr[ICellInterval | Null] = js.native
  }
  object IRegion {
    
    @scala.inline
    def apply(): IRegion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRegion]
    }
    
    @scala.inline
    implicit class IRegionMutableBuilder[Self <: IRegion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: ICellInterval): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsNull: Self = StObject.set(x, "cols", null)
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setRows(value: ICellInterval): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsNull: Self = StObject.set(x, "rows", null)
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  @js.native
  trait IStyledRegionGroup extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var regions: js.Array[IRegion] = js.native
  }
  object IStyledRegionGroup {
    
    @scala.inline
    def apply(regions: js.Array[IRegion]): IStyledRegionGroup = {
      val __obj = js.Dynamic.literal(regions = regions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStyledRegionGroup]
    }
    
    @scala.inline
    implicit class IStyledRegionGroupMutableBuilder[Self <: IStyledRegionGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setRegions(value: js.Array[IRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsVarargs(value: IRegion*): Self = StObject.set(x, "regions", js.Array(value :_*))
    }
  }
}
