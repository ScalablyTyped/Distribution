package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationConformancePackDetailedStatusRequest extends js.Object {
  /**
    * An OrganizationResourceDetailedStatusFilters object.
    */
  var Filters: js.UndefOr[OrganizationResourceDetailedStatusFilters] = js.native
  /**
    * The maximum number of OrganizationConformancePackDetailedStatuses returned on each page. If you do not specify a number, AWS Config uses the default. The default is 100. 
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of organization conformance pack for which you want status details for member accounts.
    */
  var OrganizationConformancePackName: typings.awsSdk.configserviceMod.OrganizationConformancePackName = js.native
}

object GetOrganizationConformancePackDetailedStatusRequest {
  @scala.inline
  def apply(
    OrganizationConformancePackName: OrganizationConformancePackName,
    Filters: OrganizationResourceDetailedStatusFilters = null,
    Limit: Int | Double = null,
    NextToken: String = null
  ): GetOrganizationConformancePackDetailedStatusRequest = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationConformancePackDetailedStatusRequest]
  }
}

