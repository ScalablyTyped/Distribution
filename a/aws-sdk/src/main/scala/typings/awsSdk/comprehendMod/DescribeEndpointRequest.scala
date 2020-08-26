package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointRequest extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the endpoint being described.
    */
  var EndpointArn: ComprehendEndpointArn = js.native
}

object DescribeEndpointRequest {
  @scala.inline
  def apply(EndpointArn: ComprehendEndpointArn): DescribeEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointRequest]
  }
  @scala.inline
  implicit class DescribeEndpointRequestOps[Self <: DescribeEndpointRequest] (val x: Self) extends AnyVal {
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
    def setEndpointArn(value: ComprehendEndpointArn): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
  }
  
}

