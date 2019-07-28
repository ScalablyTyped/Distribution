package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModelAnimationLoop extends js.Object

@JSImport("cesium", "ModelAnimationLoop")
@js.native
object ModelAnimationLoop extends js.Object {
  @js.native
  sealed trait MIRRORED_REPEAT extends ModelAnimationLoop
  
  @js.native
  sealed trait NONE extends ModelAnimationLoop
  
  @js.native
  sealed trait REPEAT extends ModelAnimationLoop
  
  /* 2 */ val MIRRORED_REPEAT: typings.cesium.cesiumMod.ModelAnimationLoop.MIRRORED_REPEAT with Double = js.native
  /* 0 */ val NONE: typings.cesium.cesiumMod.ModelAnimationLoop.NONE with Double = js.native
  /* 1 */ val REPEAT: typings.cesium.cesiumMod.ModelAnimationLoop.REPEAT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelAnimationLoop with Double] = js.native
}

