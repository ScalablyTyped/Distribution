package typings.babylonjs

import typings.babylonjs.deviceEnumsMod.PointerInput
import typings.babylonjs.deviceEnumsMod.PointerInput.Horizontal
import typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelX
import typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelY
import typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelZ
import typings.babylonjs.deviceEnumsMod.PointerInput.Vertical
import typings.babylonjs.deviceSourceMod.DeviceSourceEvent
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputEventsMod {
  
  @js.native
  sealed trait DeviceInputEventType extends StObject
  @JSImport("babylonjs/Events/deviceInputEvents", "DeviceInputEventType")
  @js.native
  object DeviceInputEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DeviceInputEventType & Double] = js.native
    
    /** PointerDown */
    @js.native
    sealed trait PointerDown
      extends StObject
         with DeviceInputEventType
    /* 1 */ val PointerDown: typings.babylonjs.deviceInputEventsMod.DeviceInputEventType.PointerDown & Double = js.native
    
    /** PointerMove */
    @js.native
    sealed trait PointerMove
      extends StObject
         with DeviceInputEventType
    /* 0 */ val PointerMove: typings.babylonjs.deviceInputEventsMod.DeviceInputEventType.PointerMove & Double = js.native
    
    /** PointerUp */
    @js.native
    sealed trait PointerUp
      extends StObject
         with DeviceInputEventType
    /* 2 */ val PointerUp: typings.babylonjs.deviceInputEventsMod.DeviceInputEventType.PointerUp & Double = js.native
  }
  
  @JSImport("babylonjs/Events/deviceInputEvents", "EventConstants")
  @js.native
  open class EventConstants () extends StObject
  /* static members */
  object EventConstants {
    
    @JSImport("babylonjs/Events/deviceInputEvents", "EventConstants")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Line delta for Wheel Events
      */
    @JSImport("babylonjs/Events/deviceInputEvents", "EventConstants.DOM_DELTA_LINE")
    @js.native
    def DOM_DELTA_LINE: Double = js.native
    inline def DOM_DELTA_LINE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DELTA_LINE")(x.asInstanceOf[js.Any])
    
    /**
      * Page delta for Wheel Events
      */
    @JSImport("babylonjs/Events/deviceInputEvents", "EventConstants.DOM_DELTA_PAGE")
    @js.native
    def DOM_DELTA_PAGE: Double = js.native
    inline def DOM_DELTA_PAGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DELTA_PAGE")(x.asInstanceOf[js.Any])
    
    /**
      * Pixel delta for Wheel Events (Default)
      */
    @JSImport("babylonjs/Events/deviceInputEvents", "EventConstants.DOM_DELTA_PIXEL")
    @js.native
    def DOM_DELTA_PIXEL: Double = js.native
    inline def DOM_DELTA_PIXEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DELTA_PIXEL")(x.asInstanceOf[js.Any])
  }
  
  trait IKeyboardEvent
    extends StObject
       with IUIEvent
       with DeviceSourceEvent[Any] {
    
    /**
      * Status of Alt key being pressed
      */
    var altKey: Boolean
    
    /**
      * Unicode value of character pressed
      * @deprecated Required for event, use keyCode instead.
      */
    var charCode: js.UndefOr[Double] = js.undefined
    
    /**
      * Code for key based on layout
      */
    var code: String
    
    /**
      * Status of Ctrl key being pressed
      */
    var ctrlKey: Boolean
    
    /**
      * String representation of key
      */
    var key: String
    
    /**
      * ASCII value of key
      * @deprecated Used with DeviceSourceManager
      */
    var keyCode: Double
    
    /**
      * Status of Meta key (eg. Windows key) being pressed
      */
    var metaKey: Boolean
    
    /**
      * Status of Shift key being pressed
      */
    var shiftKey: Boolean
  }
  object IKeyboardEvent {
    
    inline def apply(
      altKey: Boolean,
      code: String,
      ctrlKey: Boolean,
      inputIndex: Double,
      key: String,
      keyCode: Double,
      metaKey: Boolean,
      preventDefault: () => Unit,
      shiftKey: Boolean,
      target: Any,
      `type`: String
    ): IKeyboardEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyboardEvent]
    }
    
    extension [Self <: IKeyboardEvent](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      inline def setCharCodeUndefined: Self = StObject.set(x, "charCode", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMouseEvent
    extends StObject
       with IUIEvent {
    
    /**
      * Status of Alt key being pressed
      */
    var altKey: Boolean
    
    /**
      * Value of single mouse button pressed
      */
    var button: Double
    
    /**
      * Value of all mouse buttons pressed
      */
    var buttons: Double
    
    /**
      * Current X coordinate
      */
    var clientX: Double
    
    /**
      * Current Y coordinate
      */
    var clientY: Double
    
    /**
      * Status of Ctrl key being pressed
      */
    var ctrlKey: Boolean
    
    /**
      * Provides current click count
      */
    var detail: js.UndefOr[Double] = js.undefined
    
    /**
      * Subset of possible PointerInput values for events, excluding ones that CANNOT be in events organically
      */
    @JSName("inputIndex")
    var inputIndex_IMouseEvent: Exclude[PointerInput, Horizontal | Vertical]
    
    /**
      * Status of Meta key (eg. Windows key) being pressed
      */
    var metaKey: Boolean
    
    /**
      * Delta of movement on X axis
      */
    var movementX: Double
    
    /**
      * Delta of movement on Y axis
      */
    var movementY: Double
    
    /**
      * Delta of movement on X axis
      * @deprecated Use 'movementX' instead
      */
    var mozMovementX: js.UndefOr[Double] = js.undefined
    
    /**
      * Delta of movement on Y axis
      * @deprecated Use 'movementY' instead
      */
    var mozMovementY: js.UndefOr[Double] = js.undefined
    
    /**
      * Delta of movement on X axis
      * @deprecated Use 'movementX' instead
      */
    var msMovementX: js.UndefOr[Double] = js.undefined
    
    /**
      * Delta of movement on Y axis
      * @deprecated Use 'movementY' instead
      */
    var msMovementY: js.UndefOr[Double] = js.undefined
    
    /**
      * Current coordinate of X within container
      */
    var offsetX: Double
    
    /**
      * Current coordinate of Y within container
      */
    var offsetY: Double
    
    /**
      * Horizontal coordinate of event
      */
    var pageX: Double
    
    /**
      * Vertical coordinate of event
      */
    var pageY: Double
    
    /**
      * Status of Shift key being pressed
      */
    var shiftKey: Boolean
    
    /**
      * Delta of movement on X axis
      * @deprecated Use 'movementX' instead
      */
    var webkitMovementX: js.UndefOr[Double] = js.undefined
    
    /**
      * Delta of movement on Y axis
      * @deprecated Use 'movementY' instead
      */
    var webkitMovementY: js.UndefOr[Double] = js.undefined
    
    /**
      * Alias of clientX
      */
    var x: Double
    
    /**
      * Alias of clientY
      */
    var y: Double
  }
  object IMouseEvent {
    
    inline def apply(
      altKey: Boolean,
      button: Double,
      buttons: Double,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      inputIndex: Exclude[PointerInput, Horizontal | Vertical],
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      offsetX: Double,
      offsetY: Double,
      pageX: Double,
      pageY: Double,
      preventDefault: () => Unit,
      shiftKey: Boolean,
      target: Any,
      `type`: String,
      x: Double,
      y: Double
    ): IMouseEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMouseEvent]
    }
    
    extension [Self <: IMouseEvent](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setInputIndex(value: Exclude[PointerInput, Horizontal | Vertical]): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
      
      inline def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
      
      inline def setMozMovementX(value: Double): Self = StObject.set(x, "mozMovementX", value.asInstanceOf[js.Any])
      
      inline def setMozMovementXUndefined: Self = StObject.set(x, "mozMovementX", js.undefined)
      
      inline def setMozMovementY(value: Double): Self = StObject.set(x, "mozMovementY", value.asInstanceOf[js.Any])
      
      inline def setMozMovementYUndefined: Self = StObject.set(x, "mozMovementY", js.undefined)
      
      inline def setMsMovementX(value: Double): Self = StObject.set(x, "msMovementX", value.asInstanceOf[js.Any])
      
      inline def setMsMovementXUndefined: Self = StObject.set(x, "msMovementX", js.undefined)
      
      inline def setMsMovementY(value: Double): Self = StObject.set(x, "msMovementY", value.asInstanceOf[js.Any])
      
      inline def setMsMovementYUndefined: Self = StObject.set(x, "msMovementY", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setWebkitMovementX(value: Double): Self = StObject.set(x, "webkitMovementX", value.asInstanceOf[js.Any])
      
      inline def setWebkitMovementXUndefined: Self = StObject.set(x, "webkitMovementX", js.undefined)
      
      inline def setWebkitMovementY(value: Double): Self = StObject.set(x, "webkitMovementY", value.asInstanceOf[js.Any])
      
      inline def setWebkitMovementYUndefined: Self = StObject.set(x, "webkitMovementY", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPointerEvent
    extends StObject
       with IMouseEvent
       with DeviceSourceEvent[Any] {
    
    /**
      * Subset of possible PointerInput values for events, excluding ones that CANNOT be in events organically and mouse wheel values
      */
    @JSName("inputIndex")
    var inputIndex_IPointerEvent: Exclude[PointerInput, Horizontal | Vertical | MouseWheelX | MouseWheelY | MouseWheelZ]
    
    /**
      * Pointer Event ID
      */
    var pointerId: Double
    
    /**
      * Type of pointer
      */
    var pointerType: String
  }
  object IPointerEvent {
    
    inline def apply(
      altKey: Boolean,
      button: Double,
      buttons: Double,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      inputIndex: Exclude[PointerInput, Horizontal | Vertical | MouseWheelX | MouseWheelY | MouseWheelZ],
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      offsetX: Double,
      offsetY: Double,
      pageX: Double,
      pageY: Double,
      pointerId: Double,
      pointerType: String,
      preventDefault: () => Unit,
      shiftKey: Boolean,
      target: Any,
      `type`: String,
      x: Double,
      y: Double
    ): IPointerEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPointerEvent]
    }
    
    extension [Self <: IPointerEvent](x: Self) {
      
      inline def setInputIndex(value: Exclude[PointerInput, Horizontal | Vertical | MouseWheelX | MouseWheelY | MouseWheelZ]): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
      
      inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
      
      inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    }
  }
  
  trait IUIEvent extends StObject {
    
    /**
      * Current target for an event
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /**
      * Input array index
      */
    var inputIndex: Double
    
    /**
      * Tells user agent what to do when not explicitly handled
      */
    def preventDefault(): Unit
    
    /**
      * Alias for target
      * @deprecated Use target instead
      */
    var srcElement: js.UndefOr[Any] = js.undefined
    
    /**
      * Reference to object where object was dispatched
      */
    var target: Any
    
    /**
      * Type of event
      */
    var `type`: String
  }
  object IUIEvent {
    
    inline def apply(inputIndex: Double, preventDefault: () => Unit, target: Any, `type`: String): IUIEvent = {
      val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUIEvent]
    }
    
    extension [Self <: IUIEvent](x: Self) {
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setSrcElement(value: Any): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWheelEvent
    extends StObject
       with IMouseEvent
       with DeviceSourceEvent[Any] {
    
    /**
      * Units for delta value
      */
    var deltaMode: Double
    
    /**
      * Horizontal scroll delta
      */
    var deltaX: Double
    
    /**
      * Vertical scroll delta
      */
    var deltaY: Double
    
    /**
      * Z-Axis scroll delta
      */
    var deltaZ: Double
    
    /**
      * Subset of possible PointerInput values for events that can only be used with mouse wheel
      */
    @JSName("inputIndex")
    var inputIndex_IWheelEvent: MouseWheelX | MouseWheelY | MouseWheelZ
    
    /**
      * WheelDelta (From MouseWheel Event)
      * @deprecated
      */
    var wheelDelta: js.UndefOr[Double] = js.undefined
  }
  object IWheelEvent {
    
    inline def apply(
      altKey: Boolean,
      button: Double,
      buttons: Double,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      deltaMode: Double,
      deltaX: Double,
      deltaY: Double,
      deltaZ: Double,
      inputIndex: MouseWheelX | MouseWheelY | MouseWheelZ,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      offsetX: Double,
      offsetY: Double,
      pageX: Double,
      pageY: Double,
      preventDefault: () => Unit,
      shiftKey: Boolean,
      target: Any,
      `type`: String,
      x: Double,
      y: Double
    ): IWheelEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWheelEvent]
    }
    
    extension [Self <: IWheelEvent](x: Self) {
      
      inline def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
      
      inline def setInputIndex(value: MouseWheelX | MouseWheelY | MouseWheelZ): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
      
      inline def setWheelDelta(value: Double): Self = StObject.set(x, "wheelDelta", value.asInstanceOf[js.Any])
      
      inline def setWheelDeltaUndefined: Self = StObject.set(x, "wheelDelta", js.undefined)
    }
  }
}
