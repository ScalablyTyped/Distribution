package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSIndexSignature_
  extends StObject
     with BaseNode {
  
  var parameters: js.Array[Identifier_]
  
  var readonly: Boolean | Null
  
  var static: Boolean | Null
  
  var typeAnnotation: TSTypeAnnotation_ | Null
  
  @JSName("type")
  var type_TSIndexSignature_ : "TSIndexSignature"
}
object TSIndexSignature_ {
  
  inline def apply(parameters: js.Array[Identifier_]): TSIndexSignature_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, static = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[TSIndexSignature_]
  }
  
  extension [Self <: TSIndexSignature_](x: Self) {
    
    inline def setParameters(value: js.Array[Identifier_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Identifier_ *): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticNull: Self = StObject.set(x, "static", null)
    
    inline def setType(value: "TSIndexSignature"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
