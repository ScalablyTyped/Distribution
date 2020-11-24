package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PixelFormat extends js.Object
@JSImport("cesium", "PixelFormat")
@js.native
object PixelFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PixelFormat with Double] = js.native
  
  @js.native
  sealed trait ALPHA extends PixelFormat
  /* 2 */ @js.native
  object ALPHA extends TopLevel[ALPHA with Double]
  
  @js.native
  sealed trait DEPTH_COMPONENT extends PixelFormat
  /* 0 */ @js.native
  object DEPTH_COMPONENT extends TopLevel[DEPTH_COMPONENT with Double]
  
  @js.native
  sealed trait DEPTH_STENCIL extends PixelFormat
  /* 1 */ @js.native
  object DEPTH_STENCIL extends TopLevel[DEPTH_STENCIL with Double]
  
  @js.native
  sealed trait LUMINANCE extends PixelFormat
  /* 5 */ @js.native
  object LUMINANCE extends TopLevel[LUMINANCE with Double]
  
  @js.native
  sealed trait LUMINANCE_ALPHA extends PixelFormat
  /* 6 */ @js.native
  object LUMINANCE_ALPHA extends TopLevel[LUMINANCE_ALPHA with Double]
  
  @js.native
  sealed trait RGB extends PixelFormat
  /* 3 */ @js.native
  object RGB extends TopLevel[RGB with Double]
  
  @js.native
  sealed trait RGBA extends PixelFormat
  /* 4 */ @js.native
  object RGBA extends TopLevel[RGBA with Double]
}
