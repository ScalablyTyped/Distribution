package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonResultsAdapter extends js.Object {
  var name: String
  def extractKeyMappings(data: js.Object): js.Array[KeyMapping]
  def extractResults(data: js.Object): js.Object
  def extractSaveResults(data: js.Object): js.Array[_]
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): typings.breeze.anon.EntityType
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
}

