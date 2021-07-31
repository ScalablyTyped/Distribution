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
  
  @scala.inline
  def apply(key: fieldNameString): Field = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: fieldNameString): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefValue(value: fieldNameString): Self = StObject.set(x, "refValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefValueUndefined: Self = StObject.set(x, "refValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: fieldStringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
