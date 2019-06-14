package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PixelFormat extends js.Object

@JSImport("cesium", "PixelFormat")
@js.native
object PixelFormat extends js.Object {
  @js.native
  sealed trait ALPHA
    extends cesiumLib.cesiumMod.PixelFormat
  
  @js.native
  sealed trait DEPTH_COMPONENT
    extends cesiumLib.cesiumMod.PixelFormat
  
  @js.native
  sealed trait DEPTH_STENCIL
    extends cesiumLib.cesiumMod.PixelFormat
  
  @js.native
  sealed trait LUMINANCE
    extends cesiumLib.cesiumMod.PixelFormat
  
  @js.native
  sealed trait LUMINANCE_ALPHA
    extends cesiumLib.cesiumMod.PixelFormat
  
  @js.native
  sealed trait RGB
    extends cesiumLib.cesiumMod.PixelFormat
  
  @js.native
  sealed trait RGBA
    extends cesiumLib.cesiumMod.PixelFormat
  
  /* 2 */ val ALPHA: ALPHA with scala.Double = js.native
  /* 0 */ val DEPTH_COMPONENT: DEPTH_COMPONENT with scala.Double = js.native
  /* 1 */ val DEPTH_STENCIL: DEPTH_STENCIL with scala.Double = js.native
  /* 5 */ val LUMINANCE: LUMINANCE with scala.Double = js.native
  /* 6 */ val LUMINANCE_ALPHA: LUMINANCE_ALPHA with scala.Double = js.native
  /* 3 */ val RGB: RGB with scala.Double = js.native
  /* 4 */ val RGBA: RGBA with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.PixelFormat with scala.Double] = js.native
}

