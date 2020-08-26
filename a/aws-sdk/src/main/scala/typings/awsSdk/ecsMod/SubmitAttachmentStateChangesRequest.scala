package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitAttachmentStateChangesRequest extends js.Object {
  /**
    * Any attachments associated with the state change request.
    */
  var attachments: AttachmentStateChanges = js.native
  /**
    * The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
    */
  var cluster: js.UndefOr[String] = js.native
}

object SubmitAttachmentStateChangesRequest {
  @scala.inline
  def apply(attachments: AttachmentStateChanges): SubmitAttachmentStateChangesRequest = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitAttachmentStateChangesRequest]
  }
  @scala.inline
  implicit class SubmitAttachmentStateChangesRequestOps[Self <: SubmitAttachmentStateChangesRequest] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: AttachmentStateChange*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: AttachmentStateChanges): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
  }
  
}

