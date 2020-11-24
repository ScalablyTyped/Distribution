package typings.chromeApps.global.chrome

import typings.chromeApps.anon.FAILURE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.system.cpu.CpuInfo
import typings.chromeApps.chrome.system.display.Bounds
import typings.chromeApps.chrome.system.display.DisplayInfo
import typings.chromeApps.chrome.system.display.DisplayInfoFlags
import typings.chromeApps.chrome.system.display.DisplayLayout
import typings.chromeApps.chrome.system.display.DisplayPropertiesInfo
import typings.chromeApps.chrome.system.display.Insets
import typings.chromeApps.chrome.system.display.MirrorModeInfo
import typings.chromeApps.chrome.system.display.MirrorModeInfoMixed
import typings.chromeApps.chrome.system.display.TouchCalibrationPairs
import typings.chromeApps.chrome.system.memory.MemoryInfo
import typings.chromeApps.chrome.system.network.NetworkInterface
import typings.chromeApps.chrome.system.powerSource.PowerSourceInfo
import typings.chromeApps.chrome.system.storage.StorageCapacityInfo
import typings.chromeApps.chrome.system.storage.StorageUnitInfo
import typings.chromeApps.chromeAppsStrings.IN_USE
import typings.chromeApps.chromeAppsStrings.NO_SUCH_DEVICE
import typings.chromeApps.chromeAppsStrings.SUCCESS
import typings.chromeApps.chromeAppsStrings.bottom_
import typings.chromeApps.chromeAppsStrings.failure_
import typings.chromeApps.chromeAppsStrings.fixed_
import typings.chromeApps.chromeAppsStrings.in_use_
import typings.chromeApps.chromeAppsStrings.left_
import typings.chromeApps.chromeAppsStrings.mixed
import typings.chromeApps.chromeAppsStrings.no_such_device_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.off
import typings.chromeApps.chromeAppsStrings.removable_
import typings.chromeApps.chromeAppsStrings.right_
import typings.chromeApps.chromeAppsStrings.success_
import typings.chromeApps.chromeAppsStrings.top_
import typings.chromeApps.chromeAppsStrings.unknown__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.system")
@js.native
object system extends js.Object {
  
  // #endregion
  // #region chrome.system.*
  ////////////////
  // System CPU //
  ////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: 'system.cpu'
    * @since Chrome 32.
    */
  @js.native
  object cpu extends js.Object {
    
    /** Queries basic CPU information of the system. */
    def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit = js.native
  }
  
  ////////////////////
  // System Display //
  ////////////////////
  /**
    * Use the system.display API to query display metadata.
    * Permissions: 'system.display'
    * @since Chrome 30.
    */
  @js.native
  object display extends js.Object {
    
    /**
      * Resets the touch calibration for the display and brings it back to its default state by clearing any touch calibration data associated with the display.
      * @since Chrome 57
      * @param id The display's unique identifier.
      */
    def clearTouchCalibration(id: String): Unit = js.native
    
    /**
      * Sets the touch calibration pairs for a display.
      * These **pairs** would be used to calibrate the touch screen for display with **id** called in startCustomTouchCalibration().
      * Always call **startCustomTouchCalibration** before calling this method.
      * If another touch calibration is already in progress this will throw an error.
      * @since Chrome 57
      * @param pairs The pairs of point used to calibrate the display.
      * @param bounds Bounds of the display when the touch calibration was performed. |bounds.left| and |bounds.top| values are ignored.
      * @throws Error
      */
    def completeCustomTouchCalibration(pairs: TouchCalibrationPairs, bounds: Bounds): Unit = js.native
    
    /**
      * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
      * @description
      * Enables/disables the unified desktop feature.
      * Note that this simply enables the feature, but will not change the actual desktop mode.
      * (That is, if the desktop is in mirror mode, it will stay in mirror mode)
      * @since Chrome 46
      * @param {boolean} enabled True if unified desktop should be enabled.
      */
    def enableUnifiedDesktop(enabled: Boolean): Unit = js.native
    
    /**
      * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
      * @description Requests the layout info for all displays.
      * @since Chrome 53
      * @export
      * @param callback The callback to invoke with the results.
      */
    def getDisplayLayout(callback: js.Function1[/* layouts */ js.Array[DisplayLayout], Unit]): Unit = js.native
    
