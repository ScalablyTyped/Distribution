package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyboardEventModifier extends js.Object

@JSImport("cesium", "KeyboardEventModifier")
@js.native
object KeyboardEventModifier extends js.Object {
  @js.native
  sealed trait ALT
    extends cesiumLib.cesiumMod.KeyboardEventModifier
  
  @js.native
  sealed trait CTRL
    extends cesiumLib.cesiumMod.KeyboardEventModifier
  
  @js.native
  sealed trait SHIFT
    extends cesiumLib.cesiumMod.KeyboardEventModifier
  
  val ALT: ALT with java.lang.String = js.native
  val CTRL: CTRL with java.lang.String = js.native
  val SHIFT: SHIFT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.KeyboardEventModifier with java.lang.String] = js.native
}

