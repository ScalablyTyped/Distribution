package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The value of the ETag header that you received when updating the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the results of updating the configuration.
    */
  var FieldLevelEncryption: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryption] = js.native
}

object UpdateFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryption: FieldLevelEncryption = null): UpdateFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (FieldLevelEncryption != null) __obj.updateDynamic("FieldLevelEncryption")(FieldLevelEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigResult]
  }
}

