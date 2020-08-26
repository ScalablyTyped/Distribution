package typings.browserfs.emscriptenFsMod

import typings.browserfs.anon.Opts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenFSNode extends js.Object {
  var mode: Double = js.native
  var mount: Opts = js.native
  var name: String = js.native
  var node_ops: EmscriptenNodeOps = js.native
  var parent: EmscriptenFSNode = js.native
  var stream_ops: EmscriptenStreamOps = js.native
}

object EmscriptenFSNode {
  @scala.inline
  def apply(
    mode: Double,
    mount: Opts,
    name: String,
    node_ops: EmscriptenNodeOps,
    parent: EmscriptenFSNode,
    stream_ops: EmscriptenStreamOps
  ): EmscriptenFSNode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_ops = node_ops.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], stream_ops = stream_ops.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmscriptenFSNode]
  }
  @scala.inline
  implicit class EmscriptenFSNodeOps[Self <: EmscriptenFSNode] (val x: Self) extends AnyVal {
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
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMount(value: Opts): Self = this.set("mount", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_ops(value: EmscriptenNodeOps): Self = this.set("node_ops", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: EmscriptenFSNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStream_ops(value: EmscriptenStreamOps): Self = this.set("stream_ops", value.asInstanceOf[js.Any])
  }
  
}

