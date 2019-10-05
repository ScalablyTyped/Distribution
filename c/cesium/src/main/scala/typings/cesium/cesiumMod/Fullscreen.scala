package typings.cesium.cesiumMod

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
  
  /* 1 */ val changeEventName: typings.cesium.cesiumMod.Fullscreen.changeEventName with Double = js.native
  /* 0 */ val element: typings.cesium.cesiumMod.Fullscreen.element with Double = js.native
  /* 3 */ val enabled: typings.cesium.cesiumMod.Fullscreen.enabled with Double = js.native
  /* 2 */ val errorEventName: typings.cesium.cesiumMod.Fullscreen.errorEventName with Double = js.native
  /* 4 */ val fullscreen: typings.cesium.cesiumMod.Fullscreen.fullscreen with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Fullscreen with Double] = js.native
  def exitFullscreen(): js.UndefOr[scala.Nothing] = js.native
  def requestFullscreen(element: js.Any): js.UndefOr[scala.Nothing] = js.native
  def supportsFullscreen(): Boolean = js.native
}

