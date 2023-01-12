package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebDeviceInputSystem
  extends StObject
     with IDeviceInputSystem {
  
  /* private */ var _activeTouchIds: Any
  
  /**
    * Add a gamepad to the DeviceInputSystem
    * @param gamepad A single DOM Gamepad object
    */
  /* private */ var _addGamePad: Any
  
  /**
    * Add pointer device to DeviceInputSystem
    * @param deviceType Type of Pointer to add
    * @param deviceSlot Pointer ID (0 for mouse, pointerId for Touch)
    * @param currentX Current X at point of adding
    * @param currentY Current Y at point of adding
    */
  /* private */ var _addPointerDevice: Any
  
  /**
    * Checks for existing connections to devices and register them, if necessary
    * Currently handles gamepads and mouse
    */
  /* private */ var _checkForConnectedDevices: Any
  
  /**
    * Disable listening for user input events
    */
  /* private */ var _disableEvents: Any
  
  /* private */ var _elementToAttachTo: Any
  
  /**
    * Enable listening for user input events
    */
  /* private */ var _enableEvents: Any
  
  /* private */ val _engine: Any
  
  /* private */ var _eventPrefix: Any
  
  /* private */ var _eventsAttached: Any
  
  /* private */ var _gamepadConnectedEvent: Any
  
  /* private */ var _gamepadDisconnectedEvent: Any
  
  /* private */ var _gamepads: Any
  
  /**
    * Gets DeviceType from the device name
    * @param deviceName Name of Device from DeviceInputSystem
    * @returns DeviceType enum value
    */
  /* private */ var _getGamepadDeviceType: Any
  
  /**
    * Get DeviceType from a given pointer/mouse/touch event.
    * @param evt PointerEvent to evaluate
    * @returns DeviceType interpreted from event
    */
  /* private */ var _getPointerType: Any
  
  /**
    * Handle all actions that come from gamepad interaction
    */
  /* private */ var _handleGamepadActions: Any
  
  /**
    * Handle all actions that come from keyboard interaction
    */
  /* private */ var _handleKeyActions: Any
  
  /**
    * Handle all actions that come from pointer interaction
    */
  /* private */ var _handlePointerActions: Any
  
  /* private */ var _inputs: Any
  
  /* private */ val _isUsingFirefox: Any
  
  /* private */ var _keyboardActive: Any
  
  /* private */ var _keyboardBlurEvent: Any
  
  /* private */ var _keyboardDownEvent: Any
  
  /* private */ var _keyboardUpEvent: Any
  
  /* private */ var _maxTouchPoints: Any
  
  /* private */ var _metaKeys: Any
  
  /* private */ var _mouseId: Any
  
  /* private */ var _onDeviceConnected: Any
  
  /* private */ var _onDeviceDisconnected: Any
  
  /* private */ var _onInputChanged: Any
  
  /* private */ var _pointerActive: Any
  
  /* private */ var _pointerBlurEvent: Any
  
  /* private */ var _pointerCancelEvent: Any
  
  /* private */ var _pointerDownEvent: Any
  
  /* private */ var _pointerInputClearObserver: Any
  
  /* private */ var _pointerMoveEvent: Any
  
  /* private */ var _pointerUpEvent: Any
  
  /* private */ var _pointerWheelEvent: Any
  
  /**
    * Add device and inputs to device array
    * @param deviceType Enum specifying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    * @param numberOfInputs Number of input entries to create for given device
    */
  /* private */ var _registerDevice: Any
  
  /**
    * Given a specific device name, remove that device from the device map
    * @param deviceType Enum specifying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    */
  /* private */ var _unregisterDevice: Any
  
  /**
    * Update all non-event based devices with each frame
    * @param deviceType Enum specifying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    * @param inputIndex Id of input to be checked
    */
  /* private */ var _updateDevice: Any
  
  /* private */ val _usingMacOS: Any
  
  /* private */ val _usingSafari: Any
  
  /* private */ var _wheelEventName: Any
}
object WebDeviceInputSystem {
  
