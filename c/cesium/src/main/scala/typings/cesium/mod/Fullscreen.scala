package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Fullscreen extends StObject
@JSImport("cesium", "Fullscreen")
@js.native
object Fullscreen extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Fullscreen & Double] = js.native
  
  @js.native
  sealed trait changeEventName
    extends StObject
       with Fullscreen
  /* 1 */ val changeEventName: typings.cesium.mod.Fullscreen.changeEventName & Double = js.native
  
  @js.native
  sealed trait element
    extends StObject
       with Fullscreen
  /* 0 */ val element: typings.cesium.mod.Fullscreen.element & Double = js.native
  
  @js.native
  sealed trait enabled
    extends StObject
       with Fullscreen
  /* 3 */ val enabled: typings.cesium.mod.Fullscreen.enabled & Double = js.native
  
  @js.native
  sealed trait errorEventName
    extends StObject
       with Fullscreen
  /* 2 */ val errorEventName: typings.cesium.mod.Fullscreen.errorEventName & Double = js.native
  
  def exitFullscreen(): Unit = js.native
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with Fullscreen
  /* 4 */ val fullscreen: typings.cesium.mod.Fullscreen.fullscreen & Double = js.native
  
  def requestFullscreen(element: js.Any): Unit = js.native
  
  def supportsFullscreen(): Boolean = js.native
}
