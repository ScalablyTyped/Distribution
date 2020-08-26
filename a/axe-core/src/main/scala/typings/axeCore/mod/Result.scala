package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var description: String = js.native
  var help: String = js.native
  var helpUrl: String = js.native
  var id: String = js.native
  var impact: js.UndefOr[ImpactValue] = js.native
  var nodes: js.Array[NodeResult] = js.native
  var tags: js.Array[TagValue] = js.native
}

object Result {
  @scala.inline
  def apply(
    description: String,
    help: String,
    helpUrl: String,
    id: String,
    nodes: js.Array[NodeResult],
    tags: js.Array[TagValue]
  ): Result = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpUrl = helpUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpUrl(value: String): Self = this.set("helpUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: NodeResult*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[NodeResult]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: TagValue*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[TagValue]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setImpact(value: ImpactValue): Self = this.set("impact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpact: Self = this.set("impact", js.undefined)
  }
  
}

