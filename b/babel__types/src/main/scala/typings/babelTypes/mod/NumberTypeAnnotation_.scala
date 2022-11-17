package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_NumberTypeAnnotation_ : "NumberTypeAnnotation"
}
object NumberTypeAnnotation_ {
  
  inline def apply(): NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[NumberTypeAnnotation_]
  }
  
  extension [Self <: NumberTypeAnnotation_](x: Self) {
    
    inline def setType(value: "NumberTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
