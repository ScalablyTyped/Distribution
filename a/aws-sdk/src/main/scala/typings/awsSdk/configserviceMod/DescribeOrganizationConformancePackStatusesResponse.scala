package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConformancePackStatusesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of OrganizationConformancePackStatus objects. 
    */
  var OrganizationConformancePackStatuses: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConformancePackStatuses] = js.native
}

object DescribeOrganizationConformancePackStatusesResponse {
  @scala.inline
  def apply(): DescribeOrganizationConformancePackStatusesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConformancePackStatusesResponse]
  }
  @scala.inline
  implicit class DescribeOrganizationConformancePackStatusesResponseOps[Self <: DescribeOrganizationConformancePackStatusesResponse] (val x: Self) extends AnyVal {
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
    def setOrganizationConformancePackStatusesVarargs(value: OrganizationConformancePackStatus*): Self = this.set("OrganizationConformancePackStatuses", js.Array(value :_*))
    @scala.inline
    def setOrganizationConformancePackStatuses(value: OrganizationConformancePackStatuses): Self = this.set("OrganizationConformancePackStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationConformancePackStatuses: Self = this.set("OrganizationConformancePackStatuses", js.undefined)
  }
  
}

