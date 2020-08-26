package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the endpoints.
    */
  var VpcEndpoints: js.UndefOr[VpcEndpointSet] = js.native
}

object DescribeVpcEndpointsResult {
  @scala.inline
  def apply(): DescribeVpcEndpointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointsResult]
  }
  @scala.inline
  implicit class DescribeVpcEndpointsResultOps[Self <: DescribeVpcEndpointsResult] (val x: Self) extends AnyVal {
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
    def setVpcEndpointsVarargs(value: VpcEndpoint*): Self = this.set("VpcEndpoints", js.Array(value :_*))
    @scala.inline
    def setVpcEndpoints(value: VpcEndpointSet): Self = this.set("VpcEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpoints: Self = this.set("VpcEndpoints", js.undefined)
  }
  
}

