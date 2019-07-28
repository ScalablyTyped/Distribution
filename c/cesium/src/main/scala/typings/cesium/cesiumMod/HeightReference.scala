package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightReference extends js.Object

@JSImport("cesium", "HeightReference")
@js.native
object HeightReference extends js.Object {
  @js.native
  sealed trait CLAMP_TO_GROUND extends HeightReference
  
  @js.native
  sealed trait NONE extends HeightReference
  
  @js.native
  sealed trait RELATIVE_TO_GROUND extends HeightReference
  
  /* 0 */ val CLAMP_TO_GROUND: typings.cesium.cesiumMod.HeightReference.CLAMP_TO_GROUND with Double = js.native
  /* 1 */ val NONE: typings.cesium.cesiumMod.HeightReference.NONE with Double = js.native
  /* 2 */ val RELATIVE_TO_GROUND: typings.cesium.cesiumMod.HeightReference.RELATIVE_TO_GROUND with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightReference with Double] = js.native
}

