package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSFunctionType_
  extends StObject
     with BaseNode
     with TSType {
  
  var parameters: js.Array[Identifier_ | RestElement_]
  
  var typeAnnotation: TSTypeAnnotation_ | Null
  
  var typeParameters: TSTypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSFunctionType_ : TSFunctionType
}
object TSFunctionType_ {
  
  inline def apply(parameters: js.Array[Identifier_ | RestElement_]): TSFunctionType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[TSFunctionType_]
  }
  
  extension [Self <: TSFunctionType_](x: Self) {
    
    inline def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setType(value: TSFunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeParameters(value: TSTypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
