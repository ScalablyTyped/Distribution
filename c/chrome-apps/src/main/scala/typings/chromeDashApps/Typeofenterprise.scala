package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofenterprise extends js.Object {
  // #endregion
  // #region chrome.enterprise.*
  ////////////////
  // ENTERPRISE //
  ////////////////
  /**
    * @requires Permissions: 'enterprise.deviceAttributes'
    * @requires Note: This API is only available to apps force-installed by enterprise policy.
    * @requires(CrOS) Only available on Chrome OS.
    * @since Chrome 46.
    * @description
    * Use the chrome.enterprise.deviceAttributes API to read device attributes.
    */
  val deviceAttributes: TypeofdeviceAttributes
  /**
    * @requires Permissions: 'enterprise.platformKeys'
    * @requires Note: This API is only available to apps force-installed by enterprise policy.
    * @requires(CrOS) Only available on Chrome OS.
    * @description
    * Use the chrome.enterprise.platformKeys API to generate hardware-backed keys and to install certificates for these keys.
    * The certificates will be managed by the platform and can be used for TLS authentication, network access or by other extension through chrome.platformKeys.
    * @see[Documentation]{@link https://developer.chrome.com/extensions/enterprise_platformKeys}
    */
  val platformKeys: TypeofplatformKeys
}

object Typeofenterprise {
  @scala.inline
  def apply(deviceAttributes: TypeofdeviceAttributes, platformKeys: TypeofplatformKeys): Typeofenterprise = {
    val __obj = js.Dynamic.literal(deviceAttributes = deviceAttributes.asInstanceOf[js.Any], platformKeys = platformKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofenterprise]
  }
}

