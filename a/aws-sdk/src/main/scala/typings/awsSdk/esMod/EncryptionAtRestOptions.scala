package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAtRestOptions extends js.Object {
  /**
    * Specifies the option to enable Encryption At Rest.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    *  Specifies the KMS Key ID for Encryption At Rest options.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.esMod.KmsKeyId] = js.native
}

object EncryptionAtRestOptions {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined, KmsKeyId: KmsKeyId = null): EncryptionAtRestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRestOptions]
  }
}

