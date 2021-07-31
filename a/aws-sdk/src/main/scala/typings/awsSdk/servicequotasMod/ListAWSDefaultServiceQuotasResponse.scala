package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAWSDefaultServiceQuotasResponse extends StObject {
  
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request that indicates that there's more output available. In a subsequent call, set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.undefined
  
  /**
    * A list of the quotas in the account with the AWS default values. 
    */
  var Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.undefined
}
object ListAWSDefaultServiceQuotasResponse {
  
  @scala.inline
  def apply(): ListAWSDefaultServiceQuotasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAWSDefaultServiceQuotasResponse]
  }
  
  @scala.inline
  implicit class ListAWSDefaultServiceQuotasResponseMutableBuilder[Self <: ListAWSDefaultServiceQuotasResponse] (val x: Self) extends AnyVal {
    
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
