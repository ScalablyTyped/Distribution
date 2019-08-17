package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.map
import typings.atAwsDashSdkTypes.buildProtocolMod.Map
import typings.atAwsDashSdkTypes.buildProtocolMod.SerializationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeModelMap
  extends Map
     with Documented
     with Named {
  @JSName("key")
  var key_TreeModelMap: TreeModelMember
  @JSName("value")
  var value_TreeModelMap: TreeModelMember
}

object TreeModelMap {
  @scala.inline
  def apply(
    documentation: String,
    key: TreeModelMember,
    name: String,
    `type`: SerializationType,
    type_Map: map,
    value: TreeModelMember,
    flattened: js.UndefOr[Boolean] = js.undefined,
    sensitive: js.UndefOr[Boolean] = js.undefined
  ): TreeModelMap = {
    val __obj = js.Dynamic.literal(documentation = documentation, key = key, name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("type")(type_Map)
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[TreeModelMap]
  }
}

