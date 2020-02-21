package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureMagnificationFilter extends js.Object

@JSImport("cesium", "TextureMagnificationFilter")
@js.native
object TextureMagnificationFilter extends js.Object {
  @js.native
  sealed trait LINEAR extends TextureMagnificationFilter
  
  @js.native
  sealed trait NEAREST extends TextureMagnificationFilter
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureMagnificationFilter with Double] = js.native
  /* 0 */ @js.native
  object LINEAR extends TopLevel[LINEAR with Double]
  
  /* 1 */ @js.native
  object NEAREST extends TopLevel[NEAREST with Double]
  
}

