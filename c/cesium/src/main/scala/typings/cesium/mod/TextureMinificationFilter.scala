package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureMinificationFilter extends js.Object
@JSImport("cesium", "TextureMinificationFilter")
@js.native
object TextureMinificationFilter extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureMinificationFilter with Double] = js.native
  
  @js.native
  sealed trait LINEAR extends TextureMinificationFilter
  /* 0 */ @js.native
  object LINEAR extends TopLevel[LINEAR with Double]
  
  @js.native
  sealed trait LINEAR_MIPMAP_LINEAR extends TextureMinificationFilter
  /* 1 */ @js.native
  object LINEAR_MIPMAP_LINEAR extends TopLevel[LINEAR_MIPMAP_LINEAR with Double]
  
  @js.native
  sealed trait LINEAR_MIPMAP_NEAREST extends TextureMinificationFilter
  /* 2 */ @js.native
  object LINEAR_MIPMAP_NEAREST extends TopLevel[LINEAR_MIPMAP_NEAREST with Double]
  
  @js.native
  sealed trait NEAREST extends TextureMinificationFilter
  /* 3 */ @js.native
  object NEAREST extends TopLevel[NEAREST with Double]
  
  @js.native
  sealed trait NEAREST_MIPMAP_LINEAR extends TextureMinificationFilter
  /* 4 */ @js.native
  object NEAREST_MIPMAP_LINEAR extends TopLevel[NEAREST_MIPMAP_LINEAR with Double]
  
  @js.native
  sealed trait NEAREST_MIPMAP_NEAREST extends TextureMinificationFilter
  /* 5 */ @js.native
  object NEAREST_MIPMAP_NEAREST extends TopLevel[NEAREST_MIPMAP_NEAREST with Double]
}
