package typings.backblazeB2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardApiResponse extends js.Object {
  var config: js.Any
  var data: js.Any
  var headers: js.Any
  var request: js.Any
  var status: String
  var statusText: String
}

object StandardApiResponse {
  @scala.inline
  def apply(config: js.Any, data: js.Any, headers: js.Any, request: js.Any, status: String, statusText: String): StandardApiResponse = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardApiResponse]
  }
}

