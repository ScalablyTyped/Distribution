package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_ThisTypeAnnotation_ : "ThisTypeAnnotation"
}
object ThisTypeAnnotation_ {
  
  inline def apply(): ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[ThisTypeAnnotation_]
  }
  
  extension [Self <: ThisTypeAnnotation_](x: Self) {
    
    inline def setType(value: "ThisTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
