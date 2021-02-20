package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DeclareOpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait DeclareOpaqueType_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_ = js.native
  
  var supertype: FlowType | Null = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_DeclareOpaqueType_ : DeclareOpaqueType = js.native
}
object DeclareOpaqueType_ {
  
  @scala.inline
  def apply(id: Identifier_, `type`: DeclareOpaqueType): DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareOpaqueType_]
  }
  
  @scala.inline
  implicit class DeclareOpaqueType_MutableBuilder[Self <: DeclareOpaqueType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertype(value: FlowType): Self = StObject.set(x, "supertype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertypeNull: Self = StObject.set(x, "supertype", null)
    
    @scala.inline
    def setType(value: DeclareOpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
