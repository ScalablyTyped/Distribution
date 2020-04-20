package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAlgorithmOptions extends js.Object {
  /**
    * The set of accepted encryption algorithms that are allowed in a code signing job.
    */
  var allowedValues: EncryptionAlgorithms = js.native
  /**
    * The default encryption algorithm that is used by a code signing job.
    */
  var defaultValue: EncryptionAlgorithm = js.native
}

object EncryptionAlgorithmOptions {
  @scala.inline
  def apply(allowedValues: EncryptionAlgorithms, defaultValue: EncryptionAlgorithm): EncryptionAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAlgorithmOptions]
  }
}

