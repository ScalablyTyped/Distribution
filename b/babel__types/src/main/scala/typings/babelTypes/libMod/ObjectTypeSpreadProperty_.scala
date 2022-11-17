package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeSpreadProperty_
  extends StObject
     with BaseNode {
  
  var argument: FlowType
  
  @JSName("type")
  var type_ObjectTypeSpreadProperty_ : "ObjectTypeSpreadProperty"
}
object ObjectTypeSpreadProperty_ {
  
  inline def apply(argument: FlowType): ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[ObjectTypeSpreadProperty_]
  }
  
  extension [Self <: ObjectTypeSpreadProperty_](x: Self) {
    
    inline def setArgument(value: FlowType): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ObjectTypeSpreadProperty"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
