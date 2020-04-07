package typings.babylonjs.BABYLON

import typings.std.ClipboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ClipboardInfo")
@js.native
class ClipboardInfo protected () extends js.Object {
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
  /**
    * Defines the related dom event
    */
  var event: ClipboardEvent = js.native
  /**
    * Defines the type of event (BABYLON.ClipboardEventTypes)
    */
  var `type`: Double = js.native
}

/* static members */
@JSGlobal("BABYLON.ClipboardInfo")
@js.native
object ClipboardInfo extends js.Object {
  /**
    *  Get the clipboard event's type from the keycode.
    * @param keyCode Defines the keyCode for the current keyboard event.
    * @return {number}
    */
  def GetTypeFromCharacter(keyCode: Double): Double = js.native
}

