package typings.babylonjs

import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputSystemMod {
  
  @JSImport("babylonjs/DeviceInput/deviceInputSystem", "DeviceInputSystem")
  @js.native
  class DeviceInputSystem protected () extends IDisposable {
    
    /**
      * Add a gamepad to the DeviceInputSystem
      * @param gamepad A single DOM Gamepad object
      */
    var _addGamePad: js.Any = js.native
    
    /**
      * Add pointer device to DeviceInputSystem
      * @param deviceType Type of Pointer to add
      * @param deviceSlot Pointer ID (0 for mouse, pointerId for Touch)
      * @param currentX Current X at point of adding
      * @param currentY Current Y at point of adding
      */
    var _addPointerDevice: js.Any = js.native
    
    /**
      * Checks for existing connections to devices and register them, if necessary
      * Currently handles gamepads and mouse
      */
    var _checkForConnectedDevices: js.Any = js.native
    
    var _elementToAttachTo: js.Any = js.native
    
    var _gamepadConnectedEvent: js.Any = js.native
    
    var _gamepadDisconnectedEvent: js.Any = js.native
    
    var _gamepads: js.Any = js.native
    
    /**
      * Gets DeviceType from the device name
      * @param deviceName Name of Device from DeviceInputSystem
      * @returns DeviceType enum value
      */
    var _getGamepadDeviceType: js.Any = js.native
    
    /**
      * Handle all actions that come from gamepad interaction
      */
    var _handleGamepadActions: js.Any = js.native
    
    /**
      * Handle all actions that come from keyboard interaction
      */
    var _handleKeyActions: js.Any = js.native
    
    /**
      * Handle all actions that come from pointer interaction
      */
    var _handlePointerActions: js.Any = js.native
    
    var _inputs: js.Any = js.native
    
    var _keyboardActive: js.Any = js.native
    
    var _keyboardDownEvent: js.Any = js.native
    
    var _keyboardUpEvent: js.Any = js.native
    
    var _onDeviceConnected: js.Any = js.native
    
    var _pointerActive: js.Any = js.native
    
    var _pointerDownEvent: js.Any = js.native
    
    var _pointerMoveEvent: js.Any = js.native
    
    var _pointerUpEvent: js.Any = js.native
    
    /**
      * Add device and inputs to device array
      * @param deviceType Enum specifiying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param numberOfInputs Number of input entries to create for given device
      */
    var _registerDevice: js.Any = js.native
    
    /**
      * Given a specific device name, remove that device from the device map
      * @param deviceType Enum specifiying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      */
    var _unregisterDevice: js.Any = js.native
    
    /**
      * Update all non-event based devices with each frame
      * @param deviceType Enum specifiying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param inputIndex Id of input to be checked
      */
    var _updateDevice: js.Any = js.native
    
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
  /* static members */
  object DeviceInputSystem {
    
    @JSImport("babylonjs/DeviceInput/deviceInputSystem", "DeviceInputSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DeviceInputSystem instance
      * @param engine Engine to pull input element from
      * @returns The new instance
      */
    @JSImport("babylonjs/DeviceInput/deviceInputSystem", "DeviceInputSystem.Create")
    @js.native
    def Create(engine: Engine): DeviceInputSystem = js.native
    
    @JSImport("babylonjs/DeviceInput/deviceInputSystem", "DeviceInputSystem._MAX_KEYCODES")
    @js.native
    def _MAX_KEYCODES: js.Any = js.native
    @scala.inline
    def _MAX_KEYCODES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_KEYCODES")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/DeviceInput/deviceInputSystem", "DeviceInputSystem._MAX_POINTER_INPUTS")
    @js.native
    def _MAX_POINTER_INPUTS: js.Any = js.native
    @scala.inline
    def _MAX_POINTER_INPUTS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_POINTER_INPUTS")(x.asInstanceOf[js.Any])
  }
}
