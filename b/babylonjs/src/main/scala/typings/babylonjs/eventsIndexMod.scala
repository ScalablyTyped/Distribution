package typings.babylonjs

import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.typesMod.Nullable
import typings.std.ClipboardEvent
import typings.std.KeyboardEvent
import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsIndexMod {
  
  @JSImport("babylonjs/Events/index", "ClipboardEventTypes")
  @js.native
  class ClipboardEventTypes ()
    extends typings.babylonjs.clipboardEventsMod.ClipboardEventTypes
  /* static members */
  object ClipboardEventTypes {
    
    /**
      * The clipboard event is fired when a copy command is active (pressed).
      */
    @JSImport("babylonjs/Events/index", "ClipboardEventTypes.COPY")
    @js.native
    val COPY: Double = js.native
    
    /**
      *  The clipboard event is fired when a cut command is active (pressed).
      */
    @JSImport("babylonjs/Events/index", "ClipboardEventTypes.CUT")
    @js.native
    val CUT: Double = js.native
    
    /**
      * The clipboard event is fired when a paste command is active (pressed).
      */
    @JSImport("babylonjs/Events/index", "ClipboardEventTypes.PASTE")
    @js.native
    val PASTE: Double = js.native
  }
  
  @JSImport("babylonjs/Events/index", "ClipboardInfo")
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
  /* static members */
  object ClipboardInfo {
    
    @JSImport("babylonjs/Events/index", "ClipboardInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Get the clipboard event's type from the keycode.
      * @param keyCode Defines the keyCode for the current keyboard event.
      * @return {number}
      */
    inline def GetTypeFromCharacter(keyCode: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTypeFromCharacter")(keyCode.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("babylonjs/Events/index", "KeyboardEventTypes")
  @js.native
  class KeyboardEventTypes ()
    extends typings.babylonjs.keyboardEventsMod.KeyboardEventTypes
  /* static members */
  object KeyboardEventTypes {
    
    /**
      * The keydown event is fired when a key becomes active (pressed).
      */
    @JSImport("babylonjs/Events/index", "KeyboardEventTypes.KEYDOWN")
    @js.native
    val KEYDOWN: Double = js.native
    
    /**
      * The keyup event is fired when a key has been released.
      */
    @JSImport("babylonjs/Events/index", "KeyboardEventTypes.KEYUP")
    @js.native
    val KEYUP: Double = js.native
  }
  
  @JSImport("babylonjs/Events/index", "KeyboardInfo")
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
  
  @JSImport("babylonjs/Events/index", "KeyboardInfoPre")
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
  
  @JSImport("babylonjs/Events/index", "PointerEventTypes")
  @js.native
  class PointerEventTypes ()
    extends typings.babylonjs.pointerEventsMod.PointerEventTypes
  /* static members */
  object PointerEventTypes {
    
    /**
      * The pointerdoubletap event is fired when a the object has been touched and released twice without drag.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERDOUBLETAP")
    @js.native
    val POINTERDOUBLETAP: Double = js.native
    
    /**
      * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions from no buttons depressed to at least one button depressed. For touch, it is fired when physical contact is made with the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERDOWN")
    @js.native
    val POINTERDOWN: Double = js.native
    
    /**
      * The pointermove event is fired when a pointer changes coordinates.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERMOVE")
    @js.native
    val POINTERMOVE: Double = js.native
    
    /**
      * The pointerpick event is fired when a mesh or sprite has been picked by the pointer.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERPICK")
    @js.native
    val POINTERPICK: Double = js.native
    
    /**
      * The pointertap event is fired when a the object has been touched and released without drag.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERTAP")
    @js.native
    val POINTERTAP: Double = js.native
    
    /**
      * The pointerup event is fired when a pointer is no longer active.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERUP")
    @js.native
    val POINTERUP: Double = js.native
    
    /**
      * The pointerwheel event is fired when a mouse wheel has been rotated.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERWHEEL")
    @js.native
    val POINTERWHEEL: Double = js.native
  }
  
  @JSImport("babylonjs/Events/index", "PointerInfo")
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
  
  @JSImport("babylonjs/Events/index", "PointerInfoBase")
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
  
  @JSImport("babylonjs/Events/index", "PointerInfoPre")
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
}
