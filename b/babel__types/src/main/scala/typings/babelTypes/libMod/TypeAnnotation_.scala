package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeAnnotation_
  extends StObject
     with BaseNode {
  
  var typeAnnotation: FlowType
  
  @JSName("type")
  var type_TypeAnnotation_ : "TypeAnnotation"
}
object TypeAnnotation_ {
  
  inline def apply(typeAnnotation: FlowType): TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[TypeAnnotation_]
  }
  
  extension [Self <: TypeAnnotation_](x: Self) {
    
    inline def setType(value: "TypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
