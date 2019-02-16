package typings
package chromeLib.chromeNs.enterpriseNs

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
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getDeviceAssetId(callback: js.Function1[/* assetId */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

