package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceAccessDetails extends js.Object {
  
  /**
    * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey-cert.pub.
    */
  var certKey: js.UndefOr[String] = js.native
  
  /**
    * For SSH access, the date on which the temporary keys expire.
    */
  var expiresAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * Describes the public SSH host keys or the RDP certificate.
    */
  var hostKeys: js.UndefOr[HostKeysList] = js.native
  
  /**
    * The name of this Amazon Lightsail instance.
    */
  var instanceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The public IP address of the Amazon Lightsail instance.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.native
  
  /**
    * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.  If you create an instance using any key pair other than the default (LightsailDefaultKeyPair), password will always be an empty string. If you change the Administrator password on the instance, Lightsail will continue to return the original password value. When accessing the instance using RDP, you need to manually enter the Administrator password after changing it from the default. 
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only needed if password is empty and the instance is not new (and therefore the password is not ready yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
    */
  var passwordData: js.UndefOr[PasswordData] = js.native
  
  /**
    * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey).
    */
  var privateKey: js.UndefOr[String] = js.native
  
  /**
    * The protocol for these Amazon Lightsail instance access details.
    */
  var protocol: js.UndefOr[InstanceAccessProtocol] = js.native
  
  /**
    * The user name to use when logging in to the Amazon Lightsail instance.
    */
  var username: js.UndefOr[String] = js.native
}
object InstanceAccessDetails {
  
  @scala.inline
  def apply(): InstanceAccessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAccessDetails]
  }
  
  @scala.inline
  implicit class InstanceAccessDetailsOps[Self <: InstanceAccessDetails] (val x: Self) extends AnyVal {
    
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
    def setCertKey(value: String): Self = this.set("certKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertKey: Self = this.set("certKey", js.undefined)
    
    @scala.inline
    def setExpiresAt(value: IsoDate): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresAt: Self = this.set("expiresAt", js.undefined)
    
    @scala.inline
    def setHostKeysVarargs(value: HostKeyAttributes*): Self = this.set("hostKeys", js.Array(value :_*))
    
    @scala.inline
    def setHostKeys(value: HostKeysList): Self = this.set("hostKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostKeys: Self = this.set("hostKeys", js.undefined)
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPasswordData(value: PasswordData): Self = this.set("passwordData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordData: Self = this.set("passwordData", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setProtocol(value: InstanceAccessProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
