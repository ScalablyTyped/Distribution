package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterInstanceRequest extends StObject {
  
  /**
    * The instance's hostname.
    */
  var Hostname: js.UndefOr[String] = js.undefined
  
  /**
    * An InstanceIdentity object that contains the instance's identity.
    */
  var InstanceIdentity: js.UndefOr[typings.awsSdk.opsworksMod.InstanceIdentity] = js.undefined
  
  /**
    * The instance's private IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's public IP address.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  
  /**
    * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
    */
  var RsaPublicKey: js.UndefOr[String] = js.undefined
  
  /**
    * The instances public RSA key fingerprint.
    */
  var RsaPublicKeyFingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the stack that the instance is to be registered with.
    */
  var StackId: String
}
object RegisterInstanceRequest {
  
  inline def apply(StackId: String): RegisterInstanceRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterInstanceRequest]
  }
  
  extension [Self <: RegisterInstanceRequest](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setInstanceIdentity(value: InstanceIdentity): Self = StObject.set(x, "InstanceIdentity", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdentityUndefined: Self = StObject.set(x, "InstanceIdentity", js.undefined)
    
    inline def setPrivateIp(value: String): Self = StObject.set(x, "PrivateIp", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpUndefined: Self = StObject.set(x, "PrivateIp", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    inline def setRsaPublicKey(value: String): Self = StObject.set(x, "RsaPublicKey", value.asInstanceOf[js.Any])
    
    inline def setRsaPublicKeyFingerprint(value: String): Self = StObject.set(x, "RsaPublicKeyFingerprint", value.asInstanceOf[js.Any])
    
    inline def setRsaPublicKeyFingerprintUndefined: Self = StObject.set(x, "RsaPublicKeyFingerprint", js.undefined)
    
    inline def setRsaPublicKeyUndefined: Self = StObject.set(x, "RsaPublicKey", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
