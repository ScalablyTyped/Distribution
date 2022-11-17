package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeAlias_
  extends StObject
     with BaseNode {
  
  var id: Identifier_
  
  var right: FlowType
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TypeAlias_ : "TypeAlias"
}
object TypeAlias_ {
  
  inline def apply(id: Identifier_, right: FlowType): TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[TypeAlias_]
  }
  
  extension [Self <: TypeAlias_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRight(value: FlowType): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TypeAlias"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
