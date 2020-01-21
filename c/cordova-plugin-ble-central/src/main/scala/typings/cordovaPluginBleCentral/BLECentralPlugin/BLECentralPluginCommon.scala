package typings.cordovaPluginBleCentral.BLECentralPlugin

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BLECentralPluginCommon extends js.Object {
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

