package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  /**
    * An array of values.
    */
  var arrayValue: js.UndefOr[ArrayValue] = js.undefined
  
  /**
    * A value of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.undefined
  
  /**
    * A value of Boolean data type.
    */
  var booleanValue: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A value of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.undefined
  
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A value of long data type.
    */
  var longValue: js.UndefOr[BoxedLong] = js.undefined
  
  /**
    * A value of string data type.
    */
  var stringValue: js.UndefOr[String] = js.undefined
}
object Field {
  
  @scala.inline
  def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayValue(value: ArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayValueUndefined: Self = StObject.set(x, "arrayValue", js.undefined)
    
    @scala.inline
    def setBlobValue(value: _Blob): Self = StObject.set(x, "blobValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobValueUndefined: Self = StObject.set(x, "blobValue", js.undefined)
    
    @scala.inline
    def setBooleanValue(value: BoxedBoolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: BoxedDouble): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setIsNull(value: BoxedBoolean): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNullUndefined: Self = StObject.set(x, "isNull", js.undefined)
    
    @scala.inline
    def setLongValue(value: BoxedLong): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
