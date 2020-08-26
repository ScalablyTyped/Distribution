package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumSymbolBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait EnumSymbolBody_
  extends EnumBody
     with BaseNode {
  var members: js.Array[EnumDefaultedMember_] = js.native
  @JSName("type")
  var type_EnumSymbolBody_ : EnumSymbolBody = js.native
}

object EnumSymbolBody_ {
  @scala.inline
  def apply(members: js.Array[EnumDefaultedMember_], `type`: EnumSymbolBody): EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumSymbolBody_]
  }
  @scala.inline
  implicit class EnumSymbolBody_Ops[Self <: EnumSymbolBody_] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: EnumDefaultedMember_ *): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMember_]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: EnumSymbolBody): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

