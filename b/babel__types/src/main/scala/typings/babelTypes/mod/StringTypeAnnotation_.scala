package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_StringTypeAnnotation_ : "StringTypeAnnotation"
}
object StringTypeAnnotation_ {
  
  inline def apply(): StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[StringTypeAnnotation_]
  }
  
  extension [Self <: StringTypeAnnotation_](x: Self) {
    
    inline def setType(value: "StringTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
