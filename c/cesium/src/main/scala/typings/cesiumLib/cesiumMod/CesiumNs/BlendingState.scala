package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendingState extends js.Object

@JSImport("cesium/Cesium", "BlendingState")
@js.native
object BlendingState extends js.Object {
  @js.native
  sealed trait ADDITIVE_BLEND
    extends cesiumLib.cesiumMod.CesiumNs.BlendingState
  
  @js.native
  sealed trait ALPHA_BLEND
    extends cesiumLib.cesiumMod.CesiumNs.BlendingState
  
  @js.native
  sealed trait DISABLED
    extends cesiumLib.cesiumMod.CesiumNs.BlendingState
  
  @js.native
  sealed trait PRE_MULTIPLIED_ALPHA_BLEND
    extends cesiumLib.cesiumMod.CesiumNs.BlendingState
  
}

