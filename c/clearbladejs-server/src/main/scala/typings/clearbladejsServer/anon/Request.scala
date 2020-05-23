package typings.clearbladejsServer.anon

import typings.clearbladejsServer.CbServer.BasicReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var request: BasicReq
}

object Request {
  @scala.inline
  def apply(request: BasicReq): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

