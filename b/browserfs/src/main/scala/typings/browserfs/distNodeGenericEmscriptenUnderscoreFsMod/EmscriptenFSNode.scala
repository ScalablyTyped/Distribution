package typings.browserfs.distNodeGenericEmscriptenUnderscoreFsMod

import typings.browserfs.Anon_Opts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmscriptenFSNode extends js.Object {
  var mode: Double
  var mount: Anon_Opts
  var name: String
  var node_ops: EmscriptenNodeOps
  var parent: EmscriptenFSNode
  var stream_ops: EmscriptenStreamOps
}

object EmscriptenFSNode {
  @scala.inline
  def apply(
    mode: Double,
    mount: Anon_Opts,
    name: String,
    node_ops: EmscriptenNodeOps,
    parent: EmscriptenFSNode,
    stream_ops: EmscriptenStreamOps
  ): EmscriptenFSNode = {
    val __obj = js.Dynamic.literal(mode = mode, mount = mount, name = name, node_ops = node_ops, parent = parent, stream_ops = stream_ops)
  
    __obj.asInstanceOf[EmscriptenFSNode]
  }
}

