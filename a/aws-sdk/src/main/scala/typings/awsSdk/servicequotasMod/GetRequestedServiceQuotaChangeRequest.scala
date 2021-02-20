package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRequestedServiceQuotaChangeRequest extends StObject {
  
  /**
    * Identifies the quota increase request.
    */
  var RequestId: typings.awsSdk.servicequotasMod.RequestId = js.native
}
object GetRequestedServiceQuotaChangeRequest {
  
  @scala.inline
  def apply(RequestId: RequestId): GetRequestedServiceQuotaChangeRequest = {
    val __obj = js.Dynamic.literal(RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeRequest]
  }
  
  @scala.inline
  implicit class GetRequestedServiceQuotaChangeRequestMutableBuilder[Self <: GetRequestedServiceQuotaChangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
  }
}
