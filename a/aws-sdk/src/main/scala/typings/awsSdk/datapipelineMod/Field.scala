package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  /**
    * The field identifier.
    */
  var key: fieldNameString
  
  /**
    * The field value, expressed as the identifier of another object.
    */
  var refValue: js.UndefOr[fieldNameString] = js.undefined
  
  /**
    * The field value, expressed as a String.
    */
  var stringValue: js.UndefOr[fieldStringValue] = js.undefined
}
object Field {
  
  inline def apply(key: fieldNameString): Field = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setKey(value: fieldNameString): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRefValue(value: fieldNameString): Self = StObject.set(x, "refValue", value.asInstanceOf[js.Any])
    
    inline def setRefValueUndefined: Self = StObject.set(x, "refValue", js.undefined)
    
    inline def setStringValue(value: fieldStringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
