package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WindingOrder with Double] = js.native
  /* 0 */ @js.native
  object CLOCKWISE extends TopLevel[CLOCKWISE with Double]
  
  /* 1 */ @js.native
  object COUNTER_CLOCKWISE extends TopLevel[COUNTER_CLOCKWISE with Double]
  
}

