package typings.atBlueprintjsTable.libEsmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableLoadingOption extends js.Object

@JSImport("@blueprintjs/table/lib/esm/regions", "TableLoadingOption")
@js.native
object TableLoadingOption extends js.Object {
  @js.native
  sealed trait CELLS extends TableLoadingOption
  
  @js.native
  sealed trait COLUMN_HEADERS extends TableLoadingOption
  
  @js.native
  sealed trait ROW_HEADERS extends TableLoadingOption
  
  /* "cells" */ val CELLS: typings.atBlueprintjsTable.libEsmRegionsMod.TableLoadingOption.CELLS with String = js.native
  /* "column-header" */ val COLUMN_HEADERS: typings.atBlueprintjsTable.libEsmRegionsMod.TableLoadingOption.COLUMN_HEADERS with String = js.native
  /* "row-header" */ val ROW_HEADERS: typings.atBlueprintjsTable.libEsmRegionsMod.TableLoadingOption.ROW_HEADERS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TableLoadingOption with String] = js.native
}

