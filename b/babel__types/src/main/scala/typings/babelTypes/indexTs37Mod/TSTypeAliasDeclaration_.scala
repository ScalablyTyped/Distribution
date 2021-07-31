package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSTypeAliasDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Statement {
  
  var declare: Boolean | Null
  
  var id: Identifier_
  
  var typeAnnotation: TSType
  
  var typeParameters: TSTypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSTypeAliasDeclaration_ : TSTypeAliasDeclaration
}
object TSTypeAliasDeclaration_ {
  
  @scala.inline
  def apply(id: Identifier_, typeAnnotation: TSType): TSTypeAliasDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[TSTypeAliasDeclaration_]
  }
  
  @scala.inline
  implicit class TSTypeAliasDeclaration_MutableBuilder[Self <: TSTypeAliasDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSTypeAliasDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
