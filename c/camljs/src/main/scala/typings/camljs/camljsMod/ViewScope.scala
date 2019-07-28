package typings.camljs.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewScope extends js.Object

@JSImport("camljs", "ViewScope")
@js.native
object ViewScope extends js.Object {
  @js.native
  sealed trait FilesOnly extends ViewScope
  
  @js.native
  sealed trait Recursive extends ViewScope
  
  @js.native
  sealed trait RecursiveAll extends ViewScope
  
  /* 2 */ val FilesOnly: typings.camljs.camljsMod.ViewScope.FilesOnly with Double = js.native
  /* 0 */ val Recursive: typings.camljs.camljsMod.ViewScope.Recursive with Double = js.native
  /* 1 */ val RecursiveAll: typings.camljs.camljsMod.ViewScope.RecursiveAll with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewScope with Double] = js.native
}

