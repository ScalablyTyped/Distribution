package typings.babylonjs

import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.deviceInputEventsMod.IUIEvent
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.inputInterfacesMod.IDeviceInputSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webDeviceInputSystemMod {
  
  @JSImport("babylonjs/DeviceInput/webDeviceInputSystem", "WebDeviceInputSystem")
  @js.native
  open class WebDeviceInputSystem protected ()
    extends StObject
       with IDeviceInputSystem {
    def this(
      engine: Engine,
      onDeviceConnected: js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit],
      onDeviceDisconnected: js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit],
      onInputChanged: js.Function3[/* deviceType */ DeviceType, /* deviceSlot */ Double, /* eventData */ IUIEvent, Unit]
    ) = this()
    
    /* private */ var _activeTouchIds: Any = js.native
    
    /**
      * Add a gamepad to the DeviceInputSystem
      * @param gamepad A single DOM Gamepad object
      */
    /* private */ var _addGamePad: Any = js.native
    
    /**
      * Add pointer device to DeviceInputSystem
      * @param deviceType Type of Pointer to add
      * @param deviceSlot Pointer ID (0 for mouse, pointerId for Touch)
      * @param currentX Current X at point of adding
      * @param currentY Current Y at point of adding
      */
    /* private */ var _addPointerDevice: Any = js.native
    
    /**
      * Checks for existing connections to devices and register them, if necessary
      * Currently handles gamepads and mouse
      */
    /* private */ var _checkForConnectedDevices: Any = js.native
    
    /**
      * Disable listening for user input events
      */
    /* private */ var _disableEvents: Any = js.native
    
    /* private */ var _elementToAttachTo: Any = js.native
    
    /**
      * Enable listening for user input events
      */
    /* private */ var _enableEvents: Any = js.native
    
    /* private */ val _engine: Any = js.native
    
    /* private */ var _eventPrefix: Any = js.native
    
    /* private */ var _eventsAttached: Any = js.native
    
    /* private */ var _gamepadConnectedEvent: Any = js.native
    
    /* private */ var _gamepadDisconnectedEvent: Any = js.native
    
    /* private */ var _gamepads: Any = js.native
    
    /**
      * Gets DeviceType from the device name
      * @param deviceName Name of Device from DeviceInputSystem
      * @returns DeviceType enum value
      */
    /* private */ var _getGamepadDeviceType: Any = js.native
    
    /**
      * Get DeviceType from a given pointer/mouse/touch event.
      * @param evt PointerEvent to evaluate
      * @returns DeviceType interpreted from event
      */
    /* private */ var _getPointerType: Any = js.native
    
    /**
      * Handle all actions that come from gamepad interaction
      */
    /* private */ var _handleGamepadActions: Any = js.native
    
    /**
      * Handle all actions that come from keyboard interaction
      */
    /* private */ var _handleKeyActions: Any = js.native
    
    /**
      * Handle all actions that come from pointer interaction
      */
    /* private */ var _handlePointerActions: Any = js.native
    
    /* private */ var _inputs: Any = js.native
    
    /* private */ val _isUsingFirefox: Any = js.native
    
    /* private */ var _keyboardActive: Any = js.native
    
    /* private */ var _keyboardBlurEvent: Any = js.native
    
    /* private */ var _keyboardDownEvent: Any = js.native
    
    /* private */ var _keyboardUpEvent: Any = js.native
    
    /* private */ var _maxTouchPoints: Any = js.native
    
    /* private */ var _metaKeys: Any = js.native
    
    /* private */ var _mouseId: Any = js.native
    
    /* private */ var _onDeviceConnected: Any = js.native
    
    /* private */ var _onDeviceDisconnected: Any = js.native
    
    /* private */ var _onInputChanged: Any = js.native
    
    /* private */ var _pointerActive: Any = js.native
    
    /* private */ var _pointerBlurEvent: Any = js.native
    
    /* private */ var _pointerCancelEvent: Any = js.native
    
    /* private */ var _pointerDownEvent: Any = js.native
    
    /* private */ var _pointerInputClearObserver: Any = js.native
    
    /* private */ var _pointerMoveEvent: Any = js.native
    
    /* private */ var _pointerUpEvent: Any = js.native
    
    /* private */ var _pointerWheelEvent: Any = js.native
    
    /**
      * Add device and inputs to device array
      * @param deviceType Enum specifying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param numberOfInputs Number of input entries to create for given device
      */
    /* private */ var _registerDevice: Any = js.native
    
    /**
      * Given a specific device name, remove that device from the device map
      * @param deviceType Enum specifying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      */
    /* private */ var _unregisterDevice: Any = js.native
    
    /**
      * Update all non-event based devices with each frame
      * @param deviceType Enum specifying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param inputIndex Id of input to be checked
      */
    /* private */ var _updateDevice: Any = js.native
    
    /* private */ val _usingMacOS: Any = js.native
    
    /* private */ val _usingSafari: Any = js.native
    
    /* private */ var _wheelEventName: Any = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Check for a specific device in the DeviceInputSystem
      * @param deviceType Type of device to check for
      * @returns bool with status of device's existence
      */
    /* CompleteClass */
    override def isDeviceAvailable(deviceType: DeviceType): Boolean = js.native
    
    /**
      * Checks for current device input value, given an id and input index. Throws exception if requested device not initialized.
      * @param deviceType Enum specifying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param inputIndex Id of input to be checked
      * @returns Current value of input
      */
    /* CompleteClass */
    override def pollInput(deviceType: DeviceType, deviceSlot: Double, inputIndex: Double): Double = js.native
  }
}
