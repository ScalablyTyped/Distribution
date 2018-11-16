package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShadowMode extends js.Object

@JSImport("cesium/Cesium", "ShadowMode")
@js.native
object ShadowMode extends js.Object {
  @js.native
  sealed trait CAST_ONLY
    extends cesiumLib.cesiumMod.CesiumNs.ShadowMode
  
  @js.native
  sealed trait DISABLED
    extends cesiumLib.cesiumMod.CesiumNs.ShadowMode
  
  @js.native
  sealed trait ENABLED
    extends cesiumLib.cesiumMod.CesiumNs.ShadowMode
  
  @js.native
  sealed trait RECEIVE_ONLY
    extends cesiumLib.cesiumMod.CesiumNs.ShadowMode
  
}

