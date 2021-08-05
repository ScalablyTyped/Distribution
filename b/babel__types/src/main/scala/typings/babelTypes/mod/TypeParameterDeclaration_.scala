package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TypeParameterDeclaration_
  extends StObject
     with BaseNode
     with Flow {
  
  var params: js.Array[TypeParameter_]
  
  @JSName("type")
  var type_TypeParameterDeclaration_ : TypeParameterDeclaration
}
object TypeParameterDeclaration_ {
  
  inline def apply(params: js.Array[TypeParameter_]): TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[TypeParameterDeclaration_]
  }
  
  extension [Self <: TypeParameterDeclaration_](x: Self) {
    
    inline def setParams(value: js.Array[TypeParameter_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TypeParameter_ *): Self = StObject.set(x, "params", js.Array(value :_*))
    
    inline def setType(value: TypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
