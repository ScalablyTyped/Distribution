package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFieldLevelEncryptionProfileRequest extends js.Object {
  /**
    * Request to update a field-level encryption profile. 
    */
  var FieldLevelEncryptionProfileConfig: typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileConfig = js.native
  /**
    * The ID of the field-level encryption profile request. 
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the profile identity to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object UpdateFieldLevelEncryptionProfileRequest {
  @scala.inline
  def apply(
    FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
    Id: String,
    IfMatch: String = null
  ): UpdateFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionProfileConfig = FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileRequest]
  }
}

