package typings.cordovaPluginBleCentral

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BLECentralPlugin {
  
  @js.native
  trait BLECentralPluginCommon extends StObject {
    
    def connect(
      device_id: String,
      connectCallback: js.Function1[/* data */ PeripheralDataExtended, _],
      disconnectCallback: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    
    def scan(services: js.Array[String], seconds: Double, success: js.Function1[/* data */ PeripheralData, _]): Unit = js.native
    def scan(
      services: js.Array[String],
      seconds: Double,
      success: js.Function1[/* data */ PeripheralData, _],
      failure: js.Function1[/* error */ String, _]
    ): Unit = js.native
    
    /* Register to be notified when the value of a characteristic changes. */
    def startNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ ArrayBuffer, _]
    ): Unit = js.native
    def startNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ ArrayBuffer, _],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    
    def startScan(services: js.Array[String], success: js.Function1[/* data */ PeripheralData, _]): Unit = js.native
    def startScan(
      services: js.Array[String],
      success: js.Function1[/* data */ PeripheralData, _],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    
    def startScanWithOptions(
      services: js.Array[String],
      options: StartScanOptions,
      success: js.Function1[/* data */ PeripheralData, _]
    ): Unit = js.native
    def startScanWithOptions(
      services: js.Array[String],
      options: StartScanOptions,
      success: js.Function1[/* data */ PeripheralData, _],
      failure: js.Function1[/* error */ String, _]
    ): Unit = js.native
    
    def startStateNotifications(success: js.Function1[/* state */ String, _]): Unit = js.native
    def startStateNotifications(success: js.Function1[/* state */ String, _], failure: js.Function1[/* error */ String, _]): Unit = js.native
  }
  
  @js.native
  trait BLECentralPluginPromises extends BLECentralPluginCommon {
    
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
  trait BLECentralPluginStatic extends BLECentralPluginCommon {
    
    /* Automatically connect to a device when it is in range of the phone
      [iOS] background notifications on ios must be enabled if you want to run in the background
      [Android] this relies on the autoConnect argument of BluetoothDevice.connectGatt(). Not all Android devices implement this feature correctly. */
    def autoConnect(
      device_id: String,
      connectCallback: js.Function1[/* data */ PeripheralDataExtended, _],
      disconnectCallback: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    
    /* Find the bonded devices.
      [iOS] bondedDevices is not supported on iOS. */
    def bondedDevices(success: js.Function1[/* data */ js.Array[PeripheralData], _], failure: js.Function0[_]): Unit = js.native
    
    /* Find connected peripherals offering the listed service UUIDs.
      This function wraps CBCentralManager.retrieveConnectedPeripheralsWithServices.
      [Android] peripheralsWithIdentifiers is not supported on Android. */
    def connectedPeripheralsWithServices(
      services: js.Array[String],
      success: js.Function1[/* data */ js.Array[PeripheralData], _],
      failure: js.Function0[_]
    ): Unit = js.native
    
    def disconnect(device_id: String): Unit = js.native
    def disconnect(
      device_id: String,
      success: js.UndefOr[scala.Nothing],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    def disconnect(device_id: String, success: js.Function0[_]): Unit = js.native
    def disconnect(
      device_id: String,
      success: js.Function0[_],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    
    /* Enable Bluetooth on the device.
      [iOS] enable is not supported on iOS. */
    def enable(success: js.Function0[_], failure: js.Function1[/* error */ String, _]): Unit = js.native
    
    /* Calls the success callback when the peripheral is connected and the failure callback when not connected. */
    def isConnected(device_id: String, success: js.Function0[_]): Unit = js.native
    def isConnected(device_id: String, success: js.Function0[_], failure: js.Function1[/* error */ String, _]): Unit = js.native
    
    /* Reports if bluetooth is enabled. */
    def isEnabled(success: js.Function0[_], failure: js.Function1[/* error */ String, _]): Unit = js.native
    
    /* Find known (but not necessarily connected) peripherals offering the listed service UUIDs.
      This function wraps CBCentralManager.retrievePeripheralsWithIdentifiers
      [Android] peripheralsWithIdentifiers is not supported on Android. */
    def peripheralsWithIdentifiers(
      services: js.Array[String],
      success: js.Function1[/* data */ js.Array[PeripheralData], _],
      failure: js.Function0[_]
    ): Unit = js.native
    
    def read(device_id: String, service_uuid: String, characteristic_uuid: String): Unit = js.native
    def read(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.UndefOr[scala.Nothing],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    def read(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ ArrayBuffer, _]
    ): Unit = js.native
    def read(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function1[/* rawData */ ArrayBuffer, _],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    
    def readRSSI(device_id: String, success: js.Function1[/* rssi */ Double, _]): Unit = js.native
    def readRSSI(
      device_id: String,
      success: js.Function1[/* rssi */ Double, _],
      failure: js.Function1[/* error */ String, _]
    ): Unit = js.native
    
    /* Clears cached services and characteristics info for some poorly behaved devices. Uses an undocumented API,
      so it is not guaranteed to work.
      [iOS] refreshDeviceCache is not supported on iOS. */
    def refreshDeviceCache(device_id: String, timeout_millis: Double): Unit = js.native
    def refreshDeviceCache(
      device_id: String,
      timeout_millis: Double,
      success: js.UndefOr[scala.Nothing],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    def refreshDeviceCache(
      device_id: String,
      timeout_millis: Double,
      success: js.Function1[/* data */ PeripheralDataExtended, _]
    ): Unit = js.native
    def refreshDeviceCache(
      device_id: String,
      timeout_millis: Double,
      success: js.Function1[/* data */ PeripheralDataExtended, _],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    
    /* May be used to request (on Android) a larger MTU size to be able to send more data at once
      [iOS] requestMtu is not supported on iOS. */
    def requestMtu(device_id: String, mtu: Double): Unit = js.native
    def requestMtu(device_id: String, mtu: Double, success: js.UndefOr[scala.Nothing], failure: js.Function0[_]): Unit = js.native
    def requestMtu(device_id: String, mtu: Double, success: js.Function0[_]): Unit = js.native
    def requestMtu(device_id: String, mtu: Double, success: js.Function0[_], failure: js.Function0[_]): Unit = js.native
    
    /* Opens the Bluetooth settings for the operating systems.
      [iOS] showBluetoothSettings is not supported on iOS. */
    def showBluetoothSettings(success: js.Function0[_], failure: js.Function0[_]): Unit = js.native
    
    def stopNotification(device_id: String, service_uuid: String, characteristic_uuid: String): Unit = js.native
    def stopNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.UndefOr[scala.Nothing],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    def stopNotification(device_id: String, service_uuid: String, characteristic_uuid: String, success: js.Function0[_]): Unit = js.native
    def stopNotification(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      success: js.Function0[_],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    
    def stopScan(): Unit = js.native
    def stopScan(success: js.Function0[_]): Unit = js.native
    def stopScan(success: js.Function0[_], failure: js.Function0[_]): Unit = js.native
    
    def stopStateNotifications(): Unit = js.native
    def stopStateNotifications(success: js.UndefOr[scala.Nothing], failure: js.Function0[_]): Unit = js.native
    def stopStateNotifications(success: js.Function0[_]): Unit = js.native
    def stopStateNotifications(success: js.Function0[_], failure: js.Function0[_]): Unit = js.native
    
    var withPromises: BLECentralPluginPromises = js.native
    
    def write(device_id: String, service_uuid: String, characteristic_uuid: String, data: ArrayBuffer): Unit = js.native
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.UndefOr[scala.Nothing],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.Function0[_]
    ): Unit = js.native
    def write(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.Function0[_],
      failure: js.Function1[/* error */ String | BLEError, _]
    ): Unit = js.native
    
    /* Writes data to a characteristic without a response from the peripheral. You are not notified if the write fails in the BLE stack.
      The success callback is be called when the characteristic is written.*/
    def writeWithoutResponse(device_id: String, service_uuid: String, characteristic_uuid: String, data: ArrayBuffer): Unit = js.native
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.UndefOr[scala.Nothing],
      failure: js.Function1[/* error */ String, _]
    ): Unit = js.native
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.Function0[_]
    ): Unit = js.native
    def writeWithoutResponse(
      device_id: String,
      service_uuid: String,
      characteristic_uuid: String,
      data: ArrayBuffer,
      success: js.Function0[_],
      failure: js.Function1[/* error */ String, _]
    ): Unit = js.native
  }
  
  @js.native
  trait BLEError extends StObject {
    
    var errorMessage: String = js.native
    
    var id: String = js.native
    
    var name: String = js.native
  }
  object BLEError {
    
    @scala.inline
    def apply(errorMessage: String, id: String, name: String): BLEError = {
      val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BLEError]
    }
    
    @scala.inline
    implicit class BLEErrorMutableBuilder[Self <: BLEError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PeripheralCharacteristic extends StObject {
    
    var characteristic: String = js.native
    
    var descriptors: js.UndefOr[js.Array[_]] = js.native
    
    var properties: js.Array[String] = js.native
    
    var service: String = js.native
  }
  object PeripheralCharacteristic {
    
    @scala.inline
    def apply(characteristic: String, properties: js.Array[String], service: String): PeripheralCharacteristic = {
      val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeripheralCharacteristic]
    }
    
    @scala.inline
    implicit class PeripheralCharacteristicMutableBuilder[Self <: PeripheralCharacteristic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacteristic(value: String): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptors(value: js.Array[_]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptorsUndefined: Self = StObject.set(x, "descriptors", js.undefined)
      
      @scala.inline
      def setDescriptorsVarargs(value: js.Any*): Self = StObject.set(x, "descriptors", js.Array(value :_*))
      
      @scala.inline
      def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PeripheralData extends StObject {
    
    var advertising: ArrayBuffer | js.Any = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var rssi: Double = js.native
  }
  object PeripheralData {
    
    @scala.inline
    def apply(advertising: ArrayBuffer | js.Any, id: String, name: String, rssi: Double): PeripheralData = {
      val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeripheralData]
    }
    
    @scala.inline
    implicit class PeripheralDataMutableBuilder[Self <: PeripheralData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvertising(value: ArrayBuffer | js.Any): Self = StObject.set(x, "advertising", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRssi(value: Double): Self = StObject.set(x, "rssi", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PeripheralDataExtended extends PeripheralData {
    
    var characteristics: js.Array[PeripheralCharacteristic] = js.native
    
    var services: js.Array[String] = js.native
  }
  object PeripheralDataExtended {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PeripheralDataExtendedMutableBuilder[Self <: PeripheralDataExtended] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacteristics(value: js.Array[PeripheralCharacteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacteristicsVarargs(value: PeripheralCharacteristic*): Self = StObject.set(x, "characteristics", js.Array(value :_*))
      
      @scala.inline
      def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StartScanOptions extends StObject {
    
    var reportDuplicates: js.UndefOr[Boolean] = js.native
  }
  object StartScanOptions {
    
    @scala.inline
    def apply(): StartScanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartScanOptions]
    }
    
    @scala.inline
    implicit class StartScanOptionsMutableBuilder[Self <: StartScanOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReportDuplicates(value: Boolean): Self = StObject.set(x, "reportDuplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportDuplicatesUndefined: Self = StObject.set(x, "reportDuplicates", js.undefined)
    }
  }
}
