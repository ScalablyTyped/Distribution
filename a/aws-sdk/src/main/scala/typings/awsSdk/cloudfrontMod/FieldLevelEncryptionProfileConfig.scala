package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionProfileConfig extends js.Object {
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: String = js.native
  /**
    * An optional comment for the field-level encryption profile.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typings.awsSdk.cloudfrontMod.EncryptionEntities = js.native
  /**
    * Profile name for the field-level encryption profile.
    */
  var Name: String = js.native
}

object FieldLevelEncryptionProfileConfig {
  @scala.inline
  def apply(
    CallerReference: String,
    EncryptionEntities: EncryptionEntities,
    Name: String,
    Comment: String = null
  ): FieldLevelEncryptionProfileConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], EncryptionEntities = EncryptionEntities.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileConfig]
  }
}

