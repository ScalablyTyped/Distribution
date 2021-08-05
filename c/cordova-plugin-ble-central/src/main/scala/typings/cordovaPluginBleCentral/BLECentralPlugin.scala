package typings.cordovaPluginBleCentral

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BLECentralPlugin {
  
  @js.native
  trait BLECentralPluginCommon extends StObject {
    
    def connect(
      device_id: String,
      connectCallback: js.Function1[/* data */ PeripheralDataExtended, js.Any],
      disconnectCallback: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    
    def scan(
      services: js.Array[String],
      seconds: Double,
      success: js.Function1[/* data */ PeripheralData, js.Any]
    ): Unit = js.native
    def scan(
      services: js.Array[String],
      seconds: Double,
      success: js.Function1[/* data */ PeripheralData, js.Any],
      failure: js.Function1[/* error */ String, js.Any]
    ): Unit = js.native
    
    /* Register to be notified when the value of a characteristic changes. */
    def startNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ ArrayBuffer, js.Any]
    ): Unit = js.native
    def startNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ ArrayBuffer, js.Any],
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    
    def startScan(services: js.Array[String], success: js.Function1[/* data */ PeripheralData, js.Any]): Unit = js.native
    def startScan(
      services: js.Array[String],
      success: js.Function1[/* data */ PeripheralData, js.Any],
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    
    def startScanWithOptions(
      services: js.Array[String],
      options: StartScanOptions,
      success: js.Function1[/* data */ PeripheralData, js.Any]
    ): Unit = js.native
    def startScanWithOptions(
      services: js.Array[String],
      options: StartScanOptions,
      success: js.Function1[/* data */ PeripheralData, js.Any],
      failure: js.Function1[/* error */ String, js.Any]
    ): Unit = js.native
    
    def startStateNotifications(success: js.Function1[/* state */ String, js.Any]): Unit = js.native
    def startStateNotifications(
      success: js.Function1[/* state */ String, js.Any],
      failure: js.Function1[/* error */ String, js.Any]
    ): Unit = js.native
  }
  
  @js.native
  trait BLECentralPluginPromises
    extends StObject
       with BLECentralPluginCommon {
    
    def disconnect(device_id: String): js.Promise[Unit] = js.native
    
    def enable(): js.Promise[Unit] = js.native
    
    /* Returns a rejected promise if the device is not connected */
    def isConnected(device_id: String): js.Promise[Unit] = js.native
    
    /* Returns a rejected promise if bluetooth is not connected */
    def isEnabled(): js.Promise[Unit] = js.native
    
    def read(device_id: String, service_uuid: String, characteristic_uuid: String): js.Promise[ArrayBuffer] = js.native
    
    def readRSSI(device_id: String): js.Promise[Double] = js.native
    
    def showBluetoothSettings(): js.Promise[Unit] = js.native
    
    def stopNotification(device_id: String, service_uuid: String, characteristic_uuid: String): js.Promise[Unit] = js.native
    
    def stopScan(): js.Promise[Unit] = js.native
    
    def stopStateNotifications(): js.Promise[Unit] = js.native
    
    def write(device_id: String, service_uuid: String, characteristic_uuid: String, value: ArrayBuffer): js.Promise[Unit] = js.native
    
    def writeWithoutResponse(device_id: String, service_uuid: String, characteristic_uuid: String, value: ArrayBuffer): js.Promise[Unit] = js.native
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
      connectCallback: js.Function1[/* data */ PeripheralDataExtended, js.Any],
      disconnectCallback: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    
    /* Find the bonded devices.
      [iOS] bondedDevices is not supported on iOS. */
    def bondedDevices(success: js.Function1[/* data */ js.Array[PeripheralData], js.Any], failure: js.Function0[js.Any]): Unit = js.native
    
    /* Find connected peripherals offering the listed service UUIDs.
      This function wraps CBCentralManager.retrieveConnectedPeripheralsWithServices.
      [Android] peripheralsWithIdentifiers is not supported on Android. */
    def connectedPeripheralsWithServices(
      services: js.Array[String],
      success: js.Function1[/* data */ js.Array[PeripheralData], js.Any],
      failure: js.Function0[js.Any]
    ): Unit = js.native
    
    def disconnect(device_id: String): Unit = js.native
    def disconnect(device_id: String, success: js.Function0[js.Any]): Unit = js.native
    def disconnect(
      device_id: String,
      success: js.Function0[js.Any],
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    def disconnect(device_id: String, success: Unit, failure: js.Function1[/* error */ String | BLEError, js.Any]): Unit = js.native
    
    /* Enable Bluetooth on the device.
      [iOS] enable is not supported on iOS. */
    def enable(success: js.Function0[js.Any], failure: js.Function1[/* error */ String, js.Any]): Unit = js.native
    
    /* Calls the success callback when the peripheral is connected and the failure callback when not connected. */
    def isConnected(device_id: String, success: js.Function0[js.Any]): Unit = js.native
    def isConnected(
      device_id: String,
      success: js.Function0[js.Any],
      failure: js.Function1[/* error */ String, js.Any]
    ): Unit = js.native
    
    /* Reports if bluetooth is enabled. */
    def isEnabled(success: js.Function0[js.Any], failure: js.Function1[/* error */ String, js.Any]): Unit = js.native
    
    /* Find known (but not necessarily connected) peripherals offering the listed service UUIDs.
      This function wraps CBCentralManager.retrievePeripheralsWithIdentifiers
      [Android] peripheralsWithIdentifiers is not supported on Android. */
    def peripheralsWithIdentifiers(
      services: js.Array[String],
      success: js.Function1[/* data */ js.Array[PeripheralData], js.Any],
      failure: js.Function0[js.Any]
    ): Unit = js.native
    
    def read(device_id: String, service_uuid: String, characteristic_uuid: String): Unit = js.native
    def read(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ ArrayBuffer, js.Any]
    ): Unit = js.native
    def read(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ ArrayBuffer, js.Any],
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    def read(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    
    def readRSSI(device_id: String, success: js.Function1[/* rssi */ Double, js.Any]): Unit = js.native
    def readRSSI(
      device_id: String,
      success: js.Function1[/* rssi */ Double, js.Any],
      failure: js.Function1[/* error */ String, js.Any]
    ): Unit = js.native
    
    /* Clears cached services and characteristics info for some poorly behaved devices. Uses an undocumented API,
      so it is not guaranteed to work.
      [iOS] refreshDeviceCache is not supported on iOS. */
    def refreshDeviceCache(device_id: String, timeout_millis: Double): Unit = js.native
    def refreshDeviceCache(
      device_id: String,
      timeout_millis: Double,
      success: js.Function1[/* data */ PeripheralDataExtended, js.Any]
    ): Unit = js.native
    def refreshDeviceCache(
      device_id: String,
      timeout_millis: Double,
      success: js.Function1[/* data */ PeripheralDataExtended, js.Any],
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    def refreshDeviceCache(
      device_id: String,
      timeout_millis: Double,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    
    /* May be used to request (on Android) a larger MTU size to be able to send more data at once
      [iOS] requestMtu is not supported on iOS. */
    def requestMtu(device_id: String, mtu: Double): Unit = js.native
    def requestMtu(device_id: String, mtu: Double, success: js.Function0[js.Any]): Unit = js.native
    def requestMtu(device_id: String, mtu: Double, success: js.Function0[js.Any], failure: js.Function0[js.Any]): Unit = js.native
    def requestMtu(device_id: String, mtu: Double, success: Unit, failure: js.Function0[js.Any]): Unit = js.native
    
    /* Opens the Bluetooth settings for the operating systems.
      [iOS] showBluetoothSettings is not supported on iOS. */
    def showBluetoothSettings(success: js.Function0[js.Any], failure: js.Function0[js.Any]): Unit = js.native
    
    def stopNotification(device_id: String, service_uuid: String, characteristic_uuid: String): Unit = js.native
    def stopNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function0[js.Any]
    ): Unit = js.native
    def stopNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function0[js.Any],
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    def stopNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    
    def stopScan(): Unit = js.native
    def stopScan(success: js.Function0[js.Any]): Unit = js.native
    def stopScan(success: js.Function0[js.Any], failure: js.Function0[js.Any]): Unit = js.native
    
    def stopStateNotifications(): Unit = js.native
    def stopStateNotifications(success: js.Function0[js.Any]): Unit = js.native
    def stopStateNotifications(success: js.Function0[js.Any], failure: js.Function0[js.Any]): Unit = js.native
    def stopStateNotifications(success: Unit, failure: js.Function0[js.Any]): Unit = js.native
    
    var withPromises: BLECentralPluginPromises = js.native
    
    def write(device_id: String, service_uuid: String, characteristic_uuid: String, data: ArrayBuffer): Unit = js.native
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.Function0[js.Any]
    ): Unit = js.native
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.Function0[js.Any],
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: Unit,
      failure: js.Function1[/* error */ String | BLEError, js.Any]
    ): Unit = js.native
    
    /* Writes data to a characteristic without a response from the peripheral. You are not notified if the write fails in the BLE stack.
      The success callback is be called when the characteristic is written.*/
    def writeWithoutResponse(device_id: String, service_uuid: String, characteristic_uuid: String, data: ArrayBuffer): Unit = js.native
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.Function0[js.Any]
    ): Unit = js.native
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.Function0[js.Any],
      failure: js.Function1[/* error */ String, js.Any]
    ): Unit = js.native
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: Unit,
      failure: js.Function1[/* error */ String, js.Any]
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
  
  trait PeripheralCharacteristic extends StObject {
    
    var characteristic: String
    
    var descriptors: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
      
      inline def setDescriptors(value: js.Array[js.Any]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setDescriptorsUndefined: Self = StObject.set(x, "descriptors", js.undefined)
      
      inline def setDescriptorsVarargs(value: js.Any*): Self = StObject.set(x, "descriptors", js.Array(value :_*))
      
      inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeripheralData extends StObject {
    
    var advertising: ArrayBuffer | js.Any
    
    var id: String
    
    var name: String
    
    var rssi: Double
  }
  object PeripheralData {
    
    inline def apply(advertising: ArrayBuffer | js.Any, id: String, name: String, rssi: Double): PeripheralData = {
      val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeripheralData]
    }
    
    extension [Self <: PeripheralData](x: Self) {
      
      inline def setAdvertising(value: ArrayBuffer | js.Any): Self = StObject.set(x, "advertising", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRssi(value: Double): Self = StObject.set(x, "rssi", value.asInstanceOf[js.Any])
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
      advertising: ArrayBuffer | js.Any,
      characteristics: js.Array[PeripheralCharacteristic],
      id: String,
      name: String,
      rssi: Double,
      services: js.Array[String]
    ): PeripheralDataExtended = {
      val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], characteristics = characteristics.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeripheralDataExtended]
    }
    
    extension [Self <: PeripheralDataExtended](x: Self) {
      
      inline def setCharacteristics(value: js.Array[PeripheralCharacteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      inline def setCharacteristicsVarargs(value: PeripheralCharacteristic*): Self = StObject.set(x, "characteristics", js.Array(value :_*))
      
      inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
    }
  }
  
  trait StartScanOptions extends StObject {
    
    var reportDuplicates: js.UndefOr[Boolean] = js.undefined
  }
  object StartScanOptions {
    
    inline def apply(): StartScanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartScanOptions]
    }
    
    extension [Self <: StartScanOptions](x: Self) {
      
      inline def setReportDuplicates(value: Boolean): Self = StObject.set(x, "reportDuplicates", value.asInstanceOf[js.Any])
      
      inline def setReportDuplicatesUndefined: Self = StObject.set(x, "reportDuplicates", js.undefined)
    }
  }
}
