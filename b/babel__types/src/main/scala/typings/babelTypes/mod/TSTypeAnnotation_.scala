package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeAnnotation_
  extends StObject
     with BaseNode {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSTypeAnnotation_ : "TSTypeAnnotation"
}
object TSTypeAnnotation_ {
  
  inline def apply(typeAnnotation: TSType): TSTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeAnnotation")
    __obj.asInstanceOf[TSTypeAnnotation_]
  }
  
  extension [Self <: TSTypeAnnotation_](x: Self) {
    
    inline def setType(value: "TSTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
