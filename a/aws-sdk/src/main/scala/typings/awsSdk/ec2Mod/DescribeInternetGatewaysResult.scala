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
  def apply(InternetGateways: InternetGatewayList = null, NextToken: String = null): DescribeInternetGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (InternetGateways != null) __obj.updateDynamic("InternetGateways")(InternetGateways.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInternetGatewaysResult]
  }
}

