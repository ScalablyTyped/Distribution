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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object system {
  
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
  object cpu {
    
    @JSGlobal("chrome.system.cpu")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Queries basic CPU information of the system.
      * @returns Promise<CpuInfo> only if callback is not specified
      */
    inline def getInfo(): js.Promise[CpuInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")().asInstanceOf[js.Promise[CpuInfo]]
    /**
      * Queries basic CPU information of the system.
      * @param callback takes in an argument with CpuInfo
      */
    inline def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  ////////////////////
  // System Display //
  ////////////////////
  /**
    * Use the system.display API to query display metadata.
    * Permissions: 'system.display'
    * @since Chrome 30.
    */
  object display {
    
    @JSGlobal("chrome.system.display")
    @js.native
    val ^ : js.Any = js.native
    
    object DisplayPosition {
      
      @JSGlobal("chrome.system.display.DisplayPosition")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.system.display.DisplayPosition.BOTTOM")
      @js.native
      def BOTTOM: bottom_ = js.native
      inline def BOTTOM_=(x: bottom_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.DisplayPosition.LEFT")
      @js.native
      def LEFT: left_ = js.native
      inline def LEFT_=(x: left_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.DisplayPosition.RIGHT")
      @js.native
      def RIGHT: right_ = js.native
      inline def RIGHT_=(x: right_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.DisplayPosition.TOP")
      @js.native
      def TOP: top_ = js.native
      inline def TOP_=(x: top_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
    }
    
    object MirrorMode {
      
      @JSGlobal("chrome.system.display.MirrorMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.system.display.MirrorMode.MIXED")
      @js.native
      def MIXED: mixed = js.native
      inline def MIXED_=(x: mixed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIXED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.MirrorMode.NORMAL")
      @js.native
      def NORMAL: normal_ = js.native
      inline def NORMAL_=(x: normal_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.MirrorMode.OFF")
      @js.native
      def OFF: off = js.native
      inline def OFF_=(x: off): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFF")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Resets the touch calibration for the display and brings it back to its default state by clearing any touch calibration data associated with the display.
      * @since Chrome 57
      * @param id The display's unique identifier.
      */
    inline def clearTouchCalibration(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTouchCalibration")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def completeCustomTouchCalibration(pairs: TouchCalibrationPairs, bounds: Bounds): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("completeCustomTouchCalibration")(pairs.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @requires CrOS Kiosk apps | WebUI -This is only available to Chrome OS Kiosk apps and Web UI.
      * @description
      * Enables/disables the unified desktop feature.
      * Note that this simply enables the feature, but will not change the actual desktop mode.
      * (That is, if the desktop is in mirror mode, it will stay in mirror mode)
      * @since Chrome 46
      * @param {boolean} enabled True if unified desktop should be enabled.
      */
    inline def enableUnifiedDesktop(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableUnifiedDesktop")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @requires CrOS Kiosk apps | WebUI -This is only available to Chrome OS Kiosk apps and Web UI.
      * @description Requests the layout info for all displays.
      * @since Chrome 53
      * @export
      * @param callback The callback to invoke with the results.
      */
    inline def getDisplayLayout(callback: js.Function1[/* layouts */ js.Array[DisplayLayout], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLayout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Requests the information for all attached display devices.
      * @param callback The callback to invoke with the results.
      */
    inline def getInfo(callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      * Requests the information for all attached display devices.
      * @since Chrome 59
      * @param flags Options affecting how the information is returned.
      * @param callback The callback to invoke with the results.
      */
    inline def getInfo(flags: DisplayInfoFlags, callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Fired when anything changes to the display configuration.
      */
    @JSGlobal("chrome.system.display.onDisplayChanged")
    @js.native
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
    inline def overscanCalibrationAdjust(id: String, delta: Insets): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("overscanCalibrationAdjust")(id.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Complete overscan adjustments for a display by saving the current values and hiding the overlay.
      * @since Chrome 53
      * @param id The display's unique identifier.
      */
    inline def overscanCalibrationComplete(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overscanCalibrationComplete")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Resets the overscan insets for a display to the last saved value (i.e before Start was called).
      * @since Chrome 53
      * @param id The display's unique identifier.
      */
    inline def overscanCalibrationReset(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overscanCalibrationReset")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Starts overscan calibration for a display.
      * This will show an overlay on the screen indicating the current overscan insets.
      * If overscan calibration for display **id** is in progress this will reset calibration.
      * @since Chrome 53
      * @param id The display's unique identifier.
      */
    inline def overscanCalibrationStart(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overscanCalibrationStart")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @requires CrOS Kiosk apps | WebUI -This is only available to Chrome OS Kiosk apps and Web UI.
      * @description
      * Set the layout for all displays.
      * Any display not included will use the default layout.
      * If a layout would overlap or be otherwise invalid it will be adjusted to a valid layout.
      * After layout is resolved, an onDisplayChanged event will be triggered.
      * @since Chrome 53
      * @param layouts The layout information, required for all displays except the primary display.
      * @param callback Empty function called when the function finishes. To find out whether the function succeeded, runtime.lastError should be queried.
      */
    inline def setDisplayLayout(layouts: js.Array[DisplayLayout]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayLayout")(layouts.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setDisplayLayout(layouts: js.Array[DisplayLayout], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayLayout")(layouts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @requires CrOS Kiosk apps | WebUI -This is only available to Chrome OS Kiosk apps and Web UI.
      * @description
      * Updates the properties for the display specified by **id**,
      * according to the information provided in **info**.
      * On failure, runtime.lastError will be set.
      * @param {string} id The display's unique identifier.
      * @param {DisplayPropertiesInfo} info The information about display properties that should be changed. A property will be changed only if a new value for it is specified in |info|.
      * @param {() => void} [callback] Empty function called when the function finishes. To find out whether the function succeeded, runtime.lastError should be queried.
      */
    inline def setDisplayProperties(id: String, info: DisplayPropertiesInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayProperties")(id.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setDisplayProperties(id: String, info: DisplayPropertiesInfo, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayProperties")(id.asInstanceOf[js.Any], info.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setMirrorMode(info: MirrorModeInfoMixed, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMirrorMode")(info.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * @requires CrOS Kiosk app -Chrome OS Kiosk apps only
      * @since Chrome 65.
      * @description
      * Sets the display mode to the specified mirror mode.
      * Each call resets the state from previous calls.
      * Calling setDisplayProperties() will fail for the
      * mirroring destination displays.
      */
    inline def setMirrorMode(info: MirrorModeInfo, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMirrorMode")(info.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Displays the native touch calibration UX for the display with **id** as display id.
      * This will show an overlay on the screen with required instructions on how to proceed.
      * The callback will be invoked in case of successful calibraion only.
      * If the calibration fails, this will throw an error.
      * @since Chrome 57
      * @param id The display's unique identifier.
      * @param callback Optional callback to inform the caller that the touch calibration has ended. The argument of the callback informs if the calibration was a success or not.
      */
    inline def showNativeTouchCalibration(id: String, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showNativeTouchCalibration")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Starts custom touch calibration for a display.
      * This should be called when using a custom UX for collecting calibration data.
      * If another touch calibration is already in progress this will throw an error.
      * @since Chrome 57
      * @param id The display's unique identifier.
      */
    inline def startCustomTouchCalibration(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startCustomTouchCalibration")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  ///////////////////
  // System Memory //
  ///////////////////
  /**
    * The chrome.system.memory API.
    * @requires Permissions: 'system.memory'
    * @since Chrome 32.
    */
  object memory {
    
    @JSGlobal("chrome.system.memory")
    @js.native
    val ^ : js.Any = js.native
    
    /** Get physical memory information. */
    inline def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  //////////////////////
  // System - Network //
  //////////////////////
  /**
    * The chrome.system.network API.
    * @requires Permissions: 'system.network'
    */
  object network {
    
    @JSGlobal("chrome.system.network")
    @js.native
    val ^ : js.Any = js.native
    
    /** Retrieves information about local adapters on this system. */
    inline def getNetworkInterfaces(callback: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterfaces")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /////////////////////////
  // System Power Source //
  /////////////////////////
  /**
    * @requires CrOS Kiosk -Chrome OS kiosk app.
    * @requires Permissions: 'system.powerSource'
    * @description The chrome.system.powerSource API allows Chrome Kiosk Apps to query the state of connected power sources.
    * @since Latest
    */
  object powerSource {
    
    @JSGlobal("chrome.system.powerSource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.system.powerSource.PowerSourceType")
    @js.native
    object PowerSourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.chromeApps.chrome.system.powerSource.PowerSourceType & String] = js.native
      
      /* "mains" */ val mains: typings.chromeApps.chrome.system.powerSource.PowerSourceType.mains & String = js.native
      
      /* "unknown" */ val unknown: typings.chromeApps.chrome.system.powerSource.PowerSourceType.unknown & String = js.native
      
      /* "usb" */ val usb: typings.chromeApps.chrome.system.powerSource.PowerSourceType.usb & String = js.native
    }
    
    /**
      * Requests information on attached power sources.
      * @param callback The callback to invoke with the results or undefined if the power source information is not known.
      */
    inline def getPowerSourceInfo(callback: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPowerSourceInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Event for changes in the set of connected power sources.
      */
    @JSGlobal("chrome.system.powerSource.onPowerChanged")
    @js.native
    val onPowerChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]] = js.native
    
    /**
      * Requests a power source status update.
      * Resulting power source status updates are observable using *onPowerChanged*.
      */
    inline def requestStatusUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStatusUpdate")().asInstanceOf[Unit]
  }
  
  ////////////////////
  // System Storage //
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * @requires Permissions: 'system.storage'
    * @since Chrome 30.
    */
  object storage {
    
    @JSGlobal("chrome.system.storage")
    @js.native
    val ^ : js.Any = js.native
    
    object EjectDeviceResultCode {
      
      @JSGlobal("chrome.system.storage.EjectDeviceResultCode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.system.storage.EjectDeviceResultCode.FAILURE")
      @js.native
      def FAILURE: failure_ = js.native
      inline def FAILURE_=(x: failure_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.storage.EjectDeviceResultCode.IN_USE")
      @js.native
      def IN_USE: in_use_ = js.native
      inline def IN_USE_=(x: in_use_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IN_USE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.storage.EjectDeviceResultCode.NO_SUCH_DEVICE")
      @js.native
      def NO_SUCH_DEVICE: no_such_device_ = js.native
      inline def NO_SUCH_DEVICE_=(x: no_such_device_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SUCH_DEVICE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.storage.EjectDeviceResultCode.SUCCESS")
      @js.native
      def SUCCESS: success_ = js.native
      inline def SUCCESS_=(x: success_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    }
    
    object StorageUnitType {
      
      @JSGlobal("chrome.system.storage.StorageUnitType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.system.storage.StorageUnitType.FIXED")
      @js.native
      def FIXED: fixed_ = js.native
      inline def FIXED_=(x: fixed_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.storage.StorageUnitType.REMOVABLE")
      @js.native
      def REMOVABLE: removable_ = js.native
      inline def REMOVABLE_=(x: removable_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVABLE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.storage.StorageUnitType.UNKNOWN")
      @js.native
      def UNKNOWN: unknown__ = js.native
      inline def UNKNOWN_=(x: unknown__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    }
    
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
    inline def ejectDevice(
      id: String,
      callback: js.Function1[
          /* result */ ToStringLiteral[
            FAILURE, 
            /* keyof chrome-apps.anon.FAILURE */ SUCCESS | IN_USE | NO_SUCH_DEVICE | typings.chromeApps.chromeAppsStrings.FAILURE, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof {  SUCCESS :'success',   IN_USE :'in_use',   NO_SUCH_DEVICE :'no_such_device',   FAILURE :'failure'} extends keyof {  SUCCESS :'success',   IN_USE :'in_use',   NO_SUCH_DEVICE :'no_such_device',   FAILURE :'failure'} ? std.Exclude<keyof {  SUCCESS :'success',   IN_USE :'in_use',   NO_SUCH_DEVICE :'no_such_device',   FAILURE :'failure'}, 'success' | 'in_use' | 'no_such_device' | 'failure'> : never */ js.Any
          ], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ejectDevice")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Get the available capacity of a specified |id| storage device. The |id| is the transient device ID from StorageUnitInfo.
      * @since Dev channel only.
      */
    inline def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableCapacity")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Get the storage information from the system. The argument passed to the callback is an array of StorageUnitInfo objects. */
    inline def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Fired when a new removable storage is attached to the system. */
    @JSGlobal("chrome.system.storage.onAttached")
    @js.native
    val onAttached: typings.chromeApps.chrome.events.Event[js.Function1[/* info */ StorageUnitInfo, Unit]] = js.native
    
    /** Fired when a removable storage is detached from the system. */
    @JSGlobal("chrome.system.storage.onDetached")
    @js.native
    val onDetached: typings.chromeApps.chrome.events.Event[js.Function1[/* id */ String, Unit]] = js.native
  }
}
