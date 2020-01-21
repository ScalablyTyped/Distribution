package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConformancePacksResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns a list of OrganizationConformancePacks objects.
    */
  var OrganizationConformancePacks: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConformancePacks] = js.native
}

object DescribeOrganizationConformancePacksResponse {
  @scala.inline
  def apply(NextToken: String = null, OrganizationConformancePacks: OrganizationConformancePacks = null): DescribeOrganizationConformancePacksResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationConformancePacks != null) __obj.updateDynamic("OrganizationConformancePacks")(OrganizationConformancePacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConformancePacksResponse]
  }
}

