package typings.clearbladejsServer

import typings.clearbladejsServer.CbServer.BasicReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  var request: BasicReq
}

object AnonRequest {
  @scala.inline
  def apply(request: BasicReq): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequest]
  }
}

