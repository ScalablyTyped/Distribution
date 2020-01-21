package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    NextToken: String = null,
    OrganizationConfigRuleDetailedStatus: OrganizationConfigRuleDetailedStatus = null
  ): GetOrganizationConfigRuleDetailedStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationConfigRuleDetailedStatus != null) __obj.updateDynamic("OrganizationConfigRuleDetailedStatus")(OrganizationConfigRuleDetailedStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusResponse]
  }
}

