package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevEndpointRequest extends js.Object {
  /**
    * Name of the DevEndpoint to retrieve information for.
    */
  var EndpointName: GenericString = js.native
}

object GetDevEndpointRequest {
  @scala.inline
  def apply(EndpointName: GenericString): GetDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevEndpointRequest]
  }
  @scala.inline
  implicit class GetDevEndpointRequestOps[Self <: GetDevEndpointRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpointName(value: GenericString): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
  }
  
}

