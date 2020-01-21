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
    * The hash algorithm options that are available for a a code signing job.
    */
  var hashAlgorithmOptions: HashAlgorithmOptions = js.native
}

object SigningConfiguration {
  @scala.inline
  def apply(encryptionAlgorithmOptions: EncryptionAlgorithmOptions, hashAlgorithmOptions: HashAlgorithmOptions): SigningConfiguration = {
    val __obj = js.Dynamic.literal(encryptionAlgorithmOptions = encryptionAlgorithmOptions.asInstanceOf[js.Any], hashAlgorithmOptions = hashAlgorithmOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SigningConfiguration]
  }
}