  inline def apply(
    _activeTouchIds: Any,
    _addGamePad: Any,
    _addPointerDevice: Any,
    _checkForConnectedDevices: Any,
    _disableEvents: Any,
    _elementToAttachTo: Any,
    _enableEvents: Any,
    _engine: Any,
    _eventPrefix: Any,
    _eventsAttached: Any,
    _gamepadConnectedEvent: Any,
    _gamepadDisconnectedEvent: Any,
    _gamepads: Any,
    _getGamepadDeviceType: Any,
    _getPointerType: Any,
    _handleGamepadActions: Any,
    _handleKeyActions: Any,
    _handlePointerActions: Any,
    _inputs: Any,
    _isUsingFirefox: Any,
    _keyboardActive: Any,
    _keyboardBlurEvent: Any,
    _keyboardDownEvent: Any,
    _keyboardUpEvent: Any,
    _maxTouchPoints: Any,
    _metaKeys: Any,
    _mouseId: Any,
    _onDeviceConnected: Any,
    _onDeviceDisconnected: Any,
    _onInputChanged: Any,
    _pointerActive: Any,
    _pointerBlurEvent: Any,
    _pointerCancelEvent: Any,
    _pointerDownEvent: Any,
    _pointerInputClearObserver: Any,
    _pointerMoveEvent: Any,
    _pointerUpEvent: Any,
    _pointerWheelEvent: Any,
    _registerDevice: Any,
    _unregisterDevice: Any,
    _updateDevice: Any,
    _usingMacOS: Any,
    _usingSafari: Any,
    _wheelEventName: Any,
    dispose: () => Unit,
    isDeviceAvailable: DeviceType => Boolean,
    pollInput: (DeviceType, Double, Double) => Double
  ): WebDeviceInputSystem = {
    val __obj = js.Dynamic.literal(_activeTouchIds = _activeTouchIds.asInstanceOf[js.Any], _addGamePad = _addGamePad.asInstanceOf[js.Any], _addPointerDevice = _addPointerDevice.asInstanceOf[js.Any], _checkForConnectedDevices = _checkForConnectedDevices.asInstanceOf[js.Any], _disableEvents = _disableEvents.asInstanceOf[js.Any], _elementToAttachTo = _elementToAttachTo.asInstanceOf[js.Any], _enableEvents = _enableEvents.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventPrefix = _eventPrefix.asInstanceOf[js.Any], _eventsAttached = _eventsAttached.asInstanceOf[js.Any], _gamepadConnectedEvent = _gamepadConnectedEvent.asInstanceOf[js.Any], _gamepadDisconnectedEvent = _gamepadDisconnectedEvent.asInstanceOf[js.Any], _gamepads = _gamepads.asInstanceOf[js.Any], _getGamepadDeviceType = _getGamepadDeviceType.asInstanceOf[js.Any], _getPointerType = _getPointerType.asInstanceOf[js.Any], _handleGamepadActions = _handleGamepadActions.asInstanceOf[js.Any], _handleKeyActions = _handleKeyActions.asInstanceOf[js.Any], _handlePointerActions = _handlePointerActions.asInstanceOf[js.Any], _inputs = _inputs.asInstanceOf[js.Any], _isUsingFirefox = _isUsingFirefox.asInstanceOf[js.Any], _keyboardActive = _keyboardActive.asInstanceOf[js.Any], _keyboardBlurEvent = _keyboardBlurEvent.asInstanceOf[js.Any], _keyboardDownEvent = _keyboardDownEvent.asInstanceOf[js.Any], _keyboardUpEvent = _keyboardUpEvent.asInstanceOf[js.Any], _maxTouchPoints = _maxTouchPoints.asInstanceOf[js.Any], _metaKeys = _metaKeys.asInstanceOf[js.Any], _mouseId = _mouseId.asInstanceOf[js.Any], _onDeviceConnected = _onDeviceConnected.asInstanceOf[js.Any], _onDeviceDisconnected = _onDeviceDisconnected.asInstanceOf[js.Any], _onInputChanged = _onInputChanged.asInstanceOf[js.Any], _pointerActive = _pointerActive.asInstanceOf[js.Any], _pointerBlurEvent = _pointerBlurEvent.asInstanceOf[js.Any], _pointerCancelEvent = _pointerCancelEvent.asInstanceOf[js.Any], _pointerDownEvent = _pointerDownEvent.asInstanceOf[js.Any], _pointerInputClearObserver = _pointerInputClearObserver.asInstanceOf[js.Any], _pointerMoveEvent = _pointerMoveEvent.asInstanceOf[js.Any], _pointerUpEvent = _pointerUpEvent.asInstanceOf[js.Any], _pointerWheelEvent = _pointerWheelEvent.asInstanceOf[js.Any], _registerDevice = _registerDevice.asInstanceOf[js.Any], _unregisterDevice = _unregisterDevice.asInstanceOf[js.Any], _updateDevice = _updateDevice.asInstanceOf[js.Any], _usingMacOS = _usingMacOS.asInstanceOf[js.Any], _usingSafari = _usingSafari.asInstanceOf[js.Any], _wheelEventName = _wheelEventName.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDeviceAvailable = js.Any.fromFunction1(isDeviceAvailable), pollInput = js.Any.fromFunction3(pollInput))
    __obj.asInstanceOf[WebDeviceInputSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebDeviceInputSystem] (val x: Self) extends AnyVal {
    
    inline def set_activeTouchIds(value: Any): Self = StObject.set(x, "_activeTouchIds", value.asInstanceOf[js.Any])
    
    inline def set_addGamePad(value: Any): Self = StObject.set(x, "_addGamePad", value.asInstanceOf[js.Any])
    
    inline def set_addPointerDevice(value: Any): Self = StObject.set(x, "_addPointerDevice", value.asInstanceOf[js.Any])
    
    inline def set_checkForConnectedDevices(value: Any): Self = StObject.set(x, "_checkForConnectedDevices", value.asInstanceOf[js.Any])
    
    inline def set_disableEvents(value: Any): Self = StObject.set(x, "_disableEvents", value.asInstanceOf[js.Any])
    
    inline def set_elementToAttachTo(value: Any): Self = StObject.set(x, "_elementToAttachTo", value.asInstanceOf[js.Any])
    
    inline def set_enableEvents(value: Any): Self = StObject.set(x, "_enableEvents", value.asInstanceOf[js.Any])
    
    inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
    
    inline def set_eventPrefix(value: Any): Self = StObject.set(x, "_eventPrefix", value.asInstanceOf[js.Any])
    
    inline def set_eventsAttached(value: Any): Self = StObject.set(x, "_eventsAttached", value.asInstanceOf[js.Any])
    
    inline def set_gamepadConnectedEvent(value: Any): Self = StObject.set(x, "_gamepadConnectedEvent", value.asInstanceOf[js.Any])
    
    inline def set_gamepadDisconnectedEvent(value: Any): Self = StObject.set(x, "_gamepadDisconnectedEvent", value.asInstanceOf[js.Any])
    
    inline def set_gamepads(value: Any): Self = StObject.set(x, "_gamepads", value.asInstanceOf[js.Any])
    
    inline def set_getGamepadDeviceType(value: Any): Self = StObject.set(x, "_getGamepadDeviceType", value.asInstanceOf[js.Any])
    
    inline def set_getPointerType(value: Any): Self = StObject.set(x, "_getPointerType", value.asInstanceOf[js.Any])
    
    inline def set_handleGamepadActions(value: Any): Self = StObject.set(x, "_handleGamepadActions", value.asInstanceOf[js.Any])
    
    inline def set_handleKeyActions(value: Any): Self = StObject.set(x, "_handleKeyActions", value.asInstanceOf[js.Any])
    
    inline def set_handlePointerActions(value: Any): Self = StObject.set(x, "_handlePointerActions", value.asInstanceOf[js.Any])
    
    inline def set_inputs(value: Any): Self = StObject.set(x, "_inputs", value.asInstanceOf[js.Any])
    
    inline def set_isUsingFirefox(value: Any): Self = StObject.set(x, "_isUsingFirefox", value.asInstanceOf[js.Any])
    
    inline def set_keyboardActive(value: Any): Self = StObject.set(x, "_keyboardActive", value.asInstanceOf[js.Any])
    
    inline def set_keyboardBlurEvent(value: Any): Self = StObject.set(x, "_keyboardBlurEvent", value.asInstanceOf[js.Any])
    
    inline def set_keyboardDownEvent(value: Any): Self = StObject.set(x, "_keyboardDownEvent", value.asInstanceOf[js.Any])
    
    inline def set_keyboardUpEvent(value: Any): Self = StObject.set(x, "_keyboardUpEvent", value.asInstanceOf[js.Any])
    
    inline def set_maxTouchPoints(value: Any): Self = StObject.set(x, "_maxTouchPoints", value.asInstanceOf[js.Any])
    
    inline def set_metaKeys(value: Any): Self = StObject.set(x, "_metaKeys", value.asInstanceOf[js.Any])
    
    inline def set_mouseId(value: Any): Self = StObject.set(x, "_mouseId", value.asInstanceOf[js.Any])
    
    inline def set_onDeviceConnected(value: Any): Self = StObject.set(x, "_onDeviceConnected", value.asInstanceOf[js.Any])
    
    inline def set_onDeviceDisconnected(value: Any): Self = StObject.set(x, "_onDeviceDisconnected", value.asInstanceOf[js.Any])
    
    inline def set_onInputChanged(value: Any): Self = StObject.set(x, "_onInputChanged", value.asInstanceOf[js.Any])
    
    inline def set_pointerActive(value: Any): Self = StObject.set(x, "_pointerActive", value.asInstanceOf[js.Any])
    
    inline def set_pointerBlurEvent(value: Any): Self = StObject.set(x, "_pointerBlurEvent", value.asInstanceOf[js.Any])
    
    inline def set_pointerCancelEvent(value: Any): Self = StObject.set(x, "_pointerCancelEvent", value.asInstanceOf[js.Any])
    
    inline def set_pointerDownEvent(value: Any): Self = StObject.set(x, "_pointerDownEvent", value.asInstanceOf[js.Any])
    
    inline def set_pointerInputClearObserver(value: Any): Self = StObject.set(x, "_pointerInputClearObserver", value.asInstanceOf[js.Any])
    
    inline def set_pointerMoveEvent(value: Any): Self = StObject.set(x, "_pointerMoveEvent", value.asInstanceOf[js.Any])
    
    inline def set_pointerUpEvent(value: Any): Self = StObject.set(x, "_pointerUpEvent", value.asInstanceOf[js.Any])
    
    inline def set_pointerWheelEvent(value: Any): Self = StObject.set(x, "_pointerWheelEvent", value.asInstanceOf[js.Any])
    
    inline def set_registerDevice(value: Any): Self = StObject.set(x, "_registerDevice", value.asInstanceOf[js.Any])
    
    inline def set_unregisterDevice(value: Any): Self = StObject.set(x, "_unregisterDevice", value.asInstanceOf[js.Any])
    
    inline def set_updateDevice(value: Any): Self = StObject.set(x, "_updateDevice", value.asInstanceOf[js.Any])
    
    inline def set_usingMacOS(value: Any): Self = StObject.set(x, "_usingMacOS", value.asInstanceOf[js.Any])
    
    inline def set_usingSafari(value: Any): Self = StObject.set(x, "_usingSafari", value.asInstanceOf[js.Any])
    
    inline def set_wheelEventName(value: Any): Self = StObject.set(x, "_wheelEventName", value.asInstanceOf[js.Any])
  }
}
