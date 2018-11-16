package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrimitiveType extends js.Object

@JSImport("cesium/Cesium", "PrimitiveType")
@js.native
object PrimitiveType extends js.Object {
  @js.native
  sealed trait LINES
    extends cesiumLib.cesiumMod.CesiumNs.PrimitiveType
  
  @js.native
  sealed trait LINE_LOOP
    extends cesiumLib.cesiumMod.CesiumNs.PrimitiveType
  
  @js.native
  sealed trait LINE_STRIP
    extends cesiumLib.cesiumMod.CesiumNs.PrimitiveType
  
  @js.native
  sealed trait POINTS
    extends cesiumLib.cesiumMod.CesiumNs.PrimitiveType
  
  @js.native
  sealed trait TRIANGLES
    extends cesiumLib.cesiumMod.CesiumNs.PrimitiveType
  
  @js.native
  sealed trait TRIANGLE_FAN
    extends cesiumLib.cesiumMod.CesiumNs.PrimitiveType
  
  @js.native
  sealed trait TRIANGLE_STRIP
    extends cesiumLib.cesiumMod.CesiumNs.PrimitiveType
  
}

