package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewaysResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the transit gateways.
    */
  var TransitGateways: js.UndefOr[TransitGatewayList] = js.native
}

object DescribeTransitGatewaysResult {
  @scala.inline
  def apply(): DescribeTransitGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewaysResult]
  }
  @scala.inline
  implicit class DescribeTransitGatewaysResultOps[Self <: DescribeTransitGatewaysResult] (val x: Self) extends AnyVal {
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
    def setTransitGatewaysVarargs(value: TransitGateway*): Self = this.set("TransitGateways", js.Array(value :_*))
    @scala.inline
    def setTransitGateways(value: TransitGatewayList): Self = this.set("TransitGateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGateways: Self = this.set("TransitGateways", js.undefined)
  }
  
}

