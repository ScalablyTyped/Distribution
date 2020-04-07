package typings.babylonjs

import typings.std.ClipboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Events/clipboardEvents", JSImport.Namespace)
@js.native
object clipboardEventsMod extends js.Object {
  @js.native
  class ClipboardEventTypes () extends js.Object
  
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
  @js.native
  object ClipboardEventTypes extends js.Object {
    /**
      * The clipboard event is fired when a copy command is active (pressed).
      */
    val COPY: Double = js.native
    /**
      *  The clipboard event is fired when a cut command is active (pressed).
      */
    val CUT: Double = js.native
    /**
      * The clipboard event is fired when a paste command is active (pressed).
      */
    val PASTE: Double = js.native
  }
  
  /* static members */
  @js.native
  object ClipboardInfo extends js.Object {
    /**
      *  Get the clipboard event's type from the keycode.
      * @param keyCode Defines the keyCode for the current keyboard event.
      * @return {number}
      */
    def GetTypeFromCharacter(keyCode: Double): Double = js.native
  }
  
}

