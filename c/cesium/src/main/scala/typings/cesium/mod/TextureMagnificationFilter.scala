package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureMagnificationFilter extends StObject
@JSImport("cesium", "TextureMagnificationFilter")
@js.native
object TextureMagnificationFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureMagnificationFilter & Double] = js.native
  
  @js.native
  sealed trait LINEAR
    extends StObject
       with TextureMagnificationFilter
  /* 0 */ val LINEAR: typings.cesium.mod.TextureMagnificationFilter.LINEAR & Double = js.native
  
  @js.native
  sealed trait NEAREST
    extends StObject
       with TextureMagnificationFilter
  /* 1 */ val NEAREST: typings.cesium.mod.TextureMagnificationFilter.NEAREST & Double = js.native
}
