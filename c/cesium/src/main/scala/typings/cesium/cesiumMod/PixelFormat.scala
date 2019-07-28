package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PixelFormat extends js.Object

@JSImport("cesium", "PixelFormat")
@js.native
object PixelFormat extends js.Object {
  @js.native
  sealed trait ALPHA extends PixelFormat
  
  @js.native
  sealed trait DEPTH_COMPONENT extends PixelFormat
  
  @js.native
  sealed trait DEPTH_STENCIL extends PixelFormat
  
  @js.native
  sealed trait LUMINANCE extends PixelFormat
  
  @js.native
  sealed trait LUMINANCE_ALPHA extends PixelFormat
  
  @js.native
  sealed trait RGB extends PixelFormat
  
  @js.native
  sealed trait RGBA extends PixelFormat
  
  /* 2 */ val ALPHA: typings.cesium.cesiumMod.PixelFormat.ALPHA with Double = js.native
  /* 0 */ val DEPTH_COMPONENT: typings.cesium.cesiumMod.PixelFormat.DEPTH_COMPONENT with Double = js.native
  /* 1 */ val DEPTH_STENCIL: typings.cesium.cesiumMod.PixelFormat.DEPTH_STENCIL with Double = js.native
  /* 5 */ val LUMINANCE: typings.cesium.cesiumMod.PixelFormat.LUMINANCE with Double = js.native
  /* 6 */ val LUMINANCE_ALPHA: typings.cesium.cesiumMod.PixelFormat.LUMINANCE_ALPHA with Double = js.native
  /* 3 */ val RGB: typings.cesium.cesiumMod.PixelFormat.RGB with Double = js.native
  /* 4 */ val RGBA: typings.cesium.cesiumMod.PixelFormat.RGBA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PixelFormat with Double] = js.native
}

