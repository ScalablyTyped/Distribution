package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningConfigurationOverrides extends js.Object {
  /**
    * A specified override of the default encryption algorithm that is used in a code signing job.
    */
  var encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm] = js.native
  /**
    * A specified override of the default hash algorithm that is used in a code signing job.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.native
}

object SigningConfigurationOverrides {
  @scala.inline
  def apply(): SigningConfigurationOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningConfigurationOverrides]
  }
  @scala.inline
  implicit class SigningConfigurationOverridesOps[Self <: SigningConfigurationOverrides] (val x: Self) extends AnyVal {
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
    def setEncryptionAlgorithm(value: EncryptionAlgorithm): Self = this.set("encryptionAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionAlgorithm: Self = this.set("encryptionAlgorithm", js.undefined)
    @scala.inline
    def setHashAlgorithm(value: HashAlgorithm): Self = this.set("hashAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashAlgorithm: Self = this.set("hashAlgorithm", js.undefined)
  }
  
}

