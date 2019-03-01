package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntityType extends js.Object {
  var entityType: js.UndefOr[breezeLib.breezeNs.EntityType] = js.undefined
  var ignore: js.UndefOr[scala.Boolean] = js.undefined
  var nodeId: js.UndefOr[js.Any] = js.undefined
  var nodeRefId: js.UndefOr[js.Any] = js.undefined
}

object Anon_EntityType {
  @scala.inline
  def apply(
    entityType: breezeLib.breezeNs.EntityType = null,
    ignore: js.UndefOr[scala.Boolean] = js.undefined,
    nodeId: js.Any = null,
    nodeRefId: js.Any = null
  ): Anon_EntityType = {
    val __obj = js.Dynamic.literal()
    if (entityType != null) __obj.updateDynamic("entityType")(entityType)
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore)
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId)
    if (nodeRefId != null) __obj.updateDynamic("nodeRefId")(nodeRefId)
    __obj.asInstanceOf[Anon_EntityType]
  }
}

