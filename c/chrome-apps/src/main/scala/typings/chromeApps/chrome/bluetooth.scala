package typings.chromeApps.chrome

import typings.chromeApps.chromeAppsStrings.all__
import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.bluetooth_
import typings.chromeApps.chromeAppsStrings.keyboard_
import typings.chromeApps.chromeAppsStrings.usb_
import typings.chromeApps.chromeAppsStrings.video_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.bluetooth*
///////////////
// Bluetooth //
///////////////
/**
  * @since Chrome 37
  * @requires Manifest: 'bluetooth': {...}
  * @description
  * Use the chrome.bluetooth API to connect to a Bluetooth device.
  * All functions report failures via chrome.runtime.lastError.
  * **Important: This API works only on OS X, Windows and Chrome OS.**
  */
object bluetooth {
  
  trait AdapterState extends StObject {
    
    /** The address of the adapter, in the format 'XX:XX:XX:XX:XX:XX'. */
    var address: String
    
    /** Indicates whether or not the adapter is available (i.e. enabled). */
    var available: Boolean
    
    /** Indicates whether or not the adapter is currently discovering. */
    var discovering: Boolean
    
    /** The human-readable name of the adapter. */
    var name: String
    
    /** Indicates whether or not the adapter has power. */
    var powered: Boolean
  }
  object AdapterState {
    
