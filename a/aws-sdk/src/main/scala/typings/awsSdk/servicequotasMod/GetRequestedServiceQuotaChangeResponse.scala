package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRequestedServiceQuotaChangeResponse extends StObject {
  
  /**
    * Returns the RequestedServiceQuotaChange object for the specific increase request.
    */
  var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
}
object GetRequestedServiceQuotaChangeResponse {
  
  @scala.inline
  def apply(): GetRequestedServiceQuotaChangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeResponse]
  }
  
  @scala.inline
  implicit class GetRequestedServiceQuotaChangeResponseMutableBuilder[Self <: GetRequestedServiceQuotaChangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedQuota(value: RequestedServiceQuotaChange): Self = StObject.set(x, "RequestedQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedQuotaUndefined: Self = StObject.set(x, "RequestedQuota", js.undefined)
  }
}
