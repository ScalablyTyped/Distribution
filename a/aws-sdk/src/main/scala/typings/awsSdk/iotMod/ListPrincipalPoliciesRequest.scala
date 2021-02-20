package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPrincipalPoliciesRequest extends StObject {
  
  /**
    * Specifies the order for results. If true, results are returned in ascending creation order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  
  /**
    * The marker for the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
  
  /**
    * The principal. Valid principals are CertificateArn (arn:aws:iot:region:accountId:cert/certificateId), thingGroupArn (arn:aws:iot:region:accountId:thinggroup/groupName) and CognitoId (region:id).
    */
  var principal: Principal = js.native
}
object ListPrincipalPoliciesRequest {
  
  @scala.inline
  def apply(principal: Principal): ListPrincipalPoliciesRequest = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalPoliciesRequest]
  }
  
  @scala.inline
  implicit class ListPrincipalPoliciesRequestMutableBuilder[Self <: ListPrincipalPoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscendingOrder(value: AscendingOrder): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingOrderUndefined: Self = StObject.set(x, "ascendingOrder", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
  }
}
