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
  def apply(attachments: AttachmentStateChanges, cluster: String = null): SubmitAttachmentStateChangesRequest = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitAttachmentStateChangesRequest]
  }
}

