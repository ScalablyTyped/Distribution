package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumNumberBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait EnumNumberBody_
  extends EnumBody
     with BaseNode {
  
  var explicit: Boolean = js.native
  
  var members: js.Array[EnumNumberMember_] = js.native
  
  @JSName("type")
  var type_EnumNumberBody_ : EnumNumberBody = js.native
}
object EnumNumberBody_ {
  
  @scala.inline
  def apply(explicit: Boolean, members: js.Array[EnumNumberMember_], `type`: EnumNumberBody): EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumNumberBody_]
  }
  
  @scala.inline
  implicit class EnumNumberBody_Ops[Self <: EnumNumberBody_] (val x: Self) extends AnyVal {
    
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
    def setExplicit(value: Boolean): Self = this.set("explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumNumberMember_ *): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[EnumNumberMember_]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EnumNumberBody): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
