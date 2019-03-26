package typings
package atBlueprintjsTableLib.libEsmRegionsMod

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
  sealed trait CELLS
    extends atBlueprintjsTableLib.libEsmRegionsMod.RegionCardinality
  
  /**
    * A region that represents all cells within 1 or more columns.
    */
  @js.native
  sealed trait FULL_COLUMNS
    extends atBlueprintjsTableLib.libEsmRegionsMod.RegionCardinality
  
  /**
    * A region that represents all cells within 1 or more rows.
    */
  @js.native
  sealed trait FULL_ROWS
    extends atBlueprintjsTableLib.libEsmRegionsMod.RegionCardinality
  
  /**
    * A region that represents all cells in the table.
    */
  @js.native
  sealed trait FULL_TABLE
    extends atBlueprintjsTableLib.libEsmRegionsMod.RegionCardinality
  
  /* "cells" */ val CELLS: CELLS with java.lang.String = js.native
  /* "full-columns" */ val FULL_COLUMNS: FULL_COLUMNS with java.lang.String = js.native
  /* "full-rows" */ val FULL_ROWS: FULL_ROWS with java.lang.String = js.native
  /* "full-table" */ val FULL_TABLE: FULL_TABLE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atBlueprintjsTableLib.libEsmRegionsMod.RegionCardinality with java.lang.String] = js.native
}

