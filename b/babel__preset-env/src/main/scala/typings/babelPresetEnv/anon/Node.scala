package typings.babelPresetEnv.anon

import typings.babelPresetEnv.babelPresetEnvBooleans.`true`
import typings.babelPresetEnv.babelPresetEnvStrings.current
import typings.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends _TargetsOptions {
  var node: String | current | `true` = js.native
}

object Node {
  @scala.inline
  def apply(node: String | current | `true`): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setNode(value: String | current | `true`): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

