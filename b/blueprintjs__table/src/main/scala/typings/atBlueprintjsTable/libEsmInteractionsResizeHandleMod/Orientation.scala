package typings.atBlueprintjsTable.libEsmInteractionsResizeHandleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSImport("@blueprintjs/table/lib/esm/interactions/resizeHandle", "Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait HORIZONTAL extends Orientation
  
  @js.native
  sealed trait VERTICAL extends Orientation
  
  /* 1 */ val HORIZONTAL: typings.atBlueprintjsTable.libEsmInteractionsResizeHandleMod.Orientation.HORIZONTAL with Double = js.native
  /* 0 */ val VERTICAL: typings.atBlueprintjsTable.libEsmInteractionsResizeHandleMod.Orientation.VERTICAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
}

