package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSEnumDeclaration
  extends Node
     with Declaration
     with Statement {
  
  var const: Boolean | Null = js.native
  
  var declare: Boolean | Null = js.native
  
  var id: Identifier_ = js.native
  
  var initializer: Expression | Null = js.native
  
  var members: js.Array[TSEnumMember] = js.native
  
  @JSName("type")
  var type_TSEnumDeclaration: typings.babelTypes.babelTypesStrings.TSEnumDeclaration = js.native
}
object TSEnumDeclaration {
  
  @JSImport("babel-types/ts3.6", "TSEnumDeclaration")
  @js.native
  def apply(id: Identifier_, members: js.Array[TSEnumMember]): TSEnumDeclaration = js.native
  
  @scala.inline
  implicit class TSEnumDeclarationMutableBuilder[Self <: TSEnumDeclaration] (val x: Self) extends AnyVal {
    
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
    def setMembers(value: js.Array[TSEnumMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: TSEnumMember*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
