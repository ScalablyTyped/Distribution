package typings.cordovaDashPluginDashBleDashCentral.BLECentralPlugin

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BLECentralPluginStatic extends BLECentralPluginCommon {
  var withPromises: BLECentralPluginPromises = js.native
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
  def requestMtu(device_id: String, mtu: Double, success: js.Function0[_]): Unit = js.native
  def requestMtu(device_id: String, mtu: Double, success: js.Function0[_], failure: js.Function0[_]): Unit = js.native
  /* Opens the Bluetooth settings for the operating systems.
    [iOS] showBluetoothSettings is not supported on iOS. */
  def showBluetoothSettings(success: js.Function0[_], failure: js.Function0[_]): Unit = js.native
  def stopNotification(device_id: String, service_uuid: String, characteristic_uuid: String): Unit = js.native
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
  def stopStateNotifications(success: js.Function0[_]): Unit = js.native
  def stopStateNotifications(success: js.Function0[_], failure: js.Function0[_]): Unit = js.native
  def write(device_id: String, service_uuid: String, characteristic_uuid: String, data: ArrayBuffer): Unit = js.native
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

