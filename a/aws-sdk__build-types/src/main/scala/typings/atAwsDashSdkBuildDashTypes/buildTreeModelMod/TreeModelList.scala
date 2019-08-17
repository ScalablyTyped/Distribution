package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.list
import typings.atAwsDashSdkTypes.buildProtocolMod.List
import typings.atAwsDashSdkTypes.buildProtocolMod.SerializationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeModelList
  extends List
     with Documented
     with Named {
  @JSName("member")
  var member_TreeModelList: TreeModelMember
}

object TreeModelList {
  @scala.inline
  def apply(
    documentation: String,
    member: TreeModelMember,
    name: String,
    `type`: SerializationType,
    type_List: list,
    flattened: js.UndefOr[Boolean] = js.undefined,
    min: Int | Double = null,
    sensitive: js.UndefOr[Boolean] = js.undefined
  ): TreeModelList = {
    val __obj = js.Dynamic.literal(documentation = documentation, member = member, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("type")(type_List)
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[TreeModelList]
  }
}

