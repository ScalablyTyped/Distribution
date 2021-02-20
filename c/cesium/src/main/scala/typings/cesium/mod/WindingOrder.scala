package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WindingOrder extends StObject
@JSImport("cesium", "WindingOrder")
@js.native
object WindingOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WindingOrder with Double] = js.native
  
  @js.native
  sealed trait CLOCKWISE extends WindingOrder
  /* 0 */ val CLOCKWISE: typings.cesium.mod.WindingOrder.CLOCKWISE with Double = js.native
  
  @js.native
  sealed trait COUNTER_CLOCKWISE extends WindingOrder
  /* 1 */ val COUNTER_CLOCKWISE: typings.cesium.mod.WindingOrder.COUNTER_CLOCKWISE with Double = js.native
}
