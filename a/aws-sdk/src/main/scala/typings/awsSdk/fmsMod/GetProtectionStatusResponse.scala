package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProtectionStatusResponse extends js.Object {
  
  /**
    * The ID of the AWS Firewall administrator account for this policy.
    */
  var AdminAccountId: js.UndefOr[AWSAccountId] = js.native
  
  /**
    * Details about the attack, including the following:   Attack type   Account ID   ARN of the resource attacked   Start time of the attack   End time of the attack (ongoing attacks will not have an end time)   The details are in JSON format. 
    */
  var Data: js.UndefOr[ProtectionData] = js.native
  
  /**
    * If you have more objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more objects, submit another GetProtectionStatus request, and specify the NextToken value from the response in the NextToken value in the next request. AWS SDKs provide auto-pagination that identify NextToken in a response and make subsequent request calls automatically on your behalf. However, this feature is not supported by GetProtectionStatus. You must submit subsequent requests with NextToken using your own processes. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The service type that is protected by the policy. Currently, this is always SHIELD_ADVANCED.
    */
  var ServiceType: js.UndefOr[SecurityServiceType] = js.native
}
object GetProtectionStatusResponse {
  
  @scala.inline
  def apply(): GetProtectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProtectionStatusResponse]
  }
  
  @scala.inline
  implicit class GetProtectionStatusResponseOps[Self <: GetProtectionStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdminAccountId(value: AWSAccountId): Self = this.set("AdminAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminAccountId: Self = this.set("AdminAccountId", js.undefined)
    
    @scala.inline
    def setData(value: ProtectionData): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setServiceType(value: SecurityServiceType): Self = this.set("ServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceType: Self = this.set("ServiceType", js.undefined)
  }
}
