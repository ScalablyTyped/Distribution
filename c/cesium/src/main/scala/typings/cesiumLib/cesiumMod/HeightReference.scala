package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightReference extends js.Object

@JSImport("cesium", "HeightReference")
@js.native
object HeightReference extends js.Object {
  @js.native
  sealed trait CLAMP_TO_GROUND
    extends cesiumLib.cesiumMod.HeightReference
  
  @js.native
  sealed trait NONE
    extends cesiumLib.cesiumMod.HeightReference
  
  @js.native
  sealed trait RELATIVE_TO_GROUND
    extends cesiumLib.cesiumMod.HeightReference
  
  /* 0 */ val CLAMP_TO_GROUND: CLAMP_TO_GROUND with scala.Double = js.native
  /* 1 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val RELATIVE_TO_GROUND: RELATIVE_TO_GROUND with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.HeightReference with scala.Double] = js.native
}

