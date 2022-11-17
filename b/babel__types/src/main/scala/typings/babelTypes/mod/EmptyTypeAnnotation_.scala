package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_EmptyTypeAnnotation_ : "EmptyTypeAnnotation"
}
object EmptyTypeAnnotation_ {
  
  inline def apply(): EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[EmptyTypeAnnotation_]
  }
  
  extension [Self <: EmptyTypeAnnotation_](x: Self) {
    
    inline def setType(value: "EmptyTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
