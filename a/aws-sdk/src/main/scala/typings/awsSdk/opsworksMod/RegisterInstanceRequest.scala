package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterInstanceRequest extends StObject {
  
  /**
    * The instance's hostname.
    */
  var Hostname: js.UndefOr[String] = js.native
  
  /**
    * An InstanceIdentity object that contains the instance's identity.
    */
  var InstanceIdentity: js.UndefOr[typings.awsSdk.opsworksMod.InstanceIdentity] = js.native
  
  /**
    * The instance's private IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.native
  
  /**
    * The instance's public IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  
  /**
    * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
    */
  var RsaPublicKey: js.UndefOr[String] = js.native
  
  /**
    * The instances public RSA key fingerprint.
    */
  var RsaPublicKeyFingerprint: js.UndefOr[String] = js.native
  
  /**
    * The ID of the stack that the instance is to be registered with.
    */
  var StackId: String = js.native
}
object RegisterInstanceRequest {
  
  @scala.inline
  def apply(StackId: String): RegisterInstanceRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterInstanceRequest]
  }
  
  @scala.inline
  implicit class RegisterInstanceRequestMutableBuilder[Self <: RegisterInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    @scala.inline
    def setInstanceIdentity(value: InstanceIdentity): Self = StObject.set(x, "InstanceIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdentityUndefined: Self = StObject.set(x, "InstanceIdentity", js.undefined)
    
    @scala.inline
    def setPrivateIp(value: String): Self = StObject.set(x, "PrivateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpUndefined: Self = StObject.set(x, "PrivateIp", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    @scala.inline
    def setRsaPublicKey(value: String): Self = StObject.set(x, "RsaPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaPublicKeyFingerprint(value: String): Self = StObject.set(x, "RsaPublicKeyFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaPublicKeyFingerprintUndefined: Self = StObject.set(x, "RsaPublicKeyFingerprint", js.undefined)
    
    @scala.inline
    def setRsaPublicKeyUndefined: Self = StObject.set(x, "RsaPublicKey", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
