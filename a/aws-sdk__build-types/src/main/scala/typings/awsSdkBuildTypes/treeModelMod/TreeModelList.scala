package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkTypes.awsSdkTypesStrings.list
import typings.awsSdkTypes.protocolMod.List
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
    `type`: list,
    flattened: js.UndefOr[Boolean] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    sensitive: js.UndefOr[Boolean] = js.undefined
  ): TreeModelList = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], member = member.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelList]
  }
}

