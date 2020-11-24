package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureMagnificationFilter extends js.Object
@JSImport("cesium", "TextureMagnificationFilter")
@js.native
object TextureMagnificationFilter extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureMagnificationFilter with Double] = js.native
  
  @js.native
  sealed trait LINEAR extends TextureMagnificationFilter
  /* 0 */ @js.native
  object LINEAR extends TopLevel[LINEAR with Double]
  
  @js.native
  sealed trait NEAREST extends TextureMagnificationFilter
  /* 1 */ @js.native
  object NEAREST extends TopLevel[NEAREST with Double]
}
