package typings
package atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSImport("@blueprintjs/table/lib/esm/interactions/resizeHandle", "Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait HORIZONTAL
    extends atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.Orientation
  
  @js.native
  sealed trait VERTICAL
    extends atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.Orientation
  
  /* 1 */ val HORIZONTAL: HORIZONTAL with scala.Double = js.native
  /* 0 */ val VERTICAL: VERTICAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.Orientation with scala.Double
  ] = js.native
}

