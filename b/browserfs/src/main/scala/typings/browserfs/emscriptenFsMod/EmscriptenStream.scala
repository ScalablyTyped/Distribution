package typings.browserfs.emscriptenFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmscriptenStream extends js.Object {
  var flags: String
  var nfd: js.Any
  var node: EmscriptenFSNode
  var position: Double
}

object EmscriptenStream {
  @scala.inline
  def apply(flags: String, nfd: js.Any, node: EmscriptenFSNode, position: Double): EmscriptenStream = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], nfd = nfd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmscriptenStream]
  }
}

