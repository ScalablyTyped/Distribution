package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStaleSecurityGroupsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of items to return for this request. The request returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[DescribeStaleSecurityGroupsMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a prior call.)
    */
  var NextToken: js.UndefOr[DescribeStaleSecurityGroupsNextToken] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object DescribeStaleSecurityGroupsRequest {
  @scala.inline
  def apply(VpcId: VpcId): DescribeStaleSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStaleSecurityGroupsRequest]
  }
  @scala.inline
  implicit class DescribeStaleSecurityGroupsRequestOps[Self <: DescribeStaleSecurityGroupsRequest] (val x: Self) extends AnyVal {
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
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setMaxResults(value: DescribeStaleSecurityGroupsMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: DescribeStaleSecurityGroupsNextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

