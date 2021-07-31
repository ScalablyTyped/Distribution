package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WindingOrder extends StObject
@JSImport("cesium", "WindingOrder")
@js.native
object WindingOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WindingOrder & Double] = js.native
  
  @js.native
  sealed trait CLOCKWISE
    extends StObject
       with WindingOrder
  /* 0 */ val CLOCKWISE: typings.cesium.mod.WindingOrder.CLOCKWISE & Double = js.native
  
  @js.native
  sealed trait COUNTER_CLOCKWISE
    extends StObject
       with WindingOrder
  /* 1 */ val COUNTER_CLOCKWISE: typings.cesium.mod.WindingOrder.COUNTER_CLOCKWISE & Double = js.native
}
