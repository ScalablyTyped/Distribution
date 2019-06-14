package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WindingOrder extends js.Object

@JSImport("cesium", "WindingOrder")
@js.native
object WindingOrder extends js.Object {
  @js.native
  sealed trait CLOCKWISE
    extends cesiumLib.cesiumMod.WindingOrder
  
  @js.native
  sealed trait COUNTER_CLOCKWISE
    extends cesiumLib.cesiumMod.WindingOrder
  
  /* 0 */ val CLOCKWISE: CLOCKWISE with scala.Double = js.native
  /* 1 */ val COUNTER_CLOCKWISE: COUNTER_CLOCKWISE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.WindingOrder with scala.Double] = js.native
}

