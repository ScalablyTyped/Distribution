package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRequestedServiceQuotaChangeHistoryByQuotaResponse extends StObject {
  
  /**
    * If present in the response, this value indicates there's more output available that what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.native
  
  /**
    * Returns a list of service quota requests.
    */
  var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition] = js.native
}
object ListRequestedServiceQuotaChangeHistoryByQuotaResponse {
  
  @scala.inline
  def apply(): ListRequestedServiceQuotaChangeHistoryByQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryByQuotaResponse]
  }
  
  @scala.inline
  implicit class ListRequestedServiceQuotaChangeHistoryByQuotaResponseMutableBuilder[Self <: ListRequestedServiceQuotaChangeHistoryByQuotaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestedQuotas(value: RequestedServiceQuotaChangeHistoryListDefinition): Self = StObject.set(x, "RequestedQuotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedQuotasUndefined: Self = StObject.set(x, "RequestedQuotas", js.undefined)
    
    @scala.inline
    def setRequestedQuotasVarargs(value: RequestedServiceQuotaChange*): Self = StObject.set(x, "RequestedQuotas", js.Array(value :_*))
  }
}
