package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNatGatewaysRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    nat-gateway-id - The ID of the NAT gateway.    state - The state of the NAT gateway (pending | failed | available | deleting | deleted).    subnet-id - The ID of the subnet in which the NAT gateway resides.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC in which the NAT gateway resides.  
    */
  var Filter: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeNatGatewaysMaxResults] = js.native
  /**
    * One or more NAT gateway IDs.
    */
  var NatGatewayIds: js.UndefOr[NatGatewayIdStringList] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeNatGatewaysRequest {
  @scala.inline
  def apply(): DescribeNatGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNatGatewaysRequest]
  }
  @scala.inline
  implicit class DescribeNatGatewaysRequestOps[Self <: DescribeNatGatewaysRequest] (val x: Self) extends AnyVal {
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
    def setFilterVarargs(value: Filter*): Self = this.set("Filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: FilterList): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setMaxResults(value: DescribeNatGatewaysMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNatGatewayIdsVarargs(value: NatGatewayId*): Self = this.set("NatGatewayIds", js.Array(value :_*))
    @scala.inline
    def setNatGatewayIds(value: NatGatewayIdStringList): Self = this.set("NatGatewayIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatGatewayIds: Self = this.set("NatGatewayIds", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

