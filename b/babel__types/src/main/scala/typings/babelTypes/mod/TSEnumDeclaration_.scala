package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSEnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
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
  implicit class TSEnumDeclaration_MutableBuilder[Self <: TSEnumDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConst(value: Boolean): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstNull: Self = StObject.set(x, "const", null)
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    @scala.inline
    def setMembers(value: js.Array[TSEnumMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: TSEnumMember_ *): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
