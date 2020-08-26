package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewaysRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters. The possible values are:    options.propagation-default-route-table-id - The ID of the default propagation route table.    options.amazon-side-asn - The private ASN for the Amazon side of a BGP session.    options.association-default-route-table-id - The ID of the default association route table.    options.auto-accept-shared-attachments - Indicates whether there is automatic acceptance of attachment requests (enable | disable).    options.default-route-table-association - Indicates whether resource attachments are automatically associated with the default association route table (enable | disable).    options.default-route-table-propagation - Indicates whether resource attachments automatically propagate routes to the default propagation route table (enable | disable).    options.dns-support - Indicates whether DNS support is enabled (enable | disable).    options.vpn-ecmp-support - Indicates whether Equal Cost Multipath Protocol support is enabled (enable | disable).    owner-id - The ID of the AWS account that owns the transit gateway.    state - The state of the attachment (available | deleted | deleting | failed | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting).    transit-gateway-id - The ID of the transit gateway.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the transit gateways.
    */
  var TransitGatewayIds: js.UndefOr[TransitGatewayIdStringList] = js.native
}

object DescribeTransitGatewaysRequest {
  @scala.inline
  def apply(): DescribeTransitGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewaysRequest]
  }
  @scala.inline
  implicit class DescribeTransitGatewaysRequestOps[Self <: DescribeTransitGatewaysRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: TransitGatewayMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTransitGatewayIdsVarargs(value: TransitGatewayId*): Self = this.set("TransitGatewayIds", js.Array(value :_*))
    @scala.inline
    def setTransitGatewayIds(value: TransitGatewayIdStringList): Self = this.set("TransitGatewayIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayIds: Self = this.set("TransitGatewayIds", js.undefined)
  }
  
}

