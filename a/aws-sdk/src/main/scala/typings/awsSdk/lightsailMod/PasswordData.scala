package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(ciphertext: String = null, keyPairName: ResourceName = null): PasswordData = {
    val __obj = js.Dynamic.literal()
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext.asInstanceOf[js.Any])
    if (keyPairName != null) __obj.updateDynamic("keyPairName")(keyPairName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordData]
  }
}

