package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeviceAttributes extends js.Object {
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit
  def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit
}

object TypeofdeviceAttributes {
  @scala.inline
  def apply(
    getDeviceAnnotatedLocation: js.Function1[/* annotatedLocation */ String, Unit] => Unit,
    getDeviceAssetId: js.Function1[/* assetId */ String, Unit] => Unit,
    getDeviceSerialNumber: js.Function1[/* serialNumber */ String, Unit] => Unit,
    getDirectoryDeviceId: js.Function1[/* deviceId */ String, Unit] => Unit
  ): TypeofdeviceAttributes = {
    val __obj = js.Dynamic.literal(getDeviceAnnotatedLocation = js.Any.fromFunction1(getDeviceAnnotatedLocation), getDeviceAssetId = js.Any.fromFunction1(getDeviceAssetId), getDeviceSerialNumber = js.Any.fromFunction1(getDeviceSerialNumber), getDirectoryDeviceId = js.Any.fromFunction1(getDirectoryDeviceId))
    __obj.asInstanceOf[TypeofdeviceAttributes]
  }
}

