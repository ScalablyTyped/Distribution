package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSEnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSEnumDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Statement
     with TypeScript {
  
  var const: Boolean | Null
  
  var declare: Boolean | Null
  
  var id: Identifier_
  
  var initializer: Expression | Null
  
  var members: js.Array[TSEnumMember_]
  
  @JSName("type")
  var type_TSEnumDeclaration_ : TSEnumDeclaration
}
object TSEnumDeclaration_ {
  
  inline def apply(id: Identifier_, members: js.Array[TSEnumMember_]): TSEnumDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], const = null, declare = null, end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[TSEnumDeclaration_]
  }
  
  extension [Self <: TSEnumDeclaration_](x: Self) {
    
    inline def setConst(value: Boolean): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    inline def setConstNull: Self = StObject.set(x, "const", null)
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    inline def setMembers(value: js.Array[TSEnumMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: TSEnumMember_ *): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
