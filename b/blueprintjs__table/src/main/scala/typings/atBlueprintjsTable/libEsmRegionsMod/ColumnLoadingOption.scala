package typings.atBlueprintjsTable.libEsmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnLoadingOption extends js.Object

@JSImport("@blueprintjs/table/lib/esm/regions", "ColumnLoadingOption")
@js.native
object ColumnLoadingOption extends js.Object {
  @js.native
  sealed trait CELLS extends ColumnLoadingOption
  
  @js.native
  sealed trait HEADER extends ColumnLoadingOption
  
  /* "cells" */ val CELLS: typings.atBlueprintjsTable.libEsmRegionsMod.ColumnLoadingOption.CELLS with String = js.native
  /* "column-header" */ val HEADER: typings.atBlueprintjsTable.libEsmRegionsMod.ColumnLoadingOption.HEADER with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ColumnLoadingOption with String] = js.native
}

