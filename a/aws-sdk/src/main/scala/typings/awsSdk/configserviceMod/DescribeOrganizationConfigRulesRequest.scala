package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConfigRulesRequest extends js.Object {
  /**
    * The maximum number of organization config rules returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The names of organization config rules for which you want details. If you do not specify any names, AWS Config returns details for all your organization config rules.
    */
  var OrganizationConfigRuleNames: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConfigRuleNames] = js.native
}

object DescribeOrganizationConfigRulesRequest {
  @scala.inline
  def apply(
    Limit: Int | Double = null,
    NextToken: String = null,
    OrganizationConfigRuleNames: OrganizationConfigRuleNames = null
  ): DescribeOrganizationConfigRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationConfigRuleNames != null) __obj.updateDynamic("OrganizationConfigRuleNames")(OrganizationConfigRuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigRulesRequest]
  }
}

