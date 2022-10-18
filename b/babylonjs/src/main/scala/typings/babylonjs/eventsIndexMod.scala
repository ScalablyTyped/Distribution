package typings.babylonjs

import typings.babylonjs.collisionsPickingInfoMod.PickingInfo
import typings.babylonjs.eventsDeviceInputEventsMod.IKeyboardEvent
import typings.babylonjs.eventsDeviceInputEventsMod.IMouseEvent
import typings.babylonjs.typesMod.Nullable
import typings.std.ClipboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsIndexMod {
  
  @JSImport("babylonjs/Events/index", "ClipboardEventTypes")
  @js.native
  open class ClipboardEventTypes ()
    extends typings.babylonjs.eventsClipboardEventsMod.ClipboardEventTypes
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
  open class ClipboardInfo protected ()
    extends typings.babylonjs.eventsClipboardEventsMod.ClipboardInfo {
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
      * @returns {number}
      */
    inline def GetTypeFromCharacter(keyCode: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTypeFromCharacter")(keyCode.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("babylonjs/Events/index", "DeviceInputEventType")
  @js.native
  object DeviceInputEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.eventsDeviceInputEventsMod.DeviceInputEventType & Double] = js.native
    
    /* 1 */ val PointerDown: typings.babylonjs.eventsDeviceInputEventsMod.DeviceInputEventType.PointerDown & Double = js.native
    
    /* 0 */ val PointerMove: typings.babylonjs.eventsDeviceInputEventsMod.DeviceInputEventType.PointerMove & Double = js.native
    
    /* 2 */ val PointerUp: typings.babylonjs.eventsDeviceInputEventsMod.DeviceInputEventType.PointerUp & Double = js.native
  }
  
  @JSImport("babylonjs/Events/index", "EventConstants")
  @js.native
  open class EventConstants ()
    extends typings.babylonjs.eventsDeviceInputEventsMod.EventConstants
  /* static members */
  object EventConstants {
    
    @JSImport("babylonjs/Events/index", "EventConstants")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Line delta for Wheel Events
      */
    @JSImport("babylonjs/Events/index", "EventConstants.DOM_DELTA_LINE")
    @js.native
    def DOM_DELTA_LINE: Double = js.native
    inline def DOM_DELTA_LINE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DELTA_LINE")(x.asInstanceOf[js.Any])
    
    /**
      * Page delta for Wheel Events
      */
    @JSImport("babylonjs/Events/index", "EventConstants.DOM_DELTA_PAGE")
    @js.native
    def DOM_DELTA_PAGE: Double = js.native
    inline def DOM_DELTA_PAGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DELTA_PAGE")(x.asInstanceOf[js.Any])
    
    /**
      * Pixel delta for Wheel Events (Default)
      */
    @JSImport("babylonjs/Events/index", "EventConstants.DOM_DELTA_PIXEL")
    @js.native
    def DOM_DELTA_PIXEL: Double = js.native
    inline def DOM_DELTA_PIXEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DELTA_PIXEL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Events/index", "KeyboardEventTypes")
  @js.native
  open class KeyboardEventTypes ()
    extends typings.babylonjs.eventsKeyboardEventsMod.KeyboardEventTypes
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
  open class KeyboardInfo protected ()
    extends typings.babylonjs.eventsKeyboardEventsMod.KeyboardInfo {
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
    event: IKeyboardEvent
    ) = this()
  }
  
  @JSImport("babylonjs/Events/index", "KeyboardInfoPre")
  @js.native
  open class KeyboardInfoPre protected ()
    extends typings.babylonjs.eventsKeyboardEventsMod.KeyboardInfoPre {
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
    event: IKeyboardEvent
    ) = this()
  }
  
  @JSImport("babylonjs/Events/index", "PointerEventTypes")
  @js.native
  open class PointerEventTypes ()
    extends typings.babylonjs.eventsPointerEventsMod.PointerEventTypes
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
  open class PointerInfo protected ()
    extends typings.babylonjs.eventsPointerEventsMod.PointerInfo {
    /**
      * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      * @param pickInfo Defines the picking info associated to the info (if any)\
      */
    def this(
      `type`: Double,
      event: IMouseEvent,
      /**
      * Defines the picking info associated to the info (if any)\
      */
    pickInfo: Nullable[PickingInfo]
    ) = this()
  }
  
  @JSImport("babylonjs/Events/index", "PointerInfoBase")
  @js.native
  open class PointerInfoBase protected ()
    extends typings.babylonjs.eventsPointerEventsMod.PointerInfoBase {
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
    event: IMouseEvent
    ) = this()
  }
  
  @JSImport("babylonjs/Events/index", "PointerInfoPre")
  @js.native
  open class PointerInfoPre protected ()
    extends typings.babylonjs.eventsPointerEventsMod.PointerInfoPre {
    /**
      * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      * @param localX Defines the local x coordinates of the pointer when the event occured
      * @param localY Defines the local y coordinates of the pointer when the event occured
      */
    def this(`type`: Double, event: IMouseEvent, localX: Double, localY: Double) = this()
  }
}
