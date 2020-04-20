package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionProfile extends js.Object {
  /**
    * A complex data type that includes the profile name and the encryption entities for the field-level encryption profile.
    */
  var FieldLevelEncryptionProfileConfig: typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileConfig = js.native
  /**
    * The ID for a field-level encryption profile configuration which includes a set of profiles that specify certain selected data fields to be encrypted by specific public keys.
    */
  var Id: String = js.native
  /**
    * The last time the field-level encryption profile was updated.
    */
  var LastModifiedTime: timestamp = js.native
}

object FieldLevelEncryptionProfile {
  @scala.inline
  def apply(
    FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
    Id: String,
    LastModifiedTime: timestamp
  ): FieldLevelEncryptionProfile = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionProfileConfig = FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfile]
  }
}

