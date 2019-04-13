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
  
  val ALPHA: ALPHA with java.lang.String = js.native
  val DEPTH_COMPONENT: DEPTH_COMPONENT with java.lang.String = js.native
  val DEPTH_STENCIL: DEPTH_STENCIL with java.lang.String = js.native
  val LUMINANCE: LUMINANCE with java.lang.String = js.native
  val LUMINANCE_ALPHA: LUMINANCE_ALPHA with java.lang.String = js.native
  val RGB: RGB with java.lang.String = js.native
  val RGBA: RGBA with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.PixelFormat with java.lang.String] = js.native
}

