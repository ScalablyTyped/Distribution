package typings.atBlueprintjsTable.libEsmRegionsMod

import org.scalablytyped.runtime.TopLevel
import typings.atBlueprintjsTable.libEsmRegionsMod.TableLoadingOption.CELLS
import typings.atBlueprintjsTable.libEsmRegionsMod.TableLoadingOption.COLUMN_HEADERS
import typings.atBlueprintjsTable.libEsmRegionsMod.TableLoadingOption.ROW_HEADERS
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TableLoadingOption with String] = js.native
  /* "cells" */ @js.native
  object CELLS extends TopLevel[CELLS with String]
  
  /* "column-header" */ @js.native
  object COLUMN_HEADERS extends TopLevel[COLUMN_HEADERS with String]
  
  /* "row-header" */ @js.native
  object ROW_HEADERS extends TopLevel[ROW_HEADERS with String]
  
}

