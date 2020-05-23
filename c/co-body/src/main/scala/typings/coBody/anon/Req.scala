package typings.coBody.anon

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Req extends js.Object {
  var req: IncomingMessage
}

object Req {
  @scala.inline
  def apply(req: IncomingMessage): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
}

