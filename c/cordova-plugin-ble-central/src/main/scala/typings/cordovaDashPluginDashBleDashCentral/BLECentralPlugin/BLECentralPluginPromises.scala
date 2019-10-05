package typings.cordovaDashPluginDashBleDashCentral.BLECentralPlugin

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

