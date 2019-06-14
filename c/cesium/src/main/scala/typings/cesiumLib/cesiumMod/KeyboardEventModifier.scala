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
  
  /* 2 */ val ALT: ALT with scala.Double = js.native
  /* 1 */ val CTRL: CTRL with scala.Double = js.native
  /* 0 */ val SHIFT: SHIFT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.KeyboardEventModifier with scala.Double] = js.native
}

