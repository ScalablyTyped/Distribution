package typings
package atBlueprintjsTableLib.libEsmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowLoadingOption extends js.Object

@JSImport("@blueprintjs/table/lib/esm/regions", "RowLoadingOption")
@js.native
object RowLoadingOption extends js.Object {
  @js.native
  sealed trait CELLS
    extends atBlueprintjsTableLib.libEsmRegionsMod.RowLoadingOption
  
  @js.native
  sealed trait HEADER
    extends atBlueprintjsTableLib.libEsmRegionsMod.RowLoadingOption
  
  /* "cells" */ val CELLS: CELLS with java.lang.String = js.native
  /* "row-header" */ val HEADER: HEADER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atBlueprintjsTableLib.libEsmRegionsMod.RowLoadingOption with java.lang.String] = js.native
}

