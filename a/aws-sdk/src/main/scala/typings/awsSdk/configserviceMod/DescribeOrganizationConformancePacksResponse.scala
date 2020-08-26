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
  def apply(): DescribeOrganizationConformancePacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConformancePacksResponse]
  }
  @scala.inline
  implicit class DescribeOrganizationConformancePacksResponseOps[Self <: DescribeOrganizationConformancePacksResponse] (val x: Self) extends AnyVal {
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
    def setOrganizationConformancePacksVarargs(value: OrganizationConformancePack*): Self = this.set("OrganizationConformancePacks", js.Array(value :_*))
    @scala.inline
    def setOrganizationConformancePacks(value: OrganizationConformancePacks): Self = this.set("OrganizationConformancePacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationConformancePacks: Self = this.set("OrganizationConformancePacks", js.undefined)
  }
  
}

