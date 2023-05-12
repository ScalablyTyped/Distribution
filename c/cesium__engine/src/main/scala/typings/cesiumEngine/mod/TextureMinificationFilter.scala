package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureMinificationFilter extends StObject
@JSImport("@cesium/engine", "TextureMinificationFilter")
@js.native
object TextureMinificationFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[TextureMinificationFilter & scala.Nothing] = js.native
  
  /**
    * Samples the texture through bi-linear interpolation of the four nearest pixels. This produces smoother results than <code>NEAREST</code> filtering.
    */
  @js.native
  sealed trait LINEAR
    extends StObject
       with TextureMinificationFilter
  /* WebGLConstants.LINEAR */ val LINEAR: typings.cesiumEngine.mod.TextureMinificationFilter.LINEAR & scala.Nothing = js.native
  
  /**
    * Read texture values with linear sampling from two adjacent mip levels and linearly interpolate the results.
    * <p>
    * This option provides a good balance of visual quality and speed when sampling from a mipmapped texture.
    * </p>
    * <p>
    * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
    * </p>
    */
  @js.native
  sealed trait LINEAR_MIPMAP_LINEAR
    extends StObject
       with TextureMinificationFilter
  /* WebGLConstants.LINEAR_MIPMAP_LINEAR */ val LINEAR_MIPMAP_LINEAR: typings.cesiumEngine.mod.TextureMinificationFilter.LINEAR_MIPMAP_LINEAR & scala.Nothing = js.native
  
  /**
    * Selects the nearest mip level and applies linear sampling within that level.
    * <p>
    * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
    * </p>
    */
  @js.native
  sealed trait LINEAR_MIPMAP_NEAREST
    extends StObject
       with TextureMinificationFilter
  /* WebGLConstants.LINEAR_MIPMAP_NEAREST */ val LINEAR_MIPMAP_NEAREST: typings.cesiumEngine.mod.TextureMinificationFilter.LINEAR_MIPMAP_NEAREST & scala.Nothing = js.native
  
  /**
    * Samples the texture by returning the closest pixel.
    */
  @js.native
  sealed trait NEAREST
    extends StObject
       with TextureMinificationFilter
  /* WebGLConstants.NEAREST */ val NEAREST: typings.cesiumEngine.mod.TextureMinificationFilter.NEAREST & scala.Nothing = js.native
  
  /**
    * Read texture values with nearest sampling from two adjacent mip levels and linearly interpolate the results.
    * <p>
    * This option provides a good balance of visual quality and speed when sampling from a mipmapped texture.
    * </p>
    * <p>
    * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
    * </p>
    */
  @js.native
  sealed trait NEAREST_MIPMAP_LINEAR
    extends StObject
       with TextureMinificationFilter
  /* WebGLConstants.NEAREST_MIPMAP_LINEAR */ val NEAREST_MIPMAP_LINEAR: typings.cesiumEngine.mod.TextureMinificationFilter.NEAREST_MIPMAP_LINEAR & scala.Nothing = js.native
  
  /**
    * Selects the nearest mip level and applies nearest sampling within that level.
    * <p>
    * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
    * </p>
    */
  @js.native
  sealed trait NEAREST_MIPMAP_NEAREST
    extends StObject
       with TextureMinificationFilter
  /* WebGLConstants.NEAREST_MIPMAP_NEAREST */ val NEAREST_MIPMAP_NEAREST: typings.cesiumEngine.mod.TextureMinificationFilter.NEAREST_MIPMAP_NEAREST & scala.Nothing = js.native
}
