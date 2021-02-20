package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Fullscreen extends StObject
@JSImport("cesium", "Fullscreen")
@js.native
object Fullscreen extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Fullscreen with Double] = js.native
  
  @js.native
  sealed trait changeEventName extends Fullscreen
  /* 1 */ val changeEventName: typings.cesium.mod.Fullscreen.changeEventName with Double = js.native
  
  @js.native
  sealed trait element extends Fullscreen
  /* 0 */ val element: typings.cesium.mod.Fullscreen.element with Double = js.native
  
  @js.native
  sealed trait enabled extends Fullscreen
  /* 3 */ val enabled: typings.cesium.mod.Fullscreen.enabled with Double = js.native
  
  @js.native
  sealed trait errorEventName extends Fullscreen
  /* 2 */ val errorEventName: typings.cesium.mod.Fullscreen.errorEventName with Double = js.native
  
  def exitFullscreen(): js.UndefOr[scala.Nothing] = js.native
  
  @js.native
  sealed trait fullscreen extends Fullscreen
  /* 4 */ val fullscreen: typings.cesium.mod.Fullscreen.fullscreen with Double = js.native
  
  def requestFullscreen(element: js.Any): js.UndefOr[scala.Nothing] = js.native
  
  def supportsFullscreen(): Boolean = js.native
}
