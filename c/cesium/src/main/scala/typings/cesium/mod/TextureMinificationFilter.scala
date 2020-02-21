package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureMinificationFilter extends js.Object

@JSImport("cesium", "TextureMinificationFilter")
@js.native
object TextureMinificationFilter extends js.Object {
  @js.native
  sealed trait LINEAR extends TextureMinificationFilter
  
  @js.native
  sealed trait LINEAR_MIPMAP_LINEAR extends TextureMinificationFilter
  
  @js.native
  sealed trait LINEAR_MIPMAP_NEAREST extends TextureMinificationFilter
  
  @js.native
  sealed trait NEAREST extends TextureMinificationFilter
  
  @js.native
  sealed trait NEAREST_MIPMAP_LINEAR extends TextureMinificationFilter
  
  @js.native
  sealed trait NEAREST_MIPMAP_NEAREST extends TextureMinificationFilter
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureMinificationFilter with Double] = js.native
  /* 0 */ @js.native
  object LINEAR extends TopLevel[LINEAR with Double]
  
  /* 1 */ @js.native
  object LINEAR_MIPMAP_LINEAR extends TopLevel[LINEAR_MIPMAP_LINEAR with Double]
  
  /* 2 */ @js.native
  object LINEAR_MIPMAP_NEAREST extends TopLevel[LINEAR_MIPMAP_NEAREST with Double]
  
  /* 3 */ @js.native
  object NEAREST extends TopLevel[NEAREST with Double]
  
  /* 4 */ @js.native
  object NEAREST_MIPMAP_LINEAR extends TopLevel[NEAREST_MIPMAP_LINEAR with Double]
  
  /* 5 */ @js.native
  object NEAREST_MIPMAP_NEAREST extends TopLevel[NEAREST_MIPMAP_NEAREST with Double]
  
}

