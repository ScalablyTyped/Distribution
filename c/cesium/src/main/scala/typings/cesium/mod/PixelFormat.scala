package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PixelFormat extends StObject
@JSImport("cesium", "PixelFormat")
@js.native
object PixelFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PixelFormat & Double] = js.native
  
  @js.native
  sealed trait ALPHA
    extends StObject
       with PixelFormat
  /* 2 */ val ALPHA: typings.cesium.mod.PixelFormat.ALPHA & Double = js.native
  
  @js.native
  sealed trait DEPTH_COMPONENT
    extends StObject
       with PixelFormat
  /* 0 */ val DEPTH_COMPONENT: typings.cesium.mod.PixelFormat.DEPTH_COMPONENT & Double = js.native
  
  @js.native
  sealed trait DEPTH_STENCIL
    extends StObject
       with PixelFormat
  /* 1 */ val DEPTH_STENCIL: typings.cesium.mod.PixelFormat.DEPTH_STENCIL & Double = js.native
  
  @js.native
  sealed trait LUMINANCE
    extends StObject
       with PixelFormat
  /* 5 */ val LUMINANCE: typings.cesium.mod.PixelFormat.LUMINANCE & Double = js.native
  
  @js.native
  sealed trait LUMINANCE_ALPHA
    extends StObject
       with PixelFormat
  /* 6 */ val LUMINANCE_ALPHA: typings.cesium.mod.PixelFormat.LUMINANCE_ALPHA & Double = js.native
  
  @js.native
  sealed trait RGB
    extends StObject
       with PixelFormat
  /* 3 */ val RGB: typings.cesium.mod.PixelFormat.RGB & Double = js.native
  
  @js.native
  sealed trait RGBA
    extends StObject
       with PixelFormat
  /* 4 */ val RGBA: typings.cesium.mod.PixelFormat.RGBA & Double = js.native
}
