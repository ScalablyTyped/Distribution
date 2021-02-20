package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.app.*
// #region chrome.audio
///////////
// Audio //
///////////
/**
  * @since Chrome 59.
  * @requires Permissions: 'audio'
  * @description
  * The chrome.audio API is provided to allow users to get information
  * about and control the audio devices attached to the system.
  * This API is currently only available in kiosk mode for ChromeOS.
  */
object audio {
  
  @js.native
  trait AudioDeviceInfo extends StObject {
    
    /** Device name. */
    var deviceName: String = js.native
    
    /** Type of the device. */
    var deviceType: DeviceType = js.native
    
    /** The user-friendly name (e.g. 'USB Microphone'). */
    var displayName: String = js.native
    
    /** The unique identifier of the audio device. */
    var id: String = js.native
    
    /** True if this is the current active device. */
    var isActive: Boolean = js.native
    
    /** The sound level of the device, volume for output, gain for input. */
    var level: integer = js.native
    
    /** The stable/persisted device id string when available. */
    var stableDeviceId: js.UndefOr[String] = js.native
    
    /** Stream type associated with this device. */
    var streamType: StreamType = js.native
  }
  object AudioDeviceInfo {
    
    @scala.inline
    def apply(
      deviceName: String,
      deviceType: DeviceType,
      displayName: String,
      id: String,
      isActive: Boolean,
      level: integer,
      streamType: StreamType
    ): AudioDeviceInfo = {
      val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioDeviceInfo]
    }
    
    @scala.inline
    implicit class AudioDeviceInfoMutableBuilder[Self <: AudioDeviceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceType(value: DeviceType): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: integer): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStableDeviceId(value: String): Self = StObject.set(x, "stableDeviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStableDeviceIdUndefined: Self = StObject.set(x, "stableDeviceId", js.undefined)
      
      @scala.inline
      def setStreamType(value: StreamType): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeviceIdLists extends StObject {
    
    /**
      * List of input devices specified by their ID.
      * To indicate input devices should be unaffected, leave this property unset.
      */
    var input: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * List of output devices specified by their ID.
      * To indicate output devices should be unaffected, leave this property unset.
      */
    var output: js.UndefOr[js.Array[String]] = js.native
  }
  object DeviceIdLists {
    
    @scala.inline
    def apply(): DeviceIdLists = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceIdLists]
    }
    
