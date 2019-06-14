package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendEquation extends js.Object

@JSImport("cesium", "BlendEquation")
@js.native
object BlendEquation extends js.Object {
  @js.native
  sealed trait ADD
    extends cesiumLib.cesiumMod.BlendEquation
  
  @js.native
  sealed trait REVERSE_SUBTRACT
    extends cesiumLib.cesiumMod.BlendEquation
  
  @js.native
  sealed trait SUBTRACT
    extends cesiumLib.cesiumMod.BlendEquation
  
  /* 0 */ val ADD: ADD with scala.Double = js.native
  /* 2 */ val REVERSE_SUBTRACT: REVERSE_SUBTRACT with scala.Double = js.native
  /* 1 */ val SUBTRACT: SUBTRACT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.BlendEquation with scala.Double] = js.native
}

