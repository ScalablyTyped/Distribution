package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_BooleanTypeAnnotation_ : "BooleanTypeAnnotation"
}
object BooleanTypeAnnotation_ {
  
  inline def apply(): BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[BooleanTypeAnnotation_]
  }
  
  extension [Self <: BooleanTypeAnnotation_](x: Self) {
    
    inline def setType(value: "BooleanTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
