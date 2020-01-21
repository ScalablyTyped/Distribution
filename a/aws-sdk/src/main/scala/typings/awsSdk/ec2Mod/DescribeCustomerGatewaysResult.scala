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
  def apply(CustomerGateways: CustomerGatewayList = null): DescribeCustomerGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (CustomerGateways != null) __obj.updateDynamic("CustomerGateways")(CustomerGateways.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomerGatewaysResult]
  }
}

