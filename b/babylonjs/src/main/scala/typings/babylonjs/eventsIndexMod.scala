package typings.babylonjs

import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.typesMod.Nullable
import typings.std.ClipboardEvent
import typings.std.KeyboardEvent
import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Events/index", JSImport.Namespace)
@js.native
object eventsIndexMod extends js.Object {
  @js.native
  class ClipboardEventTypes ()
    extends typings.babylonjs.clipboardEventsMod.ClipboardEventTypes
  
  @js.native
  class ClipboardInfo protected ()
    extends typings.babylonjs.clipboardEventsMod.ClipboardInfo {
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
  
  @js.native
  class KeyboardEventTypes ()
    extends typings.babylonjs.keyboardEventsMod.KeyboardEventTypes
  
  @js.native
  class KeyboardInfo protected ()
    extends typings.babylonjs.keyboardEventsMod.KeyboardInfo {
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
  }
  
  @js.native
  class KeyboardInfoPre protected ()
    extends typings.babylonjs.keyboardEventsMod.KeyboardInfoPre {
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
  }
  
  @js.native
  class PointerEventTypes ()
    extends typings.babylonjs.pointerEventsMod.PointerEventTypes
  
  @js.native
  class PointerInfo protected ()
    extends typings.babylonjs.pointerEventsMod.PointerInfo {
    def this(
      `type`: Double,
      event: MouseWheelEvent,
      /**
      * Defines the picking info associated to the info (if any)\
      */
    pickInfo: Nullable[PickingInfo]
    ) = this()
    /**
      * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      * @param pickInfo Defines the picking info associated to the info (if any)\
      */
    def this(
      `type`: Double,
      event: PointerEvent,
      /**
      * Defines the picking info associated to the info (if any)\
      */
    pickInfo: Nullable[PickingInfo]
    ) = this()
  }
  
  @js.native
  class PointerInfoBase protected ()
    extends typings.babylonjs.pointerEventsMod.PointerInfoBase {
    def this(
      /**
      * Defines the type of event (PointerEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: MouseWheelEvent
    ) = this()
    /**
      * Instantiates the base class of pointers info.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      */
    def this(
      /**
      * Defines the type of event (PointerEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: PointerEvent
    ) = this()
  }
  
  @js.native
  class PointerInfoPre protected ()
    extends typings.babylonjs.pointerEventsMod.PointerInfoPre {
    def this(`type`: Double, event: MouseWheelEvent, localX: Double, localY: Double) = this()
    /**
      * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      * @param localX Defines the local x coordinates of the pointer when the event occured
      * @param localY Defines the local y coordinates of the pointer when the event occured
      */
    def this(`type`: Double, event: PointerEvent, localX: Double, localY: Double) = this()
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
  
  /* static members */
  @js.native
  object PointerEventTypes extends js.Object {
    /**
      * The pointerdoubletap event is fired when a the object has been touched and released twice without drag.
      */
    val POINTERDOUBLETAP: Double = js.native
    /**
      * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions from no buttons depressed to at least one button depressed. For touch, it is fired when physical contact is made with the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
      */
    val POINTERDOWN: Double = js.native
    /**
      * The pointermove event is fired when a pointer changes coordinates.
      */
    val POINTERMOVE: Double = js.native
    /**
      * The pointerpick event is fired when a mesh or sprite has been picked by the pointer.
      */
    val POINTERPICK: Double = js.native
    /**
      * The pointertap event is fired when a the object has been touched and released without drag.
      */
    val POINTERTAP: Double = js.native
    /**
      * The pointerup event is fired when a pointer is no longer active.
      */
    val POINTERUP: Double = js.native
    /**
      * The pointerwheel event is fired when a mouse wheel has been rotated.
      */
    val POINTERWHEEL: Double = js.native
  }
  
}

