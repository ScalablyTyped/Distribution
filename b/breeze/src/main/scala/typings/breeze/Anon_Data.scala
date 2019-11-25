package typings.breeze

import typings.breeze.breeze.KeyMapping
import typings.breeze.breeze.NodeContext
import typings.breeze.breeze.QueryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var extractKeyMappings: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[KeyMapping]]] = js.undefined
  var extractResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Object]] = js.undefined
  var extractSaveResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[_]]] = js.undefined
  var name: String
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): Anon_EntityType
}

object Anon_Data {
  @scala.inline
  def apply(
    name: String,
    visitNode: (js.Object, QueryContext, NodeContext) => Anon_EntityType,
    extractKeyMappings: /* data */ js.Object => js.Array[KeyMapping] = null,
    extractResults: /* data */ js.Object => js.Object = null,
    extractSaveResults: /* data */ js.Object => js.Array[_] = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], visitNode = js.Any.fromFunction3(visitNode))
    if (extractKeyMappings != null) __obj.updateDynamic("extractKeyMappings")(js.Any.fromFunction1(extractKeyMappings))
    if (extractResults != null) __obj.updateDynamic("extractResults")(js.Any.fromFunction1(extractResults))
    if (extractSaveResults != null) __obj.updateDynamic("extractSaveResults")(js.Any.fromFunction1(extractSaveResults))
    __obj.asInstanceOf[Anon_Data]
  }
}

