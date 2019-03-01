package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceAttributes extends js.Object {
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
  val deviceAttributesNs: Anon_AnnotatedLocation
  ////////////////////
  // Enterprise Platform Keys
  ////////////////////
  /**
    * Use the chrome.enterprise.platformKeys API to generate hardware-backed keys and to install certificates for these keys. The certificates will be managed by the platform and can be used for TLS authentication, network access or by other extension through chrome.platformKeys.
    * Availability: Since Chrome 37.
    * Permissions:  "enterprise.platformKeys"
    * Important: This API works only on Chrome OS.
    * Note:  This API is only for extensions pre-installed by policy.
    */
  val platformKeysNs: Anon_CallbackCertificate
}

object Anon_DeviceAttributes {
  @scala.inline
  def apply(deviceAttributesNs: Anon_AnnotatedLocation, platformKeysNs: Anon_CallbackCertificate): Anon_DeviceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceAttributesNs")(deviceAttributesNs)
    __obj.updateDynamic("platformKeysNs")(platformKeysNs)
    __obj.asInstanceOf[Anon_DeviceAttributes]
  }
}

