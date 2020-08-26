package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionProfileSummary extends js.Object {
  /**
    * An optional comment for the field-level encryption profile summary.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typings.awsSdk.cloudfrontMod.EncryptionEntities = js.native
  /**
    * ID for the field-level encryption profile summary.
    */
  var Id: String = js.native
  /**
    * The time when the the field-level encryption profile summary was last updated.
    */
  var LastModifiedTime: timestamp = js.native
  /**
    * Name for the field-level encryption profile summary.
    */
  var Name: String = js.native
}

object FieldLevelEncryptionProfileSummary {
  @scala.inline
  def apply(EncryptionEntities: EncryptionEntities, Id: String, LastModifiedTime: timestamp, Name: String): FieldLevelEncryptionProfileSummary = {
    val __obj = js.Dynamic.literal(EncryptionEntities = EncryptionEntities.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileSummary]
  }
  @scala.inline
  implicit class FieldLevelEncryptionProfileSummaryOps[Self <: FieldLevelEncryptionProfileSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncryptionEntities(value: EncryptionEntities): Self = this.set("EncryptionEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedTime(value: timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
  
}

