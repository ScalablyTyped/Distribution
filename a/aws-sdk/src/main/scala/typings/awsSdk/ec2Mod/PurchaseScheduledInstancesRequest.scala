package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseScheduledInstancesRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The purchase requests.
    */
  var PurchaseRequests: PurchaseRequestSet = js.native
}
object PurchaseScheduledInstancesRequest {
  
  @scala.inline
  def apply(PurchaseRequests: PurchaseRequestSet): PurchaseScheduledInstancesRequest = {
    val __obj = js.Dynamic.literal(PurchaseRequests = PurchaseRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseScheduledInstancesRequest]
  }
  
  @scala.inline
  implicit class PurchaseScheduledInstancesRequestMutableBuilder[Self <: PurchaseScheduledInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPurchaseRequests(value: PurchaseRequestSet): Self = StObject.set(x, "PurchaseRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseRequestsVarargs(value: PurchaseRequest*): Self = StObject.set(x, "PurchaseRequests", js.Array(value :_*))
  }
}
