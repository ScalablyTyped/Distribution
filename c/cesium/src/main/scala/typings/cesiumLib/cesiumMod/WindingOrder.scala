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
  
  val CLOCKWISE: CLOCKWISE with java.lang.String = js.native
  val COUNTER_CLOCKWISE: COUNTER_CLOCKWISE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.WindingOrder with java.lang.String] = js.native
}

