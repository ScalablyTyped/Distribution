package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterInstanceRequest extends js.Object {
  
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
  implicit class RegisterInstanceRequestOps[Self <: RegisterInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("Hostname", js.undefined)
    
    @scala.inline
    def setInstanceIdentity(value: InstanceIdentity): Self = this.set("InstanceIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceIdentity: Self = this.set("InstanceIdentity", js.undefined)
    
    @scala.inline
    def setPrivateIp(value: String): Self = this.set("PrivateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIp: Self = this.set("PrivateIp", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
    
    @scala.inline
    def setRsaPublicKey(value: String): Self = this.set("RsaPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRsaPublicKey: Self = this.set("RsaPublicKey", js.undefined)
    
    @scala.inline
    def setRsaPublicKeyFingerprint(value: String): Self = this.set("RsaPublicKeyFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRsaPublicKeyFingerprint: Self = this.set("RsaPublicKeyFingerprint", js.undefined)
  }
}
