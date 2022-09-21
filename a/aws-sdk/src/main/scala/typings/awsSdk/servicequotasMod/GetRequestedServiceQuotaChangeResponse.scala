package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRequestedServiceQuotaChangeResponse extends StObject {
  
  /**
    * Information about the quota increase request.
    */
  var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
}
object GetRequestedServiceQuotaChangeResponse {
  
  inline def apply(): GetRequestedServiceQuotaChangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeResponse]
  }
  
  extension [Self <: GetRequestedServiceQuotaChangeResponse](x: Self) {
    
    inline def setRequestedQuota(value: RequestedServiceQuotaChange): Self = StObject.set(x, "RequestedQuota", value.asInstanceOf[js.Any])
    
    inline def setRequestedQuotaUndefined: Self = StObject.set(x, "RequestedQuota", js.undefined)
  }
}
