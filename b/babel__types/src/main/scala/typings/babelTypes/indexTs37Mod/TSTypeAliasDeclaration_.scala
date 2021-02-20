package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSTypeAliasDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  
  var declare: Boolean | Null = js.native
  
  var id: Identifier_ = js.native
  
  var typeAnnotation: TSType = js.native
  
  var typeParameters: TSTypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSTypeAliasDeclaration_ : TSTypeAliasDeclaration = js.native
}
object TSTypeAliasDeclaration_ {
  
  @scala.inline
  def apply(id: Identifier_, `type`: TSTypeAliasDeclaration, typeAnnotation: TSType): TSTypeAliasDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
