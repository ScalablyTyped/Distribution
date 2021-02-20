package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAliasDeclaration
  extends Node
     with Declaration
     with Statement {
  
  var declare: Boolean | Null = js.native
  
  var id: Identifier_ = js.native
  
  var typeAnnotation: TSType = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSTypeAliasDeclaration: typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration = js.native
}
object TSTypeAliasDeclaration {
  
  @JSImport("babel-types/ts3.6", "TSTypeAliasDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSTypeAliasDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: Null, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSTypeAliasDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  
  @scala.inline
  implicit class TSTypeAliasDeclarationMutableBuilder[Self <: TSTypeAliasDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
