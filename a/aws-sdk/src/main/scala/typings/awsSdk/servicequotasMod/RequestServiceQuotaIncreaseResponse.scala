package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestServiceQuotaIncreaseResponse extends StObject {
  
  /**
    * Returns a list of service quota requests.
    */
  var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
}
object RequestServiceQuotaIncreaseResponse {
  
  @scala.inline
  def apply(): RequestServiceQuotaIncreaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestServiceQuotaIncreaseResponse]
  }
  
  @scala.inline
  implicit class RequestServiceQuotaIncreaseResponseMutableBuilder[Self <: RequestServiceQuotaIncreaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedQuota(value: RequestedServiceQuotaChange): Self = StObject.set(x, "RequestedQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedQuotaUndefined: Self = StObject.set(x, "RequestedQuota", js.undefined)
  }
}
