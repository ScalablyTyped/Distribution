package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSEnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSEnumDeclaration__
  extends StObject
     with BaseNode
     with Declaration
     with Node
     with Statement
     with TypeScript {
  
  var const: js.UndefOr[Boolean | Null] = js.undefined
  
  var declare: js.UndefOr[Boolean | Null] = js.undefined
  
  var id: Identifier_
  
  var initializer: js.UndefOr[Expression | Null] = js.undefined
  
  var members: js.Array[TSEnumMember__]
  
  @JSName("type")
  var type_TSEnumDeclaration__ : TSEnumDeclaration
}
object TSEnumDeclaration__ {
  
  inline def apply(id: Identifier_, members: js.Array[TSEnumMember__]): TSEnumDeclaration__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[TSEnumDeclaration__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSEnumDeclaration__] (val x: Self) extends AnyVal {
    
    inline def setConst(value: Boolean): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    inline def setConstNull: Self = StObject.set(x, "const", null)
    
    inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setDeclareUndefined: Self = StObject.set(x, "declare", js.undefined)
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    inline def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
    
    inline def setMembers(value: js.Array[TSEnumMember__]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: TSEnumMember__ *): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
