package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var extractKeyMappings: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[breezeLib.breezeNs.KeyMapping]]] = js.undefined
  var extractResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Object]] = js.undefined
  var extractSaveResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[_]]] = js.undefined
  var name: java.lang.String
  def visitNode(
    node: js.Object,
    queryContext: breezeLib.breezeNs.QueryContext,
    nodeContext: breezeLib.breezeNs.NodeContext
  ): Anon_EntityType
}

object Anon_Data {
  @scala.inline
  def apply(
    name: java.lang.String,
    visitNode: (js.Object, breezeLib.breezeNs.QueryContext, breezeLib.breezeNs.NodeContext) => Anon_EntityType,
    extractKeyMappings: /* data */ js.Object => js.Array[breezeLib.breezeNs.KeyMapping] = null,
    extractResults: /* data */ js.Object => js.Object = null,
    extractSaveResults: /* data */ js.Object => js.Array[_] = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(name = name, visitNode = js.Any.fromFunction3(visitNode))
    if (extractKeyMappings != null) __obj.updateDynamic("extractKeyMappings")(js.Any.fromFunction1(extractKeyMappings))
    if (extractResults != null) __obj.updateDynamic("extractResults")(js.Any.fromFunction1(extractResults))
    if (extractSaveResults != null) __obj.updateDynamic("extractSaveResults")(js.Any.fromFunction1(extractSaveResults))
    __obj.asInstanceOf[Anon_Data]
  }
}

