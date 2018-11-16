package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendOption extends js.Object

@JSImport("cesium/Cesium", "BlendOption")
@js.native
object BlendOption extends js.Object {
  @js.native
  sealed trait OPAQUE
    extends cesiumLib.cesiumMod.CesiumNs.BlendOption
  
  @js.native
  sealed trait OPAQUE_AND_TRANSLUCENT
    extends cesiumLib.cesiumMod.CesiumNs.BlendOption
  
  @js.native
  sealed trait TRANSLUCENT
    extends cesiumLib.cesiumMod.CesiumNs.BlendOption
  
}

