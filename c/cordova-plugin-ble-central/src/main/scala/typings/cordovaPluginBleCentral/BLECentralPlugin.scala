package typings.cordovaPluginBleCentral

import typings.cordovaPluginBleCentral.anon.EmitOnRegistered
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.`1m`
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.aggressive
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.all
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.balanced
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.coded
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.few
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.first
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.high
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.lost
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.low
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.lowLatency
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.lowPower
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.max
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.one
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.opportunistic
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.registered
import typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.sticky
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BLECentralPlugin {
  
  @js.native
  trait BLECentralPluginCommon extends StObject {
    
    def connect(
      device_id: String,
      connectCallback: js.Function1[/* data */ PeripheralDataExtended, Any],
      disconnectCallback: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    
    def scan(services: js.Array[String], seconds: Double, success: js.Function1[/* data */ PeripheralData, Any]): Unit = js.native
    def scan(
      services: js.Array[String],
      seconds: Double,
      success: js.Function1[/* data */ PeripheralData, Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
    
    def startScan(services: js.Array[String], success: js.Function1[/* data */ PeripheralData, Any]): Unit = js.native
    def startScan(
      services: js.Array[String],
      success: js.Function1[/* data */ PeripheralData, Any],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    
    def startScanWithOptions(
      services: js.Array[String],
      options: StartScanOptions,
      success: js.Function1[/* data */ PeripheralData, Any]
    ): Unit = js.native
    def startScanWithOptions(
      services: js.Array[String],
      options: StartScanOptions,
      success: js.Function1[/* data */ PeripheralData, Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
  }
  
  @js.native
  trait BLECentralPluginPromises
    extends StObject
       with BLECentralPluginCommon {
    
    /* Find the bonded devices.
      [iOS] bondedDevices is not supported on iOS. */
    def bondedDevices(): js.Promise[PeripheralData] = js.native
    
    def disconnect(device_id: String): js.Promise[Unit] = js.native
    
    def enable(): js.Promise[Unit] = js.native
    
    /* Returns a rejected promise if the device is not connected */
    def isConnected(device_id: String): js.Promise[Unit] = js.native
    
    /* Returns a rejected promise if bluetooth is not connected */
    def isEnabled(): js.Promise[Unit] = js.native
    
    var l2cap: L2CAPPromises = js.native
    
    /* Lists all peripherals discovered by the plugin due to scanning or connecting since app launch.
      [iOS] list is not supported on iOS. */
    def list(): js.Promise[PeripheralData] = js.native
    
    def read(device_id: String, service_uuid: String, characteristic_uuid: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def readRSSI(device_id: String): js.Promise[Double] = js.native
    
    /* When Connecting to a peripheral android can request for the connection priority for faster communication.
      [iOS] requestConnectionPriority is not supported on iOS. */
    def requestConnectionPriority(device_id: String, priority: high | balanced | low): js.Promise[Unit] = js.native
    
    def restoredBluetoothState(): js.Promise[js.UndefOr[RestoredState]] = js.native
    
    def showBluetoothSettings(): js.Promise[Unit] = js.native
    
    /* Registers a change listener for location-related services.
      [iOS] startLocationStateNotifications is not supported on iOS. */
    def startLocationStateNotifications(change: js.Function1[/* isLocationEnabled */ Boolean, Any]): js.Promise[Unit] = js.native
    def startLocationStateNotifications(
      change: js.Function1[/* isLocationEnabled */ Boolean, Any],
      failure: js.Function1[/* error */ String, Any]
    ): js.Promise[Unit] = js.native
    
    /* Register to be notified when the value of a characteristic changes. */
    def startNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ js.typedarray.ArrayBuffer, Any]
    ): js.Promise[Unit] = js.native
    def startNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ js.typedarray.ArrayBuffer, Any],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): js.Promise[Unit] = js.native
    
    /** Registers a change listener for Bluetooth adapter state changes */
    def startStateNotifications(success: js.Function1[/* state */ String, Any]): js.Promise[Unit] = js.native
    def startStateNotifications(success: js.Function1[/* state */ String, Any], failure: js.Function1[/* error */ String, Any]): js.Promise[Unit] = js.native
    
    def stopLocationStateNotifications(): js.Promise[Unit] = js.native
    
    def stopNotification(device_id: String, service_uuid: String, characteristic_uuid: String): js.Promise[Unit] = js.native
    
    def stopScan(): js.Promise[Unit] = js.native
    
    def stopStateNotifications(): js.Promise[Unit] = js.native
    
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      value: js.typedarray.ArrayBuffer
    ): js.Promise[Unit] = js.native
    
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      value: js.typedarray.ArrayBuffer
    ): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait BLECentralPluginStatic
    extends StObject
       with BLECentralPluginCommon {
    
    /* Automatically connect to a device when it is in range of the phone
      [iOS] background notifications on ios must be enabled if you want to run in the background
      [Android] this relies on the autoConnect argument of BluetoothDevice.connectGatt(). Not all Android devices implement this feature correctly. */
    def autoConnect(
      device_id: String,
      connectCallback: js.Function1[/* data */ PeripheralDataExtended, Any],
      disconnectCallback: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    
    /* Find the bonded devices.
      [iOS] bondedDevices is not supported on iOS. */
    def bondedDevices(success: js.Function1[/* data */ js.Array[PeripheralData], Any]): Unit = js.native
    def bondedDevices(
      success: js.Function1[/* data */ js.Array[PeripheralData], Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
    
    /* Find connected peripherals offering the listed service UUIDs.
      This function wraps CBCentralManager.retrieveConnectedPeripheralsWithServices.
      [Android] peripheralsWithIdentifiers is not supported on Android. */
    def connectedPeripheralsWithServices(services: js.Array[String], success: js.Function1[/* data */ js.Array[PeripheralData], Any]): Unit = js.native
    def connectedPeripheralsWithServices(
      services: js.Array[String],
      success: js.Function1[/* data */ js.Array[PeripheralData], Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
    
    def disconnect(device_id: String): Unit = js.native
    def disconnect(device_id: String, success: js.Function0[Any]): Unit = js.native
    def disconnect(
      device_id: String,
      success: js.Function0[Any],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def disconnect(device_id: String, success: Unit, failure: js.Function1[/* error */ String | BLEError, Any]): Unit = js.native
    
    /* Enable Bluetooth on the device.
      [iOS] enable is not supported on iOS. */
    def enable(success: js.Function0[Any]): Unit = js.native
    def enable(success: js.Function0[Any], failure: js.Function1[/* error */ String, Any]): Unit = js.native
    
    /* Calls the success callback when the peripheral is connected and the failure callback when not connected. */
    def isConnected(device_id: String, success: js.Function0[Any]): Unit = js.native
    def isConnected(device_id: String, success: js.Function0[Any], failure: js.Function1[/* error */ String, Any]): Unit = js.native
    
    /* Reports if bluetooth is enabled. */
    def isEnabled(success: js.Function0[Any]): Unit = js.native
    def isEnabled(success: js.Function0[Any], failure: js.Function1[/* error */ String, Any]): Unit = js.native
    
    /* Reports if location services are enabled.
      [iOS] isLocationEnabled is not supported on iOS. */
    def isLocationEnabled(success: js.Function0[Any]): Unit = js.native
    def isLocationEnabled(success: js.Function0[Any], failure: js.Function1[/* error */ String, Any]): Unit = js.native
    
    var l2cap: L2CAP = js.native
    
    /* Lists all peripherals discovered by the plugin due to scanning or connecting since app launch.
      [iOS] list is not supported on iOS. */
    def list(success: js.Function1[/* data */ js.Array[PeripheralData], Any]): Unit = js.native
    def list(
      success: js.Function1[/* data */ js.Array[PeripheralData], Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
    
    /* Find known (but not necessarily connected) peripherals offering the listed device UUIDs.
      This function wraps CBCentralManager.retrievePeripheralsWithIdentifiers
      [Android] peripheralsWithIdentifiers is not supported on Android. */
    def peripheralsWithIdentifiers(device_ids: js.Array[String], success: js.Function1[/* data */ js.Array[PeripheralData], Any]): Unit = js.native
    def peripheralsWithIdentifiers(
      device_ids: js.Array[String],
      success: js.Function1[/* data */ js.Array[PeripheralData], Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
    
    def read(device_id: String, service_uuid: String, characteristic_uuid: String): Unit = js.native
    def read(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ js.typedarray.ArrayBuffer, Any]
    ): Unit = js.native
    def read(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ js.typedarray.ArrayBuffer, Any],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def read(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    
    def readRSSI(device_id: String, success: js.Function1[/* rssi */ Double, Any]): Unit = js.native
    def readRSSI(
      device_id: String,
      success: js.Function1[/* rssi */ Double, Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
    
    /* Clears cached services and characteristics info for some poorly behaved devices. Uses an undocumented API,
      so it is not guaranteed to work.
      [iOS] refreshDeviceCache is not supported on iOS. */
    def refreshDeviceCache(device_id: String, timeout_millis: Double): Unit = js.native
    def refreshDeviceCache(
      device_id: String,
      timeout_millis: Double,
      success: js.Function1[/* data */ PeripheralDataExtended, Any]
    ): Unit = js.native
    def refreshDeviceCache(
      device_id: String,
      timeout_millis: Double,
      success: js.Function1[/* data */ PeripheralDataExtended, Any],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def refreshDeviceCache(
      device_id: String,
      timeout_millis: Double,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    
    /* When Connecting to a peripheral android can request for the connection priority for faster communication.
      [iOS] requestConnectionPriority is not supported on iOS. */
    def requestConnectionPriority(device_id: String, priority: high | balanced | low): Unit = js.native
    def requestConnectionPriority(device_id: String, priority: high | balanced | low, success: js.Function0[Any]): Unit = js.native
    def requestConnectionPriority(
      device_id: String,
      priority: high | balanced | low,
      success: js.Function0[Any],
      failure: js.Function0[Any]
    ): Unit = js.native
    def requestConnectionPriority(device_id: String, priority: high | balanced | low, success: Unit, failure: js.Function0[Any]): Unit = js.native
    
    /* May be used to request (on Android) a larger MTU size to be able to send more data at once
      [iOS] requestMtu is not supported on iOS. */
    def requestMtu(device_id: String, mtu: Double): Unit = js.native
    def requestMtu(device_id: String, mtu: Double, success: js.Function0[Any]): Unit = js.native
    def requestMtu(device_id: String, mtu: Double, success: js.Function0[Any], failure: js.Function0[Any]): Unit = js.native
    def requestMtu(device_id: String, mtu: Double, success: Unit, failure: js.Function0[Any]): Unit = js.native
    
    /* Reports the BLE restoration status if the app was restarted by iOS
      as a result of a BLE event.
      See https://developer.apple.com/library/archive/documentation/NetworkingInternetWeb/Conceptual/CoreBluetooth_concepts/CoreBluetoothBackgroundProcessingForIOSApps/PerformingTasksWhileYourAppIsInTheBackground.html#//apple_ref/doc/uid/TP40013257-CH7-SW10
      [Android] restoredBluetoothState is not supported on Android. */
    def restoredBluetoothState(success: js.Function1[/* data */ RestoredState, Any]): Unit = js.native
    def restoredBluetoothState(
      success: js.Function1[/* data */ RestoredState, Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
    
    /* sets the pin when device requires it.
      [iOS] setPin is not supported on iOS. */
    def setPin(pin: String): Unit = js.native
    def setPin(pin: String, success: js.Function0[Any]): Unit = js.native
    def setPin(pin: String, success: js.Function0[Any], failure: js.Function1[/* error */ String | BLEError, Any]): Unit = js.native
    def setPin(pin: String, success: Unit, failure: js.Function1[/* error */ String | BLEError, Any]): Unit = js.native
    
    /* Opens the Bluetooth settings for the operating systems.
      [iOS] showBluetoothSettings is not supported on iOS. */
    def showBluetoothSettings(success: js.Function0[Any]): Unit = js.native
    def showBluetoothSettings(success: js.Function0[Any], failure: js.Function1[/* error */ String, Any]): Unit = js.native
    
    /* Registers a change listener for location-related services.
      [iOS] startLocationStateNotifications is not supported on iOS. */
    def startLocationStateNotifications(change: js.Function1[/* isLocationEnabled */ Boolean, Any]): Unit = js.native
    def startLocationStateNotifications(
      change: js.Function1[/* isLocationEnabled */ Boolean, Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
    
    def startNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ js.typedarray.ArrayBuffer, Any]
    ): Unit = js.native
    def startNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ js.typedarray.ArrayBuffer, Any],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    /* Start notifications on the given characteristic
      - options
      emitOnRegistered     Default is false. Emit "registered" to success callback 
      when peripheral confirms notifications are active
      */
    @JSName("startNotification")
    def startNotification_registered(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ js.typedarray.ArrayBuffer | registered, Any],
      failure: js.Function1[/* error */ String | BLEError, Any],
      options: EmitOnRegistered
    ): Unit = js.native
    
    /** Registers a change listener for Bluetooth adapter state changes */
    def startStateNotifications(success: js.Function1[/* state */ String, Any]): Unit = js.native
    def startStateNotifications(success: js.Function1[/* state */ String, Any], failure: js.Function1[/* error */ String, Any]): Unit = js.native
    
    def stopLocationStateNotifications(): Unit = js.native
    def stopLocationStateNotifications(success: js.Function0[Any]): Unit = js.native
    def stopLocationStateNotifications(success: js.Function0[Any], failure: js.Function1[/* error */ String, Any]): Unit = js.native
    def stopLocationStateNotifications(success: Unit, failure: js.Function1[/* error */ String, Any]): Unit = js.native
    
    def stopNotification(device_id: String, service_uuid: String, characteristic_uuid: String): Unit = js.native
    def stopNotification(device_id: String, service_uuid: String, characteristic_uuid: String, success: js.Function0[Any]): Unit = js.native
    def stopNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function0[Any],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def stopNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    
    def stopScan(): Unit = js.native
    def stopScan(success: js.Function0[Any]): Unit = js.native
    def stopScan(success: js.Function0[Any], failure: js.Function0[Any]): Unit = js.native
    def stopScan(success: Unit, failure: js.Function0[Any]): Unit = js.native
    
    def stopStateNotifications(): Unit = js.native
    def stopStateNotifications(success: js.Function0[Any]): Unit = js.native
    def stopStateNotifications(success: js.Function0[Any], failure: js.Function0[Any]): Unit = js.native
    def stopStateNotifications(success: Unit, failure: js.Function0[Any]): Unit = js.native
    
    var withPromises: BLECentralPluginPromises = js.native
    
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: js.typedarray.ArrayBuffer
    ): Unit = js.native
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: js.typedarray.ArrayBuffer,
      success: js.Function0[Any]
    ): Unit = js.native
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: js.typedarray.ArrayBuffer,
      success: js.Function0[Any],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: js.typedarray.ArrayBuffer,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    
    /* Writes data to a characteristic without a response from the peripheral. 
      You are not notified if the write fails in the BLE stack.
      The success callback is be called when the characteristic is written.*/
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: js.typedarray.ArrayBuffer
    ): Unit = js.native
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: js.typedarray.ArrayBuffer,
      success: js.Function0[Any]
    ): Unit = js.native
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: js.typedarray.ArrayBuffer,
      success: js.Function0[Any],
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: js.typedarray.ArrayBuffer,
      success: Unit,
      failure: js.Function1[/* error */ String, Any]
    ): Unit = js.native
  }
  
  trait BLEError extends StObject {
    
    var errorMessage: String
    
    var id: String
    
    var name: String
  }
  object BLEError {
    
    inline def apply(errorMessage: String, id: String, name: String): BLEError = {
      val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BLEError]
    }
    
    extension [Self <: BLEError](x: Self) {
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait L2CAP extends StObject {
    
    def close(device_id: String, psm: Double): Unit = js.native
    def close(device_id: String, psm: Double, success: js.Function0[Any]): Unit = js.native
    def close(
      device_id: String,
      psm: Double,
      success: js.Function0[Any],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def close(
      device_id: String,
      psm: Double,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    
    def open(device_id: String, psmOrOptions: Double): Unit = js.native
    def open(device_id: String, psmOrOptions: Double, connectCallback: js.Function0[Any]): Unit = js.native
    def open(
      device_id: String,
      psmOrOptions: Double,
      connectCallback: js.Function0[Any],
      disconnectCallback: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def open(
      device_id: String,
      psmOrOptions: Double,
      connectCallback: Unit,
      disconnectCallback: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def open(device_id: String, psmOrOptions: L2CAPOptions): Unit = js.native
    def open(device_id: String, psmOrOptions: L2CAPOptions, connectCallback: js.Function0[Any]): Unit = js.native
    def open(
      device_id: String,
      psmOrOptions: L2CAPOptions,
      connectCallback: js.Function0[Any],
      disconnectCallback: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def open(
      device_id: String,
      psmOrOptions: L2CAPOptions,
      connectCallback: Unit,
      disconnectCallback: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    
    def receiveData(device_id: String, psm: Double, data: js.Function1[/* data */ js.typedarray.ArrayBuffer, Any]): Unit = js.native
    
    def write(device_id: String, psm: Double, data: js.typedarray.ArrayBuffer): Unit = js.native
    def write(device_id: String, psm: Double, data: js.typedarray.ArrayBuffer, success: js.Function0[js.Object]): Unit = js.native
    def write(
      device_id: String,
      psm: Double,
      data: js.typedarray.ArrayBuffer,
      success: js.Function0[js.Object],
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
    def write(
      device_id: String,
      psm: Double,
      data: js.typedarray.ArrayBuffer,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, Any]
    ): Unit = js.native
  }
  
  trait L2CAPOptions extends StObject {
    
    var psm: Double
    
    var secureChannel: js.UndefOr[Boolean] = js.undefined
  }
  object L2CAPOptions {
    
    inline def apply(psm: Double): L2CAPOptions = {
      val __obj = js.Dynamic.literal(psm = psm.asInstanceOf[js.Any])
      __obj.asInstanceOf[L2CAPOptions]
    }
    
    extension [Self <: L2CAPOptions](x: Self) {
      
      inline def setPsm(value: Double): Self = StObject.set(x, "psm", value.asInstanceOf[js.Any])
      
      inline def setSecureChannel(value: Boolean): Self = StObject.set(x, "secureChannel", value.asInstanceOf[js.Any])
      
      inline def setSecureChannelUndefined: Self = StObject.set(x, "secureChannel", js.undefined)
    }
  }
  
  @js.native
  trait L2CAPPromises extends StObject {
    
    def close(device_id: String, psm: Double): js.Promise[Unit] = js.native
    
    def open(device_id: String, psmOrOptions: Double): js.Promise[Unit] = js.native
    def open(
      device_id: String,
      psmOrOptions: Double,
      disconnectCallback: js.Function1[/* error */ String | BLEError, Any]
    ): js.Promise[Unit] = js.native
    def open(device_id: String, psmOrOptions: L2CAPOptions): js.Promise[Unit] = js.native
    def open(
      device_id: String,
      psmOrOptions: L2CAPOptions,
      disconnectCallback: js.Function1[/* error */ String | BLEError, Any]
    ): js.Promise[Unit] = js.native
    
    def write(device_id: String, psm: Double, data: js.typedarray.ArrayBuffer): js.Promise[Unit] = js.native
  }
  
  trait PeripheralCharacteristic extends StObject {
    
    var characteristic: String
    
    var descriptors: js.UndefOr[js.Array[Any]] = js.undefined
    
    var properties: js.Array[String]
    
    var service: String
  }
  object PeripheralCharacteristic {
    
    inline def apply(characteristic: String, properties: js.Array[String], service: String): PeripheralCharacteristic = {
      val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeripheralCharacteristic]
    }
    
    extension [Self <: PeripheralCharacteristic](x: Self) {
      
      inline def setCharacteristic(value: String): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
      
      inline def setDescriptors(value: js.Array[Any]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setDescriptorsUndefined: Self = StObject.set(x, "descriptors", js.undefined)
      
      inline def setDescriptorsVarargs(value: Any*): Self = StObject.set(x, "descriptors", js.Array(value*))
      
      inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeripheralData extends StObject {
    
    var advertising: js.typedarray.ArrayBuffer | Any
    
    var id: String
    
    var name: String
    
    var rssi: Double
    
    var state: PeripheralState
  }
  object PeripheralData {
    
    inline def apply(
      advertising: js.typedarray.ArrayBuffer | Any,
      id: String,
      name: String,
      rssi: Double,
      state: PeripheralState
    ): PeripheralData = {
      val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeripheralData]
    }
    
    extension [Self <: PeripheralData](x: Self) {
      
      inline def setAdvertising(value: js.typedarray.ArrayBuffer | Any): Self = StObject.set(x, "advertising", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRssi(value: Double): Self = StObject.set(x, "rssi", value.asInstanceOf[js.Any])
      
      inline def setState(value: PeripheralState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeripheralDataExtended
    extends StObject
       with PeripheralData {
    
    var characteristics: js.Array[PeripheralCharacteristic]
    
    var services: js.Array[String]
  }
  object PeripheralDataExtended {
    
    inline def apply(
      advertising: js.typedarray.ArrayBuffer | Any,
      characteristics: js.Array[PeripheralCharacteristic],
      id: String,
      name: String,
      rssi: Double,
      services: js.Array[String],
      state: PeripheralState
    ): PeripheralDataExtended = {
      val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], characteristics = characteristics.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeripheralDataExtended]
    }
    
    extension [Self <: PeripheralDataExtended](x: Self) {
      
      inline def setCharacteristics(value: js.Array[PeripheralCharacteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      inline def setCharacteristicsVarargs(value: PeripheralCharacteristic*): Self = StObject.set(x, "characteristics", js.Array(value*))
      
      inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.disconnected
    - typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.disconnecting
    - typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.connecting
    - typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.connected
  */
  trait PeripheralState extends StObject
  object PeripheralState {
    
    inline def connected: typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.connected = "connected".asInstanceOf[typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.connected]
    
    inline def connecting: typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.connecting = "connecting".asInstanceOf[typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.connecting]
    
    inline def disconnected: typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.disconnected = "disconnected".asInstanceOf[typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.disconnected]
    
    inline def disconnecting: typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.disconnecting = "disconnecting".asInstanceOf[typings.cordovaPluginBleCentral.cordovaPluginBleCentralStrings.disconnecting]
  }
  
  trait RestoredState extends StObject {
    
    var peripherals: js.UndefOr[js.Array[PeripheralDataExtended]] = js.undefined
    
    var scanOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var scanServiceUUIDs: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RestoredState {
    
    inline def apply(): RestoredState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestoredState]
    }
    
    extension [Self <: RestoredState](x: Self) {
      
      inline def setPeripherals(value: js.Array[PeripheralDataExtended]): Self = StObject.set(x, "peripherals", value.asInstanceOf[js.Any])
      
      inline def setPeripheralsUndefined: Self = StObject.set(x, "peripherals", js.undefined)
      
      inline def setPeripheralsVarargs(value: PeripheralDataExtended*): Self = StObject.set(x, "peripherals", js.Array(value*))
      
      inline def setScanOptions(value: Record[String, Any]): Self = StObject.set(x, "scanOptions", value.asInstanceOf[js.Any])
      
      inline def setScanOptionsUndefined: Self = StObject.set(x, "scanOptions", js.undefined)
      
      inline def setScanServiceUUIDs(value: js.Array[String]): Self = StObject.set(x, "scanServiceUUIDs", value.asInstanceOf[js.Any])
      
      inline def setScanServiceUUIDsUndefined: Self = StObject.set(x, "scanServiceUUIDs", js.undefined)
      
      inline def setScanServiceUUIDsVarargs(value: String*): Self = StObject.set(x, "scanServiceUUIDs", js.Array(value*))
    }
  }
  
  trait StartScanOptions extends StObject {
    
    /* Android only */
    var callbackType: js.UndefOr[all | first | lost] = js.undefined
    
    /* Android only */
    var legacy: js.UndefOr[Boolean] = js.undefined
    
    /* Android only */
    var matchMode: js.UndefOr[aggressive | sticky] = js.undefined
    
    /* Android only */
    var numOfMatches: js.UndefOr[one | few | max] = js.undefined
    
    /* Android only */
    var phy: js.UndefOr[`1m` | coded | all] = js.undefined
    
    /* Android only */
    var reportDelay: js.UndefOr[Double] = js.undefined
    
    var reportDuplicates: js.UndefOr[Boolean] = js.undefined
    
    /* Android only */
    var scanMode: js.UndefOr[lowPower | balanced | lowLatency | opportunistic] = js.undefined
  }
  object StartScanOptions {
    
    inline def apply(): StartScanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartScanOptions]
    }
    
    extension [Self <: StartScanOptions](x: Self) {
      
      inline def setCallbackType(value: all | first | lost): Self = StObject.set(x, "callbackType", value.asInstanceOf[js.Any])
      
      inline def setCallbackTypeUndefined: Self = StObject.set(x, "callbackType", js.undefined)
      
      inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
      
      inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
      
      inline def setMatchMode(value: aggressive | sticky): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
      
      inline def setMatchModeUndefined: Self = StObject.set(x, "matchMode", js.undefined)
      
      inline def setNumOfMatches(value: one | few | max): Self = StObject.set(x, "numOfMatches", value.asInstanceOf[js.Any])
      
      inline def setNumOfMatchesUndefined: Self = StObject.set(x, "numOfMatches", js.undefined)
      
      inline def setPhy(value: `1m` | coded | all): Self = StObject.set(x, "phy", value.asInstanceOf[js.Any])
      
      inline def setPhyUndefined: Self = StObject.set(x, "phy", js.undefined)
      
      inline def setReportDelay(value: Double): Self = StObject.set(x, "reportDelay", value.asInstanceOf[js.Any])
      
      inline def setReportDelayUndefined: Self = StObject.set(x, "reportDelay", js.undefined)
      
      inline def setReportDuplicates(value: Boolean): Self = StObject.set(x, "reportDuplicates", value.asInstanceOf[js.Any])
      
      inline def setReportDuplicatesUndefined: Self = StObject.set(x, "reportDuplicates", js.undefined)
      
      inline def setScanMode(value: lowPower | balanced | lowLatency | opportunistic): Self = StObject.set(x, "scanMode", value.asInstanceOf[js.Any])
      
      inline def setScanModeUndefined: Self = StObject.set(x, "scanMode", js.undefined)
    }
  }
}
