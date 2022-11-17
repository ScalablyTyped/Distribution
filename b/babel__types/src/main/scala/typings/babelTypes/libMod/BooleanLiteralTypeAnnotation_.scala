package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanLiteralTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_BooleanLiteralTypeAnnotation_ : "BooleanLiteralTypeAnnotation"
  
  var value: Boolean
}
object BooleanLiteralTypeAnnotation_ {
  
  inline def apply(value: Boolean): BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[BooleanLiteralTypeAnnotation_]
  }
  
  extension [Self <: BooleanLiteralTypeAnnotation_](x: Self) {
    
    inline def setType(value: "BooleanLiteralTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
