package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WindingOrder extends js.Object

@JSImport("cesium", "WindingOrder")
@js.native
object WindingOrder extends js.Object {
  @js.native
  sealed trait CLOCKWISE extends WindingOrder
  
  @js.native
  sealed trait COUNTER_CLOCKWISE extends WindingOrder
  
  /* 0 */ val CLOCKWISE: typings.cesium.cesiumMod.WindingOrder.CLOCKWISE with Double = js.native
  /* 1 */ val COUNTER_CLOCKWISE: typings.cesium.cesiumMod.WindingOrder.COUNTER_CLOCKWISE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WindingOrder with Double] = js.native
}

