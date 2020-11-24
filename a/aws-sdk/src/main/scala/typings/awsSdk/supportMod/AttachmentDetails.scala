package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): AttachmentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentDetails]
  }
  
  @scala.inline
  implicit class AttachmentDetailsOps[Self <: AttachmentDetails] (val x: Self) extends AnyVal {
    
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
    def setAttachmentId(value: AttachmentId): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentId: Self = this.set("attachmentId", js.undefined)
    
    @scala.inline
    def setFileName(value: FileName): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
  }
}