    @scala.inline
    implicit class DeviceIdListsMutableBuilder[Self <: DeviceIdLists] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value :_*))
      
      @scala.inline
      def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.HEADPHONE
    - typings.chromeApps.chromeAppsStrings.MIC
    - typings.chromeApps.chromeAppsStrings.USB
    - typings.chromeApps.chromeAppsStrings.BLUETOOTH
    - typings.chromeApps.chromeAppsStrings.HDMI
    - typings.chromeApps.chromeAppsStrings.INTERNAL_SPEAKER
    - typings.chromeApps.chromeAppsStrings.INTERNAL_MIC
    - typings.chromeApps.chromeAppsStrings.FRONT_MIC
    - typings.chromeApps.chromeAppsStrings.REAR_MIC
    - typings.chromeApps.chromeAppsStrings.KEYBOARD_MIC
    - typings.chromeApps.chromeAppsStrings.HOTWORD
    - typings.chromeApps.chromeAppsStrings.LINEOUT
    - typings.chromeApps.chromeAppsStrings.POST_MIX_LOOPBACK
    - typings.chromeApps.chromeAppsStrings.POST_DSP_LOOPBACK
    - typings.chromeApps.chromeAppsStrings.OTHER
  */
  trait DeviceType extends StObject
  object DeviceType {
    
    @scala.inline
    def BLUETOOTH: typings.chromeApps.chromeAppsStrings.BLUETOOTH = "BLUETOOTH".asInstanceOf[typings.chromeApps.chromeAppsStrings.BLUETOOTH]
    
    @scala.inline
    def FRONT_MIC: typings.chromeApps.chromeAppsStrings.FRONT_MIC = "FRONT_MIC".asInstanceOf[typings.chromeApps.chromeAppsStrings.FRONT_MIC]
    
    @scala.inline
    def HDMI: typings.chromeApps.chromeAppsStrings.HDMI = "HDMI".asInstanceOf[typings.chromeApps.chromeAppsStrings.HDMI]
    
    @scala.inline
    def HEADPHONE: typings.chromeApps.chromeAppsStrings.HEADPHONE = "HEADPHONE".asInstanceOf[typings.chromeApps.chromeAppsStrings.HEADPHONE]
    
    @scala.inline
    def HOTWORD: typings.chromeApps.chromeAppsStrings.HOTWORD = "HOTWORD".asInstanceOf[typings.chromeApps.chromeAppsStrings.HOTWORD]
    
    @scala.inline
    def INTERNAL_MIC: typings.chromeApps.chromeAppsStrings.INTERNAL_MIC = "INTERNAL_MIC".asInstanceOf[typings.chromeApps.chromeAppsStrings.INTERNAL_MIC]
    
    @scala.inline
    def INTERNAL_SPEAKER: typings.chromeApps.chromeAppsStrings.INTERNAL_SPEAKER = "INTERNAL_SPEAKER".asInstanceOf[typings.chromeApps.chromeAppsStrings.INTERNAL_SPEAKER]
    
    @scala.inline
    def KEYBOARD_MIC: typings.chromeApps.chromeAppsStrings.KEYBOARD_MIC = "KEYBOARD_MIC".asInstanceOf[typings.chromeApps.chromeAppsStrings.KEYBOARD_MIC]
    
    @scala.inline
    def LINEOUT: typings.chromeApps.chromeAppsStrings.LINEOUT = "LINEOUT".asInstanceOf[typings.chromeApps.chromeAppsStrings.LINEOUT]
    
    @scala.inline
    def MIC: typings.chromeApps.chromeAppsStrings.MIC = "MIC".asInstanceOf[typings.chromeApps.chromeAppsStrings.MIC]
    
    @scala.inline
    def OTHER: typings.chromeApps.chromeAppsStrings.OTHER = "OTHER".asInstanceOf[typings.chromeApps.chromeAppsStrings.OTHER]
    
    @scala.inline
    def POST_DSP_LOOPBACK: typings.chromeApps.chromeAppsStrings.POST_DSP_LOOPBACK = "POST_DSP_LOOPBACK".asInstanceOf[typings.chromeApps.chromeAppsStrings.POST_DSP_LOOPBACK]
    
    @scala.inline
    def POST_MIX_LOOPBACK: typings.chromeApps.chromeAppsStrings.POST_MIX_LOOPBACK = "POST_MIX_LOOPBACK".asInstanceOf[typings.chromeApps.chromeAppsStrings.POST_MIX_LOOPBACK]
    
    @scala.inline
    def REAR_MIC: typings.chromeApps.chromeAppsStrings.REAR_MIC = "REAR_MIC".asInstanceOf[typings.chromeApps.chromeAppsStrings.REAR_MIC]
    
    @scala.inline
    def USB: typings.chromeApps.chromeAppsStrings.USB = "USB".asInstanceOf[typings.chromeApps.chromeAppsStrings.USB]
  }
  
  /**
    * Device properties by which to filter the list of returned audio devices.
    * If the filter is not set or set to {}, returned device list will contain all available audio devices.
    */
  @js.native
  trait Filter extends StObject {
    
    /**
      * If set, only audio devices whose active state matches this value will satisfy the filter.
      */
    var isActive: js.UndefOr[Boolean] = js.native
    
    /**
      * If set, only audio devices whose stream type is included in this list will satisfy the filter.
      */
    var streamTypes: js.UndefOr[js.Array[StreamType]] = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setStreamTypes(value: js.Array[StreamType]): Self = StObject.set(x, "streamTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamTypesUndefined: Self = StObject.set(x, "streamTypes", js.undefined)
      
      @scala.inline
      def setStreamTypesVarargs(value: StreamType*): Self = StObject.set(x, "streamTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SetDeviceProperties extends StObject {
    
    /**
      * The audio device's desired sound level. Defaults to the device's current sound level.
      * If used with audio input device, represents audio device gain.
      * If used with audio output device, represents audio device volume.
      */
    var level: js.UndefOr[integer] = js.native
  }
  object SetDeviceProperties {
    
    @scala.inline
    def apply(): SetDeviceProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetDeviceProperties]
    }
    
    @scala.inline
    implicit class SetDevicePropertiesMutableBuilder[Self <: SetDeviceProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: integer): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.INPUT
    - typings.chromeApps.chromeAppsStrings.OUTPUT
  */
  trait StreamType extends StObject
  object StreamType {
    
    @scala.inline
    def INPUT: typings.chromeApps.chromeAppsStrings.INPUT = "INPUT".asInstanceOf[typings.chromeApps.chromeAppsStrings.INPUT]
    
    @scala.inline
    def OUTPUT: typings.chromeApps.chromeAppsStrings.OUTPUT = "OUTPUT".asInstanceOf[typings.chromeApps.chromeAppsStrings.OUTPUT]
  }
}
