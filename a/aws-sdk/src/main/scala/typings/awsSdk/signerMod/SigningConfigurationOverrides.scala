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
  def apply(encryptionAlgorithm: EncryptionAlgorithm = null, hashAlgorithm: HashAlgorithm = null): SigningConfigurationOverrides = {
    val __obj = js.Dynamic.literal()
    if (encryptionAlgorithm != null) __obj.updateDynamic("encryptionAlgorithm")(encryptionAlgorithm.asInstanceOf[js.Any])
    if (hashAlgorithm != null) __obj.updateDynamic("hashAlgorithm")(hashAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningConfigurationOverrides]
  }
}

