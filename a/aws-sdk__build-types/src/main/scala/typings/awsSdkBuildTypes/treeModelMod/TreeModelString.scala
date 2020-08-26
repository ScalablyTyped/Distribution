package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkTypes.awsSdkTypesStrings.string
import typings.awsSdkTypes.protocolMod.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeModelString
  extends String
     with Documented
     with Named {
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.native
}

object TreeModelString {
  @scala.inline
  def apply(documentation: java.lang.String, name: java.lang.String, `type`: string): TreeModelString = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelString]
  }
  @scala.inline
  implicit class TreeModelStringOps[Self <: TreeModelString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnumVarargs(value: java.lang.String*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: js.Array[java.lang.String]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
  }
  
}

