package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendBulkTemplatedEmailResponse extends StObject {
  
  /**
    * The unique message identifier returned from the SendBulkTemplatedEmail action.
    */
  var Status: BulkEmailDestinationStatusList = js.native
}
object SendBulkTemplatedEmailResponse {
  
  @scala.inline
  def apply(Status: BulkEmailDestinationStatusList): SendBulkTemplatedEmailResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBulkTemplatedEmailResponse]
  }
  
  @scala.inline
  implicit class SendBulkTemplatedEmailResponseMutableBuilder[Self <: SendBulkTemplatedEmailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: BulkEmailDestinationStatusList): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusVarargs(value: BulkEmailDestinationStatus*): Self = StObject.set(x, "Status", js.Array(value :_*))
  }
}
