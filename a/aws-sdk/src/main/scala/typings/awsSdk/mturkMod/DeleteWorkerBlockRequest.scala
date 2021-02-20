package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteWorkerBlockRequest extends StObject {
  
  /**
    * A message that explains the reason for unblocking the Worker. The Worker does not see this message.
    */
  var Reason: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Worker to unblock.
    */
  var WorkerId: CustomerId = js.native
}
object DeleteWorkerBlockRequest {
  
  @scala.inline
  def apply(WorkerId: CustomerId): DeleteWorkerBlockRequest = {
    val __obj = js.Dynamic.literal(WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkerBlockRequest]
  }
  
  @scala.inline
  implicit class DeleteWorkerBlockRequestMutableBuilder[Self <: DeleteWorkerBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
  }
}
