package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SceneMode extends js.Object

@JSImport("cesium", "SceneMode")
@js.native
object SceneMode extends js.Object {
  @js.native
  sealed trait COLUMBUS_VIEW extends SceneMode
  
  @js.native
  sealed trait MORPHING extends SceneMode
  
  @js.native
  sealed trait SCENE2D extends SceneMode
  
  @js.native
  sealed trait SCENE3D extends SceneMode
  
  /* 1 */ val COLUMBUS_VIEW: typings.cesium.cesiumMod.SceneMode.COLUMBUS_VIEW with Double = js.native
  /* 0 */ val MORPHING: typings.cesium.cesiumMod.SceneMode.MORPHING with Double = js.native
  /* 2 */ val SCENE2D: typings.cesium.cesiumMod.SceneMode.SCENE2D with Double = js.native
  /* 3 */ val SCENE3D: typings.cesium.cesiumMod.SceneMode.SCENE3D with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SceneMode with Double] = js.native
  def getMorphTime(value: SceneMode): Double = js.native
}

