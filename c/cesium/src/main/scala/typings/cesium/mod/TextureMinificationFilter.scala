package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureMinificationFilter extends StObject
@JSImport("cesium", "TextureMinificationFilter")
@js.native
object TextureMinificationFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureMinificationFilter with Double] = js.native
  
  @js.native
  sealed trait LINEAR extends TextureMinificationFilter
  /* 0 */ val LINEAR: typings.cesium.mod.TextureMinificationFilter.LINEAR with Double = js.native
  
  @js.native
  sealed trait LINEAR_MIPMAP_LINEAR extends TextureMinificationFilter
  /* 1 */ val LINEAR_MIPMAP_LINEAR: typings.cesium.mod.TextureMinificationFilter.LINEAR_MIPMAP_LINEAR with Double = js.native
  
  @js.native
  sealed trait LINEAR_MIPMAP_NEAREST extends TextureMinificationFilter
  /* 2 */ val LINEAR_MIPMAP_NEAREST: typings.cesium.mod.TextureMinificationFilter.LINEAR_MIPMAP_NEAREST with Double = js.native
  
  @js.native
  sealed trait NEAREST extends TextureMinificationFilter
  /* 3 */ val NEAREST: typings.cesium.mod.TextureMinificationFilter.NEAREST with Double = js.native
  
  @js.native
  sealed trait NEAREST_MIPMAP_LINEAR extends TextureMinificationFilter
  /* 4 */ val NEAREST_MIPMAP_LINEAR: typings.cesium.mod.TextureMinificationFilter.NEAREST_MIPMAP_LINEAR with Double = js.native
  
  @js.native
  sealed trait NEAREST_MIPMAP_NEAREST extends TextureMinificationFilter
  /* 5 */ val NEAREST_MIPMAP_NEAREST: typings.cesium.mod.TextureMinificationFilter.NEAREST_MIPMAP_NEAREST with Double = js.native
}
