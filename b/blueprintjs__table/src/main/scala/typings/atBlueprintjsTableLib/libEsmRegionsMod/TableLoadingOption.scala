package typings
package atBlueprintjsTableLib.libEsmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableLoadingOption extends js.Object

@JSImport("@blueprintjs/table/lib/esm/regions", "TableLoadingOption")
@js.native
object TableLoadingOption extends js.Object {
  @js.native
  sealed trait CELLS
    extends atBlueprintjsTableLib.libEsmRegionsMod.TableLoadingOption
  
  @js.native
  sealed trait COLUMN_HEADERS
    extends atBlueprintjsTableLib.libEsmRegionsMod.TableLoadingOption
  
  @js.native
  sealed trait ROW_HEADERS
    extends atBlueprintjsTableLib.libEsmRegionsMod.TableLoadingOption
  
  /* "cells" */ val CELLS: CELLS with java.lang.String = js.native
  /* "column-header" */ val COLUMN_HEADERS: COLUMN_HEADERS with java.lang.String = js.native
  /* "row-header" */ val ROW_HEADERS: ROW_HEADERS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atBlueprintjsTableLib.libEsmRegionsMod.TableLoadingOption with java.lang.String] = js.native
}

