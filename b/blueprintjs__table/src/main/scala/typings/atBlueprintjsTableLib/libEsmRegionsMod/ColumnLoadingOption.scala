package typings
package atBlueprintjsTableLib.libEsmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnLoadingOption extends js.Object

@JSImport("@blueprintjs/table/lib/esm/regions", "ColumnLoadingOption")
@js.native
object ColumnLoadingOption extends js.Object {
  @js.native
  sealed trait CELLS
    extends atBlueprintjsTableLib.libEsmRegionsMod.ColumnLoadingOption
  
  @js.native
  sealed trait HEADER
    extends atBlueprintjsTableLib.libEsmRegionsMod.ColumnLoadingOption
  
  /* "cells" */ val CELLS: CELLS with java.lang.String = js.native
  /* "column-header" */ val HEADER: HEADER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atBlueprintjsTableLib.libEsmRegionsMod.ColumnLoadingOption with java.lang.String] = js.native
}

