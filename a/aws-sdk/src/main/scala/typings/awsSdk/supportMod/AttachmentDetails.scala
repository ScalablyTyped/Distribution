package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentDetails extends js.Object {
  /**
    * The ID of the attachment.
    */
  var attachmentId: js.UndefOr[AttachmentId] = js.native
  /**
    * The file name of the attachment.
    */
  var fileName: js.UndefOr[FileName] = js.native
}

object AttachmentDetails {
  @scala.inline
  def apply(attachmentId: AttachmentId = null, fileName: FileName = null): AttachmentDetails = {
    val __obj = js.Dynamic.literal()
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentDetails]
  }
}

