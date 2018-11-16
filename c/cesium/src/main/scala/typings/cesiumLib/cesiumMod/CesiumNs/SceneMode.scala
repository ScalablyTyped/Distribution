package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SceneMode extends js.Object

@JSImport("cesium/Cesium", "SceneMode")
@js.native
object SceneMode extends js.Object {
  @js.native
  sealed trait COLUMBUS_VIEW
    extends cesiumLib.cesiumMod.CesiumNs.SceneMode
  
  @js.native
  sealed trait MORPHING
    extends cesiumLib.cesiumMod.CesiumNs.SceneMode
  
  @js.native
  sealed trait SCENE2D
    extends cesiumLib.cesiumMod.CesiumNs.SceneMode
  
  @js.native
  sealed trait SCENE3D
    extends cesiumLib.cesiumMod.CesiumNs.SceneMode
  
}

