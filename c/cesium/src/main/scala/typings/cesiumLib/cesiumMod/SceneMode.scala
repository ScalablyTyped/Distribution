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
  
  val COLUMBUS_VIEW: COLUMBUS_VIEW with java.lang.String = js.native
  val MORPHING: MORPHING with java.lang.String = js.native
  val SCENE2D: SCENE2D with java.lang.String = js.native
  val SCENE3D: SCENE3D with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.SceneMode with java.lang.String] = js.native
}

