package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointResponse extends js.Object {
  /**
    * Describes information associated with the specific endpoint.
    */
  var EndpointProperties: js.UndefOr[typings.awsSdk.comprehendMod.EndpointProperties] = js.native
}

object DescribeEndpointResponse {
  @scala.inline
  def apply(): DescribeEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointResponse]
  }
  @scala.inline
  implicit class DescribeEndpointResponseOps[Self <: DescribeEndpointResponse] (val x: Self) extends AnyVal {
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
    def setEndpointProperties(value: EndpointProperties): Self = this.set("EndpointProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointProperties: Self = this.set("EndpointProperties", js.undefined)
  }
  
}

