package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PixelFormat extends StObject
@JSImport("cesium", "PixelFormat")
@js.native
object PixelFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PixelFormat with Double] = js.native
  
  @js.native
  sealed trait ALPHA extends PixelFormat
  /* 2 */ val ALPHA: typings.cesium.mod.PixelFormat.ALPHA with Double = js.native
  
  @js.native
  sealed trait DEPTH_COMPONENT extends PixelFormat
  /* 0 */ val DEPTH_COMPONENT: typings.cesium.mod.PixelFormat.DEPTH_COMPONENT with Double = js.native
  
  @js.native
  sealed trait DEPTH_STENCIL extends PixelFormat
  /* 1 */ val DEPTH_STENCIL: typings.cesium.mod.PixelFormat.DEPTH_STENCIL with Double = js.native
  
  @js.native
  sealed trait LUMINANCE extends PixelFormat
  /* 5 */ val LUMINANCE: typings.cesium.mod.PixelFormat.LUMINANCE with Double = js.native
  
  @js.native
  sealed trait LUMINANCE_ALPHA extends PixelFormat
  /* 6 */ val LUMINANCE_ALPHA: typings.cesium.mod.PixelFormat.LUMINANCE_ALPHA with Double = js.native
  
  @js.native
  sealed trait RGB extends PixelFormat
  /* 3 */ val RGB: typings.cesium.mod.PixelFormat.RGB with Double = js.native
  
  @js.native
  sealed trait RGBA extends PixelFormat
  /* 4 */ val RGBA: typings.cesium.mod.PixelFormat.RGBA with Double = js.native
}
