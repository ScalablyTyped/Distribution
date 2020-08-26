package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  var endpoint: js.Any = js.native
  var endpointResource: js.Any = js.native
}

object Endpoint {
  @scala.inline
  def apply(endpoint: js.Any, endpointResource: js.Any): Endpoint = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], endpointResource = endpointResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: js.Any): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointResource(value: js.Any): Self = this.set("endpointResource", value.asInstanceOf[js.Any])
  }
  
}

