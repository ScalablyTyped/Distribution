package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletedEntityKey extends StObject {
  
  var entityTypeName: String
  
  var keyValues: js.Array[Any]
}
object DeletedEntityKey {
  
  inline def apply(entityTypeName: String, keyValues: js.Array[Any]): DeletedEntityKey = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any], keyValues = keyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedEntityKey]
  }
  
  extension [Self <: DeletedEntityKey](x: Self) {
    
    inline def setEntityTypeName(value: String): Self = StObject.set(x, "entityTypeName", value.asInstanceOf[js.Any])
    
    inline def setKeyValues(value: js.Array[Any]): Self = StObject.set(x, "keyValues", value.asInstanceOf[js.Any])
    
    inline def setKeyValuesVarargs(value: Any*): Self = StObject.set(x, "keyValues", js.Array(value*))
  }
}
