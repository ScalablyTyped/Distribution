package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Fullscreen extends js.Object

@JSImport("cesium", "Fullscreen")
@js.native
object Fullscreen extends js.Object {
  @js.native
  sealed trait changeEventName extends Fullscreen
  
  @js.native
  sealed trait element extends Fullscreen
  
  @js.native
  sealed trait enabled extends Fullscreen
  
  @js.native
  sealed trait errorEventName extends Fullscreen
  
  @js.native
  sealed trait fullscreen extends Fullscreen
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Fullscreen with Double] = js.native
  def exitFullscreen(): js.UndefOr[scala.Nothing] = js.native
  def requestFullscreen(element: js.Any): js.UndefOr[scala.Nothing] = js.native
  def supportsFullscreen(): Boolean = js.native
  /* 1 */ @js.native
  object changeEventName extends TopLevel[changeEventName with Double]
  
  /* 0 */ @js.native
  object element extends TopLevel[element with Double]
  
  /* 3 */ @js.native
  object enabled extends TopLevel[enabled with Double]
  
  /* 2 */ @js.native
  object errorEventName extends TopLevel[errorEventName with Double]
  
  /* 4 */ @js.native
  object fullscreen extends TopLevel[fullscreen with Double]
  
}

