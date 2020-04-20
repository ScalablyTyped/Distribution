package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndpoint extends js.Object {
  var endpoint: js.Any
  var endpointResource: js.Any
}

object AnonEndpoint {
  @scala.inline
  def apply(endpoint: js.Any, endpointResource: js.Any): AnonEndpoint = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], endpointResource = endpointResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndpoint]
  }
}

