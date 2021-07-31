package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceQuotaIncreaseRequestsInTemplateRequest extends StObject {
  
  /**
    * Specifies the AWS Region for the quota that you want to use.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.servicequotasMod.AwsRegion] = js.undefined
  
  /**
    * (Optional) Limits the number of results that you want to include in the response. If you don't include this parameter, the response defaults to a value that's specific to the operation. If additional items exist beyond the specified maximum, the NextToken element is present and has a value (isn't null). Include that value as the NextToken request parameter in the call to the operation to get the next part of the results. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.servicequotasMod.MaxResults] = js.undefined
  
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request that indicates that there's more output available. In a subsequent call, set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.undefined
  
  /**
    * The identifier for a service. When performing an operation, use the ServiceCode to specify a particular service. 
    */
  var ServiceCode: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceCode] = js.undefined
}
object ListServiceQuotaIncreaseRequestsInTemplateRequest {
  
  @scala.inline
  def apply(): ListServiceQuotaIncreaseRequestsInTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateRequest]
  }
  
  @scala.inline
  implicit class ListServiceQuotaIncreaseRequestsInTemplateRequestMutableBuilder[Self <: ListServiceQuotaIncreaseRequestsInTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
  }
}
