package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkTypes.awsSdkTypesStrings.list
import typings.awsSdkTypes.protocolMod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeModelList
  extends List
     with Documented
     with Named {
  @JSName("member")
  var member_TreeModelList: TreeModelMember = js.native
}

object TreeModelList {
  @scala.inline
  def apply(documentation: String, member: TreeModelMember, name: String, `type`: list): TreeModelList = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], member = member.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelList]
  }
  @scala.inline
  implicit class TreeModelListOps[Self <: TreeModelList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMember(value: TreeModelMember): Self = this.set("member", value.asInstanceOf[js.Any])
  }
  
}

