package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProtectionStatusResponse extends StObject {
  
  /**
    * The ID of the AWS Firewall administrator account for this policy.
    */
  var AdminAccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * Details about the attack, including the following:   Attack type   Account ID   ARN of the resource attacked   Start time of the attack   End time of the attack (ongoing attacks will not have an end time)   The details are in JSON format. 
    */
  var Data: js.UndefOr[ProtectionData] = js.undefined
  
  /**
    * If you have more objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more objects, submit another GetProtectionStatus request, and specify the NextToken value from the response in the NextToken value in the next request. AWS SDKs provide auto-pagination that identify NextToken in a response and make subsequent request calls automatically on your behalf. However, this feature is not supported by GetProtectionStatus. You must submit subsequent requests with NextToken using your own processes. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The service type that is protected by the policy. Currently, this is always SHIELD_ADVANCED.
    */
  var ServiceType: js.UndefOr[SecurityServiceType] = js.undefined
}
object GetProtectionStatusResponse {
  
  @scala.inline
  def apply(): GetProtectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProtectionStatusResponse]
  }
  
  @scala.inline
  implicit class GetProtectionStatusResponseMutableBuilder[Self <: GetProtectionStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminAccountId(value: AWSAccountId): Self = StObject.set(x, "AdminAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminAccountIdUndefined: Self = StObject.set(x, "AdminAccountId", js.undefined)
    
    @scala.inline
    def setData(value: ProtectionData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServiceType(value: SecurityServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
  }
}
