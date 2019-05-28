package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeviceAttributes extends js.Object {
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ java.lang.String, scala.Unit]): scala.Unit
  def getDeviceAssetId(callback: js.Function1[/* assetId */ java.lang.String, scala.Unit]): scala.Unit
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ java.lang.String, scala.Unit]): scala.Unit
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ java.lang.String, scala.Unit]): scala.Unit
}

object TypeofdeviceAttributes {
  @scala.inline
  def apply(
    getDeviceAnnotatedLocation: js.Function1[/* annotatedLocation */ java.lang.String, scala.Unit] => scala.Unit,
    getDeviceAssetId: js.Function1[/* assetId */ java.lang.String, scala.Unit] => scala.Unit,
    getDeviceSerialNumber: js.Function1[/* serialNumber */ java.lang.String, scala.Unit] => scala.Unit,
    getDirectoryDeviceId: js.Function1[/* deviceId */ java.lang.String, scala.Unit] => scala.Unit
  ): TypeofdeviceAttributes = {
    val __obj = js.Dynamic.literal(getDeviceAnnotatedLocation = js.Any.fromFunction1(getDeviceAnnotatedLocation), getDeviceAssetId = js.Any.fromFunction1(getDeviceAssetId), getDeviceSerialNumber = js.Any.fromFunction1(getDeviceSerialNumber), getDirectoryDeviceId = js.Any.fromFunction1(getDirectoryDeviceId))
  
    __obj.asInstanceOf[TypeofdeviceAttributes]
  }
}

