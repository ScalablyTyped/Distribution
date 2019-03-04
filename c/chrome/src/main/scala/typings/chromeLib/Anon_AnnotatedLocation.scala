package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnnotatedLocation extends js.Object {
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ java.lang.String, scala.Unit]): scala.Unit
  def getDeviceAssetId(callback: js.Function1[/* assetId */ java.lang.String, scala.Unit]): scala.Unit
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ java.lang.String, scala.Unit]): scala.Unit
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ java.lang.String, scala.Unit]): scala.Unit
}

object Anon_AnnotatedLocation {
  @scala.inline
  def apply(
    getDeviceAnnotatedLocation: js.Function1[js.Function1[/* annotatedLocation */ java.lang.String, scala.Unit], scala.Unit],
    getDeviceAssetId: js.Function1[js.Function1[/* assetId */ java.lang.String, scala.Unit], scala.Unit],
    getDeviceSerialNumber: js.Function1[js.Function1[/* serialNumber */ java.lang.String, scala.Unit], scala.Unit],
    getDirectoryDeviceId: js.Function1[js.Function1[/* deviceId */ java.lang.String, scala.Unit], scala.Unit]
  ): Anon_AnnotatedLocation = {
    val __obj = js.Dynamic.literal(getDeviceAnnotatedLocation = getDeviceAnnotatedLocation, getDeviceAssetId = getDeviceAssetId, getDeviceSerialNumber = getDeviceSerialNumber, getDirectoryDeviceId = getDirectoryDeviceId)
  
    __obj.asInstanceOf[Anon_AnnotatedLocation]
  }
}

