package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProtectionStatusRequest extends StObject {
  
  /**
    * The end of the time period to query for the attacks. This is a timestamp type. The request syntax listing indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var EndTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have more objects than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.native
  
  /**
    * The AWS account that is in scope of the policy that you want to get the details for.
    */
  var MemberAccountId: js.UndefOr[AWSAccountId] = js.native
  
  /**
    * If you specify a value for MaxResults and you have more objects than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response, which you can use to retrieve another group of objects. For the second and subsequent GetProtectionStatus requests, specify the value of NextToken from the previous response to get information about another batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ID of the policy for which you want to get the attack information.
    */
  var PolicyId: typings.awsSdk.fmsMod.PolicyId = js.native
  
  /**
    * The start of the time period to query for the attacks. This is a timestamp type. The request syntax listing indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var StartTime: js.UndefOr[TimeStamp] = js.native
}
object GetProtectionStatusRequest {
  
  @scala.inline
  def apply(PolicyId: PolicyId): GetProtectionStatusRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProtectionStatusRequest]
  }
  
  @scala.inline
  implicit class GetProtectionStatusRequestMutableBuilder[Self <: GetProtectionStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: TimeStamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "MemberAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountIdUndefined: Self = StObject.set(x, "MemberAccountId", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: TimeStamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
