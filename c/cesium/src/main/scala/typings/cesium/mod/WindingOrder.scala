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
  def apply(value: scala.Nothing): js.UndefOr[WindingOrder & scala.Nothing] = js.native
  
  /**
    * Vertices are in clockwise order.
    */
  @js.native
  sealed trait CLOCKWISE
    extends StObject
       with WindingOrder
  /* WebGLConstants.CW */ val CLOCKWISE: typings.cesium.mod.WindingOrder.CLOCKWISE & scala.Nothing = js.native
  
  /**
    * Vertices are in counter-clockwise order.
    */
  @js.native
  sealed trait COUNTER_CLOCKWISE
    extends StObject
       with WindingOrder
  /* WebGLConstants.CCW */ val COUNTER_CLOCKWISE: typings.cesium.mod.WindingOrder.COUNTER_CLOCKWISE & scala.Nothing = js.native
}
