package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRequestedServiceQuotaChangeHistoryResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.undefined
  
  /**
    * Information about the quota increase requests.
    */
  var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition] = js.undefined
}
object ListRequestedServiceQuotaChangeHistoryResponse {
  
  inline def apply(): ListRequestedServiceQuotaChangeHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryResponse]
  }
  
  extension [Self <: ListRequestedServiceQuotaChangeHistoryResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestedQuotas(value: RequestedServiceQuotaChangeHistoryListDefinition): Self = StObject.set(x, "RequestedQuotas", value.asInstanceOf[js.Any])
    
    inline def setRequestedQuotasUndefined: Self = StObject.set(x, "RequestedQuotas", js.undefined)
    
    inline def setRequestedQuotasVarargs(value: RequestedServiceQuotaChange*): Self = StObject.set(x, "RequestedQuotas", js.Array(value*))
  }
}
