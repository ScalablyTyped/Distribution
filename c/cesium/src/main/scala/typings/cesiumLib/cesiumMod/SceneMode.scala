package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SceneMode extends js.Object

@JSImport("cesium", "SceneMode")
@js.native
object SceneMode extends js.Object {
  @js.native
  sealed trait COLUMBUS_VIEW
    extends cesiumLib.cesiumMod.SceneMode
  
  @js.native
  sealed trait MORPHING
    extends cesiumLib.cesiumMod.SceneMode
  
  @js.native
  sealed trait SCENE2D
    extends cesiumLib.cesiumMod.SceneMode
  
  @js.native
  sealed trait SCENE3D
    extends cesiumLib.cesiumMod.SceneMode
  
  /* 1 */ val COLUMBUS_VIEW: COLUMBUS_VIEW with scala.Double = js.native
  /* 0 */ val MORPHING: MORPHING with scala.Double = js.native
  /* 2 */ val SCENE2D: SCENE2D with scala.Double = js.native
  /* 3 */ val SCENE3D: SCENE3D with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.SceneMode with scala.Double] = js.native
}

