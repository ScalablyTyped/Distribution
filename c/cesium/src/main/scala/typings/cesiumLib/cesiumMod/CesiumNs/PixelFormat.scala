package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PixelFormat extends js.Object

@JSImport("cesium/Cesium", "PixelFormat")
@js.native
object PixelFormat extends js.Object {
  @js.native
  sealed trait ALPHA
    extends cesiumLib.cesiumMod.CesiumNs.PixelFormat
  
  @js.native
  sealed trait DEPTH_COMPONENT
    extends cesiumLib.cesiumMod.CesiumNs.PixelFormat
  
  @js.native
  sealed trait DEPTH_STENCIL
    extends cesiumLib.cesiumMod.CesiumNs.PixelFormat
  
  @js.native
  sealed trait LUMINANCE
    extends cesiumLib.cesiumMod.CesiumNs.PixelFormat
  
  @js.native
  sealed trait LUMINANCE_ALPHA
    extends cesiumLib.cesiumMod.CesiumNs.PixelFormat
  
  @js.native
  sealed trait RGB
    extends cesiumLib.cesiumMod.CesiumNs.PixelFormat
  
  @js.native
  sealed trait RGBA
    extends cesiumLib.cesiumMod.CesiumNs.PixelFormat
  
}

