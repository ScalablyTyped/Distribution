package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceInputSystem
  extends StObject
     with IDisposable {
  
  /**
    * Add a gamepad to the DeviceInputSystem
    * @param gamepad A single DOM Gamepad object
    */
  /* private */ var _addGamePad: js.Any = js.native
  
  /**
    * Add pointer device to DeviceInputSystem
    * @param deviceType Type of Pointer to add
    * @param deviceSlot Pointer ID (0 for mouse, pointerId for Touch)
    * @param currentX Current X at point of adding
    * @param currentY Current Y at point of adding
    */
  /* private */ var _addPointerDevice: js.Any = js.native
  
  /**
    * Checks for existing connections to devices and register them, if necessary
    * Currently handles gamepads and mouse
    */
  /* private */ var _checkForConnectedDevices: js.Any = js.native
  
  /* private */ var _elementToAttachTo: js.Any = js.native
  
  /* private */ var _gamepadConnectedEvent: js.Any = js.native
  
  /* private */ var _gamepadDisconnectedEvent: js.Any = js.native
  
  /* private */ var _gamepads: js.Any = js.native
  
  /**
    * Gets DeviceType from the device name
    * @param deviceName Name of Device from DeviceInputSystem
    * @returns DeviceType enum value
    */
  /* private */ var _getGamepadDeviceType: js.Any = js.native
  
  /**
    * Handle all actions that come from gamepad interaction
    */
  /* private */ var _handleGamepadActions: js.Any = js.native
  
  /**
    * Handle all actions that come from keyboard interaction
    */
  /* private */ var _handleKeyActions: js.Any = js.native
  
  /**
    * Handle all actions that come from pointer interaction
    */
  /* private */ var _handlePointerActions: js.Any = js.native
  
  /* private */ var _inputs: js.Any = js.native
  
  /* private */ var _keyboardActive: js.Any = js.native
  
  /* private */ var _keyboardDownEvent: js.Any = js.native
  
  /* private */ var _keyboardUpEvent: js.Any = js.native
  
  /* private */ var _onDeviceConnected: js.Any = js.native
  
  /* private */ var _pointerActive: js.Any = js.native
  
  /* private */ var _pointerDownEvent: js.Any = js.native
  
  /* private */ var _pointerMoveEvent: js.Any = js.native
  
  /* private */ var _pointerUpEvent: js.Any = js.native
  
  /**
    * Add device and inputs to device array
    * @param deviceType Enum specifiying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    * @param numberOfInputs Number of input entries to create for given device
    */
  /* private */ var _registerDevice: js.Any = js.native
  
  /**
    * Given a specific device name, remove that device from the device map
    * @param deviceType Enum specifiying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    */
  /* private */ var _unregisterDevice: js.Any = js.native
  
  /**
    * Update all non-event based devices with each frame
    * @param deviceType Enum specifiying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    * @param inputIndex Id of input to be checked
    */
  /* private */ var _updateDevice: js.Any = js.native
  
  /**
    * Returns onDeviceConnected callback property
    * @returns Callback with function to execute when a device is connected
    */
  def onDeviceConnected: js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit] = js.native
  /**
    * Sets callback function when a device is connected and executes against all connected devices
    * @param callback Function to execute when a device is connected
    */
  def onDeviceConnected_=(callback: js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit]): Unit = js.native
  
  /**
    * Callback to be triggered when a device is disconnected
    */
  def onDeviceDisconnected(deviceType: DeviceType, deviceSlot: Double): Unit = js.native
  
  /**
    * Callback to be triggered when event driven input is updated
    */
  def onInputChanged(
    deviceType: DeviceType,
    deviceSlot: Double,
    inputIndex: Double,
    previousState: Nullable[Double],
    currentState: Nullable[Double]
  ): Unit = js.native
  
  /**
    * Checks for current device input value, given an id and input index
    * @param deviceName Id of connected device
    * @param inputIndex Index of device input
    * @returns Current value of input
    */
  /**
    * Checks for current device input value, given an id and input index. Throws exception if requested device not initialized.
    * @param deviceType Enum specifiying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    * @param inputIndex Id of input to be checked
    * @returns Current value of input
    */
  def pollInput(deviceType: DeviceType, deviceSlot: Double, inputIndex: Double): Double = js.native
}
