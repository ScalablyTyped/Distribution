package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepthFunction extends js.Object

@JSImport("cesium/Cesium", "DepthFunction")
@js.native
object DepthFunction extends js.Object {
  @js.native
  sealed trait ALWAYS
    extends cesiumLib.cesiumMod.CesiumNs.DepthFunction
  
  @js.native
  sealed trait EQUAL
    extends cesiumLib.cesiumMod.CesiumNs.DepthFunction
  
  @js.native
  sealed trait GREATER
    extends cesiumLib.cesiumMod.CesiumNs.DepthFunction
  
  @js.native
  sealed trait GREATER_OR_EQUAL
    extends cesiumLib.cesiumMod.CesiumNs.DepthFunction
  
  @js.native
  sealed trait LESS
    extends cesiumLib.cesiumMod.CesiumNs.DepthFunction
  
  @js.native
  sealed trait LESS_OR_EQUAL
    extends cesiumLib.cesiumMod.CesiumNs.DepthFunction
  
  @js.native
  sealed trait NEVER
    extends cesiumLib.cesiumMod.CesiumNs.DepthFunction
  
  @js.native
  sealed trait NOT_EQUAL
    extends cesiumLib.cesiumMod.CesiumNs.DepthFunction
  
}

