package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMovingAddressesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    moving-status - The status of the Elastic IP address (MovingToVpc | RestoringToClassic).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return for the request in a single page. The remaining results of the initial request can be seen by sending another request with the returned NextToken value. This value can be between 5 and 1000; if MaxResults is given a value outside of this range, an error is returned. Default: If no value is provided, the default is 1000.
    */
  var MaxResults: js.UndefOr[DescribeMovingAddressesMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * One or more Elastic IP addresses.
    */
  var PublicIps: js.UndefOr[ValueStringList] = js.native
}

object DescribeMovingAddressesRequest {
  @scala.inline
  def apply(): DescribeMovingAddressesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMovingAddressesRequest]
  }
  @scala.inline
  implicit class DescribeMovingAddressesRequestOps[Self <: DescribeMovingAddressesRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: DescribeMovingAddressesMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPublicIpsVarargs(value: String*): Self = this.set("PublicIps", js.Array(value :_*))
    @scala.inline
    def setPublicIps(value: ValueStringList): Self = this.set("PublicIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIps: Self = this.set("PublicIps", js.undefined)
  }
  
}

