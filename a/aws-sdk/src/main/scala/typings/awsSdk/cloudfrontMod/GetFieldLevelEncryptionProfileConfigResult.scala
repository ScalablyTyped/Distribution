package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionProfileConfigResult extends js.Object {
  /**
    * The current version of the field-level encryption profile configuration result. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the field-level encryption profile configuration information.
    */
  var FieldLevelEncryptionProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileConfig] = js.native
}

object GetFieldLevelEncryptionProfileConfigResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig = null): GetFieldLevelEncryptionProfileConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (FieldLevelEncryptionProfileConfig != null) __obj.updateDynamic("FieldLevelEncryptionProfileConfig")(FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigResult]
  }
}

