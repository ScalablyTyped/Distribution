package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAccessDetails extends StObject {
  
  /**
    * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey-cert.pub.
    */
  var certKey: js.UndefOr[String] = js.undefined
  
  /**
    * For SSH access, the date on which the temporary keys expire.
    */
  var expiresAt: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * Describes the public SSH host keys or the RDP certificate.
    */
  var hostKeys: js.UndefOr[HostKeysList] = js.undefined
  
  /**
    * The name of this Amazon Lightsail instance.
    */
  var instanceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The public IP address of the Amazon Lightsail instance.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.  If you create an instance using any key pair other than the default (LightsailDefaultKeyPair), password will always be an empty string. If you change the Administrator password on the instance, Lightsail will continue to return the original password value. When accessing the instance using RDP, you need to manually enter the Administrator password after changing it from the default. 
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only needed if password is empty and the instance is not new (and therefore the password is not ready yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
    */
  var passwordData: js.UndefOr[PasswordData] = js.undefined
  
  /**
    * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey).
    */
  var privateKey: js.UndefOr[String] = js.undefined
  
  /**
    * The protocol for these Amazon Lightsail instance access details.
    */
  var protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined
  
  /**
    * The user name to use when logging in to the Amazon Lightsail instance.
    */
  var username: js.UndefOr[String] = js.undefined
}
object InstanceAccessDetails {
  
  inline def apply(): InstanceAccessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAccessDetails]
  }
  
  extension [Self <: InstanceAccessDetails](x: Self) {
    
    inline def setCertKey(value: String): Self = StObject.set(x, "certKey", value.asInstanceOf[js.Any])
    
    inline def setCertKeyUndefined: Self = StObject.set(x, "certKey", js.undefined)
    
    inline def setExpiresAt(value: IsoDate): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    inline def setHostKeys(value: HostKeysList): Self = StObject.set(x, "hostKeys", value.asInstanceOf[js.Any])
    
    inline def setHostKeysUndefined: Self = StObject.set(x, "hostKeys", js.undefined)
    
    inline def setHostKeysVarargs(value: HostKeyAttributes*): Self = StObject.set(x, "hostKeys", js.Array(value :_*))
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordData(value: PasswordData): Self = StObject.set(x, "passwordData", value.asInstanceOf[js.Any])
    
    inline def setPasswordDataUndefined: Self = StObject.set(x, "passwordData", js.undefined)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setProtocol(value: InstanceAccessProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
