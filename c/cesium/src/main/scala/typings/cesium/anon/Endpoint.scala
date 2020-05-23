package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  var endpoint: js.Any
  var endpointResource: js.Any
}

object Endpoint {
  @scala.inline
  def apply(endpoint: js.Any, endpointResource: js.Any): Endpoint = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], endpointResource = endpointResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

