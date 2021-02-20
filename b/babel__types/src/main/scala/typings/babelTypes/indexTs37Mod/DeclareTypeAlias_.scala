package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DeclareTypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait DeclareTypeAlias_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_ = js.native
  
  var right: FlowType = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_DeclareTypeAlias_ : DeclareTypeAlias = js.native
}
object DeclareTypeAlias_ {
  
  @scala.inline
  def apply(id: Identifier_, right: FlowType, `type`: DeclareTypeAlias): DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareTypeAlias_]
  }
  
  @scala.inline
  implicit class DeclareTypeAlias_MutableBuilder[Self <: DeclareTypeAlias_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: FlowType): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DeclareTypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
