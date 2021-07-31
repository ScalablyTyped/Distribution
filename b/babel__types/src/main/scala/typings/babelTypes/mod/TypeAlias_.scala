package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TypeAlias_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_
  
  var right: FlowType
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TypeAlias_ : TypeAlias
}
object TypeAlias_ {
  
  @scala.inline
  def apply(id: Identifier_, right: FlowType): TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[TypeAlias_]
  }
  
  @scala.inline
  implicit class TypeAlias_MutableBuilder[Self <: TypeAlias_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: FlowType): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
