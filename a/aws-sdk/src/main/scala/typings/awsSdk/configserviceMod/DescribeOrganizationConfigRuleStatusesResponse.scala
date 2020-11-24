package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationConfigRuleStatusesResponse extends js.Object {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of OrganizationConfigRuleStatus objects.
    */
  var OrganizationConfigRuleStatuses: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConfigRuleStatuses] = js.native
}
object DescribeOrganizationConfigRuleStatusesResponse {
  
  @scala.inline
  def apply(): DescribeOrganizationConfigRuleStatusesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigRuleStatusesResponse]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConfigRuleStatusesResponseOps[Self <: DescribeOrganizationConfigRuleStatusesResponse] (val x: Self) extends AnyVal {
    
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
    def setOrganizationConfigRuleStatusesVarargs(value: OrganizationConfigRuleStatus*): Self = this.set("OrganizationConfigRuleStatuses", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationConfigRuleStatuses(value: OrganizationConfigRuleStatuses): Self = this.set("OrganizationConfigRuleStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationConfigRuleStatuses: Self = this.set("OrganizationConfigRuleStatuses", js.undefined)
  }
}
