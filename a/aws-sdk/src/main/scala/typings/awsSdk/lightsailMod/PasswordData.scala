package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordData extends js.Object {
  
  /**
    * The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.  If you use the default key pair (LightsailDefaultKeyPair), the decrypted password will be available in the password field. If you are using a custom key pair, you need to use your own means of decryption. If you change the Administrator password on the instance, Lightsail will continue to return the original ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator password after changing it from the default. 
    */
  var ciphertext: js.UndefOr[String] = js.native
  
  /**
    * The name of the key pair that you used when creating your instance. If no key pair name was specified when creating the instance, Lightsail uses the default key pair (LightsailDefaultKeyPair). If you are using a custom key pair, you need to use your own means of decrypting your password using the ciphertext. Lightsail creates the ciphertext by encrypting your password with the public key part of this key pair.
    */
  var keyPairName: js.UndefOr[ResourceName] = js.native
}
object PasswordData {
  
  @scala.inline
  def apply(): PasswordData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordData]
  }
  
  @scala.inline
  implicit class PasswordDataOps[Self <: PasswordData] (val x: Self) extends AnyVal {
    
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
    def setCiphertext(value: String): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphertext: Self = this.set("ciphertext", js.undefined)
    
    @scala.inline
    def setKeyPairName(value: ResourceName): Self = this.set("keyPairName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPairName: Self = this.set("keyPairName", js.undefined)
  }
}
