package typings.consul.mod.Health

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeOptions extends CommonOptions {
  var node: String = js.native
}

object NodeOptions {
  @scala.inline
  def apply(node: String): NodeOptions = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
  @scala.inline
  implicit class NodeOptionsOps[Self <: NodeOptions] (val x: Self) extends AnyVal {
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
    def setNode(value: String): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

