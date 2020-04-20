package typings.beanstalkd.mod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicWriter extends Writer {
  def handle(protocol: BeanstalkdProtocol, connection: Socket, args: js.Any*): js.Promise[_]
}

object BasicWriter {
  @scala.inline
  def apply(command: String, handle: (BeanstalkdProtocol, Socket, /* repeated */ js.Any) => js.Promise[_]): BasicWriter = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], handle = js.Any.fromFunction3(handle))
    __obj.asInstanceOf[BasicWriter]
  }
}

