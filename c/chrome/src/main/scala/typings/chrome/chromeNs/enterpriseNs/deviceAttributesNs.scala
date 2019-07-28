package typings.chrome.chromeNs.enterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Enterprise Device Attributes
////////////////////
/**
  * Use the <code>chrome.enterprise.deviceAttributes</code> API to read device attributes.
  * Permissions:  "enterprise.deviceAttributes"
  * Since: Chrome 46
  * Important: This API works only on Chrome OS.
  * Note: This API is only for extensions pre-installed by policy.
  */
@JSGlobal("chrome.enterprise.deviceAttributes")
@js.native
object deviceAttributesNs extends js.Object {
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit = js.native
  def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit = js.native
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit = js.native
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit = js.native
}

