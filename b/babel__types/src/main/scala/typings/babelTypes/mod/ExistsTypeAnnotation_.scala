package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistsTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_ExistsTypeAnnotation_ : "ExistsTypeAnnotation"
}
object ExistsTypeAnnotation_ {
  
  inline def apply(): ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[ExistsTypeAnnotation_]
  }
  
  extension [Self <: ExistsTypeAnnotation_](x: Self) {
    
    inline def setType(value: "ExistsTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
