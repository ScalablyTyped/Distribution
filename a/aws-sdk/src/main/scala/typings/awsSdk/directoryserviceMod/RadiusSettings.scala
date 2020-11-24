package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadiusSettings extends js.Object {
  
  /**
    * The protocol specified for your RADIUS endpoints.
    */
  var AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol] = js.native
  
  /**
    * Not currently used.
    */
  var DisplayLabel: js.UndefOr[RadiusDisplayLabel] = js.native
  
  /**
    * The port that your RADIUS server is using for communications. Your on-premises network must allow inbound traffic over this port from the AWS Directory Service servers.
    */
  var RadiusPort: js.UndefOr[PortNumber] = js.native
  
  /**
    * The maximum number of times that communication with the RADIUS server is attempted.
    */
  var RadiusRetries: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusRetries] = js.native
  
  /**
    * An array of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
    */
  var RadiusServers: js.UndefOr[Servers] = js.native
  
  /**
    * The amount of time, in seconds, to wait for the RADIUS server to respond.
    */
  var RadiusTimeout: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusTimeout] = js.native
  
  /**
    * Required for enabling RADIUS on the directory.
    */
  var SharedSecret: js.UndefOr[RadiusSharedSecret] = js.native
  
  /**
    * Not currently used.
    */
  var UseSameUsername: js.UndefOr[typings.awsSdk.directoryserviceMod.UseSameUsername] = js.native
}
object RadiusSettings {
  
  @scala.inline
  def apply(): RadiusSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadiusSettings]
  }
  
  @scala.inline
  implicit class RadiusSettingsOps[Self <: RadiusSettings] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationProtocol(value: RadiusAuthenticationProtocol): Self = this.set("AuthenticationProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationProtocol: Self = this.set("AuthenticationProtocol", js.undefined)
    
    @scala.inline
    def setDisplayLabel(value: RadiusDisplayLabel): Self = this.set("DisplayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLabel: Self = this.set("DisplayLabel", js.undefined)
    
    @scala.inline
    def setRadiusPort(value: PortNumber): Self = this.set("RadiusPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusPort: Self = this.set("RadiusPort", js.undefined)
    
    @scala.inline
    def setRadiusRetries(value: RadiusRetries): Self = this.set("RadiusRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusRetries: Self = this.set("RadiusRetries", js.undefined)
    
    @scala.inline
    def setRadiusServersVarargs(value: Server*): Self = this.set("RadiusServers", js.Array(value :_*))
    
    @scala.inline
    def setRadiusServers(value: Servers): Self = this.set("RadiusServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusServers: Self = this.set("RadiusServers", js.undefined)
    
    @scala.inline
    def setRadiusTimeout(value: RadiusTimeout): Self = this.set("RadiusTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusTimeout: Self = this.set("RadiusTimeout", js.undefined)
    
    @scala.inline
    def setSharedSecret(value: RadiusSharedSecret): Self = this.set("SharedSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedSecret: Self = this.set("SharedSecret", js.undefined)
    
    @scala.inline
    def setUseSameUsername(value: UseSameUsername): Self = this.set("UseSameUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSameUsername: Self = this.set("UseSameUsername", js.undefined)
  }
}
