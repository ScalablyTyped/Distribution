package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSEnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSEnumDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  
  var const: Boolean | Null = js.native
  
  var declare: Boolean | Null = js.native
  
  var id: Identifier_ = js.native
  
  var initializer: Expression | Null = js.native
  
  var members: js.Array[TSEnumMember_] = js.native
  
  @JSName("type")
  var type_TSEnumDeclaration_ : TSEnumDeclaration = js.native
}
object TSEnumDeclaration_ {
  
  @scala.inline
  def apply(id: Identifier_, members: js.Array[TSEnumMember_], `type`: TSEnumDeclaration): TSEnumDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumDeclaration_]
  }
  
  @scala.inline
  implicit class TSEnumDeclaration_Ops[Self <: TSEnumDeclaration_] (val x: Self) extends AnyVal {
    
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
    def setMembersVarargs(value: TSEnumMember_ *): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[TSEnumMember_]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSEnumDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConst(value: Boolean): Self = this.set("const", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstNull: Self = this.set("const", null)
    
    @scala.inline
    def setDeclare(value: Boolean): Self = this.set("declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = this.set("declare", null)
    
    @scala.inline
    def setInitializer(value: Expression): Self = this.set("initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializerNull: Self = this.set("initializer", null)
  }
}
