package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryption: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryption] = js.native
}

object GetFieldLevelEncryptionResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryption: FieldLevelEncryption = null): GetFieldLevelEncryptionResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (FieldLevelEncryption != null) __obj.updateDynamic("FieldLevelEncryption")(FieldLevelEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionResult]
  }
}

