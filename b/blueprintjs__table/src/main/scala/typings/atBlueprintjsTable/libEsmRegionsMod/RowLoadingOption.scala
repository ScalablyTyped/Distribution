package typings.atBlueprintjsTable.libEsmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowLoadingOption extends js.Object

@JSImport("@blueprintjs/table/lib/esm/regions", "RowLoadingOption")
@js.native
object RowLoadingOption extends js.Object {
  @js.native
  sealed trait CELLS extends RowLoadingOption
  
  @js.native
  sealed trait HEADER extends RowLoadingOption
  
  /* "cells" */ val CELLS: typings.atBlueprintjsTable.libEsmRegionsMod.RowLoadingOption.CELLS with String = js.native
  /* "row-header" */ val HEADER: typings.atBlueprintjsTable.libEsmRegionsMod.RowLoadingOption.HEADER with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RowLoadingOption with String] = js.native
}

