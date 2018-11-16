package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StencilOperation extends js.Object

@JSImport("cesium/Cesium", "StencilOperation")
@js.native
object StencilOperation extends js.Object {
  @js.native
  sealed trait DECREMENT
    extends cesiumLib.cesiumMod.CesiumNs.StencilOperation
  
  @js.native
  sealed trait DECREMENT_WRAP
    extends cesiumLib.cesiumMod.CesiumNs.StencilOperation
  
  @js.native
  sealed trait INCREMENT
    extends cesiumLib.cesiumMod.CesiumNs.StencilOperation
  
  @js.native
  sealed trait INCREMENT_WRAP
    extends cesiumLib.cesiumMod.CesiumNs.StencilOperation
  
  @js.native
  sealed trait INVERT
    extends cesiumLib.cesiumMod.CesiumNs.StencilOperation
  
  @js.native
  sealed trait KEEP
    extends cesiumLib.cesiumMod.CesiumNs.StencilOperation
  
  @js.native
  sealed trait REPLACE
    extends cesiumLib.cesiumMod.CesiumNs.StencilOperation
  
  @js.native
  sealed trait ZERO
    extends cesiumLib.cesiumMod.CesiumNs.StencilOperation
  
}

