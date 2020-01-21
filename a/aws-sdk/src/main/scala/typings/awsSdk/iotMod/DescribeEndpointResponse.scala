package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointResponse extends js.Object {
  /**
    * The endpoint. The format of the endpoint is as follows: identifier.iot.region.amazonaws.com.
    */
  var endpointAddress: js.UndefOr[EndpointAddress] = js.native
}

object DescribeEndpointResponse {
  @scala.inline
  def apply(endpointAddress: EndpointAddress = null): DescribeEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (endpointAddress != null) __obj.updateDynamic("endpointAddress")(endpointAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointResponse]
  }
}

