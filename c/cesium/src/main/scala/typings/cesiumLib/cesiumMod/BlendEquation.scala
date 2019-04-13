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
  
  val ADD: ADD with java.lang.String = js.native
  val REVERSE_SUBTRACT: REVERSE_SUBTRACT with java.lang.String = js.native
  val SUBTRACT: SUBTRACT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.BlendEquation with java.lang.String] = js.native
}

