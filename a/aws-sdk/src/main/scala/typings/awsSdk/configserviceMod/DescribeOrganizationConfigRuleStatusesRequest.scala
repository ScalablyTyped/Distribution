package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationConfigRuleStatusesRequest extends js.Object {
  
  /**
    * The maximum number of OrganizationConfigRuleStatuses returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The names of organization config rules for which you want status details. If you do not specify any names, AWS Config returns details for all your organization AWS Confg rules.
    */
  var OrganizationConfigRuleNames: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConfigRuleNames] = js.native
}
object DescribeOrganizationConfigRuleStatusesRequest {
  
  @scala.inline
  def apply(): DescribeOrganizationConfigRuleStatusesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigRuleStatusesRequest]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConfigRuleStatusesRequestOps[Self <: DescribeOrganizationConfigRuleStatusesRequest] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: CosmosPageLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRuleNamesVarargs(value: StringWithCharLimit64*): Self = this.set("OrganizationConfigRuleNames", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationConfigRuleNames(value: OrganizationConfigRuleNames): Self = this.set("OrganizationConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationConfigRuleNames: Self = this.set("OrganizationConfigRuleNames", js.undefined)
  }
}
