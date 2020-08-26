package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationConfigRuleDetailedStatusRequest extends js.Object {
  /**
    * A StatusDetailFilters object.
    */
  var Filters: js.UndefOr[StatusDetailFilters] = js.native
  /**
    * The maximum number of OrganizationConfigRuleDetailedStatus returned on each page. If you do not specify a number, AWS Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of organization config rule for which you want status details for member accounts.
    */
  var OrganizationConfigRuleName: typings.awsSdk.configserviceMod.OrganizationConfigRuleName = js.native
}

object GetOrganizationConfigRuleDetailedStatusRequest {
  @scala.inline
  def apply(OrganizationConfigRuleName: OrganizationConfigRuleName): GetOrganizationConfigRuleDetailedStatusRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusRequest]
  }
  @scala.inline
  implicit class GetOrganizationConfigRuleDetailedStatusRequestOps[Self <: GetOrganizationConfigRuleDetailedStatusRequest] (val x: Self) extends AnyVal {
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
    def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = this.set("OrganizationConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: StatusDetailFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setLimit(value: CosmosPageLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

