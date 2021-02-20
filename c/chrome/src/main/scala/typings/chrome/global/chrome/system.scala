package typings.chrome.global.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.system.cpu.CpuInfo
import typings.chrome.chrome.system.display.Bounds
import typings.chrome.chrome.system.display.DisplayInfo
import typings.chrome.chrome.system.display.DisplayInfoFlags
import typings.chrome.chrome.system.display.DisplayLayout
import typings.chrome.chrome.system.display.DisplayPropertiesInfo
import typings.chrome.chrome.system.display.Insets
import typings.chrome.chrome.system.display.MirrorModeInfo
import typings.chrome.chrome.system.display.MirrorModeInfoMixed
import typings.chrome.chrome.system.display.TouchCalibrationPairs
import typings.chrome.chrome.system.memory.MemoryInfo
import typings.chrome.chrome.system.storage.StorageCapacityInfo
import typings.chrome.chrome.system.storage.StorageUnitInfo
import typings.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typings.chrome.chrome.system.storage.SystemStorageDetachedEvent
import typings.chrome.chromeStrings.bottom
import typings.chrome.chromeStrings.left
import typings.chrome.chromeStrings.mixed
import typings.chrome.chromeStrings.normal
import typings.chrome.chromeStrings.off
import typings.chrome.chromeStrings.right
import typings.chrome.chromeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object system {
  
  ////////////////////
  // System CPU
  ////////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: "system.cpu"
    * @since Chrome 32.
    */
  object cpu {
    
    @JSGlobal("chrome.system.cpu.getInfo")
    @js.native
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
  object display {
    
    object DisplayPosition {
      
      @JSGlobal("chrome.system.display.DisplayPosition")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.system.display.DisplayPosition.BOTTOM")
      @js.native
      def BOTTOM: bottom = js.native
      @scala.inline
      def BOTTOM_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.DisplayPosition.LEFT")
      @js.native
      def LEFT: left = js.native
      @scala.inline
      def LEFT_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.DisplayPosition.RIGHT")
      @js.native
      def RIGHT: right = js.native
      @scala.inline
      def RIGHT_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.DisplayPosition.TOP")
      @js.native
      def TOP: top = js.native
      @scala.inline
      def TOP_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
    }
    
    object MirrorMode {
      
      @JSGlobal("chrome.system.display.MirrorMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.system.display.MirrorMode.MIXED")
      @js.native
      def MIXED: mixed = js.native
      @scala.inline
      def MIXED_=(x: mixed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIXED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.MirrorMode.NORMAL")
      @js.native
      def NORMAL: normal = js.native
      @scala.inline
      def NORMAL_=(x: normal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.MirrorMode.OFF")
      @js.native
      def OFF: off = js.native
      @scala.inline
      def OFF_=(x: off): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFF")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("chrome.system.display.clearTouchCalibration")
    @js.native
    def clearTouchCalibration(id: String): Unit = js.native
    
    @JSGlobal("chrome.system.display.completeCustomTouchCalibration")
    @js.native
    def completeCustomTouchCalibration(pairs: TouchCalibrationPairs, bounds: Bounds): Unit = js.native
    
    @JSGlobal("chrome.system.display.enableUnifiedDesktop")
    @js.native
    def enableUnifiedDesktop(enabled: Boolean): Unit = js.native
    
    @JSGlobal("chrome.system.display.getDisplayLayout")
    @js.native
    def getDisplayLayout(callback: js.Function1[/* layouts */ js.Array[DisplayLayout], Unit]): Unit = js.native
    
    @JSGlobal("chrome.system.display.getInfo")
    @js.native
    def getInfo(callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
    @JSGlobal("chrome.system.display.getInfo")
    @js.native
    def getInfo(flags: DisplayInfoFlags, callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
    
    @JSGlobal("chrome.system.display.onDisplayChanged")
    @js.native
    val onDisplayChanged: Event[js.Function0[Unit]] = js.native
    
    @JSGlobal("chrome.system.display.overscanCalibrationAdjust")
    @js.native
    def overscanCalibrationAdjust(id: String, delta: Insets): Unit = js.native
    
    @JSGlobal("chrome.system.display.overscanCalibrationComplete")
    @js.native
    def overscanCalibrationComplete(id: String): Unit = js.native
    
    @JSGlobal("chrome.system.display.overscanCalibrationReset")
    @js.native
    def overscanCalibrationReset(id: String): Unit = js.native
    
    @JSGlobal("chrome.system.display.overscanCalibrationStart")
    @js.native
    def overscanCalibrationStart(id: String): Unit = js.native
    
    @JSGlobal("chrome.system.display.setDisplayLayout")
    @js.native
    def setDisplayLayout(layouts: js.Array[DisplayLayout]): Unit = js.native
    @JSGlobal("chrome.system.display.setDisplayLayout")
    @js.native
    def setDisplayLayout(layouts: js.Array[DisplayLayout], callback: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("chrome.system.display.setDisplayProperties")
    @js.native
    def setDisplayProperties(id: String, info: DisplayPropertiesInfo): Unit = js.native
    @JSGlobal("chrome.system.display.setDisplayProperties")
    @js.native
    def setDisplayProperties(id: String, info: DisplayPropertiesInfo, callback: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("chrome.system.display.setMirrorMode")
    @js.native
    def setMirrorMode(info: MirrorModeInfoMixed, callback: js.Function0[Unit]): Unit = js.native
    @JSGlobal("chrome.system.display.setMirrorMode")
    @js.native
    def setMirrorMode(info: MirrorModeInfo, callback: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("chrome.system.display.showNativeTouchCalibration")
    @js.native
    def showNativeTouchCalibration(id: String, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
    
    @JSGlobal("chrome.system.display.startCustomTouchCalibration")
    @js.native
    def startCustomTouchCalibration(id: String): Unit = js.native
  }
  
  ////////////////////
  // System Memory
  ////////////////////
  /**
    * The chrome.system.memory API.
    * Permissions:  "system.memory"
    * @since Chrome 32.
    */
  object memory {
    
    @JSGlobal("chrome.system.memory.getInfo")
    @js.native
    def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit = js.native
  }
  
  ////////////////////
  // System Storage
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * Permissions:  "system.storage"
    * @since Chrome 30.
    */
  object storage {
    
    @JSGlobal("chrome.system.storage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.system.storage.ejectDevice")
    @js.native
    def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
    
    @JSGlobal("chrome.system.storage.getAvailableCapacity")
    @js.native
    def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
    
    @JSGlobal("chrome.system.storage.getInfo")
    @js.native
    def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
    
    @JSGlobal("chrome.system.storage.onAttached")
    @js.native
    def onAttached: SystemStorageAttachedEvent = js.native
    @scala.inline
    def onAttached_=(x: SystemStorageAttachedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAttached")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.system.storage.onDetached")
    @js.native
    def onDetached: SystemStorageDetachedEvent = js.native
    @scala.inline
    def onDetached_=(x: SystemStorageDetachedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDetached")(x.asInstanceOf[js.Any])
  }
}
