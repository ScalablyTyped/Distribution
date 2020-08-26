package typings.browserfs.emscriptenFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenStream extends js.Object {
  var flags: String = js.native
  var nfd: js.Any = js.native
  var node: EmscriptenFSNode = js.native
  var position: Double = js.native
}

object EmscriptenStream {
  @scala.inline
  def apply(flags: String, nfd: js.Any, node: EmscriptenFSNode, position: Double): EmscriptenStream = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], nfd = nfd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmscriptenStream]
  }
  @scala.inline
  implicit class EmscriptenStreamOps[Self <: EmscriptenStream] (val x: Self) extends AnyVal {
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
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setNfd(value: js.Any): Self = this.set("nfd", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: EmscriptenFSNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

