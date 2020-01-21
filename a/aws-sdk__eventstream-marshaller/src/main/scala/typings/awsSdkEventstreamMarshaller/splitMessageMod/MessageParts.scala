package typings.awsSdkEventstreamMarshaller.splitMessageMod

import typings.std.DataView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageParts extends js.Object {
  var body: Uint8Array
  var headers: DataView
}

object MessageParts {
  @scala.inline
  def apply(body: Uint8Array, headers: DataView): MessageParts = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageParts]
  }
}

