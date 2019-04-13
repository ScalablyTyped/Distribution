package typings
package camljsLib.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewScope extends js.Object

@JSImport("camljs", "ViewScope")
@js.native
object ViewScope extends js.Object {
  @js.native
  sealed trait FilesOnly
    extends camljsLib.camljsMod.ViewScope
  
  @js.native
  sealed trait Recursive
    extends camljsLib.camljsMod.ViewScope
  
  @js.native
  sealed trait RecursiveAll
    extends camljsLib.camljsMod.ViewScope
  
  /* 2 */ val FilesOnly: FilesOnly with scala.Double = js.native
  /* 0 */ val Recursive: Recursive with scala.Double = js.native
  /* 1 */ val RecursiveAll: RecursiveAll with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[camljsLib.camljsMod.ViewScope with scala.Double] = js.native
}

