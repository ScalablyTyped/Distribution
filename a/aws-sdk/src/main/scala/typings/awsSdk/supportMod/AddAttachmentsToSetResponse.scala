package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAttachmentsToSetResponse extends js.Object {
  /**
    * The ID of the attachment set. If an attachmentSetId was not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId was specified, the attachments are added to the specified set, if it exists.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  /**
    * The time and date when the attachment set expires.
    */
  var expiryTime: js.UndefOr[ExpiryTime] = js.native
}

object AddAttachmentsToSetResponse {
  @scala.inline
  def apply(): AddAttachmentsToSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAttachmentsToSetResponse]
  }
  @scala.inline
  implicit class AddAttachmentsToSetResponseOps[Self <: AddAttachmentsToSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachmentSetId(value: AttachmentSetId): Self = this.set("attachmentSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentSetId: Self = this.set("attachmentSetId", js.undefined)
    @scala.inline
    def setExpiryTime(value: ExpiryTime): Self = this.set("expiryTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiryTime: Self = this.set("expiryTime", js.undefined)
  }
  
}

