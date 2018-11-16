package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewScope extends js.Object

@JSGlobal("CamlBuilder.ViewScope")
@js.native
object ViewScope extends js.Object {
  /**  */
  @js.native
  sealed trait FilesOnly
    extends camljsLib.CamlBuilderNs.ViewScope
  
  /**  */
  @js.native
  sealed trait Recursive
    extends camljsLib.CamlBuilderNs.ViewScope
  
  /**  */
  @js.native
  sealed trait RecursiveAll
    extends camljsLib.CamlBuilderNs.ViewScope
  
  /* 2 */ val FilesOnly: FilesOnly with scala.Double = js.native
  /* 0 */ val Recursive: Recursive with scala.Double = js.native
  /* 1 */ val RecursiveAll: RecursiveAll with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[camljsLib.CamlBuilderNs.ViewScope with scala.Double] = js.native
}

