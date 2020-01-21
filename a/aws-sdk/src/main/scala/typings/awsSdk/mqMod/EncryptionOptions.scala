package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionOptions extends js.Object {
  /**
    * The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt your data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
    */
  var KmsKeyId: js.UndefOr[string] = js.native
  /**
    * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS).
    */
  var UseAwsOwnedKey: boolean = js.native
}

object EncryptionOptions {
  @scala.inline
  def apply(UseAwsOwnedKey: boolean, KmsKeyId: string = null): EncryptionOptions = {
    val __obj = js.Dynamic.literal(UseAwsOwnedKey = UseAwsOwnedKey.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionOptions]
  }
}

