package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendEquation extends js.Object

@JSImport("cesium", "BlendEquation")
@js.native
object BlendEquation extends js.Object {
  @js.native
  sealed trait ADD extends BlendEquation
  
  @js.native
  sealed trait REVERSE_SUBTRACT extends BlendEquation
  
  @js.native
  sealed trait SUBTRACT extends BlendEquation
  
  /* 0 */ val ADD: typings.cesium.cesiumMod.BlendEquation.ADD with Double = js.native
  /* 2 */ val REVERSE_SUBTRACT: typings.cesium.cesiumMod.BlendEquation.REVERSE_SUBTRACT with Double = js.native
  /* 1 */ val SUBTRACT: typings.cesium.cesiumMod.BlendEquation.SUBTRACT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendEquation with Double] = js.native
}

