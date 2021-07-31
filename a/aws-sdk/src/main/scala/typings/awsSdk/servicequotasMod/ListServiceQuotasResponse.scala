package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceQuotasResponse extends StObject {
  
  /**
    * If present in the response, this value indicates there's more output available that what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.undefined
  
  /**
    * The response information for a quota lists all attribute information for the quota. 
    */
  var Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.undefined
}
object ListServiceQuotasResponse {
  
  @scala.inline
  def apply(): ListServiceQuotasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceQuotasResponse]
  }
  
  @scala.inline
  implicit class ListServiceQuotasResponseMutableBuilder[Self <: ListServiceQuotasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQuotas(value: ServiceQuotaListDefinition): Self = StObject.set(x, "Quotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotasUndefined: Self = StObject.set(x, "Quotas", js.undefined)
    
    @scala.inline
    def setQuotasVarargs(value: ServiceQuota*): Self = StObject.set(x, "Quotas", js.Array(value :_*))
  }
}
