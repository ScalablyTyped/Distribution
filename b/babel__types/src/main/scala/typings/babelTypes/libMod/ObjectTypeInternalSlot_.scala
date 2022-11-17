package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeInternalSlot_
  extends StObject
     with BaseNode {
  
  var id: Identifier_
  
  var method: Boolean
  
  var optional: Boolean
  
  var static: Boolean
  
  @JSName("type")
  var type_ObjectTypeInternalSlot_ : "ObjectTypeInternalSlot"
  
  var value: FlowType
}
object ObjectTypeInternalSlot_ {
  
  inline def apply(id: Identifier_, method: Boolean, optional: Boolean, static: Boolean, value: FlowType): ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeInternalSlot")
    __obj.asInstanceOf[ObjectTypeInternalSlot_]
  }
  
  extension [Self <: ObjectTypeInternalSlot_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ObjectTypeInternalSlot"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FlowType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
