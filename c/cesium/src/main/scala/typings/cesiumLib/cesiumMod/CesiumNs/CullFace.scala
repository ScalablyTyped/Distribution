package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CullFace extends js.Object

@JSImport("cesium/Cesium", "CullFace")
@js.native
object CullFace extends js.Object {
  @js.native
  sealed trait BACK
    extends cesiumLib.cesiumMod.CesiumNs.CullFace
  
  @js.native
  sealed trait FRONT
    extends cesiumLib.cesiumMod.CesiumNs.CullFace
  
  @js.native
  sealed trait FRONT_AND_BACK
    extends cesiumLib.cesiumMod.CesiumNs.CullFace
  
}

