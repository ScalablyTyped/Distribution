package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedNode extends js.Object {
  var html: String = js.native
  var target: js.Array[String] = js.native
}

object RelatedNode {
  @scala.inline
  def apply(html: String, target: js.Array[String]): RelatedNode = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedNode]
  }
  @scala.inline
  implicit class RelatedNodeOps[Self <: RelatedNode] (val x: Self) extends AnyVal {
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
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetVarargs(value: String*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: js.Array[String]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

