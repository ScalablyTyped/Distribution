package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeAliasDeclaration
  extends StObject
     with Node
     with Declaration
     with Statement {
  
  var declare: Boolean | Null
  
  var id: Identifier_
  
  var typeAnnotation: TSType
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSTypeAliasDeclaration: typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration
}
object TSTypeAliasDeclaration {
  
  @JSImport("babel-types/ts3.6", "TSTypeAliasDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: Null, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSTypeAliasDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: Unit, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSTypeAliasDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  
  extension [Self <: TSTypeAliasDeclaration](x: Self) {
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
