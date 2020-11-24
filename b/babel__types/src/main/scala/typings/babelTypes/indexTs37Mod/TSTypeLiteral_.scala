package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypeLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSTypeLiteral_
  extends TSType
     with BaseNode {
  
  var members: js.Array[TSTypeElement] = js.native
  
  @JSName("type")
  var type_TSTypeLiteral_ : TSTypeLiteral = js.native
}
object TSTypeLiteral_ {
  
  @scala.inline
  def apply(members: js.Array[TSTypeElement], `type`: TSTypeLiteral): TSTypeLiteral_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeLiteral_]
  }
  
  @scala.inline
  implicit class TSTypeLiteral_Ops[Self <: TSTypeLiteral_] (val x: Self) extends AnyVal {
    
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
    def setMembersVarargs(value: TSTypeElement*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[TSTypeElement]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSTypeLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
