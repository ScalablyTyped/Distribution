package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentStateChange extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the attachment.
    */
  var attachmentArn: String
  
  /**
    * The status of the attachment.
    */
  var status: String
}
object AttachmentStateChange {
  
  @scala.inline
  def apply(attachmentArn: String, status: String): AttachmentStateChange = {
    val __obj = js.Dynamic.literal(attachmentArn = attachmentArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentStateChange]
  }
  
  @scala.inline
  implicit class AttachmentStateChangeMutableBuilder[Self <: AttachmentStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentArn(value: String): Self = StObject.set(x, "attachmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
