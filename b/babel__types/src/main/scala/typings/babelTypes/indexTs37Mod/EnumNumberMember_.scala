package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.EnumNumberMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait EnumNumberMember_
  extends EnumMember
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  var init: NumericLiteral_ = js.native
  
  @JSName("type")
  var type_EnumNumberMember_ : EnumNumberMember = js.native
}
object EnumNumberMember_ {
  
  @scala.inline
  def apply(id: Identifier_, init: NumericLiteral_, `type`: EnumNumberMember): EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumNumberMember_]
  }
  
  @scala.inline
  implicit class EnumNumberMember_Ops[Self <: EnumNumberMember_] (val x: Self) extends AnyVal {
    
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
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: NumericLiteral_): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EnumNumberMember): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
