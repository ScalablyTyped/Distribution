package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_MixedTypeAnnotation_ : "MixedTypeAnnotation"
}
object MixedTypeAnnotation_ {
  
  inline def apply(): MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[MixedTypeAnnotation_]
  }
  
  extension [Self <: MixedTypeAnnotation_](x: Self) {
    
    inline def setType(value: "MixedTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
