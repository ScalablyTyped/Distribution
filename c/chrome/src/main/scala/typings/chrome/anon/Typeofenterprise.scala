package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  val deviceAttributes: TypeofdeviceAttributes = js.native
  
  ////////////////////
  // Enterprise Networking Attributes
  ////////////////////
  /**
    * Use the <code>chrome.enterprise.networkingAttributes</code> API to read information about your current network. Note: This API is only available to extensions force-installed by enterprise policy.
    * Important: This API works only on Chrome OS.
    * @since Chrome 85.
    */
  val networkingAttributes: TypeofnetworkingAttribute = js.native
  
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
  val platformKeys: TypeofplatformKeys = js.native
}
object Typeofenterprise {
  
  @scala.inline
  def apply(
    deviceAttributes: TypeofdeviceAttributes,
    networkingAttributes: TypeofnetworkingAttribute,
    platformKeys: TypeofplatformKeys
  ): Typeofenterprise = {
    val __obj = js.Dynamic.literal(deviceAttributes = deviceAttributes.asInstanceOf[js.Any], networkingAttributes = networkingAttributes.asInstanceOf[js.Any], platformKeys = platformKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofenterprise]
  }
  
  @scala.inline
  implicit class TypeofenterpriseOps[Self <: Typeofenterprise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceAttributes(value: TypeofdeviceAttributes): Self = this.set("deviceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkingAttributes(value: TypeofnetworkingAttribute): Self = this.set("networkingAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformKeys(value: TypeofplatformKeys): Self = this.set("platformKeys", value.asInstanceOf[js.Any])
  }
}
