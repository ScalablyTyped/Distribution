package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberLiteralTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_NumberLiteralTypeAnnotation_ : "NumberLiteralTypeAnnotation"
  
  var value: Double
}
object NumberLiteralTypeAnnotation_ {
  
  inline def apply(value: Double): NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[NumberLiteralTypeAnnotation_]
  }
  
  extension [Self <: NumberLiteralTypeAnnotation_](x: Self) {
    
    inline def setType(value: "NumberLiteralTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