    inline def apply(address: String, available: Boolean, discovering: Boolean, name: String, powered: Boolean): AdapterState = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], powered = powered.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdapterState]
    }
    
    extension [Self <: AdapterState](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPowered(value: Boolean): Self = StObject.set(x, "powered", value.asInstanceOf[js.Any])
    }
  }
  
  trait BluetoothEvent[T] extends StObject {
    
    def addListener(callback: js.Function1[/* event */ T, Unit]): Unit
  }
  object BluetoothEvent {
    
    inline def apply[T](addListener: js.Function1[/* event */ T, Unit] => Unit): BluetoothEvent[T] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
      __obj.asInstanceOf[BluetoothEvent[T]]
    }
    
    extension [Self <: BluetoothEvent[?], T](x: Self & BluetoothEvent[T]) {
      
      inline def setAddListener(value: js.Function1[/* event */ T, Unit] => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    }
  }
  
  trait Device extends StObject {
    
    /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
    var address: String
    
    /**
      * Indicates whether the device is connectable.
      * @since Chrome 48
      */
    var connectable: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates whether the device is currently connected to the system. */
    var connected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether the device is currently connecting to the system.
      * @since Chrome 48
      */
    var connecting: js.UndefOr[Boolean] = js.undefined
    
    /** The class of the device, a bit-field defined by http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband. */
    var deviceClass: js.UndefOr[integer] = js.undefined
    
    var deviceId: js.UndefOr[integer] = js.undefined
    
    /**
      * The received signal strength, in dBm. This field is avaliable and valid only during discovery. Outside of discovery it's value is not specified.
      * @since Chrome 44
      */
    var inquiryRssi: integer
    
    /**
      * The transmitted power level. This field is avaliable only for LE devices that include this field in AD. It is avaliable and valid only during discovery.
      * @since Chrome 44
      */
    var inquiryTxPower: integer
    
    /** The human-readable name of the device. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Indicates whether or not the device is paired with the system. */
    var paired: js.UndefOr[Boolean] = js.undefined
    
    var productId: js.UndefOr[integer] = js.undefined
    
    /**
      * The type of the device, if recognized by Chrome.
      * This is obtained from the |deviceClass| field and only represents a small fraction of the possible device types.
      * When in doubt you should use the |deviceClass| field directly.
      */
    var `type`: js.UndefOr[DeviceType] = js.undefined
    
    /**
      * UUIDs of protocols, profiles and services advertised by the device.
      * For classic Bluetooth devices, this list is obtained from EIR data and SDP tables.
      * For Low Energy devices, this list is obtained from AD and GATT primary services.
      * For dual mode devices this may be obtained from both.
      */
    var uuids: js.UndefOr[js.Array[String]] = js.undefined
    
    var vendorId: js.UndefOr[integer] = js.undefined
    
    /** The Device ID record of the device, where available. */
    var vendorIdSource: js.UndefOr[DeviceVendorIdSource] = js.undefined
  }
  object Device {
    
    inline def apply(address: String, inquiryRssi: integer, inquiryTxPower: integer): Device = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], inquiryRssi = inquiryRssi.asInstanceOf[js.Any], inquiryTxPower = inquiryTxPower.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    extension [Self <: Device](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setConnectable(value: Boolean): Self = StObject.set(x, "connectable", value.asInstanceOf[js.Any])
      
      inline def setConnectableUndefined: Self = StObject.set(x, "connectable", js.undefined)
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
      
      inline def setConnecting(value: Boolean): Self = StObject.set(x, "connecting", value.asInstanceOf[js.Any])
      
      inline def setConnectingUndefined: Self = StObject.set(x, "connecting", js.undefined)
      
      inline def setDeviceClass(value: integer): Self = StObject.set(x, "deviceClass", value.asInstanceOf[js.Any])
      
      inline def setDeviceClassUndefined: Self = StObject.set(x, "deviceClass", js.undefined)
      
      inline def setDeviceId(value: integer): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      inline def setInquiryRssi(value: integer): Self = StObject.set(x, "inquiryRssi", value.asInstanceOf[js.Any])
      
      inline def setInquiryTxPower(value: integer): Self = StObject.set(x, "inquiryTxPower", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPaired(value: Boolean): Self = StObject.set(x, "paired", value.asInstanceOf[js.Any])
      
      inline def setPairedUndefined: Self = StObject.set(x, "paired", js.undefined)
      
      inline def setProductId(value: integer): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      
      inline def setType(value: DeviceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
      
      inline def setUuidsUndefined: Self = StObject.set(x, "uuids", js.undefined)
      
      inline def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value*))
      
      inline def setVendorId(value: integer): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
      
      inline def setVendorIdSource(value: DeviceVendorIdSource): Self = StObject.set(x, "vendorIdSource", value.asInstanceOf[js.Any])
      
      inline def setVendorIdSourceUndefined: Self = StObject.set(x, "vendorIdSource", js.undefined)
      
      inline def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
    }
  }
  
  /**
    * Some criteria to filter the list of returned bluetooth devices. If the filter is not set or set to {}, returned device list will contain all bluetooth devices. Right now this is only supported in ChromeOS, for other platforms, a full list is returned.
    */
  trait DeviceFilter extends StObject {
    
    /** Type of filter to apply to the device list. Default is all. */
    var filterType: js.UndefOr[DeviceFilterType] = js.undefined
    
    /** Maximum number of bluetoth devices to return. Default is 0 (no limit) if unspecified. */
    var limit: js.UndefOr[integer] = js.undefined
  }
  object DeviceFilter {
    
    inline def apply(): DeviceFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceFilter]
    }
    
    extension [Self <: DeviceFilter](x: Self) {
      
      inline def setFilterType(value: DeviceFilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setLimit(value: integer): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.all__
    - typings.chromeApps.chromeAppsStrings.known
  */
  trait DeviceFilterType extends StObject
  object DeviceFilterType {
    
    inline def all: all__ = "all".asInstanceOf[all__]
    
    inline def known: typings.chromeApps.chromeAppsStrings.known = "known".asInstanceOf[typings.chromeApps.chromeAppsStrings.known]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.computer
    - typings.chromeApps.chromeAppsStrings.phone
    - typings.chromeApps.chromeAppsStrings.modem
    - typings.chromeApps.chromeAppsStrings.audio_
    - typings.chromeApps.chromeAppsStrings.carAudio
    - typings.chromeApps.chromeAppsStrings.video_
    - typings.chromeApps.chromeAppsStrings.peripheral
    - typings.chromeApps.chromeAppsStrings.joystick
    - typings.chromeApps.chromeAppsStrings.gamepad
    - typings.chromeApps.chromeAppsStrings.keyboard_
    - typings.chromeApps.chromeAppsStrings.mouse
    - typings.chromeApps.chromeAppsStrings.tablet
    - typings.chromeApps.chromeAppsStrings.keyboardMouseCombo
  */
  trait DeviceType extends StObject
  object DeviceType {
    
    inline def audio: audio_ = "audio".asInstanceOf[audio_]
    
    inline def carAudio: typings.chromeApps.chromeAppsStrings.carAudio = "carAudio".asInstanceOf[typings.chromeApps.chromeAppsStrings.carAudio]
    
    inline def computer: typings.chromeApps.chromeAppsStrings.computer = "computer".asInstanceOf[typings.chromeApps.chromeAppsStrings.computer]
    
    inline def gamepad: typings.chromeApps.chromeAppsStrings.gamepad = "gamepad".asInstanceOf[typings.chromeApps.chromeAppsStrings.gamepad]
    
    inline def joystick: typings.chromeApps.chromeAppsStrings.joystick = "joystick".asInstanceOf[typings.chromeApps.chromeAppsStrings.joystick]
    
    inline def keyboard: keyboard_ = "keyboard".asInstanceOf[keyboard_]
    
    inline def keyboardMouseCombo: typings.chromeApps.chromeAppsStrings.keyboardMouseCombo = "keyboardMouseCombo".asInstanceOf[typings.chromeApps.chromeAppsStrings.keyboardMouseCombo]
    
    inline def modem: typings.chromeApps.chromeAppsStrings.modem = "modem".asInstanceOf[typings.chromeApps.chromeAppsStrings.modem]
    
    inline def mouse: typings.chromeApps.chromeAppsStrings.mouse = "mouse".asInstanceOf[typings.chromeApps.chromeAppsStrings.mouse]
    
    inline def peripheral: typings.chromeApps.chromeAppsStrings.peripheral = "peripheral".asInstanceOf[typings.chromeApps.chromeAppsStrings.peripheral]
    
    inline def phone: typings.chromeApps.chromeAppsStrings.phone = "phone".asInstanceOf[typings.chromeApps.chromeAppsStrings.phone]
    
    inline def tablet: typings.chromeApps.chromeAppsStrings.tablet = "tablet".asInstanceOf[typings.chromeApps.chromeAppsStrings.tablet]
    
    inline def video: video_ = "video".asInstanceOf[video_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.bluetooth_
    - typings.chromeApps.chromeAppsStrings.usb_
  */
  trait DeviceVendorIdSource extends StObject
  object DeviceVendorIdSource {
    
    inline def bluetooth: bluetooth_ = "bluetooth".asInstanceOf[bluetooth_]
    
    inline def usb: usb_ = "usb".asInstanceOf[usb_]
  }
}
