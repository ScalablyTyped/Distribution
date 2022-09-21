package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMapping extends StObject {
  
  var entityTypeName: String
  
  var realValue: Any
  
  var tempValue: Any
}
object KeyMapping {
  
  inline def apply(entityTypeName: String, realValue: Any, tempValue: Any): KeyMapping = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any], realValue = realValue.asInstanceOf[js.Any], tempValue = tempValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapping]
  }
  
  extension [Self <: KeyMapping](x: Self) {
    
    inline def setEntityTypeName(value: String): Self = StObject.set(x, "entityTypeName", value.asInstanceOf[js.Any])
    
    inline def setRealValue(value: Any): Self = StObject.set(x, "realValue", value.asInstanceOf[js.Any])
    
    inline def setTempValue(value: Any): Self = StObject.set(x, "tempValue", value.asInstanceOf[js.Any])
  }
}
