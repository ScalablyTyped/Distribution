package typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var body: Uint8Array
  var headers: MessageHeaders
}

object Message {
  @scala.inline
  def apply(body: Uint8Array, headers: MessageHeaders): Message = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}

