package typings.atBlueprintjsTable.libEsmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RegionCardinality extends js.Object

@JSImport("@blueprintjs/table/lib/esm/regions", "RegionCardinality")
@js.native
object RegionCardinality extends js.Object {
  /**
    * A region that contains a finite rectangular group of table cells
    */
  @js.native
  sealed trait CELLS extends RegionCardinality
  
  /**
    * A region that represents all cells within 1 or more columns.
    */
  @js.native
  sealed trait FULL_COLUMNS extends RegionCardinality
  
  /**
    * A region that represents all cells within 1 or more rows.
    */
  @js.native
  sealed trait FULL_ROWS extends RegionCardinality
  
  /**
    * A region that represents all cells in the table.
    */
  @js.native
  sealed trait FULL_TABLE extends RegionCardinality
  
  /* "cells" */ val CELLS: typings.atBlueprintjsTable.libEsmRegionsMod.RegionCardinality.CELLS with String = js.native
  /* "full-columns" */ val FULL_COLUMNS: typings.atBlueprintjsTable.libEsmRegionsMod.RegionCardinality.FULL_COLUMNS with String = js.native
  /* "full-rows" */ val FULL_ROWS: typings.atBlueprintjsTable.libEsmRegionsMod.RegionCardinality.FULL_ROWS with String = js.native
  /* "full-table" */ val FULL_TABLE: typings.atBlueprintjsTable.libEsmRegionsMod.RegionCardinality.FULL_TABLE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RegionCardinality with String] = js.native
}

