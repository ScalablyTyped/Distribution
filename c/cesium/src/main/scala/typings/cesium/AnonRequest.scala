package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  var request: String
  var service: String
  var version: String
}

object AnonRequest {
  @scala.inline
  def apply(request: String, service: String, version: String): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequest]
  }
}

