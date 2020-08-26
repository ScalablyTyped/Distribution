package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningConfiguration extends js.Object {
  /**
    * The encryption algorithm options that are available for a code signing job.
    */
  var encryptionAlgorithmOptions: EncryptionAlgorithmOptions = js.native
  /**
    * The hash algorithm options that are available for a code signing job.
    */
  var hashAlgorithmOptions: HashAlgorithmOptions = js.native
}

object SigningConfiguration {
  @scala.inline
  def apply(encryptionAlgorithmOptions: EncryptionAlgorithmOptions, hashAlgorithmOptions: HashAlgorithmOptions): SigningConfiguration = {
    val __obj = js.Dynamic.literal(encryptionAlgorithmOptions = encryptionAlgorithmOptions.asInstanceOf[js.Any], hashAlgorithmOptions = hashAlgorithmOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningConfiguration]
  }
  @scala.inline
  implicit class SigningConfigurationOps[Self <: SigningConfiguration] (val x: Self) extends AnyVal {
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
    def setEncryptionAlgorithmOptions(value: EncryptionAlgorithmOptions): Self = this.set("encryptionAlgorithmOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashAlgorithmOptions(value: HashAlgorithmOptions): Self = this.set("hashAlgorithmOptions", value.asInstanceOf[js.Any])
  }
  
}

