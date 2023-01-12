package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSEnumDeclaration
  extends StObject
     with Node
     with Declaration
     with Statement {
  
  var const: Boolean | Null
  
  var declare: Boolean | Null
  
  var id: Identifier_
  
  var initializer: Expression | Null
  
  var members: js.Array[TSEnumMember]
  
  @JSName("type")
  var type_TSEnumDeclaration: typings.babelTypes.babelTypesStrings.TSEnumDeclaration
}
object TSEnumDeclaration {
  
  @JSImport("babel-types", "TSEnumDeclaration")
  @js.native
  def apply(id: Identifier_, members: js.Array[TSEnumMember]): TSEnumDeclaration = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSEnumDeclaration] (val x: Self) extends AnyVal {
    
    inline def setConst(value: Boolean): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    inline def setConstNull: Self = StObject.set(x, "const", null)
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    inline def setMembers(value: js.Array[TSEnumMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: TSEnumMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
