package typings.awsSdkClientKmsNode.typesKeyMetadataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledKeyMetadata extends KeyMetadata {
  /**
    * <p>The date and time when the CMK was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate_UnmarshalledKeyMetadata: js.UndefOr[Date] = js.native
  /**
    * <p>The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is <code>PendingDeletion</code>, otherwise this value is omitted.</p>
    */
  @JSName("DeletionDate")
  var DeletionDate_UnmarshalledKeyMetadata: js.UndefOr[Date] = js.native
  /**
    * <p>The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is omitted.</p>
    */
  @JSName("ValidTo")
  var ValidTo_UnmarshalledKeyMetadata: js.UndefOr[Date] = js.native
}

object UnmarshalledKeyMetadata {
  @scala.inline
  def apply(KeyId: String): UnmarshalledKeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledKeyMetadata]
  }
  @scala.inline
  implicit class UnmarshalledKeyMetadataOps[Self <: UnmarshalledKeyMetadata] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Date): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDeletionDate(value: Date): Self = this.set("DeletionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionDate: Self = this.set("DeletionDate", js.undefined)
    @scala.inline
    def setValidTo(value: Date): Self = this.set("ValidTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidTo: Self = this.set("ValidTo", js.undefined)
  }
  
}

