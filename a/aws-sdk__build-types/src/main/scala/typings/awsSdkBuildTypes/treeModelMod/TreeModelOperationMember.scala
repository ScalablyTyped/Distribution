package typings.awsSdkBuildTypes.treeModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeModelOperationMember extends TreeModelMember {
  @JSName("shape")
  var shape_TreeModelOperationMember: TreeModelStructure = js.native
}

object TreeModelOperationMember {
  @scala.inline
  def apply(shape: TreeModelStructure): TreeModelOperationMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelOperationMember]
  }
  @scala.inline
  implicit class TreeModelOperationMemberOps[Self <: TreeModelOperationMember] (val x: Self) extends AnyVal {
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
    def setShape(value: TreeModelStructure): Self = this.set("shape", value.asInstanceOf[js.Any])
  }
  
}

