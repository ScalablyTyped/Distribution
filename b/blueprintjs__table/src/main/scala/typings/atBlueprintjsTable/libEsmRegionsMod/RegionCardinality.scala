package typings.atBlueprintjsTable.libEsmRegionsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RegionCardinality with String] = js.native
  /* "cells" */ @js.native
  object CELLS extends TopLevel[CELLS with String]
  
  /* "full-columns" */ @js.native
  object FULL_COLUMNS extends TopLevel[FULL_COLUMNS with String]
  
  /* "full-rows" */ @js.native
  object FULL_ROWS extends TopLevel[FULL_ROWS with String]
  
  /* "full-table" */ @js.native
  object FULL_TABLE extends TopLevel[FULL_TABLE with String]
  
}

