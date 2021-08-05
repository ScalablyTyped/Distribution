package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSIndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSIndexSignature_
  extends StObject
     with BaseNode
     with TSTypeElement {
  
  var parameters: js.Array[Identifier_]
  
  var readonly: Boolean | Null
  
  var typeAnnotation: TSTypeAnnotation_ | Null
  
  @JSName("type")
  var type_TSIndexSignature_ : TSIndexSignature
}
object TSIndexSignature_ {
  
  inline def apply(parameters: js.Array[Identifier_]): TSIndexSignature_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[TSIndexSignature_]
  }
  
  extension [Self <: TSIndexSignature_](x: Self) {
    
    inline def setParameters(value: js.Array[Identifier_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Identifier_ *): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setType(value: TSIndexSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
