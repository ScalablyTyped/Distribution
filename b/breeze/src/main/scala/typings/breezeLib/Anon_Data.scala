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