    /**
      * Requests the information for all attached display devices.
      * @param callback The callback to invoke with the results.
      */
    def getInfo(callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
    /**
      * Requests the information for all attached display devices.
      * @since Chrome 59
      * @param flags Options affecting how the information is returned.
      * @param callback The callback to invoke with the results.
      */
    def getInfo(flags: DisplayInfoFlags, callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
    
    /**
      * Fired when anything changes to the display configuration.
      */
    val onDisplayChanged: typings.chromeApps.chrome.events.Event[js.Function0[Unit]] = js.native
    
    /**
      * Adjusts the current overscan insets for a display.
      * Typically this should etiher move the display along an axis (e.g. left+right have the same value)
      * or scale it along an axis (e.g. top+bottom have opposite values).
      * Each Adjust call is cumulative with previous calls since Start.
      * @since Chrome 53
      * @param id The display's unique identifier.
      * @param delta The amount to change the overscan insets.
      */
    def overscanCalibrationAdjust(id: String, delta: Insets): Unit = js.native
    
    /**
      * Complete overscan adjustments for a display by saving the current values and hiding the overlay.
      * @since Chrome 53
      * @param id The display's unique identifier.
      */
    def overscanCalibrationComplete(id: String): Unit = js.native
    
    /**
      * Resets the overscan insets for a display to the last saved value (i.e before Start was called).
      * @since Chrome 53
      * @param id The display's unique identifier.
      */
    def overscanCalibrationReset(id: String): Unit = js.native
    
    /**
      * Starts overscan calibration for a display.
      * This will show an overlay on the screen indicating the current overscan insets.
      * If overscan calibration for display **id** is in progress this will reset calibration.
      * @since Chrome 53
      * @param id The display's unique identifier.
      */
    def overscanCalibrationStart(id: String): Unit = js.native
    
    /**
      * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
      * @description
      * Set the layout for all displays.
      * Any display not included will use the default layout.
      * If a layout would overlap or be otherwise invalid it will be adjusted to a valid layout.
      * After layout is resolved, an onDisplayChanged event will be triggered.
      * @since Chrome 53
      * @param layouts The layout information, required for all displays except the primary display.
      * @param callback Empty function called when the function finishes. To find out whether the function succeeded, runtime.lastError should be queried.
      */
    def setDisplayLayout(layouts: js.Array[DisplayLayout]): Unit = js.native
    def setDisplayLayout(layouts: js.Array[DisplayLayout], callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
      * @description
      * Updates the properties for the display specified by **id**,
      * according to the information provided in **info**.
      * On failure, runtime.lastError will be set.
      * @param {string} id The display's unique identifier.
      * @param {DisplayPropertiesInfo} info The information about display properties that should be changed. A property will be changed only if a new value for it is specified in |info|.
      * @param {() => void} [callback] Empty function called when the function finishes. To find out whether the function succeeded, runtime.lastError should be queried.
      */
    def setDisplayProperties(id: String, info: DisplayPropertiesInfo): Unit = js.native
    def setDisplayProperties(id: String, info: DisplayPropertiesInfo, callback: js.Function0[Unit]): Unit = js.native
    
    def setMirrorMode(info: MirrorModeInfoMixed, callback: js.Function0[Unit]): Unit = js.native
    /**
      * @requires(CrOS Kiosk app) Chrome OS Kiosk apps only
      * @since Chrome 65.
      * @description
      * Sets the display mode to the specified mirror mode.
      * Each call resets the state from previous calls.
      * Calling setDisplayProperties() will fail for the
      * mirroring destination displays.
      */
    def setMirrorMode(info: MirrorModeInfo, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Displays the native touch calibration UX for the display with **id** as display id.
      * This will show an overlay on the screen with required instructions on how to proceed.
      * The callback will be invoked in case of successful calibraion only.
      * If the calibration fails, this will throw an error.
      * @since Chrome 57
      * @param id The display's unique identifier.
      * @param callback Optional callback to inform the caller that the touch calibration has ended. The argument of the callback informs if the calibration was a success or not.
      */
    def showNativeTouchCalibration(id: String, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
    
    /**
      * Starts custom touch calibration for a display.
      * This should be called when using a custom UX for collecting calibration data.
      * If another touch calibration is already in progress this will throw an error.
      * @since Chrome 57
      * @param id The display's unique identifier.
      */
    def startCustomTouchCalibration(id: String): Unit = js.native
    
    @js.native
    object DisplayPosition extends js.Object {
      
      var BOTTOM: bottom_ = js.native
      
      var LEFT: left_ = js.native
      
      var RIGHT: right_ = js.native
      
      var TOP: top_ = js.native
    }
    
    @js.native
    object MirrorMode extends js.Object {
      
      var MIXED: mixed = js.native
      
      var NORMAL: normal_ = js.native
      
      var OFF: off = js.native
    }
  }
  
  ///////////////////
  // System Memory //
  ///////////////////
  /**
    * The chrome.system.memory API.
    * @requires Permissions: 'system.memory'
    * @since Chrome 32.
    */
  @js.native
  object memory extends js.Object {
    
    /** Get physical memory information. */
    def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit = js.native
  }
  
  //////////////////////
  // System - Network //
  //////////////////////
  /**
    * The chrome.system.network API.
    * @requires Permissions: 'system.network'
    */
  @js.native
  object network extends js.Object {
    
    /** Retrieves information about local adapters on this system. */
    def getNetworkInterfaces(callback: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]): Unit = js.native
  }
  
  /////////////////////////
  // System Power Source //
  /////////////////////////
  /**
    * @requires(CrOS Kiosk) Chrome OS kiosk app.
    * @requires Permissions: 'system.powerSource'
    * @description The chrome.system.powerSource API allows Chrome Kiosk Apps to query the state of connected power sources.
    * @since Latest
    */
  @js.native
  object powerSource extends js.Object {
    
    /**
      * Requests information on attached power sources.
      * @param callback The callback to invoke with the results or undefined if the power source information is not known.
      */
    def getPowerSourceInfo(callback: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit]): Unit = js.native
    
    /**
      * Event for changes in the set of connected power sources.
      */
    val onPowerChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]] = js.native
    
    /**
      * Requests a power source status update.
      * Resulting power source status updates are observable using *onPowerChanged*.
      */
    def requestStatusUpdate(): Unit = js.native
    
    @js.native
    object PowerSourceType extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.chromeApps.chrome.system.powerSource.PowerSourceType with String] = js.native
      
