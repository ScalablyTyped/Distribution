package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrganizationConfigRuleDetailedStatusResponse extends js.Object {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of MemberAccountStatus objects.
    */
  var OrganizationConfigRuleDetailedStatus: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConfigRuleDetailedStatus] = js.native
}
object GetOrganizationConfigRuleDetailedStatusResponse {
  
  @scala.inline
  def apply(): GetOrganizationConfigRuleDetailedStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusResponse]
  }
  
  @scala.inline
  implicit class GetOrganizationConfigRuleDetailedStatusResponseOps[Self <: GetOrganizationConfigRuleDetailedStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRuleDetailedStatusVarargs(value: MemberAccountStatus*): Self = this.set("OrganizationConfigRuleDetailedStatus", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationConfigRuleDetailedStatus(value: OrganizationConfigRuleDetailedStatus): Self = this.set("OrganizationConfigRuleDetailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationConfigRuleDetailedStatus: Self = this.set("OrganizationConfigRuleDetailedStatus", js.undefined)
  }
}
