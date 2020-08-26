package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInternetGatewaysResult extends js.Object {
  /**
    * Information about one or more internet gateways.
    */
  var InternetGateways: js.UndefOr[InternetGatewayList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeInternetGatewaysResult {
  @scala.inline
  def apply(): DescribeInternetGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInternetGatewaysResult]
  }
  @scala.inline
  implicit class DescribeInternetGatewaysResultOps[Self <: DescribeInternetGatewaysResult] (val x: Self) extends AnyVal {
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
    def setInternetGatewaysVarargs(value: InternetGateway*): Self = this.set("InternetGateways", js.Array(value :_*))
    @scala.inline
    def setInternetGateways(value: InternetGatewayList): Self = this.set("InternetGateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternetGateways: Self = this.set("InternetGateways", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