      /* "mains" */ val mains: typings.chromeApps.chrome.system.powerSource.PowerSourceType.mains with String = js.native
      
      /* "unknown" */ val unknown: typings.chromeApps.chrome.system.powerSource.PowerSourceType.unknown with String = js.native
      
      /* "usb" */ val usb: typings.chromeApps.chrome.system.powerSource.PowerSourceType.usb with String = js.native
    }
  }
  
  ////////////////////
  // System Storage //
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * @requires Permissions: 'system.storage'
    * @since Chrome 30.
    */
  @js.native
  object storage extends js.Object {
    
    /**
      * Ejects a removable storage device.
      * @param callback
      * Parameter **result**:
      *
      * **success:** The ejection command is successful -- the application can prompt the user to remove the device;
      *
      * **in_use:** The device is in use by another application. The ejection did not succeed;
      *   the user should not remove the device until the other application is done with the device;
      *
      * **no_such_device:** There is no such device known.
      *
      * **failure:** The ejection command failed.
      */
    def ejectDevice(
      id: String,
      callback: js.Function1[
          /* result */ ToStringLiteral[
            FAILURE, 
            /* keyof chrome-apps.anon.FAILURE */ SUCCESS | IN_USE | NO_SUCH_DEVICE | typings.chromeApps.chromeAppsStrings.FAILURE, 
            Exclude[
              /* keyof chrome-apps.anon.FAILURE */ SUCCESS | IN_USE | NO_SUCH_DEVICE | typings.chromeApps.chromeAppsStrings.FAILURE, 
              success_ | in_use_ | no_such_device_ | failure_
            ]
          ], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Get the available capacity of a specified |id| storage device. The |id| is the transient device ID from StorageUnitInfo.
      * @since Dev channel only.
      */
    def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
    
    /** Get the storage information from the system. The argument passed to the callback is an array of StorageUnitInfo objects. */
    def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
    
    /** Fired when a new removable storage is attached to the system. */
    val onAttached: typings.chromeApps.chrome.events.Event[js.Function1[/* info */ StorageUnitInfo, Unit]] = js.native
    
    /** Fired when a removable storage is detached from the system. */
    val onDetached: typings.chromeApps.chrome.events.Event[js.Function1[/* id */ String, Unit]] = js.native
    
    @js.native
    object EjectDeviceResultCode extends js.Object {
      
      var FAILURE: failure_ = js.native
      
      var IN_USE: in_use_ = js.native
      
      var NO_SUCH_DEVICE: no_such_device_ = js.native
      
      var SUCCESS: success_ = js.native
    }
    
    @js.native
    object StorageUnitType extends js.Object {
      
      var FIXED: fixed_ = js.native
      
      var REMOVABLE: removable_ = js.native
      
      var UNKNOWN: unknown__ = js.native
    }
  }
}
