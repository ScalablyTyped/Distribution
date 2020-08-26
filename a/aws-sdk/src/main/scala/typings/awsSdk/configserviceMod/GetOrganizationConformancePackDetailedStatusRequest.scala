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
  def apply(OrganizationConformancePackName: OrganizationConformancePackName): GetOrganizationConformancePackDetailedStatusRequest = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationConformancePackDetailedStatusRequest]
  }
  @scala.inline
  implicit class GetOrganizationConformancePackDetailedStatusRequestOps[Self <: GetOrganizationConformancePackDetailedStatusRequest] (val x: Self) extends AnyVal {
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
    def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = this.set("OrganizationConformancePackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: OrganizationResourceDetailedStatusFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
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

