package typings.blueprintjsTable.esmRegionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TableLoadingOption extends js.Object
@JSImport("@blueprintjs/table/lib/esm/regions", "TableLoadingOption")
@js.native
object TableLoadingOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TableLoadingOption with String] = js.native
  
  @js.native
  sealed trait CELLS extends TableLoadingOption
  /* "cells" */ @js.native
  object CELLS extends TopLevel[CELLS with String]
  
  @js.native
  sealed trait COLUMN_HEADERS extends TableLoadingOption
  /* "column-header" */ @js.native
  object COLUMN_HEADERS extends TopLevel[COLUMN_HEADERS with String]
  
  @js.native
  sealed trait ROW_HEADERS extends TableLoadingOption
  /* "row-header" */ @js.native
  object ROW_HEADERS extends TopLevel[ROW_HEADERS with String]
}
