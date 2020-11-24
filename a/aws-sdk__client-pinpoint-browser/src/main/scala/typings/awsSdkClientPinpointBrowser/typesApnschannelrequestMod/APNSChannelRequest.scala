package typings.awsSdkClientPinpointBrowser.typesApnschannelrequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APNSChannelRequest extends js.Object {
  
  /**
    * The bundle id used for APNs Tokens.
    */
  var BundleId: js.UndefOr[String] = js.native
  
  /**
    * The distribution certificate from Apple.
    */
  var Certificate: js.UndefOr[String] = js.native
  
  /**
    * The default authentication method used for APNs.
    */
  var DefaultAuthenticationMethod: js.UndefOr[String] = js.native
  
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The certificate private key.
    */
  var PrivateKey: js.UndefOr[String] = js.native
  
  /**
    * The team id used for APNs Tokens.
    */
  var TeamId: js.UndefOr[String] = js.native
  
  /**
    * The token key used for APNs Tokens.
    */
  var TokenKey: js.UndefOr[String] = js.native
  
  /**
    * The token key used for APNs Tokens.
    */
  var TokenKeyId: js.UndefOr[String] = js.native
}
object APNSChannelRequest {
  
  @scala.inline
  def apply(): APNSChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APNSChannelRequest]
  }
  
  @scala.inline
  implicit class APNSChannelRequestOps[Self <: APNSChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("BundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("BundleId", js.undefined)
    
    @scala.inline
    def setCertificate(value: String): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
    
    @scala.inline
    def setDefaultAuthenticationMethod(value: String): Self = this.set("DefaultAuthenticationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAuthenticationMethod: Self = this.set("DefaultAuthenticationMethod", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("PrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("PrivateKey", js.undefined)
    
    @scala.inline
    def setTeamId(value: String): Self = this.set("TeamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamId: Self = this.set("TeamId", js.undefined)
    
    @scala.inline
    def setTokenKey(value: String): Self = this.set("TokenKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenKey: Self = this.set("TokenKey", js.undefined)
    
    @scala.inline
    def setTokenKeyId(value: String): Self = this.set("TokenKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenKeyId: Self = this.set("TokenKeyId", js.undefined)
  }
}
