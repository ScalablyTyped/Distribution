package typings.babylonjs

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Events/keyboardEvents", JSImport.Namespace)
@js.native
object keyboardEventsMod extends js.Object {
  @js.native
  class KeyboardEventTypes () extends js.Object
  
  @js.native
  class KeyboardInfo protected () extends js.Object {
    /**
      * Instantiates a new keyboard info.
      * This class is used to store keyboard related info for the onKeyboardObservable event.
      * @param type Defines the type of event (KeyboardEventTypes)
      * @param event Defines the related dom event
      */
    def this(
      /**
      * Defines the type of event (KeyboardEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: KeyboardEvent
    ) = this()
    /**
      * Defines the related dom event
      */
    var event: KeyboardEvent = js.native
    /**
      * Defines the type of event (KeyboardEventTypes)
      */
    var `type`: Double = js.native
  }
  
  @js.native
  class KeyboardInfoPre protected () extends KeyboardInfo {
    /**
      * Instantiates a new keyboard pre info.
      * This class is used to store keyboard related info for the onPreKeyboardObservable event.
      * @param type Defines the type of event (KeyboardEventTypes)
      * @param event Defines the related dom event
      */
    def this(
      /**
      * Defines the type of event (KeyboardEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: KeyboardEvent
    ) = this()
    /**
      * Defines whether the engine should skip the next onKeyboardObservable associated to this pre.
      */
    var skipOnPointerObservable: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object KeyboardEventTypes extends js.Object {
    /**
      * The keydown event is fired when a key becomes active (pressed).
      */
    val KEYDOWN: Double = js.native
    /**
      * The keyup event is fired when a key has been released.
      */
    val KEYUP: Double = js.native
  }
  
}

