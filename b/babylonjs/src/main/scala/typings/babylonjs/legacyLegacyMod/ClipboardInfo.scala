package typings.babylonjs.legacyLegacyMod

import typings.std.ClipboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ClipboardInfo")
@js.native
open class ClipboardInfo protected ()
  extends typings.babylonjs.indexMod.ClipboardInfo {
  /**
    *Creates an instance of ClipboardInfo.
    * @param type Defines the type of event (BABYLON.ClipboardEventTypes)
    * @param event Defines the related dom event
    */
  def this(
    /**
    * Defines the type of event (BABYLON.ClipboardEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: ClipboardEvent
  ) = this()
}
/* static members */
object ClipboardInfo {
  
  @JSImport("babylonjs/Legacy/legacy", "ClipboardInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Get the clipboard event's type from the keycode.
    * @param keyCode Defines the keyCode for the current keyboard event.
    * @returns {number}
    */
  inline def GetTypeFromCharacter(keyCode: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTypeFromCharacter")(keyCode.asInstanceOf[js.Any]).asInstanceOf[Double]
}
