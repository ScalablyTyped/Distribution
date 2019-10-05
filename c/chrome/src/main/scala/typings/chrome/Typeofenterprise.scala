package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofenterprise extends js.Object {
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
  val deviceAttributes: TypeofdeviceAttributes
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
  val platformKeys: TypeofplatformKeys
}

object Typeofenterprise {
  @scala.inline
  def apply(deviceAttributes: TypeofdeviceAttributes, platformKeys: TypeofplatformKeys): Typeofenterprise = {
    val __obj = js.Dynamic.literal(deviceAttributes = deviceAttributes, platformKeys = platformKeys)
  
    __obj.asInstanceOf[Typeofenterprise]
  }
}

