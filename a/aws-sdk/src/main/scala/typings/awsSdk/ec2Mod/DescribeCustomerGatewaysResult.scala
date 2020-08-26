package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCustomerGatewaysResult extends js.Object {
  /**
    * Information about one or more customer gateways.
    */
  var CustomerGateways: js.UndefOr[CustomerGatewayList] = js.native
}

object DescribeCustomerGatewaysResult {
  @scala.inline
  def apply(): DescribeCustomerGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomerGatewaysResult]
  }
  @scala.inline
  implicit class DescribeCustomerGatewaysResultOps[Self <: DescribeCustomerGatewaysResult] (val x: Self) extends AnyVal {
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
    def setCustomerGatewaysVarargs(value: CustomerGateway*): Self = this.set("CustomerGateways", js.Array(value :_*))
    @scala.inline
    def setCustomerGateways(value: CustomerGatewayList): Self = this.set("CustomerGateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerGateways: Self = this.set("CustomerGateways", js.undefined)
  }
  
}

