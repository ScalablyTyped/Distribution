package typings.babylonjs

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardEventsMod {
  
  @JSImport("babylonjs/Events/keyboardEvents", "KeyboardEventTypes")
  @js.native
  class KeyboardEventTypes () extends StObject
  /* static members */
  object KeyboardEventTypes {
    
    /**
      * The keydown event is fired when a key becomes active (pressed).
      */
    @JSImport("babylonjs/Events/keyboardEvents", "KeyboardEventTypes.KEYDOWN")
    @js.native
    val KEYDOWN: Double = js.native
    
    /**
      * The keyup event is fired when a key has been released.
      */
    @JSImport("babylonjs/Events/keyboardEvents", "KeyboardEventTypes.KEYUP")
    @js.native
    val KEYUP: Double = js.native
  }
  
  @JSImport("babylonjs/Events/keyboardEvents", "KeyboardInfo")
  @js.native
  class KeyboardInfo protected () extends StObject {
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
  
  @JSImport("babylonjs/Events/keyboardEvents", "KeyboardInfoPre")
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
}
