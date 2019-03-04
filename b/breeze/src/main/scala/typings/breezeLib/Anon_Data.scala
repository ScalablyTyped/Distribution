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
    visitNode: js.Function3[
      js.Object, 
      breezeLib.breezeNs.QueryContext, 
      breezeLib.breezeNs.NodeContext, 
      Anon_EntityType
    ],
    extractKeyMappings: js.Function1[/* data */ js.Object, js.Array[breezeLib.breezeNs.KeyMapping]] = null,
    extractResults: js.Function1[/* data */ js.Object, js.Object] = null,
    extractSaveResults: js.Function1[/* data */ js.Object, js.Array[_]] = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(name = name, visitNode = visitNode)
    if (extractKeyMappings != null) __obj.updateDynamic("extractKeyMappings")(extractKeyMappings)
    if (extractResults != null) __obj.updateDynamic("extractResults")(extractResults)
    if (extractSaveResults != null) __obj.updateDynamic("extractSaveResults")(extractSaveResults)
    __obj.asInstanceOf[Anon_Data]
  }
}

