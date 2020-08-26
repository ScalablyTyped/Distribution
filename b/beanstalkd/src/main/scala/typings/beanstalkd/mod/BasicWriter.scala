package typings.beanstalkd.mod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicWriter extends Writer {
  def handle(protocol: BeanstalkdProtocol, connection: Socket, args: js.Any*): js.Promise[_] = js.native
}

object BasicWriter {
  @scala.inline
  def apply(command: String, handle: (BeanstalkdProtocol, Socket, /* repeated */ js.Any) => js.Promise[_]): BasicWriter = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], handle = js.Any.fromFunction3(handle))
    __obj.asInstanceOf[BasicWriter]
  }
  @scala.inline
  implicit class BasicWriterOps[Self <: BasicWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandle(value: (BeanstalkdProtocol, Socket, /* repeated */ js.Any) => js.Promise[_]): Self = this.set("handle", js.Any.fromFunction3(value))
  }
  
}

