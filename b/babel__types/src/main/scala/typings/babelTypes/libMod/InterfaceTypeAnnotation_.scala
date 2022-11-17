package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceTypeAnnotation_
  extends StObject
     with BaseNode {
  
  var body: ObjectTypeAnnotation_
  
  var `extends`: js.UndefOr[js.Array[InterfaceExtends_] | Null] = js.undefined
  
  @JSName("type")
  var type_InterfaceTypeAnnotation_ : "InterfaceTypeAnnotation"
}
object InterfaceTypeAnnotation_ {
  
  inline def apply(body: ObjectTypeAnnotation_): InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.asInstanceOf[InterfaceTypeAnnotation_]
  }
  
  extension [Self <: InterfaceTypeAnnotation_](x: Self) {
    
    inline def setBody(value: ObjectTypeAnnotation_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setExtends(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setExtendsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setType(value: "InterfaceTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
