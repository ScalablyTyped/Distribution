package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkTypes.awsSdkTypesStrings.map
import typings.awsSdkTypes.protocolMod.Map
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
    `type`: map,
    value: TreeModelMember,
    flattened: js.UndefOr[Boolean] = js.undefined,
    sensitive: js.UndefOr[Boolean] = js.undefined
  ): TreeModelMap = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelMap]
  }
}

