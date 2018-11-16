package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightReference extends js.Object

@JSImport("cesium/Cesium", "HeightReference")
@js.native
object HeightReference extends js.Object {
  @js.native
  sealed trait CLAMP_TO_GROUND
    extends cesiumLib.cesiumMod.CesiumNs.HeightReference
  
  @js.native
  sealed trait NONE
    extends cesiumLib.cesiumMod.CesiumNs.HeightReference
  
  @js.native
  sealed trait RELATIVE_TO_GROUND
    extends cesiumLib.cesiumMod.CesiumNs.HeightReference
  
}

