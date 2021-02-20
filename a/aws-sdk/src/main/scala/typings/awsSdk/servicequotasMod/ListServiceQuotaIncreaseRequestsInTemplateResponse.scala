package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceQuotaIncreaseRequestsInTemplateResponse extends StObject {
  
  /**
    * If present in the response, this value indicates there's more output available that what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.native
  
  /**
    * Returns the list of values of the quota increase request in the template.
    */
  var ServiceQuotaIncreaseRequestInTemplateList: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceQuotaIncreaseRequestInTemplateList] = js.native
}
object ListServiceQuotaIncreaseRequestsInTemplateResponse {
  
  @scala.inline
  def apply(): ListServiceQuotaIncreaseRequestsInTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateResponse]
  }
  
  @scala.inline
  implicit class ListServiceQuotaIncreaseRequestsInTemplateResponseMutableBuilder[Self <: ListServiceQuotaIncreaseRequestsInTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServiceQuotaIncreaseRequestInTemplateList(value: ServiceQuotaIncreaseRequestInTemplateList): Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplateList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceQuotaIncreaseRequestInTemplateListUndefined: Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplateList", js.undefined)
    
    @scala.inline
    def setServiceQuotaIncreaseRequestInTemplateListVarargs(value: ServiceQuotaIncreaseRequestInTemplate*): Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplateList", js.Array(value :_*))
  }
}
