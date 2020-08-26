package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckResult extends js.Object {
  var data: js.Any = js.native
  var id: String = js.native
  var impact: String = js.native
  var message: String = js.native
  var relatedNodes: js.UndefOr[js.Array[RelatedNode]] = js.native
}

object CheckResult {
  @scala.inline
  def apply(data: js.Any, id: String, impact: String, message: String): CheckResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResult]
  }
  @scala.inline
  implicit class CheckResultOps[Self <: CheckResult] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImpact(value: String): Self = this.set("impact", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedNodesVarargs(value: RelatedNode*): Self = this.set("relatedNodes", js.Array(value :_*))
    @scala.inline
    def setRelatedNodes(value: js.Array[RelatedNode]): Self = this.set("relatedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedNodes: Self = this.set("relatedNodes", js.undefined)
  }
  
}

