package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModelAnimationLoop extends js.Object

@JSImport("cesium", "ModelAnimationLoop")
@js.native
object ModelAnimationLoop extends js.Object {
  @js.native
  sealed trait MIRRORED_REPEAT
    extends cesiumLib.cesiumMod.ModelAnimationLoop
  
  @js.native
  sealed trait NONE
    extends cesiumLib.cesiumMod.ModelAnimationLoop
  
  @js.native
  sealed trait REPEAT
    extends cesiumLib.cesiumMod.ModelAnimationLoop
  
  /* 2 */ val MIRRORED_REPEAT: MIRRORED_REPEAT with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val REPEAT: REPEAT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.ModelAnimationLoop with scala.Double] = js.native
}

