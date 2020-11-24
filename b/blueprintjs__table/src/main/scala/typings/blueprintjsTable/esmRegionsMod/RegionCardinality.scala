package typings.blueprintjsTable.esmRegionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RegionCardinality extends js.Object
@JSImport("@blueprintjs/table/lib/esm/regions", "RegionCardinality")
@js.native
object RegionCardinality extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RegionCardinality with String] = js.native
  
  /**
    * A region that contains a finite rectangular group of table cells
    */
  @js.native
  sealed trait CELLS extends RegionCardinality
  /* "cells" */ @js.native
  object CELLS extends TopLevel[CELLS with String]
  
  /**
    * A region that represents all cells within 1 or more columns.
    */
  @js.native
  sealed trait FULL_COLUMNS extends RegionCardinality
  /* "full-columns" */ @js.native
  object FULL_COLUMNS extends TopLevel[FULL_COLUMNS with String]
  
  /**
    * A region that represents all cells within 1 or more rows.
    */
  @js.native
  sealed trait FULL_ROWS extends RegionCardinality
  /* "full-rows" */ @js.native
  object FULL_ROWS extends TopLevel[FULL_ROWS with String]
  
  /**
    * A region that represents all cells in the table.
    */
  @js.native
  sealed trait FULL_TABLE extends RegionCardinality
  /* "full-table" */ @js.native
  object FULL_TABLE extends TopLevel[FULL_TABLE with String]
}
