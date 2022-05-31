package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Fullscreen")
@js.native
object Fullscreen extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.cesium.mod.Fullscreen & Double] = js.native
  
  /* 1 */ val changeEventName: typings.cesium.mod.Fullscreen.changeEventName & Double = js.native
  
  /* 0 */ val element: typings.cesium.mod.Fullscreen.element & Double = js.native
  
  /* 3 */ val enabled: typings.cesium.mod.Fullscreen.enabled & Double = js.native
  
  /* 2 */ val errorEventName: typings.cesium.mod.Fullscreen.errorEventName & Double = js.native
  
  def exitFullscreen(): Unit = js.native
  
  /* 4 */ val fullscreen: typings.cesium.mod.Fullscreen.fullscreen & Double = js.native
  
  def requestFullscreen(element: js.Any): Unit = js.native
  
  def supportsFullscreen(): Boolean = js.native
}
