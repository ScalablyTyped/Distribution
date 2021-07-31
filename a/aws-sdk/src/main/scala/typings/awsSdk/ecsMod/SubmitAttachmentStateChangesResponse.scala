package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitAttachmentStateChangesResponse extends StObject {
  
  /**
    * Acknowledgement of the state change.
    */
  var acknowledgment: js.UndefOr[String] = js.undefined
}
object SubmitAttachmentStateChangesResponse {
  
  @scala.inline
  def apply(): SubmitAttachmentStateChangesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitAttachmentStateChangesResponse]
  }
  
  @scala.inline
  implicit class SubmitAttachmentStateChangesResponseMutableBuilder[Self <: SubmitAttachmentStateChangesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledgment(value: String): Self = StObject.set(x, "acknowledgment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgmentUndefined: Self = StObject.set(x, "acknowledgment", js.undefined)
  }
}
