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
  def apply(
    OrganizationConfigRuleName: OrganizationConfigRuleName,
    Filters: StatusDetailFilters = null,
    Limit: js.UndefOr[CosmosPageLimit] = js.undefined,
    NextToken: String = null
  ): GetOrganizationConfigRuleDetailedStatusRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusRequest]
  }
}

