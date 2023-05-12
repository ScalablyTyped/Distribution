package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureMagnificationFilter extends StObject
@JSImport("@cesium/engine", "TextureMagnificationFilter")
@js.native
object TextureMagnificationFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[TextureMagnificationFilter & scala.Nothing] = js.native
  
  /**
    * Samples the texture through bi-linear interpolation of the four nearest pixels. This produces smoother results than <code>NEAREST</code> filtering.
    */
  @js.native
  sealed trait LINEAR
    extends StObject
       with TextureMagnificationFilter
  /* WebGLConstants.LINEAR */ val LINEAR: typings.cesiumEngine.mod.TextureMagnificationFilter.LINEAR & scala.Nothing = js.native
  
  /**
    * Samples the texture by returning the closest pixel.
    */
  @js.native
  sealed trait NEAREST
    extends StObject
       with TextureMagnificationFilter
  /* WebGLConstants.NEAREST */ val NEAREST: typings.cesiumEngine.mod.TextureMagnificationFilter.NEAREST & scala.Nothing = js.native
}
