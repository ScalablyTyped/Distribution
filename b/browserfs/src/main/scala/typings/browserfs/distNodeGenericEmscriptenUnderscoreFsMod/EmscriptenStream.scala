package typings.browserfs.distNodeGenericEmscriptenUnderscoreFsMod

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
    val __obj = js.Dynamic.literal(flags = flags, nfd = nfd, node = node, position = position)
  
    __obj.asInstanceOf[EmscriptenStream]
  }
}

