package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConfigRulesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns a list of OrganizationConfigRule objects.
    */
  var OrganizationConfigRules: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConfigRules] = js.native
}

object DescribeOrganizationConfigRulesResponse {
  @scala.inline
  def apply(NextToken: String = null, OrganizationConfigRules: OrganizationConfigRules = null): DescribeOrganizationConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationConfigRules != null) __obj.updateDynamic("OrganizationConfigRules")(OrganizationConfigRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigRulesResponse]
  }
}

