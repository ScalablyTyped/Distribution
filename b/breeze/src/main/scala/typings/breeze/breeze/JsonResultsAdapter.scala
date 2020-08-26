package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonResultsAdapter extends js.Object {
  var name: String = js.native
  def extractKeyMappings(data: js.Object): js.Array[KeyMapping] = js.native
  def extractResults(data: js.Object): js.Object = js.native
  def extractSaveResults(data: js.Object): js.Array[_] = js.native
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): typings.breeze.anon.EntityType = js.native
}

object JsonResultsAdapter {
  @scala.inline
  def apply(
    extractKeyMappings: js.Object => js.Array[KeyMapping],
    extractResults: js.Object => js.Object,
    extractSaveResults: js.Object => js.Array[_],
    name: String,
    visitNode: (js.Object, QueryContext, NodeContext) => typings.breeze.anon.EntityType
  ): JsonResultsAdapter = {
    val __obj = js.Dynamic.literal(extractKeyMappings = js.Any.fromFunction1(extractKeyMappings), extractResults = js.Any.fromFunction1(extractResults), extractSaveResults = js.Any.fromFunction1(extractSaveResults), name = name.asInstanceOf[js.Any], visitNode = js.Any.fromFunction3(visitNode))
    __obj.asInstanceOf[JsonResultsAdapter]
  }
  @scala.inline
  implicit class JsonResultsAdapterOps[Self <: JsonResultsAdapter] (val x: Self) extends AnyVal {
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
    def setExtractKeyMappings(value: js.Object => js.Array[KeyMapping]): Self = this.set("extractKeyMappings", js.Any.fromFunction1(value))
    @scala.inline
    def setExtractResults(value: js.Object => js.Object): Self = this.set("extractResults", js.Any.fromFunction1(value))
    @scala.inline
    def setExtractSaveResults(value: js.Object => js.Array[_]): Self = this.set("extractSaveResults", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisitNode(value: (js.Object, QueryContext, NodeContext) => typings.breeze.anon.EntityType): Self = this.set("visitNode", js.Any.fromFunction3(value))
  }
  
}

